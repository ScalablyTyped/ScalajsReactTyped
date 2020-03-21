package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Ref
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonCountrySelect
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.phoneInputMod.Country
import typingsJapgolly.baseui.phoneInputMod.CountrySelectProps
import typingsJapgolly.baseui.selectMod.OnChangeParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CountrySelect {
  def apply(
    countries: StringDictionary[Country],
    country: Country = null,
    inputRef: Ref = null,
    mapIsoToLabel: /* iso */ String => CallbackTo[String] = null,
    maxDropdownHeight: String = null,
    maxDropdownWidth: String = null,
    onCountryChange: /* event */ OnChangeParams => CallbackTo[js.Any] = null,
    overrides: AnonCountrySelect = null,
    size: default_ | compact | large_ = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    CountrySelectProps, 
    MountedWithRawType[CountrySelectProps, js.Object, RawMounted[CountrySelectProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
  
      if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1((t0: /* iso */ java.lang.String) => mapIsoToLabel(t0).runNow()))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (maxDropdownWidth != null) __obj.updateDynamic("maxDropdownWidth")(maxDropdownWidth.asInstanceOf[js.Any])
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.baseui.selectMod.OnChangeParams) => onCountryChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.phoneInputMod.CountrySelectProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.phoneInputMod.CountrySelectProps])(children: _*)
  }
  @JSImport("baseui/phone-input", "CountrySelect")
  @js.native
  object componentImport extends js.Object
  
}

