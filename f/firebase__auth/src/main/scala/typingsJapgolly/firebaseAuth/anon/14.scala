package typingsJapgolly.firebaseAuth.anon

import typingsJapgolly.firebaseAuth.distNodeEsmSrcApiAuthenticationMfaMod.IdTokenMfaResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var _serverResponse: IdTokenMfaResponse
  
  var appName: typingsJapgolly.firebaseAuth.distNodeEsmSrcModelAuthMod.AppName
}
object `14` {
  
  inline def apply(
    _serverResponse: IdTokenMfaResponse,
    appName: typingsJapgolly.firebaseAuth.distNodeEsmSrcModelAuthMod.AppName
  ): `14` = {
    val __obj = js.Dynamic.literal(_serverResponse = _serverResponse.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setAppName(value: typingsJapgolly.firebaseAuth.distNodeEsmSrcModelAuthMod.AppName): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def set_serverResponse(value: IdTokenMfaResponse): Self = StObject.set(x, "_serverResponse", value.asInstanceOf[js.Any])
  }
}
