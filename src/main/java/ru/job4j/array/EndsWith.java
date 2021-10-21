package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int d = word.length - post.length;
        for (int index = 0; index < post.length; index++) {
            if (post[index] != word[index + d]) {
                return false;
            }

        }
        return result;
    }
}
