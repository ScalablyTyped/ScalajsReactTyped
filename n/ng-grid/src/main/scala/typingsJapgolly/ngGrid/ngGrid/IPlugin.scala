package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPlugin extends StObject {
  
  def init(childScope: IGridScope, gridInstance: IGridInstance, services: Any): Unit
}
object IPlugin {
  
  inline def apply(init: (IGridScope, IGridInstance, Any) => Callback): IPlugin = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3((t0: IGridScope, t1: IGridInstance, t2: Any) => (init(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[IPlugin]
  }
  
  extension [Self <: IPlugin](x: Self) {
    
    inline def setInit(value: (IGridScope, IGridInstance, Any) => Callback): Self = StObject.set(x, "init", js.Any.fromFunction3((t0: IGridScope, t1: IGridInstance, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
