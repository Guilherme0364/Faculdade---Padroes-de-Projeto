/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author android
 */
public class Validador_Email_Adapter implements ProtocoloDeValidacaoDeEmail {

    @Override
    public boolean isValidEmailAddress(String email) {
        String expression = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        Pattern pattern = Pattern.compile(expression);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }

}
