package typingsJapgolly.atReachRouter.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atReachRouter.atReachRouterMod.ServerLocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ServerLocation {
  def apply(
    url: String,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ServerLocationProps, 
    typingsJapgolly.atReachRouter.atReachRouterMod.ServerLocation, 
    Unit, 
    ServerLocationProps
  ] = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
      key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atReachRouter.atReachRouterMod.ServerLocationProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.atReachRouter.atReachRouterMod.ServerLocation](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atReachRouter.atReachRouterMod.ServerLocationProps])(children: _*)
  }
  @JSImport("@reach/router", "ServerLocation")
  @js.native
  object componentImport extends js.Object
  
}

