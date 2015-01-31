/*
 * SimMetrics - SimMetrics is a java library of Similarity or Distance
 * Metrics, e.g. Levenshtein Distance, that provide float based similarity
 * measures between String Data. All metrics return consistent measures
 * rather than unbounded similarity scores.
 * 
 * Copyright (C) 2014  SimMetrics authors
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * 
 */

package org.simmetrics.tokenisers;

import java.util.ArrayList;

/**
 * TokeniserCSVBasic implements a simple CSV tokeniser. NB(this doesn't consider
 * embedded escaped comma's within the fields)
 * 
 * @author Sam Chapman
 * @version 1.1
 */
public final class CSVBasicTokenizer extends AbstractTokenizer {

	private final String delimiters = "[,\n]";

	public final ArrayList<String> tokenizeToList(final String input) {
		final ArrayList<String> returnArrayList = new ArrayList<>();

		for (String token : input.split(delimiters)) {
			returnArrayList.add(token);
		}

		return returnArrayList;
	}

	@Override
	public String toString() {
		return "CSVBasicTokenizer [delimiters=" + delimiters + "]";
	}

}
