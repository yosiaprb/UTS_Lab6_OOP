package Nomor2;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        // Menghilangkan semua spasi dan mengubah string menjadi huruf kecil
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Jika panjang string berbeda, maka tidak mungkin anagram
        if (str1.length() != str2.length()) {
            return false;
        }

        // Mengubah string menjadi array karakter
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Mengurutkan array karakter
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Membandingkan array karakter yang sudah diurutkan
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String[][] testCases = {
            {"listen", "silent"},
            {"triangle", "integral"},
            {"apple", "pale"},
            {"dusty", "study"},
            {"night", "thing"},
            {"save", "vase"},
            {"earth", "heart"},
            {"hello", "world"}
        };
        // memeriksa setiap pasangan string dalam array testCases dan menentukan apakah mereka adalah anagram atau bukan, tanpa harus menulis kode pemeriksaan berulang-ulang untuk setiap pasangan string secara manual.
        for (String[] pair : testCases) {
            String string1 = pair[0];
            String string2 = pair[1];

            if (areAnagrams(string1, string2)) {
                System.out.println(string1 + " dan " + string2 + " adalah anagram.");
            } else {
                System.out.println(string1 + " dan " + string2 + " bukan anagram.");
            }
        }
    }
}

