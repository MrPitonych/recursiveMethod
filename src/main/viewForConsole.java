package main;

/**
 * Created by dav19 on 19.03.2017.
 */
public class viewForConsole {
      public static void viewResult(int[] Price, int[] foundDays){

          int firstDay =  foundDays[0];
          int endDay = foundDays[1];

          System.out.print("Цена акций: ");
          for (Integer aPrice : Price) {
              String s = Integer.toString(aPrice);
              System.out.print(s + "," + " ");
          }
          System.out.print("\n");

          System.out.print("Массив изменений: ");
          Integer Delta[] = new Integer[Price.length - 1];
          for (int i = 0; i < Delta.length; ++i) {
              Delta[i] = Price[i + 1] - Price[i];
              String s = Integer.toString(Delta[i]);
              System.out.print(s + "," + " ");
          }
          System.out.print("\n");

         System.out.print("Максимальный подмассив Delta: ");
          for (int i = firstDay; i < endDay; ++i) {
              String s = Integer.toString(Delta[i]);
              System.out.print(s + "," + " ");
          }
          System.out.print("\n");

          System.out.print("Лучший день для покупки акций " + Integer.toString(firstDay + 1) + "й" + " " +
                  "- цена " + Integer.toString(Price[firstDay]) +
                  ", а лучший день для продажи " + Integer.toString(endDay + 1) + "й" + " " +
                  "- цена " + Integer.toString(Price[endDay]) + "\n");
          System.out.print("Чистый заработок: " + Integer.toString(Price[endDay] - Price[firstDay]));
      }
}

