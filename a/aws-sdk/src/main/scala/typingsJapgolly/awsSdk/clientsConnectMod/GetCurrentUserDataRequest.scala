package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCurrentUserDataRequest extends StObject {
  
  /**
    * Filters up to 100 Queues, or up to 9 ContactStates. The user data is retrieved only for those users who are associated with the queues and have contacts that are in the specified ContactState. 
    */
  var Filters: UserDataFilters
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object GetCurrentUserDataRequest {
  
  inline def apply(Filters: UserDataFilters, InstanceId: InstanceId): GetCurrentUserDataRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCurrentUserDataRequest]
  }
  
  extension [Self <: GetCurrentUserDataRequest](x: Self) {
    
    inline def setFilters(value: UserDataFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResult100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
