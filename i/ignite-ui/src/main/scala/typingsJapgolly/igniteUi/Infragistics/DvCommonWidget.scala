package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvCommonWidget extends StObject {
  
  def option(key: js.Object, value: js.Object): Unit
}
object DvCommonWidget {
  
  inline def apply(option: (js.Object, js.Object) => Callback): DvCommonWidget = {
    val __obj = js.Dynamic.literal(option = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (option(t0, t1)).runNow()))
    __obj.asInstanceOf[DvCommonWidget]
  }
  
  extension [Self <: DvCommonWidget](x: Self) {
    
    inline def setOption(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "option", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
  }
}
