package typingsJapgolly.servicenowLondon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlideSession extends StObject {
  
  def getClientData(paramName: String): String
  
  def getClientIP(): String
  
  def getCurrentApplicationId(): String
  
  def getLanguage(): String
  
  def getSessionToken(): String
  
  def getTimeZoneName(): String
  
  def getUrlOnStack(): String
  
  def isImpersonating(): Boolean
  
  def isInteractive(): Boolean
  
  def isLoggedIn(): Boolean
  
  def putClientData(paramName: String, paramValue: String): Unit
}
object GlideSession {
  
  inline def apply(
    getClientData: String => String,
    getClientIP: CallbackTo[String],
    getCurrentApplicationId: CallbackTo[String],
    getLanguage: CallbackTo[String],
    getSessionToken: CallbackTo[String],
    getTimeZoneName: CallbackTo[String],
    getUrlOnStack: CallbackTo[String],
    isImpersonating: CallbackTo[Boolean],
    isInteractive: CallbackTo[Boolean],
    isLoggedIn: CallbackTo[Boolean],
    putClientData: (String, String) => Callback
  ): GlideSession = {
    val __obj = js.Dynamic.literal(getClientData = js.Any.fromFunction1(getClientData), getClientIP = getClientIP.toJsFn, getCurrentApplicationId = getCurrentApplicationId.toJsFn, getLanguage = getLanguage.toJsFn, getSessionToken = getSessionToken.toJsFn, getTimeZoneName = getTimeZoneName.toJsFn, getUrlOnStack = getUrlOnStack.toJsFn, isImpersonating = isImpersonating.toJsFn, isInteractive = isInteractive.toJsFn, isLoggedIn = isLoggedIn.toJsFn, putClientData = js.Any.fromFunction2((t0: String, t1: String) => (putClientData(t0, t1)).runNow()))
    __obj.asInstanceOf[GlideSession]
  }
  
  extension [Self <: GlideSession](x: Self) {
    
    inline def setGetClientData(value: String => String): Self = StObject.set(x, "getClientData", js.Any.fromFunction1(value))
    
    inline def setGetClientIP(value: CallbackTo[String]): Self = StObject.set(x, "getClientIP", value.toJsFn)
    
    inline def setGetCurrentApplicationId(value: CallbackTo[String]): Self = StObject.set(x, "getCurrentApplicationId", value.toJsFn)
    
    inline def setGetLanguage(value: CallbackTo[String]): Self = StObject.set(x, "getLanguage", value.toJsFn)
    
    inline def setGetSessionToken(value: CallbackTo[String]): Self = StObject.set(x, "getSessionToken", value.toJsFn)
    
    inline def setGetTimeZoneName(value: CallbackTo[String]): Self = StObject.set(x, "getTimeZoneName", value.toJsFn)
    
    inline def setGetUrlOnStack(value: CallbackTo[String]): Self = StObject.set(x, "getUrlOnStack", value.toJsFn)
    
    inline def setIsImpersonating(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImpersonating", value.toJsFn)
    
    inline def setIsInteractive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInteractive", value.toJsFn)
    
    inline def setIsLoggedIn(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoggedIn", value.toJsFn)
    
    inline def setPutClientData(value: (String, String) => Callback): Self = StObject.set(x, "putClientData", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
