package typingsJapgolly.fundamentalReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import typingsJapgolly.fundamentalReact.formLabelMod.FormLabelProps
import typingsJapgolly.fundamentalReact.toggleMod.ToggleProps
import typingsJapgolly.fundamentalReact.toggleMod.ToggleSize
import typingsJapgolly.fundamentalReact.toggleMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toggle {
  def apply(
    StringDictionary: /* x */ StringDictionary[js.Any] = null,
    checked: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    customStyles: StringDictionary[js.Any] = null,
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    inputProps: StringDictionary[js.Any] = null,
    isCheck: js.UndefOr[Boolean] = js.undefined,
    isInline: js.UndefOr[Boolean] = js.undefined,
    labelProps: FormLabelProps = null,
    onChange: /* event */ ReactEventFrom[HTMLInputElement] => Callback = null,
    size: ToggleSize = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ToggleProps, default, Unit, ToggleProps] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (customStyles != null) __obj.updateDynamic("customStyles")(customStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (!js.isUndefined(isCheck)) __obj.updateDynamic("isCheck")(isCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* event */ japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLInputElement]) => onChange(t0).runNow()))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.fundamentalReact.toggleMod.ToggleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.fundamentalReact.toggleMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.fundamentalReact.toggleMod.ToggleProps])(children: _*)
  }
  @JSImport("fundamental-react/lib/Toggle/Toggle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

