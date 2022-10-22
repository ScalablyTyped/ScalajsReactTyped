package typingsJapgolly.algoliasearchHelper.anon

import typingsJapgolly.algoliasearchHelper.mod.SearchParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Facet extends StObject {
  
  var facet: String
  
  var query: String
  
  var state: SearchParameters
}
object Facet {
  
  inline def apply(facet: String, query: String, state: SearchParameters): Facet = {
    val __obj = js.Dynamic.literal(facet = facet.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Facet]
  }
  
  extension [Self <: Facet](x: Self) {
    
    inline def setFacet(value: String): Self = StObject.set(x, "facet", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
