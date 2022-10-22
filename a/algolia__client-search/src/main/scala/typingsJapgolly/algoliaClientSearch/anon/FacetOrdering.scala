package typingsJapgolly.algoliaClientSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FacetOrdering extends StObject {
  
  /**
    * defining how facets should be ordered
    */
  val facetOrdering: js.UndefOr[Facets] = js.undefined
}
object FacetOrdering {
  
  inline def apply(): FacetOrdering = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetOrdering]
  }
  
  extension [Self <: FacetOrdering](x: Self) {
    
    inline def setFacetOrdering(value: Facets): Self = StObject.set(x, "facetOrdering", value.asInstanceOf[js.Any])
    
    inline def setFacetOrderingUndefined: Self = StObject.set(x, "facetOrdering", js.undefined)
  }
}
