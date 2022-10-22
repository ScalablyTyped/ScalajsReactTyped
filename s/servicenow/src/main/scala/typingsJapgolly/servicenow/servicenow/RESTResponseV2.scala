package typingsJapgolly.servicenow.servicenow

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.servicenow.anon.Get
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RESTResponseV2 extends StObject {
  
  def getBody(): String
  
  def getCookies(): Get
  
  def getErrorCode(): Double
  
  def getErrorMessage(): String
  
  def getHeader(name: String): String
  
  def getHeaders(): js.Object
  
  def getQueryString(): String
  
  def getResponseAttachmentSysid(): String
  
  def getStatusCode(): Double
  
  def haveError(): Boolean
  
  def waitForResponse(timeoutSecs: Double): Unit
}
object RESTResponseV2 {
  
  inline def apply(
    getBody: CallbackTo[String],
    getCookies: CallbackTo[Get],
    getErrorCode: CallbackTo[Double],
    getErrorMessage: CallbackTo[String],
    getHeader: String => String,
    getHeaders: CallbackTo[js.Object],
    getQueryString: CallbackTo[String],
    getResponseAttachmentSysid: CallbackTo[String],
    getStatusCode: CallbackTo[Double],
    haveError: CallbackTo[Boolean],
    waitForResponse: Double => Callback
  ): RESTResponseV2 = {
    val __obj = js.Dynamic.literal(getBody = getBody.toJsFn, getCookies = getCookies.toJsFn, getErrorCode = getErrorCode.toJsFn, getErrorMessage = getErrorMessage.toJsFn, getHeader = js.Any.fromFunction1(getHeader), getHeaders = getHeaders.toJsFn, getQueryString = getQueryString.toJsFn, getResponseAttachmentSysid = getResponseAttachmentSysid.toJsFn, getStatusCode = getStatusCode.toJsFn, haveError = haveError.toJsFn, waitForResponse = js.Any.fromFunction1((t0: Double) => waitForResponse(t0).runNow()))
    __obj.asInstanceOf[RESTResponseV2]
  }
  
  extension [Self <: RESTResponseV2](x: Self) {
    
    inline def setGetBody(value: CallbackTo[String]): Self = StObject.set(x, "getBody", value.toJsFn)
    
    inline def setGetCookies(value: CallbackTo[Get]): Self = StObject.set(x, "getCookies", value.toJsFn)
    
    inline def setGetErrorCode(value: CallbackTo[Double]): Self = StObject.set(x, "getErrorCode", value.toJsFn)
    
    inline def setGetErrorMessage(value: CallbackTo[String]): Self = StObject.set(x, "getErrorMessage", value.toJsFn)
    
    inline def setGetHeader(value: String => String): Self = StObject.set(x, "getHeader", js.Any.fromFunction1(value))
    
    inline def setGetHeaders(value: CallbackTo[js.Object]): Self = StObject.set(x, "getHeaders", value.toJsFn)
    
    inline def setGetQueryString(value: CallbackTo[String]): Self = StObject.set(x, "getQueryString", value.toJsFn)
    
    inline def setGetResponseAttachmentSysid(value: CallbackTo[String]): Self = StObject.set(x, "getResponseAttachmentSysid", value.toJsFn)
    
    inline def setGetStatusCode(value: CallbackTo[Double]): Self = StObject.set(x, "getStatusCode", value.toJsFn)
    
    inline def setHaveError(value: CallbackTo[Boolean]): Self = StObject.set(x, "haveError", value.toJsFn)
    
    inline def setWaitForResponse(value: Double => Callback): Self = StObject.set(x, "waitForResponse", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
