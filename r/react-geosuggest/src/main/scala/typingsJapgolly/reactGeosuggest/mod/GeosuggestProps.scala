package typingsJapgolly.reactGeosuggest.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngBounds
import typingsJapgolly.googlemaps.google.maps.places.AutocompletePrediction
import typingsJapgolly.reactGeosuggest.Typeofmaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in {[ P in keyof react.react.InputHTMLAttributes<std.HTMLInputElement> ]: P} & {[ P in 'style' ]: never} & {[x: string] : never, [x: number] : never}[keyof react.react.InputHTMLAttributes<std.HTMLInputElement>] ]: react.react.InputHTMLAttributes<std.HTMLInputElement>[P]} */ trait GeosuggestProps extends js.Object {
  var autoActivateFirstSuggest: js.UndefOr[Boolean] = js.undefined
  var autoComplete: js.UndefOr[String] = js.undefined
  var bounds: js.UndefOr[LatLngBounds] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String | js.Array[String]] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var fixtures: js.UndefOr[js.Array[Fixture]] = js.undefined
  var getSuggestLabel: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, String]] = js.undefined
  var googleMaps: js.UndefOr[Typeofmaps] = js.undefined
  var highlightMatch: js.UndefOr[Boolean] = js.undefined
  var ignoreEnter: js.UndefOr[Boolean] = js.undefined
  var ignoreTab: js.UndefOr[Boolean] = js.undefined
  var initialValue: js.UndefOr[String] = js.undefined
  var inputClassName: js.UndefOr[String] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[LatLng] = js.undefined
  var maxFixtures: js.UndefOr[Double] = js.undefined
  var minLength: js.UndefOr[Double] = js.undefined
  var onActivateSuggest: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  var onKeyDown: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onKeyPress: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onSuggestNoResults: js.UndefOr[js.Function1[/* userInput */ String, Unit]] = js.undefined
  var onSuggestSelect: js.UndefOr[js.Function1[/* suggest */ Suggest, Unit]] = js.undefined
  var onUpdateSuggests: js.UndefOr[js.Function2[/* suggests */ js.Any, /* activeSuggest */ js.Any, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var queryDelay: js.UndefOr[Double] = js.undefined
  var radius: js.UndefOr[Double] = js.undefined
  var renderSuggestItem: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, _]] = js.undefined
  var skipSuggest: js.UndefOr[js.Function1[/* googleSuggest */ AutocompletePrediction, Boolean]] = js.undefined
  var style: js.UndefOr[Styles] = js.undefined
  var suggestItemActiveClassName: js.UndefOr[String] = js.undefined
  var suggestItemClassName: js.UndefOr[String] = js.undefined
  var suggestsClassName: js.UndefOr[String] = js.undefined
  var suggestsHiddenClassName: js.UndefOr[String] = js.undefined
  var types: js.UndefOr[js.Array[QueryType]] = js.undefined
}

object GeosuggestProps {
  @scala.inline
  def apply(
    autoActivateFirstSuggest: js.UndefOr[Boolean] = js.undefined,
    autoComplete: String = null,
    bounds: LatLngBounds = null,
    className: String = null,
    country: String | js.Array[String] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fixtures: js.Array[Fixture] = null,
    getSuggestLabel: /* googleSuggest */ AutocompletePrediction => CallbackTo[String] = null,
    googleMaps: Typeofmaps = null,
    highlightMatch: js.UndefOr[Boolean] = js.undefined,
    ignoreEnter: js.UndefOr[Boolean] = js.undefined,
    ignoreTab: js.UndefOr[Boolean] = js.undefined,
    initialValue: String = null,
    inputClassName: String = null,
    label: String = null,
    location: LatLng = null,
    maxFixtures: Int | Double = null,
    minLength: Int | Double = null,
    onActivateSuggest: /* suggest */ Suggest => Callback = null,
    onBlur: /* value */ js.Any => Callback = null,
    onChange: /* value */ js.Any => Callback = null,
    onFocus: /* value */ js.Any => Callback = null,
    onKeyDown: /* event */ js.Any => Callback = null,
    onKeyPress: /* event */ js.Any => Callback = null,
    onSuggestNoResults: /* userInput */ String => Callback = null,
    onSuggestSelect: /* suggest */ Suggest => Callback = null,
    onUpdateSuggests: (/* suggests */ js.Any, /* activeSuggest */ js.Any) => Callback = null,
    placeholder: String = null,
    queryDelay: Int | Double = null,
    radius: Int | Double = null,
    renderSuggestItem: /* googleSuggest */ AutocompletePrediction => CallbackTo[js.Any] = null,
    skipSuggest: /* googleSuggest */ AutocompletePrediction => CallbackTo[Boolean] = null,
    style: Styles = null,
    suggestItemActiveClassName: String = null,
    suggestItemClassName: String = null,
    suggestsClassName: String = null,
    suggestsHiddenClassName: String = null,
    types: js.Array[QueryType] = null
  ): GeosuggestProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoActivateFirstSuggest)) __obj.updateDynamic("autoActivateFirstSuggest")(autoActivateFirstSuggest.asInstanceOf[js.Any])
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (fixtures != null) __obj.updateDynamic("fixtures")(fixtures.asInstanceOf[js.Any])
    if (getSuggestLabel != null) __obj.updateDynamic("getSuggestLabel")(js.Any.fromFunction1((t0: /* googleSuggest */ typingsJapgolly.googlemaps.google.maps.places.AutocompletePrediction) => getSuggestLabel(t0).runNow()))
    if (googleMaps != null) __obj.updateDynamic("googleMaps")(googleMaps.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightMatch)) __obj.updateDynamic("highlightMatch")(highlightMatch.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEnter)) __obj.updateDynamic("ignoreEnter")(ignoreEnter.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreTab)) __obj.updateDynamic("ignoreTab")(ignoreTab.asInstanceOf[js.Any])
    if (initialValue != null) __obj.updateDynamic("initialValue")(initialValue.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (maxFixtures != null) __obj.updateDynamic("maxFixtures")(maxFixtures.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (onActivateSuggest != null) __obj.updateDynamic("onActivateSuggest")(js.Any.fromFunction1((t0: /* suggest */ typingsJapgolly.reactGeosuggest.mod.Suggest) => onActivateSuggest(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* value */ js.Any) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* value */ js.Any) => onFocus(t0).runNow()))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1((t0: /* event */ js.Any) => onKeyDown(t0).runNow()))
    if (onKeyPress != null) __obj.updateDynamic("onKeyPress")(js.Any.fromFunction1((t0: /* event */ js.Any) => onKeyPress(t0).runNow()))
    if (onSuggestNoResults != null) __obj.updateDynamic("onSuggestNoResults")(js.Any.fromFunction1((t0: /* userInput */ java.lang.String) => onSuggestNoResults(t0).runNow()))
    if (onSuggestSelect != null) __obj.updateDynamic("onSuggestSelect")(js.Any.fromFunction1((t0: /* suggest */ typingsJapgolly.reactGeosuggest.mod.Suggest) => onSuggestSelect(t0).runNow()))
    if (onUpdateSuggests != null) __obj.updateDynamic("onUpdateSuggests")(js.Any.fromFunction2((t0: /* suggests */ js.Any, t1: /* activeSuggest */ js.Any) => onUpdateSuggests(t0, t1).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (queryDelay != null) __obj.updateDynamic("queryDelay")(queryDelay.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (renderSuggestItem != null) __obj.updateDynamic("renderSuggestItem")(js.Any.fromFunction1((t0: /* googleSuggest */ typingsJapgolly.googlemaps.google.maps.places.AutocompletePrediction) => renderSuggestItem(t0).runNow()))
    if (skipSuggest != null) __obj.updateDynamic("skipSuggest")(js.Any.fromFunction1((t0: /* googleSuggest */ typingsJapgolly.googlemaps.google.maps.places.AutocompletePrediction) => skipSuggest(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (suggestItemActiveClassName != null) __obj.updateDynamic("suggestItemActiveClassName")(suggestItemActiveClassName.asInstanceOf[js.Any])
    if (suggestItemClassName != null) __obj.updateDynamic("suggestItemClassName")(suggestItemClassName.asInstanceOf[js.Any])
    if (suggestsClassName != null) __obj.updateDynamic("suggestsClassName")(suggestsClassName.asInstanceOf[js.Any])
    if (suggestsHiddenClassName != null) __obj.updateDynamic("suggestsHiddenClassName")(suggestsHiddenClassName.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeosuggestProps]
  }
}

