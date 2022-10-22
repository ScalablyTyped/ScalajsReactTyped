package typingsJapgolly.firebaseAuth.anon

import typingsJapgolly.firebaseAuth.distCordovaSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameServerResponse extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typingsJapgolly.firebaseAuth.distCordovaSrcModelAuthMod.AppName
}
object AppNameServerResponse {
  
  inline def apply(
    _serverResponse: IdTokenMfaResponse,
    appName: typingsJapgolly.firebaseAuth.distCordovaSrcModelAuthMod.AppName
  ): AppNameServerResponse = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameServerResponse]
  }
  
  extension [Self <: AppNameServerResponse](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distCordovaSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
