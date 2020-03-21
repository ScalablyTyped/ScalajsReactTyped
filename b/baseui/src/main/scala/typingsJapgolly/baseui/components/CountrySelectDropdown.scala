package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonCountrySelectDropdown
import typingsJapgolly.baseui.ReadonlyArrayReactNode
import typingsJapgolly.baseui.phoneInputMod.Country
import typingsJapgolly.baseui.phoneInputMod.CountrySelectDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CountrySelectDropdown {
  def apply(
    country: Country = null,
    mapIsoToLabel: /* iso */ String => CallbackTo[String] = null,
    maxDropdownHeight: String = null,
    overrides: AnonCountrySelectDropdown = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ReadonlyArrayReactNode = null
  ): UnmountedSimple[
    CountrySelectDropdownProps, 
    MountedWithRawType[
      CountrySelectDropdownProps, 
      js.Object, 
      RawMounted[CountrySelectDropdownProps, js.Object]
    ]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1((t0: /* iso */ java.lang.String) => mapIsoToLabel(t0).runNow()))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.baseui.phoneInputMod.CountrySelectDropdownProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.phoneInputMod.CountrySelectDropdownProps])
  }
  @JSImport("baseui/phone-input", "CountrySelectDropdown")
  @js.native
  object componentImport extends js.Object
  
}

