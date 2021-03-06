package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonChecked
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.sm
import typingsJapgolly.gestalt.mod.RadioButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RadioButton {
  def apply(
    id: String,
    onChange: AnonChecked => Callback,
    checked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    size: sm | md = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RadioButtonProps, typingsJapgolly.gestalt.mod.RadioButton, Unit, RadioButtonProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonChecked) => onChange(t0).runNow()))
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.RadioButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.RadioButton](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.RadioButtonProps])(children: _*)
  }
  @JSImport("gestalt", "RadioButton")
  @js.native
  object componentImport extends js.Object
  
}

