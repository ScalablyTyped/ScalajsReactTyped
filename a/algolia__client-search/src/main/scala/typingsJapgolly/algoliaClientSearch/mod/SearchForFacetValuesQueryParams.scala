package typingsJapgolly.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchForFacetValuesQueryParams extends StObject {
  
  /**
    * The facet name.
    */
  val facetName: String
  
  /**
    * The facet query.
    */
  val facetQuery: String
}
object SearchForFacetValuesQueryParams {
  
  inline def apply(facetName: String, facetQuery: String): SearchForFacetValuesQueryParams = {
    val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], facetQuery = facetQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForFacetValuesQueryParams]
  }
  
  extension [Self <: SearchForFacetValuesQueryParams](x: Self) {
    
    inline def setFacetName(value: String): Self = StObject.set(x, "facetName", value.asInstanceOf[js.Any])
    
    inline def setFacetQuery(value: String): Self = StObject.set(x, "facetQuery", value.asInstanceOf[js.Any])
  }
}
