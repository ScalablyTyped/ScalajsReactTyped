package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import typingsJapgolly.trimblemapsTrimblemapsJs.anon.DataAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RailStationRequest extends StObject {
  
  def callback(error: js.Error, result: DataAny): Unit
  @JSName("callback")
  var callback_Original: Callback[DataAny]
  
  var splc: String
}
object RailStationRequest {
  
  inline def apply(callback: (/* error */ js.Error, DataAny) => japgolly.scalajs.react.Callback, splc: String): RailStationRequest = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2((t0: /* error */ js.Error, t1: DataAny) => (callback(t0, t1)).runNow()), splc = splc.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailStationRequest]
  }
  
  extension [Self <: RailStationRequest](x: Self) {
    
    inline def setCallback(value: (/* error */ js.Error, DataAny) => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* error */ js.Error, t1: DataAny) => (value(t0, t1)).runNow()))
    
    inline def setSplc(value: String): Self = StObject.set(x, "splc", value.asInstanceOf[js.Any])
  }
}
