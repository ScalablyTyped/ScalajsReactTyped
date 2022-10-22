package typingsJapgolly.maximMazurokGapiClientIdentitytoolkit.gapi.client.identitytoolkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdpConfig extends StObject {
  
  /** OAuth2 client ID. */
  var clientId: js.UndefOr[String] = js.undefined
  
  /** Whether this IDP is enabled. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Percent of users who will be prompted/redirected federated login for this IDP. */
  var experimentPercent: js.UndefOr[Double] = js.undefined
  
  /** OAuth2 provider. */
  var provider: js.UndefOr[String] = js.undefined
  
  /** OAuth2 client secret. */
  var secret: js.UndefOr[String] = js.undefined
  
  /** Whitelisted client IDs for audience check. */
  var whitelistedAudiences: js.UndefOr[js.Array[String]] = js.undefined
}
object IdpConfig {
  
  inline def apply(): IdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdpConfig]
  }
  
  extension [Self <: IdpConfig](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setExperimentPercent(value: Double): Self = StObject.set(x, "experimentPercent", value.asInstanceOf[js.Any])
    
    inline def setExperimentPercentUndefined: Self = StObject.set(x, "experimentPercent", js.undefined)
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
    
    inline def setSecretUndefined: Self = StObject.set(x, "secret", js.undefined)
    
    inline def setWhitelistedAudiences(value: js.Array[String]): Self = StObject.set(x, "whitelistedAudiences", value.asInstanceOf[js.Any])
    
    inline def setWhitelistedAudiencesUndefined: Self = StObject.set(x, "whitelistedAudiences", js.undefined)
    
    inline def setWhitelistedAudiencesVarargs(value: String*): Self = StObject.set(x, "whitelistedAudiences", js.Array(value*))
  }
}
