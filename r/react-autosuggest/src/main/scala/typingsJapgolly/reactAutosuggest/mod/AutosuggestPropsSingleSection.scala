package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactAutosuggest.reactAutosuggestBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutosuggestPropsSingleSection[TSuggestion]
  extends StObject
     with AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, Any] {
  
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: js.UndefOr[`false`] = js.undefined
  
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSuggestion]
}
object AutosuggestPropsSingleSection {
  
  inline def apply[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => Node,
    suggestions: js.Array[TSuggestion]
  ): AutosuggestPropsSingleSection[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1((t0: /* request */ SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsSingleSection[TSuggestion]]
  }
  
  extension [Self <: AutosuggestPropsSingleSection[?], TSuggestion](x: Self & AutosuggestPropsSingleSection[TSuggestion]) {
    
    inline def setMultiSection(value: `false`): Self = StObject.set(x, "multiSection", value.asInstanceOf[js.Any])
    
    inline def setMultiSectionUndefined: Self = StObject.set(x, "multiSection", js.undefined)
    
    inline def setSuggestions(value: js.Array[TSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsVarargs(value: TSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
