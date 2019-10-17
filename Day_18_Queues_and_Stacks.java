/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirty_days_of_java;

import java.util.Scanner;

/**
 *
 * @author Tanvir
 */
public class Day_18_Queues_and_Stacks {

    char stack[] = new char[20];
    char queue[] = new char[20];

    int top = -1;
    int front = -1;
    int rear = -1;

    void pushCharacter(char ch) {
        if (top < 19) {
            top++;
            stack[top] = ch;
        }
    }

    void enqueueCharacter(char ch) {
        if (front < 19) {
            front++;
            queue[front] = ch;
        }
    }

    char popCharacter() {
        if (top > 0) {
            return stack[top--];
        }
        return 'c';
    }

    char dequeueCharacter() {
        if (rear < front) {
            return queue[++rear];
        }
        return 'c';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day_18_Queues_and_Stacks p = new Day_18_Queues_and_Stacks();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}
