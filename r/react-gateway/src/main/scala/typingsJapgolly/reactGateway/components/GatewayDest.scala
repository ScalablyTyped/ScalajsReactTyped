package typingsJapgolly.reactGateway.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactGateway.gatewayDestMod.GatewayDestProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GatewayDest {
  def apply(
    name: String,
    component: String | ComponentType[js.Object] = null,
    tagName: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GatewayDestProps, typingsJapgolly.reactGateway.mod.GatewayDest, Unit, GatewayDestProps] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
      if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGateway.gatewayDestMod.GatewayDestProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGateway.mod.GatewayDest](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGateway.gatewayDestMod.GatewayDestProps])(children: _*)
  }
  @JSImport("react-gateway", "GatewayDest")
  @js.native
  object componentImport extends js.Object
  
}

