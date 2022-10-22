package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchUsersRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.InstanceId] = js.undefined
  
  /**
    * The maximum number of results to return per page.
    */
  var MaxResults: js.UndefOr[MaxResult100] = js.undefined
  
  /**
    * The token for the next set of results. Use the value returned in the previous response in the next request to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken2500] = js.undefined
  
  var SearchCriteria: js.UndefOr[UserSearchCriteria] = js.undefined
  
  /**
    * Filters to be applied to search results.
    */
  var SearchFilter: js.UndefOr[UserSearchFilter] = js.undefined
}
object SearchUsersRequest {
  
  inline def apply(): SearchUsersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchUsersRequest]
  }
  
  extension [Self <: SearchUsersRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setMaxResults(value: MaxResult100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken2500): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSearchCriteria(value: UserSearchCriteria): Self = StObject.set(x, "SearchCriteria", value.asInstanceOf[js.Any])
    
    inline def setSearchCriteriaUndefined: Self = StObject.set(x, "SearchCriteria", js.undefined)
    
    inline def setSearchFilter(value: UserSearchFilter): Self = StObject.set(x, "SearchFilter", value.asInstanceOf[js.Any])
    
    inline def setSearchFilterUndefined: Self = StObject.set(x, "SearchFilter", js.undefined)
  }
}
