public class parcial {
    public static boolean isMultiple(int a, int b) {
      if (a % b == 0) {
        return true;
      } else if (b % a == 0) {
        return true;
      } else {
        return false;
      }
    }
  
    public static void checkMultiples(int a, int b) {
      if (isMultiple(a, b)) {
        System.out.println(a + " y " + b + " tienen una relación de múltiplo");
      } else {
        System.out.println(a + " y " + b + " no tienen una relación de múltiplo");
      }
    }
  
    public static void main(String[] args) {
      checkMultiples(7919, 2);
      checkMultiples(840, 210);
      checkMultiples(678223072849, 23);
      checkMultiples(1299827, 104729);
      checkMultiples(104728, 13);
    }
  }