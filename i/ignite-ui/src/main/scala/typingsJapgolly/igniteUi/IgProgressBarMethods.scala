package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgProgressBarMethods extends StObject {
  
  def destroy(): Unit
  
  def value(newValue: js.Object): Unit
  
  def widget(): Unit
}
object IgProgressBarMethods {
  
  inline def apply(destroy: Callback, value: js.Object => Callback, widget: Callback): IgProgressBarMethods = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, value = js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()), widget = widget.toJsFn)
    __obj.asInstanceOf[IgProgressBarMethods]
  }
  
  extension [Self <: IgProgressBarMethods](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setValue(value: js.Object => Callback): Self = StObject.set(x, "value", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    
    inline def setWidget(value: Callback): Self = StObject.set(x, "widget", value.toJsFn)
  }
}
