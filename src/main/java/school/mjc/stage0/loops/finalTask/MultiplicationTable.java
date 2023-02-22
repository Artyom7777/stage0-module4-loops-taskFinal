package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int result = 0;
        for(int i = 1; i <= 10; i++){
            result = i * numberTableToPrint;
            System.out.println(i + " x " + numberTableToPrint + " = " + result);
        }
    }
}
