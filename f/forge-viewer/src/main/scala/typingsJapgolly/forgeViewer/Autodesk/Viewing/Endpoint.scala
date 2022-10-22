package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  var ENDPOINT_API_D3S: String
  
  var ENDPOINT_API_DERIVATIVE_SERVICE_V2: String
  
  var ENDPOINT_API_DERIVATIVE_STREAMING: String
  
  var ENDPOINT_API_FLUENT: String
  
  var ENDPOINT_API_MODEL_DERIVATIVE_V2: String
  
  def getApiEndpoint(): String
  
  def getEndpointAndApi(): String
  
  def setEndpointAndApi(endpoint: String, api: String): Unit
}
object Endpoint {
  
  inline def apply(
    ENDPOINT_API_D3S: String,
    ENDPOINT_API_DERIVATIVE_SERVICE_V2: String,
    ENDPOINT_API_DERIVATIVE_STREAMING: String,
    ENDPOINT_API_FLUENT: String,
    ENDPOINT_API_MODEL_DERIVATIVE_V2: String,
    getApiEndpoint: CallbackTo[String],
    getEndpointAndApi: CallbackTo[String],
    setEndpointAndApi: (String, String) => Callback
  ): Endpoint = {
    val __obj = js.Dynamic.literal(ENDPOINT_API_D3S = ENDPOINT_API_D3S.asInstanceOf[js.Any], ENDPOINT_API_DERIVATIVE_SERVICE_V2 = ENDPOINT_API_DERIVATIVE_SERVICE_V2.asInstanceOf[js.Any], ENDPOINT_API_DERIVATIVE_STREAMING = ENDPOINT_API_DERIVATIVE_STREAMING.asInstanceOf[js.Any], ENDPOINT_API_FLUENT = ENDPOINT_API_FLUENT.asInstanceOf[js.Any], ENDPOINT_API_MODEL_DERIVATIVE_V2 = ENDPOINT_API_MODEL_DERIVATIVE_V2.asInstanceOf[js.Any], getApiEndpoint = getApiEndpoint.toJsFn, getEndpointAndApi = getEndpointAndApi.toJsFn, setEndpointAndApi = js.Any.fromFunction2((t0: String, t1: String) => (setEndpointAndApi(t0, t1)).runNow()))
    __obj.asInstanceOf[Endpoint]
  }
  
  extension [Self <: Endpoint](x: Self) {
    
    inline def setENDPOINT_API_D3S(value: String): Self = StObject.set(x, "ENDPOINT_API_D3S", value.asInstanceOf[js.Any])
    
    inline def setENDPOINT_API_DERIVATIVE_SERVICE_V2(value: String): Self = StObject.set(x, "ENDPOINT_API_DERIVATIVE_SERVICE_V2", value.asInstanceOf[js.Any])
    
    inline def setENDPOINT_API_DERIVATIVE_STREAMING(value: String): Self = StObject.set(x, "ENDPOINT_API_DERIVATIVE_STREAMING", value.asInstanceOf[js.Any])
    
    inline def setENDPOINT_API_FLUENT(value: String): Self = StObject.set(x, "ENDPOINT_API_FLUENT", value.asInstanceOf[js.Any])
    
    inline def setENDPOINT_API_MODEL_DERIVATIVE_V2(value: String): Self = StObject.set(x, "ENDPOINT_API_MODEL_DERIVATIVE_V2", value.asInstanceOf[js.Any])
    
    inline def setGetApiEndpoint(value: CallbackTo[String]): Self = StObject.set(x, "getApiEndpoint", value.toJsFn)
    
    inline def setGetEndpointAndApi(value: CallbackTo[String]): Self = StObject.set(x, "getEndpointAndApi", value.toJsFn)
    
    inline def setSetEndpointAndApi(value: (String, String) => Callback): Self = StObject.set(x, "setEndpointAndApi", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
