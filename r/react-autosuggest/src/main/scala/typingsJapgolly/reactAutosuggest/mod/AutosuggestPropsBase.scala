package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosuggestPropsBase[TSuggestion] extends js.Object {
  /**
    * Set it to true if you'd like to render suggestions even when the input is not focused.
    */
  var alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined
  /**
    * Set it to false if you don't want Autosuggest to keep the input focused when suggestions are clicked/tapped.
    */
  var focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Implement it to teach Autosuggest what should be the input value when suggestion is clicked.
    */
  var getSuggestionValue: GetSuggestionValue[TSuggestion]
  /**
    * 	Set it to true if you'd like Autosuggest to automatically highlight the first suggestion.
    */
  var highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined
  /**
    * Use it only if you have multiple Autosuggest components on a page.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Pass through arbitrary props to the input. It must contain at least value and onChange.
    */
  var inputProps: InputProps[TSuggestion]
  /**
    * Will be called every time the highlighted suggestion changes.
    */
  var onSuggestionHighlighted: js.UndefOr[OnSuggestionHighlighted] = js.undefined
  /**
    * Will be called every time suggestion is selected via mouse or keyboard.
    */
  var onSuggestionSelected: js.UndefOr[OnSuggestionSelected[TSuggestion]] = js.undefined
  /**
    * Will be called every time you need to set suggestions to [].
    */
  var onSuggestionsClearRequested: js.UndefOr[OnSuggestionsClearRequested] = js.undefined
  /**
    * Will be called every time you need to recalculate suggestions.
    */
  var onSuggestionsFetchRequested: SuggestionsFetchRequested
  /**
    * Use it only if you need to customize the rendering of the input.
    */
  var renderInputComponent: js.UndefOr[RenderInputComponent[TSuggestion]] = js.undefined
  /**
    * Use your imagination to define how suggestions are rendered.
    */
  var renderSuggestion: RenderSuggestion[TSuggestion]
  /**
    * Use it if you want to customize things inside the suggestions container beyond rendering the suggestions themselves.
    */
  var renderSuggestionsContainer: js.UndefOr[RenderSuggestionsContainer] = js.undefined
  /**
    * When the input is focused, Autosuggest will consult this function when to render suggestions.
    * Use it, for example, if you want to display suggestions when input value is at least 2 characters long.
    */
  var shouldRenderSuggestions: js.UndefOr[ShouldRenderSuggestions] = js.undefined
  /**
    * Use your imagination to style the Autosuggest.
    */
  var theme: js.UndefOr[Theme] = js.undefined
}

object AutosuggestPropsBase {
  @scala.inline
  def apply[TSuggestion](
    getSuggestionValue: TSuggestion => CallbackTo[String],
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => CallbackTo[Node],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Callback = null,
    onSuggestionSelected: (/* event */ ReactEventFrom[js.Any with Element], /* data */ SuggestionSelectedEventData[TSuggestion]) => Callback = null,
    onSuggestionsClearRequested: js.UndefOr[Callback] = js.undefined,
    renderInputComponent: /* inputProps */ InputProps[TSuggestion] => CallbackTo[Node] = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => CallbackTo[Node] = null,
    shouldRenderSuggestions: /* value */ String => CallbackTo[Boolean] = null,
    theme: Theme = null
  ): AutosuggestPropsBase[TSuggestion] = {
    val __obj = js.Dynamic.literal(inputProps = inputProps.asInstanceOf[js.Any])
    __obj.updateDynamic("getSuggestionValue")(js.Any.fromFunction1((t0: TSuggestion) => getSuggestionValue(t0).runNow()))
    __obj.updateDynamic("onSuggestionsFetchRequested")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.reactAutosuggest.mod.SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()))
    __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction2((t0: TSuggestion, t1: /* params */ typingsJapgolly.reactAutosuggest.mod.RenderSuggestionParams) => renderSuggestion(t0, t1).runNow()))
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactAutosuggest.mod.SuggestionHighlightedParams) => onSuggestionHighlighted(t0).runNow()))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element], t1: /* data */ typingsJapgolly.reactAutosuggest.mod.SuggestionSelectedEventData[TSuggestion]) => onSuggestionSelected(t0, t1).runNow()))
    onSuggestionsClearRequested.foreach(p => __obj.updateDynamic("onSuggestionsClearRequested")(p.toJsFn))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1((t0: /* inputProps */ typingsJapgolly.reactAutosuggest.mod.InputProps[TSuggestion]) => renderInputComponent(t0).runNow()))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactAutosuggest.mod.RenderSuggestionsContainerParams) => renderSuggestionsContainer(t0).runNow()))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => shouldRenderSuggestions(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsBase[TSuggestion]]
  }
}

