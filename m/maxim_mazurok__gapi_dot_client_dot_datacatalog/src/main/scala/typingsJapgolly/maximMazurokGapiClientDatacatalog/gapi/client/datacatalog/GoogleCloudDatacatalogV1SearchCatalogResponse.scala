package typingsJapgolly.maximMazurokGapiClientDatacatalog.gapi.client.datacatalog

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatacatalogV1SearchCatalogResponse extends StObject {
  
  /** Pagination token that can be used in subsequent calls to retrieve the next page of results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Search results. */
  var results: js.UndefOr[js.Array[GoogleCloudDatacatalogV1SearchCatalogResult]] = js.undefined
  
  /**
    * Unreachable locations. Search results don't include data from those locations. To get additional information on an error, repeat the search request and restrict it to specific
    * locations by setting the `SearchCatalogRequest.scope.restricted_locations` parameter.
    */
  var unreachable: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDatacatalogV1SearchCatalogResponse {
  
  inline def apply(): GoogleCloudDatacatalogV1SearchCatalogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatacatalogV1SearchCatalogResponse]
  }
  
  extension [Self <: GoogleCloudDatacatalogV1SearchCatalogResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResults(value: js.Array[GoogleCloudDatacatalogV1SearchCatalogResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: GoogleCloudDatacatalogV1SearchCatalogResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setUnreachable(value: js.Array[String]): Self = StObject.set(x, "unreachable", value.asInstanceOf[js.Any])
    
    inline def setUnreachableUndefined: Self = StObject.set(x, "unreachable", js.undefined)
    
    inline def setUnreachableVarargs(value: String*): Self = StObject.set(x, "unreachable", js.Array(value*))
  }
}
