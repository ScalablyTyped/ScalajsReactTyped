package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fundamentalReact.AnonClear
import typingsJapgolly.fundamentalReact.inputGroupMod.InputGroupAddonPosition
import typingsJapgolly.fundamentalReact.inputGroupMod.InputGroupProps
import typingsJapgolly.fundamentalReact.inputGroupMod.InputGroupTypes
import typingsJapgolly.fundamentalReact.inputGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputGroup {
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    actions: js.UndefOr[Boolean] = js.undefined,
    addon: String = null,
    addonPos: InputGroupAddonPosition = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    glyph: String = null,
    inputClassName: String = null,
    inputId: String = null,
    inputName: String = null,
    inputPlaceholder: String = null,
    inputProps: StringDictionary[js.Any] = null,
    inputType: InputGroupTypes = null,
    inputValue: js.Any = null,
    localizedText: AnonClear = null,
    numberDownButtonProps: StringDictionary[js.Any] = null,
    numberUpButtonProps: StringDictionary[js.Any] = null,
    searchButtonProps: StringDictionary[js.Any] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[InputGroupProps, default, Unit, InputGroupProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(actions)) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (addon != null) __obj.updateDynamic("addon")(addon.asInstanceOf[js.Any])
    if (addonPos != null) __obj.updateDynamic("addonPos")(addonPos.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (glyph != null) __obj.updateDynamic("glyph")(glyph.asInstanceOf[js.Any])
    if (inputClassName != null) __obj.updateDynamic("inputClassName")(inputClassName.asInstanceOf[js.Any])
    if (inputId != null) __obj.updateDynamic("inputId")(inputId.asInstanceOf[js.Any])
    if (inputName != null) __obj.updateDynamic("inputName")(inputName.asInstanceOf[js.Any])
    if (inputPlaceholder != null) __obj.updateDynamic("inputPlaceholder")(inputPlaceholder.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (inputType != null) __obj.updateDynamic("inputType")(inputType.asInstanceOf[js.Any])
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (numberDownButtonProps != null) __obj.updateDynamic("numberDownButtonProps")(numberDownButtonProps.asInstanceOf[js.Any])
    if (numberUpButtonProps != null) __obj.updateDynamic("numberUpButtonProps")(numberUpButtonProps.asInstanceOf[js.Any])
    if (searchButtonProps != null) __obj.updateDynamic("searchButtonProps")(searchButtonProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.inputGroupMod.InputGroupProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.inputGroupMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.inputGroupMod.InputGroupProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/InputGroup/InputGroup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

