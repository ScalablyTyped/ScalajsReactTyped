package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRemediationConfigurationRequest extends StObject {
  
  /**
    * The name of the Config rule for which you want to delete remediation configuration.
    */
  var ConfigRuleName: typingsJapgolly.awsSdk.clientsConfigserviceMod.ConfigRuleName
  
  /**
    * The type of a resource.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
}
object DeleteRemediationConfigurationRequest {
  
  inline def apply(ConfigRuleName: ConfigRuleName): DeleteRemediationConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRemediationConfigurationRequest]
  }
  
  extension [Self <: DeleteRemediationConfigurationRequest](x: Self) {
    
    inline def setConfigRuleName(value: ConfigRuleName): Self = StObject.set(x, "ConfigRuleName", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
