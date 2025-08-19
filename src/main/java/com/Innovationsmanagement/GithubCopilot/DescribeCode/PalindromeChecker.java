package com.Innovationsmanagement.GithubCopilot.DescribeCode;

/*
    Prompt:
    Erkläre diese Methode Schritt für Schritt
 */

public class PalindromeChecker {

    public boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
