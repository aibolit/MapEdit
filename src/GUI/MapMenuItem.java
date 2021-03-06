/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MapMenuItem.java
 *
 * Created on Dec 31, 2008, 4:56:13 PM
 */

package GUI;

import java.awt.event.ActionEvent;

/**
 *
 * @author Sasa
 */
public class MapMenuItem extends javax.swing.JMenuItem {

    /** Creates new form BeanForm */
    public MapMenuItem() {
        initComponents();
        initValues();
    }

    public MapMenuItem(Objects.Map map){
        this.map = map;
        initComponents();
        initValues();
    }

    private void initValues(){
        this.setText(map.getTitle());
        this.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionPerformed(evt);
            }

            private void ActionPerformed(ActionEvent evt) {
                mapedit.Constants.bringToFront(map);
                map.getDisplay().fullRedraw();
            }
        });
    }



    private Objects.Map map;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {

    }
    // </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
