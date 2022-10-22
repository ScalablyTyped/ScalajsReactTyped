package typingsJapgolly.xrm.Xrm.Controls

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the disabled value updated.
  */
trait UiCanSetDisabledElement extends StObject {
  
  /**
    * Sets the state of the control to either enabled, or disabled.
    * @param disabled true to disable, false to enable.
    */
  def setDisabled(disabled: Boolean): Unit
}
object UiCanSetDisabledElement {
  
  inline def apply(setDisabled: Boolean => Callback): UiCanSetDisabledElement = {
    val __obj = js.Dynamic.literal(setDisabled = js.Any.fromFunction1((t0: Boolean) => setDisabled(t0).runNow()))
    __obj.asInstanceOf[UiCanSetDisabledElement]
  }
  
  extension [Self <: UiCanSetDisabledElement](x: Self) {
    
    inline def setSetDisabled(value: Boolean => Callback): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
