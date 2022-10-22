package typingsJapgolly.devexpressWeb

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides base functionality for the ASPxClientScheduler's forms.
  */
trait ASPxClientFormBase extends StObject {
  
  /**
    * Closes the form.
    */
  def Close(): Unit
  
  /**
    * Occurs when the form has been closed.
    */
  var FormClosed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]]
  
  /**
    * Sets the visibility state of the specified form element.
    * @param element An object specifying the element whose visibility state should be changed.
    * @param isVisible true to display the element; false to hide the element.
    */
  def SetVisibleCore(element: Any, isVisible: Boolean): Unit
}
object ASPxClientFormBase {
  
  inline def apply(
    Close: Callback,
    FormClosed: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]],
    SetVisibleCore: (Any, Boolean) => Callback
  ): ASPxClientFormBase = {
    val __obj = js.Dynamic.literal(Close = Close.toJsFn, FormClosed = FormClosed.asInstanceOf[js.Any], SetVisibleCore = js.Any.fromFunction2((t0: Any, t1: Boolean) => (SetVisibleCore(t0, t1)).runNow()))
    __obj.asInstanceOf[ASPxClientFormBase]
  }
  
  extension [Self <: ASPxClientFormBase](x: Self) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "Close", value.toJsFn)
    
    inline def setFormClosed(value: ASPxClientEvent[ASPxClientEventHandler[ASPxClientFormBase]]): Self = StObject.set(x, "FormClosed", value.asInstanceOf[js.Any])
    
    inline def setSetVisibleCore(value: (Any, Boolean) => Callback): Self = StObject.set(x, "SetVisibleCore", js.Any.fromFunction2((t0: Any, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
