package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConfigRulesResponse extends StObject {
  
  /**
    * The details about your Config rules.
    */
  var ConfigRules: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.ConfigRules] = js.undefined
  
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeConfigRulesResponse {
  
  inline def apply(): DescribeConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRulesResponse]
  }
  
  extension [Self <: DescribeConfigRulesResponse](x: Self) {
    
    inline def setConfigRules(value: ConfigRules): Self = StObject.set(x, "ConfigRules", value.asInstanceOf[js.Any])
    
    inline def setConfigRulesUndefined: Self = StObject.set(x, "ConfigRules", js.undefined)
    
    inline def setConfigRulesVarargs(value: ConfigRule*): Self = StObject.set(x, "ConfigRules", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
