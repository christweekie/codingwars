package org.lucidant.kyu6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class MexicanWave
{

    public static String[] wave(String str) {
        if (str == null || str.trim().isEmpty()) {
            return new String[]{};
        }
        final StringBuilder baseString = new StringBuilder(str);

        final List<String> strings = new ArrayList<>(str.trim().length());
        for (int i = 0; i<baseString.length(); i++)
        {
            final char current = baseString.charAt(i);
            if (Character.isWhitespace(current)) {
                continue;
            }
            else {
                final StringBuilder sb = new StringBuilder(baseString);
                sb.setCharAt(i, Character.toUpperCase(current));
                strings.add(sb.toString());
            }
        }
        return strings.toArray(new String[0]);

    }


    public static String[] waveStream(final String str) {
        return IntStream
            .range(0, str.length())
            .mapToObj(x -> new StringBuilder(str).replace(x, x+1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
            .filter(x -> !x.equals(str))
            .toArray(String[]::new);
    }
}
