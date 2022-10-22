package typingsJapgolly.igniteUi.Infragistics

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HierarchicalDataSource extends StObject {
  
  def dataAt(path: js.Object, keyspath: js.Object): Unit
  
  def dataBind(callback: js.Object, callee: js.Object): Unit
  
  def root(): Unit
}
object HierarchicalDataSource {
  
  inline def apply(
    dataAt: (js.Object, js.Object) => Callback,
    dataBind: (js.Object, js.Object) => Callback,
    root: Callback
  ): HierarchicalDataSource = {
    val __obj = js.Dynamic.literal(dataAt = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (dataAt(t0, t1)).runNow()), dataBind = js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (dataBind(t0, t1)).runNow()), root = root.toJsFn)
    __obj.asInstanceOf[HierarchicalDataSource]
  }
  
  extension [Self <: HierarchicalDataSource](x: Self) {
    
    inline def setDataAt(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "dataAt", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setDataBind(value: (js.Object, js.Object) => Callback): Self = StObject.set(x, "dataBind", js.Any.fromFunction2((t0: js.Object, t1: js.Object) => (value(t0, t1)).runNow()))
    
    inline def setRoot(value: Callback): Self = StObject.set(x, "root", value.toJsFn)
  }
}
