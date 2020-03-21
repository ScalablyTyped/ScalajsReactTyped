package typingsJapgolly.reactAutosuggest.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactAutosuggest.reactAutosuggestBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutosuggestPropsSingleSection[TSuggestion]
  extends AutosuggestPropsBase[TSuggestion]
     with AutosuggestProps[TSuggestion, js.Any] {
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
  @scala.inline
  def apply[TSuggestion](
    getSuggestionValue: TSuggestion => CallbackTo[String],
    inputProps: InputProps[TSuggestion],
    onSuggestionsFetchRequested: /* request */ SuggestionsFetchRequestedParams => Callback,
    renderSuggestion: (TSuggestion, /* params */ RenderSuggestionParams) => CallbackTo[Node],
    suggestions: js.Array[TSuggestion],
    alwaysRenderSuggestions: js.UndefOr[Boolean] = js.undefined,
    focusInputOnSuggestionClick: js.UndefOr[Boolean] = js.undefined,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    multiSection: `false` = null,
    onSuggestionHighlighted: /* params */ SuggestionHighlightedParams => Callback = null,
    onSuggestionSelected: (/* event */ ReactEventFrom[js.Any with Element], /* data */ SuggestionSelectedEventData[TSuggestion]) => Callback = null,
    onSuggestionsClearRequested: js.UndefOr[Callback] = js.undefined,
    renderInputComponent: /* inputProps */ InputProps[TSuggestion] => CallbackTo[Node] = null,
    renderSuggestionsContainer: /* params */ RenderSuggestionsContainerParams => CallbackTo[Node] = null,
    shouldRenderSuggestions: /* value */ String => CallbackTo[Boolean] = null,
    theme: Theme = null
  ): AutosuggestPropsSingleSection[TSuggestion] = {
    val __obj = js.Dynamic.literal(inputProps = inputProps.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.updateDynamic("getSuggestionValue")(js.Any.fromFunction1((t0: TSuggestion) => getSuggestionValue(t0).runNow()))
    __obj.updateDynamic("onSuggestionsFetchRequested")(js.Any.fromFunction1((t0: /* request */ typingsJapgolly.reactAutosuggest.mod.SuggestionsFetchRequestedParams) => onSuggestionsFetchRequested(t0).runNow()))
    __obj.updateDynamic("renderSuggestion")(js.Any.fromFunction2((t0: TSuggestion, t1: /* params */ typingsJapgolly.reactAutosuggest.mod.RenderSuggestionParams) => renderSuggestion(t0, t1).runNow()))
    if (!js.isUndefined(alwaysRenderSuggestions)) __obj.updateDynamic("alwaysRenderSuggestions")(alwaysRenderSuggestions.asInstanceOf[js.Any])
    if (!js.isUndefined(focusInputOnSuggestionClick)) __obj.updateDynamic("focusInputOnSuggestionClick")(focusInputOnSuggestionClick.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (multiSection != null) __obj.updateDynamic("multiSection")(multiSection.asInstanceOf[js.Any])
    if (onSuggestionHighlighted != null) __obj.updateDynamic("onSuggestionHighlighted")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactAutosuggest.mod.SuggestionHighlightedParams) => onSuggestionHighlighted(t0).runNow()))
    if (onSuggestionSelected != null) __obj.updateDynamic("onSuggestionSelected")(js.Any.fromFunction2((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[js.Any with org.scalajs.dom.raw.Element], t1: /* data */ typingsJapgolly.reactAutosuggest.mod.SuggestionSelectedEventData[TSuggestion]) => onSuggestionSelected(t0, t1).runNow()))
    onSuggestionsClearRequested.foreach(p => __obj.updateDynamic("onSuggestionsClearRequested")(p.toJsFn))
    if (renderInputComponent != null) __obj.updateDynamic("renderInputComponent")(js.Any.fromFunction1((t0: /* inputProps */ typingsJapgolly.reactAutosuggest.mod.InputProps[TSuggestion]) => renderInputComponent(t0).runNow()))
    if (renderSuggestionsContainer != null) __obj.updateDynamic("renderSuggestionsContainer")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.reactAutosuggest.mod.RenderSuggestionsContainerParams) => renderSuggestionsContainer(t0).runNow()))
    if (shouldRenderSuggestions != null) __obj.updateDynamic("shouldRenderSuggestions")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => shouldRenderSuggestions(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutosuggestPropsSingleSection[TSuggestion]]
  }
}

