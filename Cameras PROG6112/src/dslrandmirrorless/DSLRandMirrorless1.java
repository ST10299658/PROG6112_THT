/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dslrandmirrorless;

import javax.swing.JOptionPane;


public class DSLRandMirrorless1 {
    /* int[][]cameras = {
        {10500,8500},
        {9500,7200},
        {12000,8000},
    };

   public void displayCameraSpecifications() {
        StringBuilder message = new StringBuilder();

         int Diff1 = cameras[0][0] - cameras[0][1];
         int Diff2 = cameras[1][0] - cameras[1][1];
         int Diff3 = cameras[2][0] - cameras[2][1];
         int Diff;
         if(Diff1>Diff2&&Diff1>Diff3){
              Diff = Diff1;
         }else if(Diff2>Diff1&&Diff2>Diff3){
             Diff = Diff2;
         }else{
              Diff = Diff3;
         }
        for (int i = 0; i < 3; i++) {
            if (cameras[i][i] != 0) {
                message.append("----------------------------------------\n")
                        .append("CAMERA TECHNOLOGY REPORT\n")
                        .append("----------------------------------------\n")
                        .append("          DSLR       MIRRORLESS\n")
                        .append("Canon: ").append(cameras[0][0]).append("\n")
                        .append("Sony: ").append(cameras[1][0]).append("\n")
                        .append("Nikon: ").append(cameras[2][0]).append("\n")
                        .append("----------------------------------------\n")
                        .append("CAMERA TECHNOLOGY RESULT\n")
                        .append("----------------------------------------\n")
                        .append("Canon: \n")
                        .append("Sony: \n")
                        .append("Nikon: \n")
                        .append("\n")
                        .append("THE CAMERA WITH THE MOST COST DIFFERENCE: \n" + Diff)
                        .append("----------------------------------------\n");
               
               
            }
        }

        JOptionPane.showMessageDialog(null, message.toString());
    }*/
    int[][] cameras = { {10500, 8500},
                         {9500, 7200},
                          {12000, 8000}, };
    
    public void displayCameraSpecifications() { 
        StringBuilder message = new StringBuilder(); 
        
        int maxDiff = Integer.MIN_VALUE; 
        String maxDiffBrand = "";
        String[] brands = {"Canon", "Sony", "Nikon"};
        
        for (int i = 1; i < 2; i++) { 
            int dslrCost = cameras[2][0];
            int mirrorlessCost = cameras[2][1];
            int diff = dslrCost - mirrorlessCost;
                    message.append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n") 
                    .append("CAMERA TECHNOLOGY REPORT\n") 
                    .append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n") 
                    .append("           MIRRORLESS    DSLR\n") 
                    .append(brands[0] +":      R"+cameras[0][0]).append("       R"+ cameras[0][1]).append("\n")
                    .append(brands[1]+":         R"+cameras[1][0]).append("       R"+ cameras[0][1]).append("\n")
                    .append(brands[2]+":       R"+cameras[2][0]).append("       R"+ cameras[0][1]).append("\n") 
                    .append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n") 
                    .append("CAMERA TECHNOLOGY RESULT\n") 
                    .append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n")
                    .append("Cost Difference (DSL vs. Mirrorless): R")
                    .append(diff).append("\n") .append("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv\n");
            if (diff > maxDiff) { maxDiff = diff; maxDiffBrand = brands[2]; } }
        message.append("THE CAMERA WITH THE MOST COST DIFFERENCE: \n" + "Brand: " + maxDiffBrand ) 
                .append("\nvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv"); 
        
        JOptionPane.showMessageDialog(null, message.toString()); 
    }
}
