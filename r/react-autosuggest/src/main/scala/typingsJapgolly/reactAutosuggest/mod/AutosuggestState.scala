package typingsJapgolly.reactAutosuggest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutosuggestState[TSuggestion] extends StObject {
  
  var highlightedSectionIndex: Double | Null
  
  var highlightedSuggestion: TSuggestion | Null
  
  var highlightedSuggestionIndex: Double | Null
  
  var isCollapsed: Boolean
  
  var isFocused: Boolean
  
  var valueBeforeUpDown: TSuggestion | Null
}
object AutosuggestState {
  
  inline def apply[TSuggestion](isCollapsed: Boolean, isFocused: Boolean): AutosuggestState[TSuggestion] = {
    val __obj = js.Dynamic.literal(isCollapsed = isCollapsed.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], highlightedSectionIndex = null, highlightedSuggestion = null, highlightedSuggestionIndex = null, valueBeforeUpDown = null)
    __obj.asInstanceOf[AutosuggestState[TSuggestion]]
  }
  
  extension [Self <: AutosuggestState[?], TSuggestion](x: Self & AutosuggestState[TSuggestion]) {
    
    inline def setHighlightedSectionIndex(value: Double): Self = StObject.set(x, "highlightedSectionIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedSectionIndexNull: Self = StObject.set(x, "highlightedSectionIndex", null)
    
    inline def setHighlightedSuggestion(value: TSuggestion): Self = StObject.set(x, "highlightedSuggestion", value.asInstanceOf[js.Any])
    
    inline def setHighlightedSuggestionIndex(value: Double): Self = StObject.set(x, "highlightedSuggestionIndex", value.asInstanceOf[js.Any])
    
    inline def setHighlightedSuggestionIndexNull: Self = StObject.set(x, "highlightedSuggestionIndex", null)
    
    inline def setHighlightedSuggestionNull: Self = StObject.set(x, "highlightedSuggestion", null)
    
    inline def setIsCollapsed(value: Boolean): Self = StObject.set(x, "isCollapsed", value.asInstanceOf[js.Any])
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeUpDown(value: TSuggestion): Self = StObject.set(x, "valueBeforeUpDown", value.asInstanceOf[js.Any])
    
    inline def setValueBeforeUpDownNull: Self = StObject.set(x, "valueBeforeUpDown", null)
  }
}
