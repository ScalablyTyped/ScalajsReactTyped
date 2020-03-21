package typingsJapgolly.rrc.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rrc.LocationDescriptorObjectL
import typingsJapgolly.rrc.mod.RouteConfiguration
import typingsJapgolly.rrc.mod.SwitchProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigSwitch {
  def apply(
    location: LocationDescriptorObjectL,
    routes: js.Array[RouteConfiguration],
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwitchProps, typingsJapgolly.rrc.mod.ConfigSwitch, Unit, SwitchProps] = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rrc.mod.SwitchProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rrc.mod.ConfigSwitch](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rrc.mod.SwitchProps])(children: _*)
  }
  @JSImport("rrc", "ConfigSwitch")
  @js.native
  object componentImport extends js.Object
  
}

