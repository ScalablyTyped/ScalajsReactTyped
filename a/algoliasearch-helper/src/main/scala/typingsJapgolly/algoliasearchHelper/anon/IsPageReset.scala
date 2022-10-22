package typingsJapgolly.algoliasearchHelper.anon

import typingsJapgolly.algoliasearchHelper.mod.SearchParameters
import typingsJapgolly.algoliasearchHelper.mod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPageReset extends StObject {
  
  var isPageReset: Boolean
  
  var results: SearchResults[Any]
  
  var state: SearchParameters
}
object IsPageReset {
  
  inline def apply(isPageReset: Boolean, results: SearchResults[Any], state: SearchParameters): IsPageReset = {
    val __obj = js.Dynamic.literal(isPageReset = isPageReset.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPageReset]
  }
  
  extension [Self <: IsPageReset](x: Self) {
    
    inline def setIsPageReset(value: Boolean): Self = StObject.set(x, "isPageReset", value.asInstanceOf[js.Any])
    
    inline def setResults(value: SearchResults[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
