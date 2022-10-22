package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteOrganizationConfigRuleRequest extends StObject {
  
  /**
    * The name of organization Config rule that you want to delete.
    */
  var OrganizationConfigRuleName: typingsJapgolly.awsSdk.clientsConfigserviceMod.OrganizationConfigRuleName
}
object DeleteOrganizationConfigRuleRequest {
  
  inline def apply(OrganizationConfigRuleName: OrganizationConfigRuleName): DeleteOrganizationConfigRuleRequest = {
    val __obj = js.Dynamic.literal(OrganizationConfigRuleName = OrganizationConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteOrganizationConfigRuleRequest]
  }
  
  extension [Self <: DeleteOrganizationConfigRuleRequest](x: Self) {
    
    inline def setOrganizationConfigRuleName(value: OrganizationConfigRuleName): Self = StObject.set(x, "OrganizationConfigRuleName", value.asInstanceOf[js.Any])
  }
}
