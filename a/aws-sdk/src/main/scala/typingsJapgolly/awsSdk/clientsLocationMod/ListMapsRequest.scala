package typingsJapgolly.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMapsRequest extends StObject {
  
  /**
    * An optional limit for the number of resources returned in a single call.  Default value: 100 
    */
  var MaxResults: js.UndefOr[ListMapsRequestMaxResultsInteger] = js.undefined
  
  /**
    * The pagination token specifying which page of results to return in the response. If no token is provided, the default page is the first page. Default value: null 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListMapsRequest {
  
  inline def apply(): ListMapsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMapsRequest]
  }
  
  extension [Self <: ListMapsRequest](x: Self) {
    
    inline def setMaxResults(value: ListMapsRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
