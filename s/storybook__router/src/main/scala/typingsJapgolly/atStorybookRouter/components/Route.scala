package typingsJapgolly.atStorybookRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.atStorybookRouter.distRouterMod.RenderData
import typingsJapgolly.atStorybookRouter.distRouterMod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Route {
  def apply(
    hideOnly: Boolean,
    path: String,
    startsWith: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: RenderData => CallbackTo[Node]
  ): UnmountedSimple[
    RouteProps, 
    MountedWithRawType[RouteProps, js.Object, RawMounted[RouteProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(hideOnly = hideOnly.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.atStorybookRouter.distRouterMod.RenderData) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.atStorybookRouter.distRouterMod.RouteProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](typingsJapgolly.atStorybookRouter.distRouterMod.Route)
    f(__obj.asInstanceOf[typingsJapgolly.atStorybookRouter.distRouterMod.RouteProps])
  }
}

