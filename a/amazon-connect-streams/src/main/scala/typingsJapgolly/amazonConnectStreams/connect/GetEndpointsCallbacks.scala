package typingsJapgolly.amazonConnectStreams.connect

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointsCallbacks extends StObject {
  
  val failure: js.UndefOr[SuccessFailCallback[js.Array[String]]] = js.undefined
  
  def success(
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: js.Array[GetEndpointsResult]
  ): Unit
}
object GetEndpointsCallbacks {
  
  inline def apply(success: js.Array[GetEndpointsResult] => Callback): GetEndpointsCallbacks = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1((t0: js.Array[GetEndpointsResult]) => success(t0).runNow()))
    __obj.asInstanceOf[GetEndpointsCallbacks]
  }
  
  extension [Self <: GetEndpointsCallbacks](x: Self) {
    
    inline def setFailure(value: js.Array[String] => Callback): Self = StObject.set(x, "failure", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
    
    inline def setFailureUndefined: Self = StObject.set(x, "failure", js.undefined)
    
    inline def setSuccess(value: js.Array[GetEndpointsResult] => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: js.Array[GetEndpointsResult]) => value(t0).runNow()))
  }
}
