/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_sanjaya.login;

/**
 *
 * @author Propesiom
 */
public class main_splash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      splash_screen ss = new splash_screen();
      ss.setVisible(true);
      form_login form_login = new form_login();
        try {
              for(int i = 0; i <= 100; i++){
                Thread.sleep(40);
                ss.lbl_load_num.setText(Integer.toString(i)+ "%");
                ss.jprogressbar.setValue(i);
                if(i == 100){
                    ss.setVisible(false);
                    form_login.setVisible(true);
                }
            }
        } catch (Exception e) {
        }
    
    }
    
}
