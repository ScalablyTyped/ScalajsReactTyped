package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonLabel
import typingsJapgolly.gestalt.AnonValue
import typingsJapgolly.gestalt.gestaltStrings.down
import typingsJapgolly.gestalt.gestaltStrings.left
import typingsJapgolly.gestalt.gestaltStrings.right
import typingsJapgolly.gestalt.gestaltStrings.up
import typingsJapgolly.gestalt.mod.SelectListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SelectList {
  def apply(
    id: String,
    options: js.Array[AnonLabel],
    onChange: AnonValue => Callback,
    disabled: js.UndefOr[Boolean] = js.undefined,
    errorMessage: String = null,
    idealErrorDirection: up | right | down | left = null,
    name: String = null,
    placeholder: String = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SelectListProps, typingsJapgolly.gestalt.mod.SelectList, Unit, SelectListProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonValue) => onChange(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (idealErrorDirection != null) __obj.updateDynamic("idealErrorDirection")(idealErrorDirection.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.SelectListProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.SelectList](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.SelectListProps])(children: _*)
  }
  @JSImport("gestalt", "SelectList")
  @js.native
  object componentImport extends js.Object
  
}

