package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTermSuggest
  extends StObject
     with SearchSuggestBase
     with SearchSuggest[Any] {
  
  var options: SearchTermSuggestOption | js.Array[SearchTermSuggestOption]
}
object SearchTermSuggest {
  
  inline def apply(
    length: integer,
    offset: integer,
    options: SearchTermSuggestOption | js.Array[SearchTermSuggestOption],
    text: String
  ): SearchTermSuggest = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTermSuggest]
  }
  
  extension [Self <: SearchTermSuggest](x: Self) {
    
    inline def setOptions(value: SearchTermSuggestOption | js.Array[SearchTermSuggestOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: SearchTermSuggestOption*): Self = StObject.set(x, "options", js.Array(value*))
  }
}
