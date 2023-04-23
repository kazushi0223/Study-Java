package bunki;

public class TestApp {
	  public static void main(String[] args) {
	    try {
	      String s = null;
	      System.out.println(s.toUpperCase());
	    } catch (IndexOutOfBoundsException e) {
	      System.out.println("Out of range exception.");
	    } catch (NullPointerException e) {
	      System.out.println("A NullPointerException was caught.");
	      System.out.println(e);
	    } catch (Exception e) {
	      System.out.println("Unknown exception");
	    }
	  }
	}
