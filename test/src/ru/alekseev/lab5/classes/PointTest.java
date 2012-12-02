package src.ru.alekseev.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.alekseev.lab5.Point;

public class PointTest {

  @Test
  public void testGetX() {
    System.out.println("Проверка метода getX()");
    Point p = new Point(3,4);
    assertEquals(3, p.getX(),0.00001);
  }
  
  @Test
  public void testGetY() {
    System.out.println("Проверка метода getY()");
    Point p = new Point(3,4);
    assertEquals(4, p.getY(),0.00001);
  }
}
