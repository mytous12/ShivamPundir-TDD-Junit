package org.example;

public class StringOps {
    public String removeA(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2 && i < string.length(); i++) {
            if (string.charAt(i) != 'A') {
                stringBuilder.append(string.charAt(i));
            }
        }
        if (string.length() > 2) {
            stringBuilder.append(string.substring(2));
        }
        return stringBuilder.toString();
    }
}
