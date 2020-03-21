package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.gestalt.AnonEventValue
import typingsJapgolly.gestalt.mod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch {
  def apply(
    id: String,
    onChange: AnonEventValue => Callback,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    switched: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwitchProps, typingsJapgolly.gestalt.mod.Switch, Unit, SwitchProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: typingsJapgolly.gestalt.AnonEventValue) => onChange(t0).runNow()))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(switched)) __obj.updateDynamic("switched")(switched.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.gestalt.mod.SwitchProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.gestalt.mod.Switch](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.gestalt.mod.SwitchProps])(children: _*)
  }
  @JSImport("gestalt", "Switch")
  @js.native
  object componentImport extends js.Object
  
}

