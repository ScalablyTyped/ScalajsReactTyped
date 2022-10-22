package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.reactAutosuggest.reactAutosuggestBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutosuggestPropsMultiSection[TSuggestion, TSection]
  extends StObject
     with AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, TSection] {
  
  /**
    * Implement it to teach Autosuggest where to find the suggestions for every section.
    */
  var getSectionSuggestions: js.UndefOr[GetSectionSuggestions[TSuggestion, TSection]] = js.undefined
  
  /**
    * Set it to true if you'd like to display suggestions in multiple sections (with optional titles).
    */
  var multiSection: `true`
  
  /**
    * Use your imagination to define how section titles are rendered.
    */
  var renderSectionTitle: js.UndefOr[RenderSectionTitle] = js.undefined
  
  /**
    * These are the suggestions that will be displayed. Items can take an arbitrary shape.
    */
  var suggestions: js.Array[TSection]
}
object AutosuggestPropsMultiSection {
  
  inline def apply[TSuggestion, TSection](
    getSuggestionValue: TSuggestion => String,
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => Node,
    suggestions: js.Array[TSection]
  ): AutosuggestPropsMultiSection[TSuggestion, TSection] = {
    val __obj = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = true, onSuggestionsFetchRequested = js.Any.fromFunction1((t0: /* request */ SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsMultiSection[TSuggestion, TSection]]
  }
  
  extension [Self <: AutosuggestPropsMultiSection[?, ?], TSuggestion, TSection](x: Self & (AutosuggestPropsMultiSection[TSuggestion, TSection])) {
    
    inline def setGetSectionSuggestions(value: TSection => js.Array[TSuggestion]): Self = StObject.set(x, "getSectionSuggestions", js.Any.fromFunction1(value))
    
    inline def setGetSectionSuggestionsUndefined: Self = StObject.set(x, "getSectionSuggestions", js.undefined)
    
    inline def setMultiSection(value: `true`): Self = StObject.set(x, "multiSection", value.asInstanceOf[js.Any])
    
    inline def setRenderSectionTitle(value: /* section */ Any => Node): Self = StObject.set(x, "renderSectionTitle", js.Any.fromFunction1(value))
    
    inline def setRenderSectionTitleUndefined: Self = StObject.set(x, "renderSectionTitle", js.undefined)
    
    inline def setSuggestions(value: js.Array[TSection]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsVarargs(value: TSection*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
