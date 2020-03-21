package typingsJapgolly.reactGateway.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactGateway.gatewayMod.GatewayProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Gateway {
  def apply(
    into: String,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GatewayProps, typingsJapgolly.reactGateway.mod.Gateway, Unit, GatewayProps] = {
    val __obj = js.Dynamic.literal(into = into.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactGateway.gatewayMod.GatewayProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactGateway.mod.Gateway](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactGateway.gatewayMod.GatewayProps])(children: _*)
  }
  @JSImport("react-gateway", "Gateway")
  @js.native
  object componentImport extends js.Object
  
}

