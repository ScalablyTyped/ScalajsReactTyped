package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonValue
import typingsJapgolly.gestalt.AnonValueString
import typingsJapgolly.gestalt.gestaltStrings.`current-password`
import typingsJapgolly.gestalt.gestaltStrings.date
import typingsJapgolly.gestalt.gestaltStrings.down
import typingsJapgolly.gestalt.gestaltStrings.email
import typingsJapgolly.gestalt.gestaltStrings.left
import typingsJapgolly.gestalt.gestaltStrings.number
import typingsJapgolly.gestalt.gestaltStrings.off
import typingsJapgolly.gestalt.gestaltStrings.on
import typingsJapgolly.gestalt.gestaltStrings.password
import typingsJapgolly.gestalt.gestaltStrings.right
import typingsJapgolly.gestalt.gestaltStrings.text
import typingsJapgolly.gestalt.gestaltStrings.up
import typingsJapgolly.gestalt.gestaltStrings.url
import typingsJapgolly.gestalt.gestaltStrings.username
import typingsJapgolly.gestalt.mod.TextFieldProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TextField {
  def apply(
    id: String,
    onChange: AnonValue => Callback,
    autoComplete: `current-password` | on | off | username = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    idealErrorDirection: up | right | down | left = null,
    name: String = null,
    onBlur: /* args */ AnonValueString => Callback = null,
    onFocus: /* args */ AnonValueString => Callback = null,
    placeholder: String = null,
    `type`: date | email | number | password | text | url = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TextFieldProps, typingsJapgolly.gestalt.mod.TextField, Unit, TextFieldProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonValue) => onChange(t0).runNow()))
    if (autoComplete != null) __obj.updateDynamic("autoComplete")(autoComplete.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonValueString) => onBlur(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.gestalt.AnonValueString) => onFocus(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.TextFieldProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.TextField](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.TextFieldProps])(children: _*)
  }
  @JSImport("gestalt", "TextField")
  @js.native
  object componentImport extends js.Object
  
}

