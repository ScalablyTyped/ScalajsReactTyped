package typingsJapgolly.algoliasearchHelper.anon

import typingsJapgolly.algoliasearchHelper.mod.SearchParameters
import typingsJapgolly.algoliasearchHelper.mod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Results extends StObject {
  
  var results: SearchResults[Any]
  
  var state: SearchParameters
}
object Results {
  
  inline def apply(results: SearchResults[Any], state: SearchParameters): Results = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results]
  }
  
  extension [Self <: Results](x: Self) {
    
    inline def setResults(value: SearchResults[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
