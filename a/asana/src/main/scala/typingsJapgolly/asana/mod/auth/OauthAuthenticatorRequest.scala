package typingsJapgolly.asana.mod.auth

import typingsJapgolly.asana.anon.Authorization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OauthAuthenticatorRequest extends StObject {
  
  /**
    * When browserify-d, the `auth` component of the `request` library
    * doesn't work so well, so we just manually set the bearer token instead.
    */
  var headers: Authorization
}
object OauthAuthenticatorRequest {
  
  inline def apply(headers: Authorization): OauthAuthenticatorRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[OauthAuthenticatorRequest]
  }
  
  extension [Self <: OauthAuthenticatorRequest](x: Self) {
    
    inline def setHeaders(value: Authorization): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
  }
}
