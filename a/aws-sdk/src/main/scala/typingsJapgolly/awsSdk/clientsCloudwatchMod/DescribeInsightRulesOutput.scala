package typingsJapgolly.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInsightRulesOutput extends StObject {
  
  /**
    * The rules returned by the operation.
    */
  var InsightRules: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatchMod.InsightRules] = js.undefined
  
  /**
    * If this parameter is present, it is a token that marks the start of the next batch of returned results. 
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudwatchMod.NextToken] = js.undefined
}
object DescribeInsightRulesOutput {
  
  inline def apply(): DescribeInsightRulesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInsightRulesOutput]
  }
  
  extension [Self <: DescribeInsightRulesOutput](x: Self) {
    
    inline def setInsightRules(value: InsightRules): Self = StObject.set(x, "InsightRules", value.asInstanceOf[js.Any])
    
    inline def setInsightRulesUndefined: Self = StObject.set(x, "InsightRules", js.undefined)
    
    inline def setInsightRulesVarargs(value: InsightRule*): Self = StObject.set(x, "InsightRules", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
