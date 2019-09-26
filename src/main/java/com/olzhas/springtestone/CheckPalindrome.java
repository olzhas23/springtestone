package com.olzhas.springtestone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@org.springframework.web.bind.annotation.RestController
public class CheckPalindrome {

    @GetMapping("/api/{palindrome}")
    public String palindrome(@PathVariable String palindrome){
        int ct = 0;
        for(int i = 0 ; i < palindrome.length()/2; i++){

            if (palindrome.charAt(i)==palindrome.charAt(palindrome.length()-1-i)){

                ct ++;
            }
            if (ct == palindrome.length()/2){
                return "yes";
            }
        }
        return "no";


    }
}

