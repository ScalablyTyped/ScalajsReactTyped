package typingsJapgolly.openui5.anon

import typingsJapgolly.openui5.sapMListBaseMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionColumns extends StObject {
  
  /**
    * The current value which has been typed in the input.
    */
  var suggestValue: js.UndefOr[String] = js.undefined
  
  /**
    * The suggestion list is passed to this event for convenience. If you use list-based or tabular suggestions,
    * fill the suggestionList with the items you want to suggest. Otherwise, directly add the suggestions to
    * the "suggestionItems" aggregation of the input control.
    */
  var suggestionColumns: js.UndefOr[default] = js.undefined
}
object SuggestionColumns {
  
  inline def apply(): SuggestionColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionColumns]
  }
  
  extension [Self <: SuggestionColumns](x: Self) {
    
    inline def setSuggestValue(value: String): Self = StObject.set(x, "suggestValue", value.asInstanceOf[js.Any])
    
    inline def setSuggestValueUndefined: Self = StObject.set(x, "suggestValue", js.undefined)
    
    inline def setSuggestionColumns(value: default): Self = StObject.set(x, "suggestionColumns", value.asInstanceOf[js.Any])
    
    inline def setSuggestionColumnsUndefined: Self = StObject.set(x, "suggestionColumns", js.undefined)
  }
}
