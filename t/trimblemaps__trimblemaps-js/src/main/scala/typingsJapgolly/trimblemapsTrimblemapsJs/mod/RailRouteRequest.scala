package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import typingsJapgolly.trimblemapsTrimblemapsJs.anon.DataAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RailRouteRequest extends StObject {
  
  def callback(error: js.Error, result: DataAny): Unit
  @JSName("callback")
  var callback_Original: Callback[DataAny]
  
  var options: RailRouteOptions
  
  var stops: js.Array[RailStation]
}
object RailRouteRequest {
  
  inline def apply(
    callback: (/* error */ js.Error, DataAny) => japgolly.scalajs.react.Callback,
    options: RailRouteOptions,
    stops: js.Array[RailStation]
  ): RailRouteRequest = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: /* error */ js.Error, t1: DataAny) => (callback(t0, t1)).runNow()), options = options.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailRouteRequest]
  }
  
  extension [Self <: RailRouteRequest](x: Self) {
    
    inline def setCallback(value: (/* error */ js.Error, DataAny) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* error */ js.Error, t1: DataAny) => (value(t0, t1)).runNow()))
    
    inline def setOptions(value: RailRouteOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[RailStation]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: RailStation*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
