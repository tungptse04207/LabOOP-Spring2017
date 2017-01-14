/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.edu.fpt.P00023.bo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author crazyboy
 */
public class Validate {

    public int validInt(String mes, int min, int max) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.print(mes);
        while (true) {
            try {
                n = Integer.parseInt(br.readLine());
                if (n <= min || n > max) {
                    System.out.print("RE-ENTER: ");
                } else {
                    return n;
                }
            } catch (Exception e) {
                System.out.print("INVALID!! RE-ENTER: ");
            }
        }

    }

    public double validDouble(String mes, double min, double max) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n;
        System.out.print(mes);
        while (true) {
            try {
                n = Double.parseDouble(br.readLine());
                if (n <= min || n > max) {
                    System.out.print("RE-ENTER: ");
                } else {
                    return n;
                }
            } catch (Exception e) {
                System.out.print("INVALID!! RE-ENTER: ");
            }
        }
    }

    public String validString(String mes) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.print(mes);
        while (true) {
            try {
                s = br.readLine().trim();
                if (s.isEmpty()) {
                    System.out.print("RE-ENTER: ");
                } else {
                    return s;
                }
            } catch (Exception e) {
            }
        }
    }

    public boolean isContinue(String mes) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.print(mes);
        while (true) {
            try {
                s = br.readLine().trim().toLowerCase();
                if (s.length() != 1 || (s.charAt(0) != 'y' && s.charAt(0) != 'n')) {
                    System.out.print("RE-ENTER: ");
                } else if (s.charAt(0) == 'y') {
                    return true;
                } else if (s.charAt(0) == 'n') {
                    return false;
                }
            } catch (Exception e) {
            }
        }
    }
}
