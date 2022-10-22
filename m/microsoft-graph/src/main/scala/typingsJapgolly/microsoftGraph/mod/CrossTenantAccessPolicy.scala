package typingsJapgolly.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossTenantAccessPolicy
  extends StObject
     with PolicyBase {
  
  /**
    * Defines the default configuration for how your organization interacts with external Azure Active Directory
    * organizations.
    */
  var default: js.UndefOr[NullableOption[CrossTenantAccessPolicyConfigurationDefault]] = js.undefined
  
  // Defines partner-specific configurations for external Azure Active Directory organizations.
  var partners: js.UndefOr[NullableOption[js.Array[CrossTenantAccessPolicyConfigurationPartner]]] = js.undefined
}
object CrossTenantAccessPolicy {
  
  inline def apply(): CrossTenantAccessPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossTenantAccessPolicy]
  }
  
  extension [Self <: CrossTenantAccessPolicy](x: Self) {
    
    inline def setDefault(value: NullableOption[CrossTenantAccessPolicyConfigurationDefault]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultNull: Self = StObject.set(x, "default", null)
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setPartners(value: NullableOption[js.Array[CrossTenantAccessPolicyConfigurationPartner]]): Self = StObject.set(x, "partners", value.asInstanceOf[js.Any])
    
    inline def setPartnersNull: Self = StObject.set(x, "partners", null)
    
    inline def setPartnersUndefined: Self = StObject.set(x, "partners", js.undefined)
    
    inline def setPartnersVarargs(value: CrossTenantAccessPolicyConfigurationPartner*): Self = StObject.set(x, "partners", js.Array(value*))
  }
}
