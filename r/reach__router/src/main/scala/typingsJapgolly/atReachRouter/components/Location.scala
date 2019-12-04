package typingsJapgolly.atReachRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atReachRouter.atReachRouterMod.LocationContext
import typingsJapgolly.atReachRouter.atReachRouterMod.LocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Location {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: /* context */ LocationContext => CallbackTo[Node]
  ): UnmountedWithRoot[
    LocationProps, 
    typingsJapgolly.atReachRouter.atReachRouterMod.Location, 
    Unit, 
    LocationProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.atReachRouter.atReachRouterMod.LocationContext) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.atReachRouter.atReachRouterMod.LocationProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.atReachRouter.atReachRouterMod.Location](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.atReachRouter.atReachRouterMod.LocationProps])
  }
  @JSImport("@reach/router", "Location")
  @js.native
  object componentImport extends js.Object
  
}

