public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < array2d[0].length; j++){
                sum = sum + array2d[i][j];
            }
        }
        return sum;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        int count = 0;
        for(int i = 0; i < array2d.length; i++){
            int sum = 0;
            for(int j = 0; j < array2d[0].length; j++){
                sum = sum + array2d[i][j];
            }
            if(sum == checkSum){
                count++;
            }
        }
        if(count == array2d.length){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        int count = 0;
        for(int i = 0; i < array2d.length; i++) {
            int sum = 0;
            for (int j = 0; j < array2d[0].length; j++) {
                sum = sum + array2d[j][i];
            }
            if (sum == checkSum) {
                count++;
            }

        }
        if (count == array2d.length) {
            return true;
        } else return false;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int count = 0;
        int sum1 = 0;
        for(int i = 0; i < array2d.length; i++){
            sum1 = sum1 + array2d[i][i];
        }
        int sum2 = 0;
        for(int i = 0; i < array2d.length; i++){
            sum2 = sum2 + array2d[i][array2d.length-1 - i];
        }
        if(sum1 == sum2 && sum1== checkSum){
            return true;
        }
        else return false;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int checkSum = 0;
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < array2d[0].length; j++){
                checkSum = checkSum + array2d[i][j];
            }
        }
        boolean row = magicRows(array2d, checkSum);
        boolean col = magicColumns(array2d, checkSum);
        boolean diagonal = magicDiagonals(array2d, checkSum);
        if(row == true && col == true && diagonal == true){
            return true;
        }
        else return false;
    }

}
