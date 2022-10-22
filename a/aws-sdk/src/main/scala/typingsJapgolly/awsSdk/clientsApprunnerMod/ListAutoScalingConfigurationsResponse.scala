package typingsJapgolly.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAutoScalingConfigurationsResponse extends StObject {
  
  /**
    * A list of summary information records for auto scaling configurations. In a paginated request, the request returns up to MaxResults records for each call.
    */
  var AutoScalingConfigurationSummaryList: typingsJapgolly.awsSdk.clientsApprunnerMod.AutoScalingConfigurationSummaryList
  
  /**
    * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated request.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsApprunnerMod.NextToken] = js.undefined
}
object ListAutoScalingConfigurationsResponse {
  
  inline def apply(AutoScalingConfigurationSummaryList: AutoScalingConfigurationSummaryList): ListAutoScalingConfigurationsResponse = {
    val __obj = js.Dynamic.literal(AutoScalingConfigurationSummaryList = AutoScalingConfigurationSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAutoScalingConfigurationsResponse]
  }
  
  extension [Self <: ListAutoScalingConfigurationsResponse](x: Self) {
    
    inline def setAutoScalingConfigurationSummaryList(value: AutoScalingConfigurationSummaryList): Self = StObject.set(x, "AutoScalingConfigurationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingConfigurationSummaryListVarargs(value: AutoScalingConfigurationSummary*): Self = StObject.set(x, "AutoScalingConfigurationSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
