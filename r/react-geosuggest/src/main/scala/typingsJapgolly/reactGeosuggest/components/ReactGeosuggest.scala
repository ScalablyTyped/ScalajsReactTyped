package typingsJapgolly.reactGeosuggest.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googlemaps.google.maps.LatLng
import typingsJapgolly.googlemaps.google.maps.LatLngBounds
import typingsJapgolly.googlemaps.google.maps.places.AutocompletePrediction
import typingsJapgolly.reactGeosuggest.Typeofmaps
import typingsJapgolly.reactGeosuggest.mod.Fixture
import typingsJapgolly.reactGeosuggest.mod.GeosuggestProps
import typingsJapgolly.reactGeosuggest.mod.QueryType
import typingsJapgolly.reactGeosuggest.mod.Styles
import typingsJapgolly.reactGeosuggest.mod.Suggest
import typingsJapgolly.reactGeosuggest.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactGeosuggest {
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
    types: js.Array[QueryType] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GeosuggestProps, default, Unit, GeosuggestProps] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGeosuggest.mod.GeosuggestProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGeosuggest.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGeosuggest.mod.GeosuggestProps])(children: _*)
  }
  @JSImport("react-geosuggest", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

