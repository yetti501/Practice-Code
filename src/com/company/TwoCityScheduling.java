package com.company;

public class TwoCityScheduling {

    int[][] data = {{10, 20}, {30, 200}, {400, 50}, {30, 20}};

    void printData(){
        for(int i = 0; i < data.length; i++){
            for(int j = 0; j < data[i].length; j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    int citySelector(){
        int totalCost = 0;
        int temp;
        for(int i = 0; i < data.length; i++){
            if(data[i][0] < data[i][1]){
                temp = data[i][0];
            } else {
                temp = data[i][1];
            }
            totalCost += temp;
//            System.out.println("TEMP: " + temp);
//            System.out.println("TOTAL COST: " + totalCost);

//            for(int j = 0; j < data[i].length; j++){
//                temp = data[i][j];
//                if(data[i][j] < temp){
//                    temp += totalCost;
//                    System.out.println("TEMP: " + temp + " TOTAL COST: " + totalCost);
//                }
//            }
        }

        return totalCost;
    }
}
