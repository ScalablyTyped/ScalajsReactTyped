package typingsJapgolly.algoliasearch.anon

import typingsJapgolly.algoliaClientSearch.mod.SearchForFacetValuesQueryParams
import typingsJapgolly.algoliaClientSearch.mod.SearchOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndexName extends StObject {
  
  val indexName: String
  
  val params: SearchForFacetValuesQueryParams & SearchOptions
}
object IndexName {
  
  inline def apply(indexName: String, params: SearchForFacetValuesQueryParams & SearchOptions): IndexName = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexName]
  }
  
  extension [Self <: IndexName](x: Self) {
    
    inline def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    inline def setParams(value: SearchForFacetValuesQueryParams & SearchOptions): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
  }
}
