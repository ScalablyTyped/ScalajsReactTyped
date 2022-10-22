package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthClientOptions
  extends StObject
     with BaseClientOptions {
  
  var clientSecret: js.UndefOr[String] = js.undefined
}
object OAuthClientOptions {
  
  inline def apply(baseUrl: String): OAuthClientOptions = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthClientOptions]
  }
  
  extension [Self <: OAuthClientOptions](x: Self) {
    
    inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
    
    inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
  }
}
