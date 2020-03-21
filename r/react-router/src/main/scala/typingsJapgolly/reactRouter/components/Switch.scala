package typingsJapgolly.reactRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.reactRouter.mod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Switch {
  def apply(
    location: Location[LocationState] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwitchProps, typingsJapgolly.reactRouter.mod.Switch, Unit, SwitchProps] = {
    val __obj = js.Dynamic.literal()
  
      if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactRouter.mod.SwitchProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactRouter.mod.Switch](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactRouter.mod.SwitchProps])(children: _*)
  }
  @JSImport("react-router", "Switch")
  @js.native
  object componentImport extends js.Object
  
}

