package typingsJapgolly.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoreNetworkChangeEventsRequest extends StObject {
  
  /**
    * The ID of a core network.
    */
  var CoreNetworkId: typingsJapgolly.awsSdk.clientsNetworkmanagerMod.CoreNetworkId
  
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.MaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
  
  /**
    * The ID of the policy version.
    */
  var PolicyVersionId: Integer
}
object GetCoreNetworkChangeEventsRequest {
  
  inline def apply(CoreNetworkId: CoreNetworkId, PolicyVersionId: Integer): GetCoreNetworkChangeEventsRequest = {
    val __obj = js.Dynamic.literal(CoreNetworkId = CoreNetworkId.asInstanceOf[js.Any], PolicyVersionId = PolicyVersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoreNetworkChangeEventsRequest]
  }
  
  extension [Self <: GetCoreNetworkChangeEventsRequest](x: Self) {
    
    inline def setCoreNetworkId(value: CoreNetworkId): Self = StObject.set(x, "CoreNetworkId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPolicyVersionId(value: Integer): Self = StObject.set(x, "PolicyVersionId", value.asInstanceOf[js.Any])
  }
}
