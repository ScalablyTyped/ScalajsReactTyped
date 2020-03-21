package typingsJapgolly.reactPlacesAutocomplete.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactPlacesAutocomplete.AnonBounds
import typingsJapgolly.reactPlacesAutocomplete.Readonlyloadingbooleansug
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropTypes extends js.Object {
  var debounce: js.UndefOr[Double] = js.undefined
  var googleCallbackName: js.UndefOr[String] = js.undefined
  var highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onError: js.UndefOr[
    js.Function2[/* status */ String, /* clearSuggestion */ js.Function0[Unit], Unit]
  ] = js.undefined
  var onSelect: js.UndefOr[js.Function2[/* address */ String, /* placeID */ String, Unit]] = js.undefined
  var searchOptions: js.UndefOr[AnonBounds] = js.undefined
  var shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
  def children(opts: Readonlyloadingbooleansug): Node
}

object PropTypes {
  @scala.inline
  def apply(
    children: Readonlyloadingbooleansug => CallbackTo[Node],
    debounce: Int | Double = null,
    googleCallbackName: String = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Callback = null,
    onError: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Callback = null,
    onSelect: (/* address */ String, /* placeID */ String) => Callback = null,
    searchOptions: AnonBounds = null,
    shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): PropTypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.reactPlacesAutocomplete.Readonlyloadingbooleansug) => children(t0).runNow()))
    if (debounce != null) __obj.updateDynamic("debounce")(debounce.asInstanceOf[js.Any])
    if (googleCallbackName != null) __obj.updateDynamic("googleCallbackName")(googleCallbackName.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightFirstSuggestion)) __obj.updateDynamic("highlightFirstSuggestion")(highlightFirstSuggestion.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction2((t0: /* status */ java.lang.String, t1: /* clearSuggestion */ js.Function0[scala.Unit]) => onError(t0, t1).runNow()))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* address */ java.lang.String, t1: /* placeID */ java.lang.String) => onSelect(t0, t1).runNow()))
    if (searchOptions != null) __obj.updateDynamic("searchOptions")(searchOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFetchSuggestions)) __obj.updateDynamic("shouldFetchSuggestions")(shouldFetchSuggestions.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropTypes]
  }
}

