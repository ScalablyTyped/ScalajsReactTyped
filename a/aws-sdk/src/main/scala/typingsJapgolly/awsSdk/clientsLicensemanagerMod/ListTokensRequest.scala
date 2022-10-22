package typingsJapgolly.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTokensRequest extends StObject {
  
  /**
    * Filters to scope the results. The following filter is supported:    LicenseArns   
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Maximum number of results to return in a single call.
    */
  var MaxResults: js.UndefOr[MaxSize100] = js.undefined
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Token IDs.
    */
  var TokenIds: js.UndefOr[StringList] = js.undefined
}
object ListTokensRequest {
  
  inline def apply(): ListTokensRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTokensRequest]
  }
  
  extension [Self <: ListTokensRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxSize100): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTokenIds(value: StringList): Self = StObject.set(x, "TokenIds", value.asInstanceOf[js.Any])
    
    inline def setTokenIdsUndefined: Self = StObject.set(x, "TokenIds", js.undefined)
    
    inline def setTokenIdsVarargs(value: String*): Self = StObject.set(x, "TokenIds", js.Array(value*))
  }
}
