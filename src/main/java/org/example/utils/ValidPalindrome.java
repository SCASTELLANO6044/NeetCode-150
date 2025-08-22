package org.example.utils;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        /*
        prerar formato correcto para s

        primero leer todas las letras de izq a derecha
        luego leer todas las letras de drch a izq
        luego comparar
	        si son iguales return true
	        si no return fale
        */
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();

        char [] list1 = new char[s.length()];
        for (int i = 0; i<s.length(); i++){
            list1[i] = s.charAt(i);
        }

        char [] list2 = new char[s.length()];

        for(int i = s.length()-1; i >= 0; i--){
            list2[i] = s.charAt(i);
        }

        for (int i = 0; i<s.length(); i++){
            if(list1[i] != list2[i]){
                return false;
            }
        }
        return true;
    }
}
