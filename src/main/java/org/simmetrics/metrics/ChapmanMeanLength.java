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
package org.simmetrics.metrics;

import static java.lang.Math.pow;

import org.simmetrics.StringMetric;

/**
 * Implements the Chapman Mean Length algorithm provides a similarity measure
 * between two strings from size of the mean length of the vectors - this
 * approach is supposed to be used to determine which metrics may be best to
 * apply rather than giving a valid response itself
 * 
 * @author Sam Chapman
 * @version 1.2
 */

public class ChapmanMeanLength implements StringMetric {

	/**
	 * defines the internal max string length beyond which 1.0 is always
	 * returned.
	 */
	final private static int CHAPMANMEANLENGTHMAXSTRING = 500;

	public float compare(final String string1, final String string2) {
		final float bothLengths = string2.length() + string1.length();
		if (bothLengths > CHAPMANMEANLENGTHMAXSTRING) {
			return 1.0f;
		} else {
			final float oneMinusBothScaled = (CHAPMANMEANLENGTHMAXSTRING - bothLengths)
					/ CHAPMANMEANLENGTHMAXSTRING;
			return (float) (1.0 - pow(oneMinusBothScaled, 4));
		}
	}

	@Override
	public String toString() {
		return "ChapmanMeanLength";
	}
	
	

}
