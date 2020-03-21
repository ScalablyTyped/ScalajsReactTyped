package typingsJapgolly.reactAutosuggest.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactAutosuggest.mod.InputProps
import typingsJapgolly.reactAutosuggest.mod.RenderSuggestionParams
import typingsJapgolly.reactAutosuggest.mod.RenderSuggestionsContainerParams
import typingsJapgolly.reactAutosuggest.mod.SuggestionHighlightedParams
import typingsJapgolly.reactAutosuggest.mod.SuggestionSelectedEventData
import typingsJapgolly.reactAutosuggest.mod.SuggestionsFetchRequestedParams
import typingsJapgolly.reactAutosuggest.mod.Theme
import typingsJapgolly.reactAutosuggest.mod.^
import typingsJapgolly.reactAutosuggest.reactAutosuggestBooleans.`false`
import typingsJapgolly.reactAutosuggest.reactAutosuggestBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactAutosuggest {
  def AutosuggestPropsSingleSection[T, T2](
    inputProps: InputProps[T],
    suggestions: js.Array[T],
    getSuggestionValue: T => CallbackTo[String],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
    renderSuggestion: (T, /* params */ RenderSuggestionParams) => CallbackTo[Node],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    multiSection: `false` = null,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Callback = null,
    onSuggestionSelected: (/* event */ ReactEventFrom[js.Any with Element], /* data */ SuggestionSelectedEventData[T]) => Callback = null,
    onSuggestionsClearRequested: js.UndefOr[Callback] = js.undefined,
    renderInputComponent: /* inputProps */ InputProps[T] => CallbackTo[Node] = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => CallbackTo[Node] = null,
    shouldRenderSuggestions: /* value */ String => CallbackTo[Boolean] = null,
    theme: Theme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[T], 
    ^[T, T2], 
    Unit, 
    typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[T]
  ] = {
    val __obj = js.Dynamic.literal(inputProps = inputProps.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getSuggestionValue")(js.Any.fromFunction1((t0: T) => getSuggestionValue(t0).runNow()))
    __obj.updateDynamic("onSuggestionsFetchRequested")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.reactAutosuggest.mod.SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()))
    __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction2((t0: T, t1: /* params */ typingsJapgolly.reactAutosuggest.mod.RenderSuggestionParams) => renderSuggestion(t0, t1).runNow()))
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (multiSection != null) __obj.updateDynamic("multiSection")(multiSection.asInstanceOf[js.Any])
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactAutosuggest.mod.SuggestionHighlightedParams) => onSuggestionHighlighted(t0).runNow()))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element], t1: /* data */ typingsJapgolly.reactAutosuggest.mod.SuggestionSelectedEventData[T]) => onSuggestionSelected(t0, t1).runNow()))
    onSuggestionsClearRequested.foreach(p => __obj.updateDynamic("onSuggestionsClearRequested")(p.toJsFn))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1((t0: /* inputProps */ typingsJapgolly.reactAutosuggest.mod.InputProps[T]) => renderInputComponent(t0).runNow()))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactAutosuggest.mod.RenderSuggestionsContainerParams) => renderSuggestionsContainer(t0).runNow()))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => shouldRenderSuggestions(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAutosuggest.mod.^[T, T2]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsSingleSection[T]])(children: _*)
  }
  def AutosuggestPropsMultiSection[T, T2](
    inputProps: InputProps[T],
    multiSection: `true`,
    suggestions: js.Array[T2],
    getSuggestionValue: T => CallbackTo[String],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
    renderSuggestion: (T, /* params */ RenderSuggestionParams) => CallbackTo[Node],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    getSectionSuggestions: T2 => CallbackTo[js.Array[T]] = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Callback = null,
    onSuggestionSelected: (/* event */ ReactEventFrom[js.Any with Element], /* data */ SuggestionSelectedEventData[T]) => Callback = null,
    onSuggestionsClearRequested: js.UndefOr[Callback] = js.undefined,
    renderInputComponent: /* inputProps */ InputProps[T] => CallbackTo[Node] = null,
    renderSectionTitle: /* section */ js.Any => CallbackTo[Node] = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => CallbackTo[Node] = null,
    shouldRenderSuggestions: /* value */ String => CallbackTo[Boolean] = null,
    theme: Theme = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[T, T2], 
    ^[T, T2], 
    Unit, 
    typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[T, T2]
  ] = {
    val __obj = js.Dynamic.literal(inputProps = inputProps.asInstanceOf[js.Any], multiSection = multiSection.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
  
      __obj.updateDynamic("getSuggestionValue")(js.Any.fromFunction1((t0: T) => getSuggestionValue(t0).runNow()))
    __obj.updateDynamic("onSuggestionsFetchRequested")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.reactAutosuggest.mod.SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()))
    __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction2((t0: T, t1: /* params */ typingsJapgolly.reactAutosuggest.mod.RenderSuggestionParams) => renderSuggestion(t0, t1).runNow()))
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick.asInstanceOf[js.Any])
    if (getSectionSuggestions != null) __obj.updateDynamic("getSectionSuggestions")(js.Any.fromFunction1((t0: T2) => getSectionSuggestions(t0).runNow()))
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactAutosuggest.mod.SuggestionHighlightedParams) => onSuggestionHighlighted(t0).runNow()))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element], t1: /* data */ typingsJapgolly.reactAutosuggest.mod.SuggestionSelectedEventData[T]) => onSuggestionSelected(t0, t1).runNow()))
    onSuggestionsClearRequested.foreach(p => __obj.updateDynamic("onSuggestionsClearRequested")(p.toJsFn))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1((t0: /* inputProps */ typingsJapgolly.reactAutosuggest.mod.InputProps[T]) => renderInputComponent(t0).runNow()))
    if (renderSectionTitle != null) __obj.updateDynamic("renderSectionTitle")(js.Any.fromFunction1((t0: /* section */ js.Any) => renderSectionTitle(t0).runNow()))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactAutosuggest.mod.RenderSuggestionsContainerParams) => renderSuggestionsContainer(t0).runNow()))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => shouldRenderSuggestions(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[T, T2], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactAutosuggest.mod.^[T, T2]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactAutosuggest.mod.AutosuggestPropsMultiSection[T, T2]])(children: _*)
  }
  @JSImport("react-autosuggest", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

