package typingsJapgolly.firebaseAuth.anon

import typingsJapgolly.firebaseAuth.distSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `34` extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typingsJapgolly.firebaseAuth.distSrcModelAuthMod.AppName
}
object `34` {
  
  inline def apply(
    _serverResponse: IdTokenMfaResponse,
    appName: typingsJapgolly.firebaseAuth.distSrcModelAuthMod.AppName
  ): `34` = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`34`]
  }
  
  extension [Self <: `34`](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
