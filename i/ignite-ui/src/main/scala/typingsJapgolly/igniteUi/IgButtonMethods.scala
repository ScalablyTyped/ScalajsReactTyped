package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgButtonMethods extends StObject {
  
  def destroy(): Unit
  
  def setTitle(title: js.Object): Unit
  
  def widget(): Unit
}
object IgButtonMethods {
  
  inline def apply(destroy: Callback, setTitle: js.Object => Callback, widget: Callback): IgButtonMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, setTitle = js.Any.fromFunction1((t0: js.Object) => setTitle(t0).runNow()), widget = widget.toJsFn)
    __obj.asInstanceOf[IgButtonMethods]
  }
  
  extension [Self <: IgButtonMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setSetTitle(value: js.Object => Callback): Self = StObject.set(x, "setTitle", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setWidget(value: Callback): Self = StObject.set(x, "widget", value.toJsFn)
  }
}
