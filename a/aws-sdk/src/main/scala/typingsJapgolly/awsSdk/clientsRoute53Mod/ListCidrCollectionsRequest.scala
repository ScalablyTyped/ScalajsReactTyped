package typingsJapgolly.awsSdk.clientsRoute53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCidrCollectionsRequest extends StObject {
  
  /**
    * The maximum number of CIDR collections to return in the response.
    */
  var MaxResults: js.UndefOr[typingsJapgolly.awsSdk.clientsRoute53Mod.MaxResults] = js.undefined
  
  /**
    * An opaque pagination token to indicate where the service is to begin enumerating results. If no value is provided, the listing of results starts from the beginning.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListCidrCollectionsRequest {
  
  inline def apply(): ListCidrCollectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCidrCollectionsRequest]
  }
  
  extension [Self <: ListCidrCollectionsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
