package typingsJapgolly.reachRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reachRouter.mod.LocationContext
import typingsJapgolly.reachRouter.mod.LocationProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Location {
  def apply(
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: /* context */ LocationContext => CallbackTo[Node]
  ): UnmountedWithRoot[LocationProps, typingsJapgolly.reachRouter.mod.Location, Unit, LocationProps] = {
    val __obj = js.Dynamic.literal()
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: /* context */ typingsJapgolly.reachRouter.mod.LocationContext) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reachRouter.mod.LocationProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reachRouter.mod.Location](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reachRouter.mod.LocationProps])
  }
  @JSImport("@reach/router", "Location")
  @js.native
  object componentImport extends js.Object
  
}

