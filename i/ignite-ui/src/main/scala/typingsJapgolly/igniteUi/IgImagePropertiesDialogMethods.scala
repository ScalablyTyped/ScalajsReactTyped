package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgImagePropertiesDialogMethods extends StObject {
  
  def hide(): Unit
  
  def show(item: js.Object): Unit
}
object IgImagePropertiesDialogMethods {
  
  inline def apply(hide: Callback, show: js.Object => Callback): IgImagePropertiesDialogMethods = {
    val __obj = js.Dynamic.literal(hide = hide.toJsFn, show = js.Any.fromFunction1((t0: js.Object) => show(t0).runNow()))
    __obj.asInstanceOf[IgImagePropertiesDialogMethods]
  }
  
  extension [Self <: IgImagePropertiesDialogMethods](x: Self) {
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: js.Object => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
  }
}
