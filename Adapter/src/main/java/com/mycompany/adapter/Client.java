/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.adapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author android
 */
public class Client {

    public static void main(String[] args) {

        String email = "rocolpani#gmail.com";

        String email2 = "guilhermediasgregorio4@gmail.com";

        ProtocoloDeValidacaoDeEmail protocolo = new Validador_Email_Adapter();

        if (protocolo.isValidEmailAddress(email)) {
            System.out.println(email + " e válido");
        } else {
            System.out.println(email + " nao e valido");
        }

        if (protocolo.isValidEmailAddress(email2)) {
            System.out.println(email2 + " e valido");
        } else {
            System.out.println(email2 + " nao e valido");
        }

    }

}
