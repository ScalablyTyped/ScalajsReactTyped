package typingsJapgolly.auth0.mod

import typingsJapgolly.auth0.anon.Methods
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  var custom_client_ip_header: js.UndefOr[String] = js.undefined
  
  var custom_domain_id: String
  
  var domain: String
  
  var origin_domain_name: js.UndefOr[String] = js.undefined
  
  var primary: Boolean
  
  var status: CustomDomainStatus
  
  var tls_policy: js.UndefOr[String] = js.undefined
  
  var `type`: CustomDomainType
  
  var verification: Methods
}
object Domain {
  
  inline def apply(
    custom_domain_id: String,
    domain: String,
    primary: Boolean,
    status: CustomDomainStatus,
    `type`: CustomDomainType,
    verification: Methods
  ): Domain = {
    val __obj = js.Dynamic.literal(custom_domain_id = custom_domain_id.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], verification = verification.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  
  extension [Self <: Domain](x: Self) {
    
    inline def setCustom_client_ip_header(value: String): Self = StObject.set(x, "custom_client_ip_header", value.asInstanceOf[js.Any])
    
    inline def setCustom_client_ip_headerUndefined: Self = StObject.set(x, "custom_client_ip_header", js.undefined)
    
    inline def setCustom_domain_id(value: String): Self = StObject.set(x, "custom_domain_id", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setOrigin_domain_name(value: String): Self = StObject.set(x, "origin_domain_name", value.asInstanceOf[js.Any])
    
    inline def setOrigin_domain_nameUndefined: Self = StObject.set(x, "origin_domain_name", js.undefined)
    
    inline def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: CustomDomainStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTls_policy(value: String): Self = StObject.set(x, "tls_policy", value.asInstanceOf[js.Any])
    
    inline def setTls_policyUndefined: Self = StObject.set(x, "tls_policy", js.undefined)
    
    inline def setType(value: CustomDomainType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVerification(value: Methods): Self = StObject.set(x, "verification", value.asInstanceOf[js.Any])
  }
}
