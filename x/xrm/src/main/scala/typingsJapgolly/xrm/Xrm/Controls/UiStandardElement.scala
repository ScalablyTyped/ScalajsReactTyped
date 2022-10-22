package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base interface for standard UI elements.
  */
trait UiStandardElement
  extends StObject
     with UiCanGetVisibleElement
     with UiLabelElement {
  
  /**
    * Sets the visibility state.
    * @param visible true to show, false to hide.
    */
  def setVisible(visible: Boolean): Unit
}
object UiStandardElement {
  
  inline def apply(
    getLabel: CallbackTo[String],
    getVisible: CallbackTo[Boolean],
    setLabel: String => Callback,
    setVisible: Boolean => Callback
  ): UiStandardElement = {
    val __obj = js.Dynamic.literal(getLabel = getLabel.toJsFn, getVisible = getVisible.toJsFn, setLabel = js.Any.fromFunction1((t0: String) => setLabel(t0).runNow()), setVisible = js.Any.fromFunction1((t0: Boolean) => setVisible(t0).runNow()))
    __obj.asInstanceOf[UiStandardElement]
  }
  
  extension [Self <: UiStandardElement](x: Self) {
    
    inline def setSetVisible(value: Boolean => Callback): Self = StObject.set(x, "setVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
