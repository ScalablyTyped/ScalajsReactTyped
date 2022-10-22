package typingsJapgolly.googleAppsScript.GoogleAppsScript.CardService

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error that can be returned to trigger an authorization card to be shown to the user.
  *
  *     CardService.newAuthorizationException()
  *       .setAuthorizationUrl("http://auth.com/")
  *       .setResourceDisplayName("Example Resource")
  *       .throwException();
  */
trait AuthorizationException extends StObject {
  
  def printJson(): String
  
  def setAuthorizationUrl(authUrl: String): AuthorizationException
  
  def setCustomUiCallback(callback: String): AuthorizationException
  
  def setResourceDisplayName(name: String): AuthorizationException
  
  def throwException(): Unit
}
object AuthorizationException {
  
  inline def apply(
    printJson: CallbackTo[String],
    setAuthorizationUrl: String => AuthorizationException,
    setCustomUiCallback: String => AuthorizationException,
    setResourceDisplayName: String => AuthorizationException,
    throwException: Callback
  ): AuthorizationException = {
    val __obj = js.Dynamic.literal(printJson = printJson.toJsFn, setAuthorizationUrl = js.Any.fromFunction1(setAuthorizationUrl), setCustomUiCallback = js.Any.fromFunction1(setCustomUiCallback), setResourceDisplayName = js.Any.fromFunction1(setResourceDisplayName), throwException = throwException.toJsFn)
    __obj.asInstanceOf[AuthorizationException]
  }
  
  extension [Self <: AuthorizationException](x: Self) {
    
    inline def setPrintJson(value: CallbackTo[String]): Self = StObject.set(x, "printJson", value.toJsFn)
    
    inline def setSetAuthorizationUrl(value: String => AuthorizationException): Self = StObject.set(x, "setAuthorizationUrl", js.Any.fromFunction1(value))
    
    inline def setSetCustomUiCallback(value: String => AuthorizationException): Self = StObject.set(x, "setCustomUiCallback", js.Any.fromFunction1(value))
    
    inline def setSetResourceDisplayName(value: String => AuthorizationException): Self = StObject.set(x, "setResourceDisplayName", js.Any.fromFunction1(value))
    
    inline def setThrowException(value: Callback): Self = StObject.set(x, "throwException", value.toJsFn)
  }
}
