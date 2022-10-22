package typingsJapgolly.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSuggestionParams extends StObject {
  
  var isHighlighted: Boolean
  
  var query: String
}
object RenderSuggestionParams {
  
  inline def apply(isHighlighted: Boolean, query: String): RenderSuggestionParams = {
    val __obj = js.Dynamic.literal(isHighlighted = isHighlighted.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuggestionParams]
  }
  
  extension [Self <: RenderSuggestionParams](x: Self) {
    
    inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
