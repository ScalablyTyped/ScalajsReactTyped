package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Close[Value, FilterParams] extends StObject {
  
  def close(): Unit
  
  var data: js.Array[Value]
  
  var filterParams: js.UndefOr[FilterParams] = js.undefined
  
  def setFilter(a: FilterParams): Unit
}
object Close {
  
  inline def apply[Value, FilterParams](close: Callback, data: js.Array[Value], setFilter: FilterParams => Callback): Close[Value, FilterParams] = {
    val __obj = js.Dynamic.literal(close = close.toJsFn, data = data.asInstanceOf[js.Any], setFilter = js.Any.fromFunction1((t0: FilterParams) => setFilter(t0).runNow()))
    __obj.asInstanceOf[Close[Value, FilterParams]]
  }
  
  extension [Self <: Close[?, ?], Value, FilterParams](x: Self & (Close[Value, FilterParams])) {
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setData(value: js.Array[Value]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Value*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setFilterParams(value: FilterParams): Self = StObject.set(x, "filterParams", value.asInstanceOf[js.Any])
    
    inline def setFilterParamsUndefined: Self = StObject.set(x, "filterParams", js.undefined)
    
    inline def setSetFilter(value: FilterParams => Callback): Self = StObject.set(x, "setFilter", js.Any.fromFunction1((t0: FilterParams) => value(t0).runNow()))
  }
}
