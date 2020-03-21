package typingsJapgolly.reactFns.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps
import typingsJapgolly.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DeviceMotion {
  def apply(
    component: ComponentType[DeviceMotionProps | Unit] = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    render: DeviceMotionProps => CallbackTo[Node] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[DeviceMotionProps, Node]) | Node = null
  ): UnmountedWithRoot[
    SharedRenderProps[DeviceMotionProps], 
    typingsJapgolly.reactFns.mod.DeviceMotion, 
    Unit, 
    SharedRenderProps[DeviceMotionProps]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: typingsJapgolly.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps) => render(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactFns.typesMod.SharedRenderProps[typingsJapgolly.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps], 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactFns.mod.DeviceMotion](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactFns.typesMod.SharedRenderProps[typingsJapgolly.reactFns.deviceMotionDeviceMotionMod.DeviceMotionProps]])
  }
  @JSImport("react-fns", "DeviceMotion")
  @js.native
  object componentImport extends js.Object
  
}

