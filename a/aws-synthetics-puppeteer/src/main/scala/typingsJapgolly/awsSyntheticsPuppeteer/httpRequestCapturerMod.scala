package typingsJapgolly.awsSyntheticsPuppeteer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.awsSyntheticsPuppeteer.httpRequestsReportMod.HttpTimingsResult
import typingsJapgolly.awsSyntheticsPuppeteer.syntheticsConfigurationMod.SyntheticsConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpRequestCapturerMod extends Shortcut {
  
  @JSImport("HttpRequestCapturer", JSImport.Namespace)
  @js.native
  val ^ : HttpRequestCapturer = js.native
  
  /**
    * This module captures HTTP requests for reporting and creates traces if enabled.
    */
  trait HttpRequestCapturer extends StObject {
    
    var _executionError: Any
    
    var _httpRequestCount: Double
    
    var _httpRequests: js.Array[Any]
    
    var _requestsResult: Any
    
    var _syntheticsConfiguration: SyntheticsConfiguration
    
    var _tracing: Any
    
    def addHelperHeaders(stepId: Any, requestOptions: Any, body: Any, stepConfig: Any): Unit
    
    def addRequest(stepId: Any, request: Any): Unit
    
    def captureHTTPsGlobal(module: Any): Unit
    
    def configure(requestsResult: Any, tracing: Any, syntheticsConfiguration: Any): Unit
    
    def enableCapture(module: Any): Unit
    
    def getExecutionError(): Any
    
    def getHttpRequests(): js.Array[Any]
    
    def getHttpTimings(timings: Any): HttpTimingsResult
    
    def getRequestsResult(): Any
    
    def getStepHttpMapping(): js.Object
    
    def isLibraryGeneratedRequest(requestOptions: Any): Boolean
    
    def reset(): Unit
    
    def setExecutionError(err: Any): Unit
    
    def startCapture(): Unit
  }
  object HttpRequestCapturer {
    
    inline def apply(
      _executionError: Any,
      _httpRequestCount: Double,
      _httpRequests: js.Array[Any],
      _requestsResult: Any,
      _syntheticsConfiguration: SyntheticsConfiguration,
      _tracing: Any,
      addHelperHeaders: (Any, Any, Any, Any) => Callback,
      addRequest: (Any, Any) => Callback,
      captureHTTPsGlobal: Any => Callback,
      configure: (Any, Any, Any) => Callback,
      enableCapture: Any => Callback,
      getExecutionError: CallbackTo[Any],
      getHttpRequests: CallbackTo[js.Array[Any]],
      getHttpTimings: Any => HttpTimingsResult,
      getRequestsResult: CallbackTo[Any],
      getStepHttpMapping: CallbackTo[js.Object],
      isLibraryGeneratedRequest: Any => Boolean,
      reset: Callback,
      setExecutionError: Any => Callback,
      startCapture: Callback
    ): HttpRequestCapturer = {
      val __obj = js.Dynamic.literal(_executionError = _executionError.asInstanceOf[js.Any], _httpRequestCount = _httpRequestCount.asInstanceOf[js.Any], _httpRequests = _httpRequests.asInstanceOf[js.Any], _requestsResult = _requestsResult.asInstanceOf[js.Any], _syntheticsConfiguration = _syntheticsConfiguration.asInstanceOf[js.Any], _tracing = _tracing.asInstanceOf[js.Any], addHelperHeaders = js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (addHelperHeaders(t0, t1, t2, t3)).runNow()), addRequest = js.Any.fromFunction2((t0: Any, t1: Any) => (addRequest(t0, t1)).runNow()), captureHTTPsGlobal = js.Any.fromFunction1((t0: Any) => captureHTTPsGlobal(t0).runNow()), configure = js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (configure(t0, t1, t2)).runNow()), enableCapture = js.Any.fromFunction1((t0: Any) => enableCapture(t0).runNow()), getExecutionError = getExecutionError.toJsFn, getHttpRequests = getHttpRequests.toJsFn, getHttpTimings = js.Any.fromFunction1(getHttpTimings), getRequestsResult = getRequestsResult.toJsFn, getStepHttpMapping = getStepHttpMapping.toJsFn, isLibraryGeneratedRequest = js.Any.fromFunction1(isLibraryGeneratedRequest), reset = reset.toJsFn, setExecutionError = js.Any.fromFunction1((t0: Any) => setExecutionError(t0).runNow()), startCapture = startCapture.toJsFn)
      __obj.asInstanceOf[HttpRequestCapturer]
    }
    
    extension [Self <: HttpRequestCapturer](x: Self) {
      
      inline def setAddHelperHeaders(value: (Any, Any, Any, Any) => Callback): Self = StObject.set(x, "addHelperHeaders", js.Any.fromFunction4((t0: Any, t1: Any, t2: Any, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setAddRequest(value: (Any, Any) => Callback): Self = StObject.set(x, "addRequest", js.Any.fromFunction2((t0: Any, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setCaptureHTTPsGlobal(value: Any => Callback): Self = StObject.set(x, "captureHTTPsGlobal", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setConfigure(value: (Any, Any, Any) => Callback): Self = StObject.set(x, "configure", js.Any.fromFunction3((t0: Any, t1: Any, t2: Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setEnableCapture(value: Any => Callback): Self = StObject.set(x, "enableCapture", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setGetExecutionError(value: CallbackTo[Any]): Self = StObject.set(x, "getExecutionError", value.toJsFn)
      
      inline def setGetHttpRequests(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "getHttpRequests", value.toJsFn)
      
      inline def setGetHttpTimings(value: Any => HttpTimingsResult): Self = StObject.set(x, "getHttpTimings", js.Any.fromFunction1(value))
      
      inline def setGetRequestsResult(value: CallbackTo[Any]): Self = StObject.set(x, "getRequestsResult", value.toJsFn)
      
      inline def setGetStepHttpMapping(value: CallbackTo[js.Object]): Self = StObject.set(x, "getStepHttpMapping", value.toJsFn)
      
      inline def setIsLibraryGeneratedRequest(value: Any => Boolean): Self = StObject.set(x, "isLibraryGeneratedRequest", js.Any.fromFunction1(value))
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
      
      inline def setSetExecutionError(value: Any => Callback): Self = StObject.set(x, "setExecutionError", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setStartCapture(value: Callback): Self = StObject.set(x, "startCapture", value.toJsFn)
      
      inline def set_executionError(value: Any): Self = StObject.set(x, "_executionError", value.asInstanceOf[js.Any])
      
      inline def set_httpRequestCount(value: Double): Self = StObject.set(x, "_httpRequestCount", value.asInstanceOf[js.Any])
      
      inline def set_httpRequests(value: js.Array[Any]): Self = StObject.set(x, "_httpRequests", value.asInstanceOf[js.Any])
      
      inline def set_httpRequestsVarargs(value: Any*): Self = StObject.set(x, "_httpRequests", js.Array(value*))
      
      inline def set_requestsResult(value: Any): Self = StObject.set(x, "_requestsResult", value.asInstanceOf[js.Any])
      
      inline def set_syntheticsConfiguration(value: SyntheticsConfiguration): Self = StObject.set(x, "_syntheticsConfiguration", value.asInstanceOf[js.Any])
      
      inline def set_tracing(value: Any): Self = StObject.set(x, "_tracing", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = HttpRequestCapturer
  
  /* This means you don't have to write `^`, but can instead just say `httpRequestCapturerMod.foo` */
  override def _to: HttpRequestCapturer = ^
}
