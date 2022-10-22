package typingsJapgolly.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProtocolsListsResponse extends StObject {
  
  /**
    * If you specify a value for MaxResults in your list request, and you have more objects than the maximum, Firewall Manager returns this token in the response. You can use this token in subsequent requests to retrieve the next batch of objects.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * An array of ProtocolsListDataSummary objects.
    */
  var ProtocolsLists: js.UndefOr[ProtocolsListsData] = js.undefined
}
object ListProtocolsListsResponse {
  
  inline def apply(): ListProtocolsListsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProtocolsListsResponse]
  }
  
  extension [Self <: ListProtocolsListsResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProtocolsLists(value: ProtocolsListsData): Self = StObject.set(x, "ProtocolsLists", value.asInstanceOf[js.Any])
    
    inline def setProtocolsListsUndefined: Self = StObject.set(x, "ProtocolsLists", js.undefined)
    
    inline def setProtocolsListsVarargs(value: ProtocolsListDataSummary*): Self = StObject.set(x, "ProtocolsLists", js.Array(value*))
  }
}
