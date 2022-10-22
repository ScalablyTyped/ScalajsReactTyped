package typingsJapgolly.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainData extends StObject {
  
  var custom_client_ip_header: js.UndefOr[String] = js.undefined
  
  var domain: String
  
  var tls_policy: js.UndefOr[String] = js.undefined
  
  var `type`: CustomDomainType
  
  var verification_method: js.UndefOr[CustomDomainVerificationMethod] = js.undefined
}
object CreateDomainData {
  
  inline def apply(domain: String, `type`: CustomDomainType): CreateDomainData = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainData]
  }
  
  extension [Self <: CreateDomainData](x: Self) {
    
    inline def setCustom_client_ip_header(value: String): Self = StObject.set(x, "custom_client_ip_header", value.asInstanceOf[js.Any])
    
    inline def setCustom_client_ip_headerUndefined: Self = StObject.set(x, "custom_client_ip_header", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setTls_policy(value: String): Self = StObject.set(x, "tls_policy", value.asInstanceOf[js.Any])
    
    inline def setTls_policyUndefined: Self = StObject.set(x, "tls_policy", js.undefined)
    
    inline def setType(value: CustomDomainType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerification_method(value: CustomDomainVerificationMethod): Self = StObject.set(x, "verification_method", value.asInstanceOf[js.Any])
    
    inline def setVerification_methodUndefined: Self = StObject.set(x, "verification_method", js.undefined)
  }
}
