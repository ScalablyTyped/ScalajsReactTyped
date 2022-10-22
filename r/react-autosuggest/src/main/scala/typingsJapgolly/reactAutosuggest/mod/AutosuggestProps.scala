package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[TSuggestion]
  - typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[TSuggestion, TSection]
*/
trait AutosuggestProps[TSuggestion, TSection] extends StObject
object AutosuggestProps {
  
  inline def AutosuggestPropsMultiSection[TSuggestion, TSection](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => Node,
    suggestions: js.Array[TSection]
  ): typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[TSuggestion, TSection] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = true, onSuggestionsFetchRequested = js.Any.fromFunction1((t0: /* request */ SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[TSuggestion, TSection]]
  }
  
  inline def AutosuggestPropsSingleSection[TSuggestion](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => Node,
    suggestions: js.Array[TSuggestion]
  ): typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[TSuggestion] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1((t0: /* request */ SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[TSuggestion]]
  }
}
