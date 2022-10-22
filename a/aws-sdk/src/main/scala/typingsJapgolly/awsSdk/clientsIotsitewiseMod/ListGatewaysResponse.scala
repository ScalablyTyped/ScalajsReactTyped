package typingsJapgolly.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGatewaysResponse extends StObject {
  
  /**
    * A list that summarizes each gateway.
    */
  var gatewaySummaries: GatewaySummaries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListGatewaysResponse {
  
  inline def apply(gatewaySummaries: GatewaySummaries): ListGatewaysResponse = {
    val __obj = js.Dynamic.literal(gatewaySummaries = gatewaySummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGatewaysResponse]
  }
  
  extension [Self <: ListGatewaysResponse](x: Self) {
    
    inline def setGatewaySummaries(value: GatewaySummaries): Self = StObject.set(x, "gatewaySummaries", value.asInstanceOf[js.Any])
    
    inline def setGatewaySummariesVarargs(value: GatewaySummary*): Self = StObject.set(x, "gatewaySummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
