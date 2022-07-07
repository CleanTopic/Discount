public class Main {
    public static void main(String[] args) {
        int price[] = new int[5]; //Создаем Массив
        int discount;
        int offset;
        int readLength;
        price[0] = 5;
        price[1] = 100;
        price[2] = 20;
        price[3] = 66;
        price[4] = 16;

        discount = 2; // Число заданное 50% == 2
        offset = 1; //Начальная точка
        readLength = 3; //Длинна
        readLength++;//Уведичиваем на единицу


        for(int i = offset; i < readLength; i++){
            double value = Math.floor(price[i]/discount);
            System.out.println(value);
        }
    }

}



