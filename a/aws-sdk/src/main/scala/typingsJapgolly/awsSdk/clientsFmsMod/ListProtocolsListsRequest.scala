package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtocolsListsRequest extends StObject {
  
  /**
    * Specifies whether the lists to retrieve are default lists owned by Firewall Manager.
    */
  var DefaultLists: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are available, in the response, Firewall Manager provides a NextToken value that you can use in a subsequent call to get the next batch of objects. If you don't specify this, Firewall Manager returns all available objects.
    */
  var MaxResults: PaginationMaxResults
  
  /**
    * If you specify a value for MaxResults in your list request, and you have more objects than the maximum, Firewall Manager returns this token in the response. For all but the first request, you provide the token returned by the prior request in the request parameters, to retrieve the next batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListProtocolsListsRequest {
  
  inline def apply(MaxResults: PaginationMaxResults): ListProtocolsListsRequest = {
    val __obj = js.Dynamic.literal(MaxResults = MaxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProtocolsListsRequest]
  }
  
  extension [Self <: ListProtocolsListsRequest](x: Self) {
    
    inline def setDefaultLists(value: Boolean): Self = StObject.set(x, "DefaultLists", value.asInstanceOf[js.Any])
    
    inline def setDefaultListsUndefined: Self = StObject.set(x, "DefaultLists", js.undefined)
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
