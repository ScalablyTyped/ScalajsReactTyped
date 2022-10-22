package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SOAPResponseV2 extends StObject {
  
  def getBody(): String
  
  def getErrorCode(): Double
  
  def getErrorMessage(): String
  
  def getHeader(name: String): String
  
  def getHeaders(): js.Object
  
  def getStatusCode(): Double
  
  def haveError(): Boolean
  
  def waitForResponse(timeoutSecs: Double): Unit
}
object SOAPResponseV2 {
  
  inline def apply(
    getBody: CallbackTo[String],
    getErrorCode: CallbackTo[Double],
    getErrorMessage: CallbackTo[String],
    getHeader: String => String,
    getHeaders: CallbackTo[js.Object],
    getStatusCode: CallbackTo[Double],
    haveError: CallbackTo[Boolean],
    waitForResponse: Double => Callback
  ): SOAPResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = getBody.toJsFn, getErrorCode = getErrorCode.toJsFn, getErrorMessage = getErrorMessage.toJsFn, getHeader = js.Any.fromFunction1(getHeader), getHeaders = getHeaders.toJsFn, getStatusCode = getStatusCode.toJsFn, haveError = haveError.toJsFn, waitForResponse = js.Any.fromFunction1((t0: Double) => waitForResponse(t0).runNow()))
    __obj.asInstanceOf[SOAPResponseV2]
  }
  
  extension [Self <: SOAPResponseV2](x: Self) {
    
    inline def setGetBody(value: CallbackTo[String]): Self = StObject.set(x, "getBody", value.toJsFn)
    
    inline def setGetErrorCode(value: CallbackTo[Double]): Self = StObject.set(x, "getErrorCode", value.toJsFn)
    
    inline def setGetErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "getErrorMessage", value.toJsFn)
    
    inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setGetHeaders(value: CallbackTo[js.Object]): Self = StObject.set(x, "getHeaders", value.toJsFn)
    
    inline def setGetStatusCode(value: CallbackTo[Double]): Self = StObject.set(x, "getStatusCode", value.toJsFn)
    
    inline def setHaveError(value: CallbackTo[Boolean]): Self = StObject.set(x, "haveError", value.toJsFn)
    
    inline def setWaitForResponse(value: Double => Callback): Self = StObject.set(x, "waitForResponse", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
