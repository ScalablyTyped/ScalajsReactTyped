package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgToolbarButtonMethods extends StObject {
  
  /**
    * Activate toolbar button
    *
    * @param event
    */
  def activate(event: js.Object): Unit
  
  /**
    * Deactivate toolbar button
    *
    * @param event
    */
  def deactivate(event: js.Object): Unit
  
  /**
    * Destroy the widget.
    */
  def destroy(): Unit
  
  /**
    * Toggle toolbar button
    */
  def toggle(): Unit
  
  /**
    * Returns the element that represents this widget.
    */
  def widget(): js.Object
}
object IgToolbarButtonMethods {
  
  inline def apply(
    activate: js.Object => Callback,
    deactivate: js.Object => Callback,
    destroy: Callback,
    toggle: Callback,
    widget: CallbackTo[js.Object]
  ): IgToolbarButtonMethods = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1((t0: js.Object) => activate(t0).runNow()), deactivate = js.Any.fromFunction1((t0: js.Object) => deactivate(t0).runNow()), destroy = destroy.toJsFn, toggle = toggle.toJsFn, widget = widget.toJsFn)
    __obj.asInstanceOf[IgToolbarButtonMethods]
  }
  
  extension [Self <: IgToolbarButtonMethods](x: Self) {
    
    inline def setActivate(value: js.Object => Callback): Self = StObject.set(x, "activate", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDeactivate(value: js.Object => Callback): Self = StObject.set(x, "deactivate", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    
    inline def setWidget(value: CallbackTo[js.Object]): Self = StObject.set(x, "widget", value.toJsFn)
  }
}
