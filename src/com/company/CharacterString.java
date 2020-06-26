package com.company;

public class CharacterString {
    void reverseCharacterString(char[] str){
        char[] output = new char[str.length];
        int counter = 0;
        for(int i = str.length - 1; i >= 0; i--){
            output[counter] = str[i];
            counter++;
        }
        for(int j = 0; j < output.length; j++){
            System.out.print(output[j]);
        }
    }
}
