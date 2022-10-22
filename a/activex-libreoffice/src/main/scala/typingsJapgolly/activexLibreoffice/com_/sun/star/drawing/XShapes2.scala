package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Allows insertion of shapes at different positions.
  * @since LibreOffice 4.2
  */
trait XShapes2 extends StObject {
  
  /**
    * Insert a new shape to the bottom of the stack.
    * @param xShape shape to be inserted.
    * @since LibreOffice 4.2
    */
  def addBottom(xShape: XShape): Unit
  
  /**
    * Insert a new shape to the top of the stack.
    * @param xShape shape to be inserted.
    * @since LibreOffice 4.2
    */
  def addTop(xShape: XShape): Unit
}
object XShapes2 {
  
  inline def apply(addBottom: XShape => Callback, addTop: XShape => Callback): XShapes2 = {
    val __obj = js.Dynamic.literal(addBottom = js.Any.fromFunction1((t0: XShape) => addBottom(t0).runNow()), addTop = js.Any.fromFunction1((t0: XShape) => addTop(t0).runNow()))
    __obj.asInstanceOf[XShapes2]
  }
  
  extension [Self <: XShapes2](x: Self) {
    
    inline def setAddBottom(value: XShape => Callback): Self = StObject.set(x, "addBottom", js.Any.fromFunction1((t0: XShape) => value(t0).runNow()))
    
    inline def setAddTop(value: XShape => Callback): Self = StObject.set(x, "addTop", js.Any.fromFunction1((t0: XShape) => value(t0).runNow()))
  }
}
