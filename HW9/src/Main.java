public class Main {

    public static void main(String[] args)  {
        String [][] squere=new String[][]{{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "0", "1", "2"}, {"3", "4", "5", "6"}};
        try {
            twoEnter(squere);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

    }
    public static void twoEnter(String[][] array) throws MyArraySizeException,MyArrayDataException {
        int sum=0;


        for (int x=0;x<array.length;x++){
            for (int y=0;y<array.length;y++){
                if (array[x].length!=4){
                    throw new MyArraySizeException("Wrong length");
                }

                try {
                    sum=sum+Integer.parseInt(array[x][y]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(x,y,"Wrong value on:");
                }
            }
        }
        System.out.println("Сумма всего масива:"+sum);
    }
}
