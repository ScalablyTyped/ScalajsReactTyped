package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRemediationConfigurationsRequest extends StObject {
  
  /**
    * A list of Config rule names of remediation configurations for which you want details. 
    */
  var ConfigRuleNames: typingsJapgolly.awsSdk.clientsConfigserviceMod.ConfigRuleNames
}
object DescribeRemediationConfigurationsRequest {
  
  inline def apply(ConfigRuleNames: ConfigRuleNames): DescribeRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleNames = ConfigRuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationConfigurationsRequest]
  }
  
  extension [Self <: DescribeRemediationConfigurationsRequest](x: Self) {
    
    inline def setConfigRuleNames(value: ConfigRuleNames): Self = StObject.set(x, "ConfigRuleNames", value.asInstanceOf[js.Any])
    
    inline def setConfigRuleNamesVarargs(value: ConfigRuleName*): Self = StObject.set(x, "ConfigRuleNames", js.Array(value*))
  }
}
