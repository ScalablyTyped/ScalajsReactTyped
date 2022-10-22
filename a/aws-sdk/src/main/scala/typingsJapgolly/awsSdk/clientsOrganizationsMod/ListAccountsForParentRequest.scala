package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountsForParentRequest extends StObject {
  
  /**
    * The total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the maximum you specify, the NextToken response element is present and has a value (is not null). Include that value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that Organizations might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.MaxResults] = js.undefined
  
  /**
    * The parameter for receiving additional results if you receive a NextToken response in a previous request. A NextToken response indicates that more output is available. Set this parameter to the value of the previous call's NextToken response to indicate where the output should continue from.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.clientsOrganizationsMod.NextToken] = js.undefined
  
  /**
    * The unique identifier (ID) for the parent root or organization unit (OU) whose accounts you want to list.
    */
  var ParentId: typingsJapgolly.awsSdk.clientsOrganizationsMod.ParentId
}
object ListAccountsForParentRequest {
  
  inline def apply(ParentId: ParentId): ListAccountsForParentRequest = {
    val __obj = js.Dynamic.literal(ParentId = ParentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccountsForParentRequest]
  }
  
  extension [Self <: ListAccountsForParentRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setParentId(value: ParentId): Self = StObject.set(x, "ParentId", value.asInstanceOf[js.Any])
  }
}
