package src.ru.alekseev.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.alekseev.lab5.Triangle;

public class TriangleTest {

  @Test
  public void testGetX() {
    System.out.println("Проверка метода getX()");
    Triangle t = new Triangle(3,4,3,4,5,6);
    assertEquals(3, t.getX(),0.00001);
  }
  
  @Test
  public void testGetY() {
    System.out.println("Проверка метода getY()");
    Triangle t = new Triangle(3,4,3,4,5,6);
    assertEquals(4, t.getY(),0.00001);
  }
}
