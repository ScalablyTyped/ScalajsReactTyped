package typingsJapgolly.parse.mod.global.Parse

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface declaration for Authentication Providers
  * https://parseplatform.org/Parse-SDK-JS/api/master/AuthProvider.html
  */
trait AuthProvider extends StObject {
  
  /**
    * Called when _linkWith isn't passed authData. Handle your own authentication here.
    */
  def authenticate(): Unit
  
  /**
    * (Optional) Called when service is unlinked. Handle any cleanup here.
    */
  var deauthenticate: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Unique identifier for this Auth Provider.
    */
  def getAuthType(): String
  
  /**
    * Called when auth data is syncronized. Can be used to determine if authData is still valid
    */
  def restoreAuthentication(): Boolean
}
object AuthProvider {
  
  inline def apply(
    authenticate: Callback,
    getAuthType: CallbackTo[String],
    restoreAuthentication: CallbackTo[Boolean]
  ): AuthProvider = {
    val __obj = js.Dynamic.literal(authenticate = authenticate.toJsFn, getAuthType = getAuthType.toJsFn, restoreAuthentication = restoreAuthentication.toJsFn)
    __obj.asInstanceOf[AuthProvider]
  }
  
  extension [Self <: AuthProvider](x: Self) {
    
    inline def setAuthenticate(value: Callback): Self = StObject.set(x, "authenticate", value.toJsFn)
    
    inline def setDeauthenticate(value: Callback): Self = StObject.set(x, "deauthenticate", value.toJsFn)
    
    inline def setDeauthenticateUndefined: Self = StObject.set(x, "deauthenticate", js.undefined)
    
    inline def setGetAuthType(value: CallbackTo[String]): Self = StObject.set(x, "getAuthType", value.toJsFn)
    
    inline def setRestoreAuthentication(value: CallbackTo[Boolean]): Self = StObject.set(x, "restoreAuthentication", value.toJsFn)
  }
}
