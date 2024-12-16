/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mdpf.guiswingorderlinuxmdpf;

/**
 *
 * @author Matteo
 */
public class Launcher {
    public static void main(String[] args) {
        try {
            Login login = new Login();
            GuiSwingOrderLinuxMDPF gui = new GuiSwingOrderLinuxMDPF();
            login.setVisible(true);
            login.setAlwaysOnTop(true);
            login.setLocationRelativeTo(null);
            gui.setVisible(false);
            while (!login.isLoginSuccessful()) {                
                Thread.sleep(1000);
                
            }
            gui.setVisible(true);
        } catch (Exception e) {
        }
    }
}
