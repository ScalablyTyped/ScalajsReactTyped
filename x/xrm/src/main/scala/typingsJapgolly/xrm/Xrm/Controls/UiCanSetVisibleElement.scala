package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the visibility value updated.
  */
trait UiCanSetVisibleElement extends StObject {
  
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: Boolean): Unit
}
object UiCanSetVisibleElement {
  
  inline def apply(setVisible: Boolean => Callback): UiCanSetVisibleElement = {
    val __obj = js.Dynamic.literal(setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[UiCanSetVisibleElement]
  }
  
  extension [Self <: UiCanSetVisibleElement](x: Self) {
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
