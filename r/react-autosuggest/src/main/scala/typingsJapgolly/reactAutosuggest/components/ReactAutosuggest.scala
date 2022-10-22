package typingsJapgolly.reactAutosuggest.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactAutosuggest.mod.ContainerProps
import typingsJapgolly.reactAutosuggest.mod.InputProps
import typingsJapgolly.reactAutosuggest.mod.RenderInputComponentProps
import typingsJapgolly.reactAutosuggest.mod.RenderSuggestionParams
import typingsJapgolly.reactAutosuggest.mod.RenderSuggestionsContainerParams
import typingsJapgolly.reactAutosuggest.mod.ShouldRenderReasons
import typingsJapgolly.reactAutosuggest.mod.SuggestionHighlightedParams
import typingsJapgolly.reactAutosuggest.mod.SuggestionSelectedEventData
import typingsJapgolly.reactAutosuggest.mod.SuggestionsFetchRequestedParams
import typingsJapgolly.reactAutosuggest.mod.Theme
import typingsJapgolly.reactAutosuggest.mod.^
import typingsJapgolly.reactAutosuggest.reactAutosuggestBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAutosuggest {
  
  object AutosuggestPropsMultiSection {
    
    inline def apply[T, T2](
      getSuggestionValue: T => String,
      inputProps: InputProps[T],
      onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
      renderSuggestion: (T, /* params */ RenderSuggestionParams) => Node,
      suggestions: js.Array[T2]
    ): Builder[T, T2] = {
      val __props = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], multiSection = true, onSuggestionsFetchRequested = js.Any.fromFunction1((t0: /* request */ SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
      new Builder[T, T2](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[T, T2]]))
    }
    
    @JSImport("react-autosuggest", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[T, T2] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[^[T, T2]] {
      
      inline def alwaysRenderSuggestions(value: Boolean): this.type = set("alwaysRenderSuggestions", value.asInstanceOf[js.Any])
      
      inline def containerProps(value: ContainerProps): this.type = set("containerProps", value.asInstanceOf[js.Any])
      
      inline def focusInputOnSuggestionClick(value: Boolean): this.type = set("focusInputOnSuggestionClick", value.asInstanceOf[js.Any])
      
      inline def getSectionSuggestions(value: T2 => js.Array[T]): this.type = set("getSectionSuggestions", js.Any.fromFunction1(value))
      
      inline def highlightFirstSuggestion(value: Boolean): this.type = set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def onSuggestionHighlighted(value: /* params */ SuggestionHighlightedParams => Callback): this.type = set("onSuggestionHighlighted", js.Any.fromFunction1((t0: /* params */ SuggestionHighlightedParams) => value(t0).runNow()))
      
      inline def onSuggestionSelected(
        value: (/* event */ ReactEventFrom[Any & Element], /* data */ SuggestionSelectedEventData[T]) => Callback
      ): this.type = set("onSuggestionSelected", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Any & Element], t1: /* data */ SuggestionSelectedEventData[T]) => (value(t0, t1)).runNow()))
      
      inline def onSuggestionsClearRequested(value: Callback): this.type = set("onSuggestionsClearRequested", value.toJsFn)
      
      inline def renderInputComponent(value: /* inputProps */ RenderInputComponentProps => Node): this.type = set("renderInputComponent", js.Any.fromFunction1(value))
      
      inline def renderSectionTitle(value: /* section */ Any => Node): this.type = set("renderSectionTitle", js.Any.fromFunction1(value))
      
      inline def renderSuggestionsContainer(value: /* params */ RenderSuggestionsContainerParams => Node): this.type = set("renderSuggestionsContainer", js.Any.fromFunction1(value))
      
      inline def shouldRenderSuggestions(value: (/* value */ String, /* reason */ ShouldRenderReasons) => Boolean): this.type = set("shouldRenderSuggestions", js.Any.fromFunction2(value))
      
      inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps[T, T2](p: typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[T, T2]): Builder[T, T2] = new Builder[T, T2](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object AutosuggestPropsSingleSection {
    
    inline def apply[T, T2](
      getSuggestionValue: T => String,
      inputProps: InputProps[T],
      onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
      renderSuggestion: (T, /* params */ RenderSuggestionParams) => Node,
      suggestions: js.Array[T]
    ): Builder[T, T2] = {
      val __props = js.Dynamic.literal(getSuggestionValue = js.Any.fromFunction1(getSuggestionValue), inputProps = inputProps.asInstanceOf[js.Any], onSuggestionsFetchRequested = js.Any.fromFunction1((t0: /* request */ SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()), renderSuggestion = js.Any.fromFunction2(renderSuggestion), suggestions = suggestions.asInstanceOf[js.Any])
      new Builder[T, T2](js.Array(this.component, __props.asInstanceOf[typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[T]]))
    }
    
    @JSImport("react-autosuggest", JSImport.Namespace)
    @js.native
    val component: js.Object = js.native
    
    @scala.inline
    open class Builder[T, T2] (val args: js.Array[Any])
      extends AnyVal
         with StBuildingComponent[^[T, T2]] {
      
      inline def alwaysRenderSuggestions(value: Boolean): this.type = set("alwaysRenderSuggestions", value.asInstanceOf[js.Any])
      
      inline def containerProps(value: ContainerProps): this.type = set("containerProps", value.asInstanceOf[js.Any])
      
      inline def focusInputOnSuggestionClick(value: Boolean): this.type = set("focusInputOnSuggestionClick", value.asInstanceOf[js.Any])
      
      inline def highlightFirstSuggestion(value: Boolean): this.type = set("highlightFirstSuggestion", value.asInstanceOf[js.Any])
      
      inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
      
      inline def multiSection(value: `false`): this.type = set("multiSection", value.asInstanceOf[js.Any])
      
      inline def onSuggestionHighlighted(value: /* params */ SuggestionHighlightedParams => Callback): this.type = set("onSuggestionHighlighted", js.Any.fromFunction1((t0: /* params */ SuggestionHighlightedParams) => value(t0).runNow()))
      
      inline def onSuggestionSelected(
        value: (/* event */ ReactEventFrom[Any & Element], /* data */ SuggestionSelectedEventData[T]) => Callback
      ): this.type = set("onSuggestionSelected", js.Any.fromFunction2((t0: /* event */ ReactEventFrom[Any & Element], t1: /* data */ SuggestionSelectedEventData[T]) => (value(t0, t1)).runNow()))
      
      inline def onSuggestionsClearRequested(value: Callback): this.type = set("onSuggestionsClearRequested", value.toJsFn)
      
      inline def renderInputComponent(value: /* inputProps */ RenderInputComponentProps => Node): this.type = set("renderInputComponent", js.Any.fromFunction1(value))
      
      inline def renderSuggestionsContainer(value: /* params */ RenderSuggestionsContainerParams => Node): this.type = set("renderSuggestionsContainer", js.Any.fromFunction1(value))
      
      inline def shouldRenderSuggestions(value: (/* value */ String, /* reason */ ShouldRenderReasons) => Boolean): this.type = set("shouldRenderSuggestions", js.Any.fromFunction2(value))
      
      inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    }
    
    def withProps[T, T2](p: typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[T]): Builder[T, T2] = new Builder[T, T2](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
}
