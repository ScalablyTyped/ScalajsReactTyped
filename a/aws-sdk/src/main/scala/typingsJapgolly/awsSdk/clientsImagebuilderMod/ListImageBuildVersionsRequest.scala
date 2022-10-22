package typingsJapgolly.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImageBuildVersionsRequest extends StObject {
  
  /**
    * Use the following filters to streamline results:    name     osVersion     platform     type     version   
    */
  var filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the image whose build versions you want to retrieve.
    */
  var imageVersionArn: ImageVersionArn
  
  /**
    * The maximum items to return in a request.
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.undefined
  
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImageBuildVersionsRequest {
  
  inline def apply(imageVersionArn: ImageVersionArn): ListImageBuildVersionsRequest = {
    val __obj = js.Dynamic.literal(imageVersionArn = imageVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImageBuildVersionsRequest]
  }
  
  extension [Self <: ListImageBuildVersionsRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setImageVersionArn(value: ImageVersionArn): Self = StObject.set(x, "imageVersionArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: RestrictedInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
