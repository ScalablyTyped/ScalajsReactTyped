package typingsJapgolly.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImagePipelinesRequest extends StObject {
  
  /**
    * Use the following filters to streamline results:    description     distributionConfigurationArn     imageRecipeArn     infrastructureConfigurationArn     name     status   
    */
  var filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum items to return in a request.
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImagePipelinesRequest {
  
  inline def apply(): ListImagePipelinesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagePipelinesRequest]
  }
  
  extension [Self <: ListImagePipelinesRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
