package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows injection of keyboard and mouse events
  * @since LibreOffice 5.1
  */
trait XToolkitRobot extends StObject {
  
  def keyPress(aKeyEvent: KeyEvent): Unit
  
  def keyRelease(aKeyEvent: KeyEvent): Unit
  
  def mouseMove(aMouseEvent: MouseEvent): Unit
  
  def mousePress(aMouseEvent: MouseEvent): Unit
  
  def mouseRelease(aMouseEvent: MouseEvent): Unit
}
object XToolkitRobot {
  
  inline def apply(
    keyPress: KeyEvent => Callback,
    keyRelease: KeyEvent => Callback,
    mouseMove: MouseEvent => Callback,
    mousePress: MouseEvent => Callback,
    mouseRelease: MouseEvent => Callback
  ): XToolkitRobot = {
    val __obj = js.Dynamic.literal(keyPress = js.Any.fromFunction1((t0: KeyEvent) => keyPress(t0).runNow()), keyRelease = js.Any.fromFunction1((t0: KeyEvent) => keyRelease(t0).runNow()), mouseMove = js.Any.fromFunction1((t0: MouseEvent) => mouseMove(t0).runNow()), mousePress = js.Any.fromFunction1((t0: MouseEvent) => mousePress(t0).runNow()), mouseRelease = js.Any.fromFunction1((t0: MouseEvent) => mouseRelease(t0).runNow()))
    __obj.asInstanceOf[XToolkitRobot]
  }
  
  extension [Self <: XToolkitRobot](x: Self) {
    
    inline def setKeyPress(value: KeyEvent => Callback): Self = StObject.set(x, "keyPress", js.Any.fromFunction1((t0: KeyEvent) => value(t0).runNow()))
    
    inline def setKeyRelease(value: KeyEvent => Callback): Self = StObject.set(x, "keyRelease", js.Any.fromFunction1((t0: KeyEvent) => value(t0).runNow()))
    
    inline def setMouseMove(value: MouseEvent => Callback): Self = StObject.set(x, "mouseMove", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setMousePress(value: MouseEvent => Callback): Self = StObject.set(x, "mousePress", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setMouseRelease(value: MouseEvent => Callback): Self = StObject.set(x, "mouseRelease", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
  }
}
