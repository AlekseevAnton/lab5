package src.ru.alekseev.lab5.classes;

import org.junit.Test;
import static org.junit.Assert.*;
import ru.alekseev.lab5.Rectangle;

public class RectangleTest {

  @Test
  public void testGetX() {
    System.out.println("Проверка метода getX()");
    Rectangle r = new Rectangle(3,4,2,3,4,5,6,7);
    assertEquals(3, r.getX(),0.00001);
  }
  
  @Test
  public void testGetY() {
    System.out.println("Проверка метода getY()");
    Rectangle r = new Rectangle(3,4,2,3,4,5,6,7);
    assertEquals(4, r.getY(),0.00001);
  }
}
