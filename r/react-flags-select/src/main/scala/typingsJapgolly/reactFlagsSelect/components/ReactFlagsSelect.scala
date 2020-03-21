package typingsJapgolly.reactFlagsSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactFlagsSelect.mod.Props
import typingsJapgolly.reactFlagsSelect.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFlagsSelect {
  def apply(
    alignOptions: String = null,
    blackList: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    countries: js.Array[String] = null,
    customLabels: StringDictionary[String] = null,
    defaultCountry: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    onSelect: /* countryCode */ String => Callback = null,
    optionsSize: Int | Double = null,
    placeholder: String = null,
    searchable: js.UndefOr[Boolean] = js.undefined,
    selectedSize: Int | Double = null,
    showOptionLabel: js.UndefOr[Boolean] = js.undefined,
    showSelectedLabel: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal()
  
      if (alignOptions != null) __obj.updateDynamic("alignOptions")(alignOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(blackList)) __obj.updateDynamic("blackList")(blackList.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (countries != null) __obj.updateDynamic("countries")(countries.asInstanceOf[js.Any])
    if (customLabels != null) __obj.updateDynamic("customLabels")(customLabels.asInstanceOf[js.Any])
    if (defaultCountry != null) __obj.updateDynamic("defaultCountry")(defaultCountry.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: /* countryCode */ java.lang.String) => onSelect(t0).runNow()))
    if (optionsSize != null) __obj.updateDynamic("optionsSize")(optionsSize.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(searchable)) __obj.updateDynamic("searchable")(searchable.asInstanceOf[js.Any])
    if (selectedSize != null) __obj.updateDynamic("selectedSize")(selectedSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showOptionLabel)) __obj.updateDynamic("showOptionLabel")(showOptionLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(showSelectedLabel)) __obj.updateDynamic("showSelectedLabel")(showSelectedLabel.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFlagsSelect.mod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactFlagsSelect.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFlagsSelect.mod.Props])(children: _*)
  }
  @JSImport("react-flags-select", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

