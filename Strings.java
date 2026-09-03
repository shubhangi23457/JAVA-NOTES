// ================================
// NOTES
// ================================

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Strings {

    public static void main(String[] args) {

        // 1. STRING CREATION

        String s1 = "Hello";
        String s2 = "World";

        // Using new keyword
        String s3 = new String("Java");

        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);


        // 2. STRING CONCATENATION

        String firstName = "Shubhangi";
        String lastName = "Savant";

        String fullName = firstName + " " + lastName;

        System.out.println("\nFull Name: " + fullName);

        System.out.println(
            "Using concat(): " +
            firstName.concat(" ").concat(lastName)
        );


        // 3. LENGTH

        String text = "Java Programming";

        System.out.println("\nLength: " + text.length());


        // 4. charAt()

        System.out.println(
            "Character at index 0: " + text.charAt(0)
        );

        System.out.println(
            "Character at index 5: " + text.charAt(5)
        );

        // 5. toUpperCase() and toLowerCase()

        System.out.println(
            "\nUppercase: " + text.toUpperCase()
        );

        System.out.println(
            "Lowercase: " + text.toLowerCase()
        );


        // 6. equals() AND equalsIgnoreCase()

        String a = "Java";
        String b = "Java";
        String c = "java";

        System.out.println(
            "\na.equals(b): " + a.equals(b)
        );

        System.out.println(
            "a.equals(c): " + a.equals(c)
        );

        System.out.println(
            "a.equalsIgnoreCase(c): "
            + a.equalsIgnoreCase(c)
        );


        // 7. == VS equals()

        String x = "Hello";
        String y = "Hello";

        String z = new String("Hello");

        System.out.println("\nString Comparison:");

        System.out.println("x == y: " + (x == y));

        System.out.println("x == z: " + (x == z));

        System.out.println("x.equals(z): " + x.equals(z));


        // 8. compareTo()

        String p = "Apple";
        String q = "Banana";

        System.out.println(
            "\np.compareTo(q): " + p.compareTo(q)
        );

        System.out.println(
            "q.compareTo(p): " + q.compareTo(p)
        );

        System.out.println(
            "p.compareTo(\"Apple\"): "
            + p.compareTo("Apple")
        );

        // 9. contains()

        String sentence =
            "Java is a powerful programming language";

        System.out.println(
            "\nContains Java: "
            + sentence.contains("Java")
        );

        System.out.println(
            "Contains Python: "
            + sentence.contains("Python")
        );


        // 10. startsWith() AND endsWith()

        System.out.println(
            "\nStarts with Java: "
            + sentence.startsWith("Java")
        );

        System.out.println(
            "Ends with language: "
            + sentence.endsWith("language")
        );


        // 11. indexOf() AND lastIndexOf()

        String word = "programming";

        System.out.println(
            "\nIndex of 'g': " + word.indexOf('g')
        );

        System.out.println(
            "Last index of 'g': "
            + word.lastIndexOf('g')
        );

        System.out.println(
            "Index of \"gram\": "
            + word.indexOf("gram")
        );


        // 12. substring()

        String language = "JavaProgramming";

        System.out.println(
            "\nsubstring(4): "
            + language.substring(4)
        );

        System.out.println(
            "substring(0, 4): "
            + language.substring(0, 4)
        );


        // 13. replace()

        String message = "I like Java";

        System.out.println(
            "\nReplace Java with Python: "
            + message.replace("Java", "Python")
        );

        System.out.println(
            "Replace a with @: "
            + message.replace('a', '@')
        );


        // 14. trim()

        String spaces = "   Hello Java   ";

        System.out.println(
            "\nBefore trim: [" + spaces + "]"
        );

        System.out.println(
            "After trim: [" + spaces.trim() + "]"
        );


        // 15. isEmpty() AND isBlank()

        String empty = "";
        String blank = "   ";

        System.out.println(
            "\nIs empty: " + empty.isEmpty()
        );

        System.out.println(
            "Is blank: " + blank.isBlank()
        );


        // 16. split()

        String data = "Java,Python,C++,JavaScript";

        String[] languagesArray = data.split(",");

        System.out.println("\nAfter split:");

        for (String lang : languagesArray) {
            System.out.println(lang);
        }


        // 17. STRINGBUILDER
        // String Builder has a capacity of 16 characters

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");

        System.out.println(
            "\nStringBuilder: " + sb
        );


        // 18. insert()

        sb.insert(6, "Advanced ");

        System.out.println(
            "After insert(): " + sb
        );


        // 19. delete()

        sb.delete(6, 15);

        System.out.println(
            "After delete(): " + sb
        );


        // 20. replace() IN STRINGBUILDER

        sb.replace(6, 10, "World");

        System.out.println(
            "After replace(): " + sb
        );

        // 21. reverse()

        sb.reverse();

        System.out.println(
            "After reverse(): " + sb
        );

        // Reverse again to restore
        sb.reverse();


        // 22. setCharAt()

        sb.setCharAt(0, 'h');

        System.out.println(
            "After setCharAt(): " + sb
        );


        // 23. StringBuilder length()

        System.out.println(
            "StringBuilder length: " + sb.length()
        );


        // 24. StringBuilder capacity()

        System.out.println(
            "StringBuilder capacity: "
            + sb.capacity()
        );


        // 25. CONVERT STRINGBUILDER TO STRING

        String result = sb.toString();

        System.out.println(
            "Converted String: " + result
        );


        // 26. PALINDROME USING STRINGBUILDER

        String original = "madam";

        String reversed =
            new StringBuilder(original)
                .reverse()
                .toString();

        System.out.println(
            "\nOriginal: " + original
        );

        System.out.println(
            "Reversed: " + reversed
        );

        System.out.println(
            "Is Palindrome: "
            + original.equals(reversed)
        );


        // 27. STRINGBUILDER EFFICIENT CONCATENATION

        StringBuilder numbers = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            numbers.append(i).append(" ");
        }

        System.out.println(
            "\nNumbers: " + numbers
        );
    }
}


/*
============================================================
JAVA STRING, STRING METHODS & STRINGBUILDER
IMPORTANT CODING QUESTIONS + SOLUTIONS
============================================================
*/


// 1. REVERSE A STRING
// Question: Write a Java program to reverse a given String.

class Q1_ReverseString {
    public static void main(String[] args) {

        String s = "Java";

        StringBuilder sb = new StringBuilder(s);

        System.out.println(sb.reverse());
    }
}


// 2. CHECK PALINDROME
// Question: Check whether a given String is a palindrome.

class Q2_Palindrome {
    public static void main(String[] args) {

        String s = "madam";

        String reverse = new StringBuilder(s).reverse().toString();

        if (s.equals(reverse))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}



// 3. COUNT VOWELS AND CONSONANTS
// Question: Count the number of vowels and consonants.


class Q3_VowelsConsonants {
    public static void main(String[] args) {

        String s = "Programming".toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {

                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}



// 4. COUNT FREQUENCY OF EVERY CHARACTER
// Question: Count how many times each character occurs.


class Q4_CharacterFrequency {
    public static void main(String[] args) {

        String s = "programming";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Process each character only once
            if (s.indexOf(ch) == i) {

                int count = 0;

                for (int j = 0; j < s.length(); j++) {

                    if (s.charAt(j) == ch)
                        count++;
                }

                System.out.println(ch + " = " + count);
            }
        }
    }
}



// 5. FIRST NON-REPEATING CHARACTER
// Question: Find the first character that occurs only once.


class Q5_FirstNonRepeating {
    public static void main(String[] args) {

        String s = "swiss";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)) {

                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating character");
    }
}



// 6. REMOVE DUPLICATE CHARACTERS
// Question: Remove duplicate characters while preserving order.


class Q6_RemoveDuplicates {
    public static void main(String[] args) {

        String s = "programming";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}



// 7. COUNT WORDS
// Question: Count the number of words in a sentence.


class Q7_CountWords {
    public static void main(String[] args) {

        String s = "Java is easy to learn";

        s = s.trim();

        if (s.isEmpty()) {
            System.out.println(0);
        } else {

            String[] words = s.split("\\s+");

            System.out.println("Number of words: " + words.length);
        }
    }
}



// 8. REVERSE EVERY WORD
// Question:
// Reverse every word but keep the order of the words unchanged.
//
// Input : Java is powerful
// Output: avaJ si lufrewop


class Q8_ReverseEveryWord {
    public static void main(String[] args) {

        String s = "Java is powerful";

        String[] words = s.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result.append(
                new StringBuilder(word).reverse()
            );

            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}



// 9. REVERSE WORD ORDER
// Question:
// Reverse the order of words in a sentence.
//
// Input : Java is powerful
// Output: powerful is Java


class Q9_ReverseWordOrder {
    public static void main(String[] args) {

        String s = "Java is powerful";

        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            result.append(words[i]);

            if (i != 0)
                result.append(" ");
        }

        System.out.println(result);
    }
}



// 10. CHECK ANAGRAM
// Question: Check whether two Strings are anagrams.
// Example: listen and silent


class Q10_Anagram {
    public static void main(String[] args) {

        String a = "listen";
        String b = "silent";

        a = a.replaceAll("\\s+", "").toLowerCase();
        b = b.replaceAll("\\s+", "").toLowerCase();

        char[] x = a.toCharArray();
        char[] y = b.toCharArray();

        Arrays.sort(x);
        Arrays.sort(y);

        if (Arrays.equals(x, y))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}



// 11. REMOVE ALL SPACES
// Question: Remove all spaces from a String.


class Q11_RemoveSpaces {
    public static void main(String[] args) {

        String s = "Java is very easy";

        String result = s.replaceAll("\\s+", "");

        System.out.println(result);
    }
}



// 12. REPLACE A CHARACTER
// Question: Replace every occurrence of 'a' with 'x'.


class Q12_ReplaceCharacter {
    public static void main(String[] args) {

        String s = "banana";

        String result = s.replace('a', 'x');

        System.out.println(result);
    }
}



// 13. COUNT OCCURRENCES OF A SUBSTRING
// Question:
// Count how many times a substring occurs in a String.
// Overlapping occurrences are counted.
//
// Example:
// String = banana
// Substring = ana
// Answer = 2


class Q13_SubstringCount {
    public static void main(String[] args) {

        String s = "banana";
        String sub = "ana";

        int count = 0;

        for (int i = 0; i <= s.length() - sub.length(); i++) {

            if (s.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}



// 14. STRINGBUILDER - INSERT
// Question:
// Insert "Java " at the beginning of "Programming".


class Q14_StringBuilderInsert {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Programming");

        sb.insert(0, "Java ");

        System.out.println(sb);
    }
}



// 15. STRINGBUILDER - DELETE
// Question:
// Delete characters from index 2 to index 5.
// Remember: end index is excluded.


class Q15_StringBuilderDelete {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Programming");

        sb.delete(2, 5);

        System.out.println(sb);
    }
}



// 16. STRINGBUILDER - setCharAt()
// Question:
// Change the first character of "Java" to 'K'.


class Q16_SetCharAt {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.setCharAt(0, 'K');

        System.out.println(sb);
    }
}



// 17. COMPARE TWO STRINGS USING equals()
// Question:
// Compare two Strings based on their contents.


class Q17_EqualsComparison {
    public static void main(String[] args) {

        String a = "Java";
        String b = new String("Java");

        if (a.equals(b))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}



// 18. CASE-INSENSITIVE COMPARISON
// Question:
// Check whether two Strings are equal ignoring case.


class Q18_EqualsIgnoreCase {
    public static void main(String[] args) {

        String a = "JAVA";
        String b = "java";

        if (a.equalsIgnoreCase(b))
            System.out.println("Equal");
        else
            System.out.println("Not Equal");
    }
}



// 19. LEXICOGRAPHICAL COMPARISON
// Question:
// Compare two Strings using compareTo().


class Q19_CompareTo {
    public static void main(String[] args) {

        String a = "apple";
        String b = "banana";

        int result = a.compareTo(b);

        if (result < 0)
            System.out.println("a comes before b");

        else if (result > 0)
            System.out.println("a comes after b");

        else
            System.out.println("Both are equal");
    }
}



// 20. TOGGLE CASE
// Question:
// Convert uppercase characters to lowercase and
// lowercase characters to uppercase.


class Q20_ToggleCase {
    public static void main(String[] args) {

        String s = "JaVa";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isUpperCase(ch))
                result.append(Character.toLowerCase(ch));

            else
                result.append(Character.toUpperCase(ch));
        }

        System.out.println(result);
    }
}



// 21. REMOVE DUPLICATE WORDS
// Question:
// Remove duplicate words while preserving their original order.


class Q21_RemoveDuplicateWords {
    public static void main(String[] args) {

        String s = "java is java and java is easy";

        String[] words = s.split("\\s+");

        LinkedHashSet<String> set = new LinkedHashSet<>();

        for (String word : words) {
            set.add(word);
        }

        System.out.println(String.join(" ", set));
    }
}



// 22. FIND LONGEST WORD
// Question:
// Find the longest word in a sentence.


class Q22_LongestWord {
    public static void main(String[] args) {

        String s = "Java programming is interesting";

        String[] words = s.split("\\s+");

        String longest = "";

        for (String word : words) {

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}



// 23. FIND SHORTEST WORD
// Question:
// Find the shortest word in a sentence.


class Q23_ShortestWord {
    public static void main(String[] args) {

        String s = "Java is very powerful";

        String[] words = s.split("\\s+");

        String shortest = words[0];

        for (String word : words) {

            if (word.length() < shortest.length()) {
                shortest = word;
            }
        }

        System.out.println("Shortest word: " + shortest);
    }
}



// 24. CHECK IF STRING CONTAINS ONLY DIGITS
// Question:
// Check whether a String contains only numeric digits.


class Q24_OnlyDigits {
    public static void main(String[] args) {

        String s = "123456";

        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isDigit(s.charAt(i))) {

                valid = false;
                break;
            }
        }

        System.out.println(valid);
    }
}



// 25. REMOVE VOWELS
// Question:
// Remove all vowels from a String.


class Q25_RemoveVowels {
    public static void main(String[] args) {

        String s = "Programming";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if ("aeiouAEIOU".indexOf(ch) == -1) {
                result.append(ch);
            }
        }

        System.out.println(result);
    }
}



// 26. STRINGBUILDER APPEND
// Question:
// Append numbers 1 to 5 using StringBuilder.


class Q26_StringBuilderAppend {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            sb.append(i);
        }

        System.out.println(sb);
    }
}



// 27. CONVERT STRINGBUILDER TO STRING
// Question:
// Convert a StringBuilder object into a String.


class Q27_StringBuilderToString {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        String s = sb.toString();

        System.out.println(s);
    }
}



// 28. REMOVE SPECIFIC CHARACTER USING STRINGBUILDER
// Question:
// Remove every occurrence of character 'a'.


class Q28_RemoveCharacter {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("banana");

        // Iterate backwards because deletion changes indexes
        for (int i = sb.length() - 1; i >= 0; i--) {

            if (sb.charAt(i) == 'a') {
                sb.deleteCharAt(i);
            }
        }

        System.out.println(sb);
    }
}



// 29. CHECK STRING ROTATION
// Question:
// Check whether one String is a rotation of another.
//
// Example:
// waterbottle
// erbottlewat


class Q29_StringRotation {
    public static void main(String[] args) {

        String a = "waterbottle";
        String b = "erbottlewat";

        boolean result =
                a.length() == b.length()
                && (a + a).contains(b);

        System.out.println(result);
    }
}



// 30. STRING COMPRESSION
// Question:
// Compress a String by counting consecutive characters.
//
// Input : aaabbccccd
// Output: a3b2c4d1


class Q30_StringCompression {
    public static void main(String[] args) {

        String s = "aaabbccccd";

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i <= s.length(); i++) {

            if (i < s.length()
                    && s.charAt(i) == s.charAt(i - 1)) {

                count++;

            } else {

                result.append(s.charAt(i - 1));
                result.append(count);

                count = 1;
            }
        }

        System.out.println(result);
    }
}



// 31. COUNT UPPERCASE, LOWERCASE, DIGITS AND SPECIAL CHARACTERS
// Question:
// Count uppercase, lowercase, digits and special characters.


class Q31_CharacterTypes {
    public static void main(String[] args) {

        String s = "Java@123";

        int upper = 0;
        int lower = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isUpperCase(ch))
                upper++;

            else if (Character.isLowerCase(ch))
                lower++;

            else if (Character.isDigit(ch))
                digits++;

            else
                special++;
        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + digits);
        System.out.println("Special: " + special);
    }
}



// 32. FIND MOST FREQUENT CHARACTER
// Question:
// Find the character with the highest frequency.


class Q32_MostFrequentCharacter {
    public static void main(String[] args) {

        String s = "programming";

        char maxChar = s.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == ch)
                    count++;
            }

            if (count > maxCount) {

                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println(
            maxChar + " occurs " + maxCount + " times"
        );
    }
}



// 33. CHECK IF TWO STRINGS ARE EQUAL WITHOUT equals()
// Question:
// Compare two Strings character by character.


class Q33_ManualStringComparison {
    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";

        boolean equal = true;

        if (a.length() != b.length()) {

            equal = false;

        } else {

            for (int i = 0; i < a.length(); i++) {

                if (a.charAt(i) != b.charAt(i)) {

                    equal = false;
                    break;
                }
            }
        }

        System.out.println(equal);
    }
}



// 34. FIND ALL OCCURRENCES OF A CHARACTER
// Question:
// Find all indexes where a particular character occurs.


class Q34_AllOccurrences {
    public static void main(String[] args) {

        String s = "banana";
        char target = 'a';

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == target) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}



// 35. REMOVE A SUBSTRING
// Question:
// Remove all occurrences of "java" from a String.


class Q35_RemoveSubstring {
    public static void main(String[] args) {

        String s = "java is easy and java is powerful";

        String result = s.replace("java", "");

        System.out.println(result);
    }
}



// 36. CHECK PREFIX AND SUFFIX
// Question:
// Check whether a String starts with "Java"
// and ends with "Programming".


class Q36_PrefixSuffix {
    public static void main(String[] args) {

        String s = "Java Programming";

        System.out.println(s.startsWith("Java"));
        System.out.println(s.endsWith("Programming"));
    }
}



// 37. FIND SECOND MOST FREQUENT CHARACTER
// Question:
// Find the second most frequent character in a String.


class Q37_SecondMostFrequent {
    public static void main(String[] args) {

        String s = "aabbccc";

        int max1 = 0;
        int max2 = 0;

        char first = '\0';
        char second = '\0';

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (s.indexOf(ch) != i)
                continue;

            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == ch)
                    count++;
            }

            if (count > max1) {

                max2 = max1;
                second = first;

                max1 = count;
                first = ch;

            } else if (count > max2 && count < max1) {

                max2 = count;
                second = ch;
            }
        }

        if (second != '\0')
            System.out.println(second);
        else
            System.out.println("No second most frequent character");
    }
}



// 38. REMOVE CONSECUTIVE DUPLICATES
// Question:
// Remove consecutive duplicate characters.
//
// Input : aabbccdaa
// Output: abcda


class Q38_RemoveConsecutiveDuplicates {
    public static void main(String[] args) {

        String s = "aabbccdaa";

        StringBuilder result = new StringBuilder();

        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != s.charAt(i - 1)) {
                result.append(s.charAt(i));
            }
        }

        System.out.println(result);
    }
}



// 39. REVERSE STRING WITHOUT reverse()
// Question:
// Reverse a String without using StringBuilder.reverse().


class Q39_ReverseWithoutReverse {
    public static void main(String[] args) {

        String s = "Java";

        StringBuilder result = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        System.out.println(result);
    }
}



// 40. CHECK PALINDROME WITHOUT REVERSE()
// Question:
// Check palindrome without using reverse().


class Q40_PalindromeWithoutReverse {
    public static void main(String[] args) {

        String s = "madam";

        boolean palindrome = true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                palindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (palindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}



// 41. REMOVE ALL OCCURRENCES OF A CHARACTER
// Question:
// Remove every occurrence of a given character using StringBuilder.


class Q41_RemoveAllOccurrences {
    public static void main(String[] args) {

        String s = "programming";
        char target = 'm';

        StringBuilder sb = new StringBuilder(s);

        for (int i = sb.length() - 1; i >= 0; i--) {

            if (sb.charAt(i) == target) {
                sb.deleteCharAt(i);
            }
        }

        System.out.println(sb);
    }
}



// 42. CAPITALIZE FIRST LETTER OF EVERY WORD
// Question:
// Capitalize the first letter of every word.


class Q42_CapitalizeWords {
    public static void main(String[] args) {

        String s = "java is very powerful";

        String[] words = s.split("\\s+");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            result.append(
                Character.toUpperCase(word.charAt(0))
            );

            result.append(word.substring(1));
            result.append(" ");
        }

        System.out.println(result.toString().trim());
    }
}



// 43. CHECK IF STRING CONTAINS ONLY ALPHABETS
// Question:
// Check whether a String contains only A-Z or a-z.


class Q43_OnlyAlphabets {
    public static void main(String[] args) {

        String s = "JavaProgramming";

        boolean valid = true;

        for (int i = 0; i < s.length(); i++) {

            if (!Character.isLetter(s.charAt(i))) {

                valid = false;
                break;
            }
        }

        System.out.println(valid);
    }
}



// 44. FIND CHARACTER AT A PARTICULAR INDEX
// Question:
// Find the character at index 3.


class Q44_CharAt {
    public static void main(String[] args) {

        String s = "Programming";

        System.out.println(s.charAt(3));
    }
}



// 45. EXTRACT SUBSTRING
// Question:
// Extract characters from index 3 to index 7.


class Q45_Substring {
    public static void main(String[] args) {

        String s = "Programming";

        System.out.println(s.substring(3, 7));
    }
}



// 46. FIND FIRST AND LAST OCCURRENCE
// Question:
// Find the first and last occurrence of character 'a'.


class Q46_FirstLastIndex {
    public static void main(String[] args) {

        String s = "banana";

        System.out.println("First: " + s.indexOf('a'));
        System.out.println("Last: " + s.lastIndexOf('a'));
    }
}



// 47. CONVERT STRING TO UPPERCASE AND LOWERCASE
// Question:
// Convert a String to uppercase and lowercase.


class Q47_CaseConversion {
    public static void main(String[] args) {

        String s = "Java Programming";

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}



// 48. STRINGBUILDER CAPACITY
// Question:
// Display the length and capacity of a StringBuilder.


class Q48_StringBuilderCapacity {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
    }
}



// 49. STRINGBUILDER REPLACE
// Question:
// Replace characters from index 0 to 4 with "Code".


class Q49_StringBuilderReplace {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java Programming");

        sb.replace(0, 4, "Code");

        System.out.println(sb);
    }
}



// 50. STRINGBUILDER MULTIPLE OPERATIONS
// Question:
// Perform append, insert, delete, setCharAt and reverse
// operations on a StringBuilder.


class Q50_StringBuilderOperations {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        sb.append("Code");

        sb.insert(4, " ");

        sb.setCharAt(0, 'K');

        sb.delete(5, 6);

        sb.reverse();

        System.out.println(sb);
    }
}