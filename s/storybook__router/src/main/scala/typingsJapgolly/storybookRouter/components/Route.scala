package typingsJapgolly.storybookRouter.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.storybookRouter.routerMod.RenderData
import typingsJapgolly.storybookRouter.routerMod.RouteProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Route {
  def apply(
    hideOnly: Boolean,
    path: String,
    startsWith: Boolean,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: RenderData => CallbackTo[Node]
  ): UnmountedSimple[
    RouteProps, 
    MountedWithRawType[RouteProps, js.Object, RawMounted[RouteProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal(hideOnly = hideOnly.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
  
      __obj.updateDynamic("children")(js.Any.fromFunction1((t0: typingsJapgolly.storybookRouter.routerMod.RenderData) => children(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.storybookRouter.routerMod.RouteProps, 
  japgolly.scalajs.react.Children.None, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.storybookRouter.routerMod.RouteProps])
  }
  @JSImport("@storybook/router", "Route")
  @js.native
  object componentImport extends js.Object
  
}

