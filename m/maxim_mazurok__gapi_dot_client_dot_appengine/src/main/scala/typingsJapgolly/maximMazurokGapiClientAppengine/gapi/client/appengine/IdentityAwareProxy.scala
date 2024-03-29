package typingsJapgolly.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityAwareProxy extends StObject {
  
  /** Whether the serving infrastructure will authenticate and authorize all incoming requests.If true, the oauth2_client_id and oauth2_client_secret fields must be non-empty. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** OAuth2 client ID to use for the authentication flow. */
  var oauth2ClientId: js.UndefOr[String] = js.undefined
  
  /**
    * OAuth2 client secret to use for the authentication flow.For security reasons, this value cannot be retrieved via the API. Instead, the SHA-256 hash of the value is returned in the
    * oauth2_client_secret_sha256 field.@InputOnly
    */
  var oauth2ClientSecret: js.UndefOr[String] = js.undefined
  
  /** Hex-encoded SHA-256 hash of the client secret.@OutputOnly */
  var oauth2ClientSecretSha256: js.UndefOr[String] = js.undefined
}
object IdentityAwareProxy {
  
  inline def apply(): IdentityAwareProxy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdentityAwareProxy]
  }
  
  extension [Self <: IdentityAwareProxy](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOauth2ClientId(value: String): Self = StObject.set(x, "oauth2ClientId", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientIdUndefined: Self = StObject.set(x, "oauth2ClientId", js.undefined)
    
    inline def setOauth2ClientSecret(value: String): Self = StObject.set(x, "oauth2ClientSecret", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientSecretSha256(value: String): Self = StObject.set(x, "oauth2ClientSecretSha256", value.asInstanceOf[js.Any])
    
    inline def setOauth2ClientSecretSha256Undefined: Self = StObject.set(x, "oauth2ClientSecretSha256", js.undefined)
    
    inline def setOauth2ClientSecretUndefined: Self = StObject.set(x, "oauth2ClientSecret", js.undefined)
  }
}
