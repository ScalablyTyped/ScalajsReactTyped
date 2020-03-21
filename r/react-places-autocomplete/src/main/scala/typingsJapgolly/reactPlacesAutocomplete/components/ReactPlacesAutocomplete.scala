package typingsJapgolly.reactPlacesAutocomplete.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactPlacesAutocomplete.AnonBounds
import typingsJapgolly.reactPlacesAutocomplete.Readonlyloadingbooleansug
import typingsJapgolly.reactPlacesAutocomplete.mod.PropTypes
import typingsJapgolly.reactPlacesAutocomplete.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactPlacesAutocomplete {
  def apply(
    debounce: Int | Double = null,
    googleCallbackName: String = null,
    highlightFirstSuggestion: js.UndefOr[Boolean] = js.undefined,
    onChange: /* value */ String => Callback = null,
    onError: (/* status */ String, /* clearSuggestion */ js.Function0[Unit]) => Callback = null,
    onSelect: (/* address */ String, /* placeID */ String) => Callback = null,
    searchOptions: AnonBounds = null,
    shouldFetchSuggestions: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: Readonlyloadingbooleansug => CallbackTo[Node]
  ): UnmountedWithRoot[PropTypes, default, Unit, PropTypes] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactPlacesAutocomplete.mod.PropTypes, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactPlacesAutocomplete.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactPlacesAutocomplete.mod.PropTypes])
  }
  @JSImport("react-places-autocomplete", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

