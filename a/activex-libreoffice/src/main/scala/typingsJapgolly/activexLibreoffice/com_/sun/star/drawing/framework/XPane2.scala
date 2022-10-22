package typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.framework

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility.XAccessible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An extension of the {@link XPane} interface that adds support for a) showing and hiding the windows that internally belong to the pane and b) setting
  * the accessibility object. This is typically an optional interface.
  */
trait XPane2 extends StObject {
  
  /** Return the accessibility object that is currently associated with the windows that implement the pane. */
  var Accessible: XAccessible
  
  /** Return the accessibility object that is currently associated with the windows that implement the pane. */
  def getAccessible(): XAccessible
  
  /**
    * Return whether all windows that are used to implement the pane are visible.
    * @returns `TRUE` when all windows of the pane are visible.
    */
  def isVisible(): Boolean
  
  /**
    * Set the accessibility object for the pane. When there is more than one window used to implement the pane then the given accessibility object is
    * usually set at the topmost window. However, the details are implementation dependent.
    * @param xAccessible May be an empty reference.
    */
  def setAccessible(xAccessible: XAccessible): Unit
  
  /**
    * Hide or show the pane. If there is more than one window used to implement the pane then it is left to the implementation if one, some, or all windows
    * are hidden or shown as long as the pane becomes hidden or visible.
    * @param bIsVisible When `TRUE` then show the pane. Hide it otherwise.
    */
  def setVisible(bIsVisible: Boolean): Unit
}
object XPane2 {
  
  inline def apply(
    Accessible: XAccessible,
    getAccessible: CallbackTo[XAccessible],
    isVisible: CallbackTo[Boolean],
    setAccessible: XAccessible => Callback,
    setVisible: Boolean => Callback
  ): XPane2 = {
    val __obj = js.Dynamic.literal(Accessible = Accessible.asInstanceOf[js.Any], getAccessible = getAccessible.toJsFn, isVisible = isVisible.toJsFn, setAccessible = js.Any.fromFunction1((t0: XAccessible) => setAccessible(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[XPane2]
  }
  
  extension [Self <: XPane2](x: Self) {
    
    inline def setAccessible(value: XAccessible): Self = StObject.set(x, "Accessible", value.asInstanceOf[js.Any])
    
    inline def setGetAccessible(value: CallbackTo[XAccessible]): Self = StObject.set(x, "getAccessible", value.toJsFn)
    
    inline def setIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "isVisible", value.toJsFn)
    
    inline def setSetAccessible(value: XAccessible => Callback): Self = StObject.set(x, "setAccessible", js.Any.fromFunction1((t0: XAccessible) => value(t0).runNow()))
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
