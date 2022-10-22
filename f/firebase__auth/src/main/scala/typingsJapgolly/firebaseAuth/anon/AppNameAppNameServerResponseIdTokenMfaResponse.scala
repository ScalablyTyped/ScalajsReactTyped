package typingsJapgolly.firebaseAuth.anon

import typingsJapgolly.firebaseAuth.distEsm5SrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNameAppNameServerResponseIdTokenMfaResponse extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typingsJapgolly.firebaseAuth.distEsm5SrcModelAuthMod.AppName
}
object AppNameAppNameServerResponseIdTokenMfaResponse {
  
  inline def apply(
    _serverResponse: IdTokenMfaResponse,
    appName: typingsJapgolly.firebaseAuth.distEsm5SrcModelAuthMod.AppName
  ): AppNameAppNameServerResponseIdTokenMfaResponse = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppNameAppNameServerResponseIdTokenMfaResponse]
  }
  
  extension [Self <: AppNameAppNameServerResponseIdTokenMfaResponse](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distEsm5SrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
