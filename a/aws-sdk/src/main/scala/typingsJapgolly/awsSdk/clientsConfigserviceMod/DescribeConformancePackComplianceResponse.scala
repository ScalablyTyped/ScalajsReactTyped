package typingsJapgolly.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeConformancePackComplianceResponse extends StObject {
  
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typingsJapgolly.awsSdk.clientsConfigserviceMod.ConformancePackName
  
  /**
    * Returns a list of ConformancePackRuleCompliance objects.
    */
  var ConformancePackRuleComplianceList: typingsJapgolly.awsSdk.clientsConfigserviceMod.ConformancePackRuleComplianceList
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object DescribeConformancePackComplianceResponse {
  
  inline def apply(
    ConformancePackName: ConformancePackName,
    ConformancePackRuleComplianceList: ConformancePackRuleComplianceList
  ): DescribeConformancePackComplianceResponse = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any], ConformancePackRuleComplianceList = ConformancePackRuleComplianceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConformancePackComplianceResponse]
  }
  
  extension [Self <: DescribeConformancePackComplianceResponse](x: Self) {
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setConformancePackRuleComplianceList(value: ConformancePackRuleComplianceList): Self = StObject.set(x, "ConformancePackRuleComplianceList", value.asInstanceOf[js.Any])
    
    inline def setConformancePackRuleComplianceListVarargs(value: ConformancePackRuleCompliance*): Self = StObject.set(x, "ConformancePackRuleComplianceList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
