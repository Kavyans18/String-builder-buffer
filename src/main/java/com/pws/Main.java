package com.pws;

public class Main {
    public static void main(String[] args) {
        String value = "intellij";
        String literal = "intelli";
        System.out.println("===========================STRING=========================");
        System.out.println("Character at index 2 :" + value.charAt(2));
        System.out.println("Unicode of character at index 2 :" + value.codePointAt(2));
        System.out.println("Unicode of character before index 2 :" + value.codePointBefore(2));
        System.out.println("Number of unicode characters in the string :" + value.codePointCount(0, 7));
        int res = value.compareTo(literal);
        System.out.println("Number of character that are unique in the compared string :" + res);
        String a = value.concat("J");
        System.out.println("Merging the strings" + a);
        System.out.println("Checking if the string contains the given character :" + value.contains("l"));
        System.out.println("Checking whether the string ends with the character j :" + value.contains("ij"));
        System.out.println("formatted String :" + String.format(value));
        System.out.println("Occurrence of first Index :" + value.indexOf('i'));
        System.out.println("Checking if the string is empty :"+value.isEmpty());
        System.out.println("Occurrence of last Index" + value.lastIndexOf('i'));
        System.out.println("Length of the String is :"+ value.length());
        System.out.println("Replacing old character with new character :"+value.replace('i', 's'));
        System.out.println("Replacing old character with new character in the first occurrence:"+value.replaceFirst("i", "s"));
        System.out.println("Checking if the string starts with string pattern : i :"+value.startsWith("int"));
        System.out.println("To upper case :"+ value.toUpperCase());
        System.out.println("To lower case :"+ value.toLowerCase());
        value = "    intelij";
        System.out.println("Trim :"+ value.trim());
        System.out.println();

        System.out.println("===========================STRING BUFFER=========================");

        StringBuffer sb = new StringBuffer("Intellij IDE");
        System.out.println("To insert a string in a particular position : " +sb.insert(9,"Java "));
        System.out.println("To add a string with anther string :" + sb.append(" used"));
        System.out.println("To replace the string :" + sb.replace(7, 10, "java"));
        System.out.println("To delete string contents with index :" +sb.delete(7,10));
        System.out.println("Reverse the string :" + sb.reverse());
        System.out.println("Checking the capacity of the String :" + sb.capacity());
        System.out.println("Counting the length of the String :" + sb.length());
        System.out.println("Deleting the character at a particular index :" + sb.deleteCharAt(7));
        sb.setCharAt(0,'i');
        System.out.println("Replacing the character at a particular index :"+ sb);
        System.out.print("Finding the index of a string :" +sb.indexOf("ED"));
        System.out.println();

        System.out.println("===========================STRING BUILDER=========================");

        StringBuilder stringBuilder = new StringBuilder("Intellij IDE");
        System.out.println("To insert a string in a particular position : " +stringBuilder.insert(9,"Java "));
        System.out.println("To add a string with anther string :" + stringBuilder.append(" used"));
        System.out.println("To replace the string :" + stringBuilder.replace(7, 10, "java"));
        System.out.println("To delete string contents with index :" +stringBuilder.delete(7,10));
        System.out.println("Reverse the string :" + stringBuilder.reverse());
        System.out.println("Checking the capacity of the String :" + stringBuilder.capacity());
        System.out.println("Counting the length of the String :" + stringBuilder.length());
        System.out.println("Deleting the character at a particular index :" + stringBuilder.deleteCharAt(7));
        stringBuilder.setCharAt(0,'i');
        System.out.println("Replacing the character at a particular index :"+ stringBuilder);
        System.out.print("Finding the index of a string :" +stringBuilder.indexOf("ED"));
        System.out.println();

    }
}