package typingsJapgolly.reactDashRouterDashDom.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.historyMod.Location
import typingsJapgolly.history.historyMod.LocationState
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashRouter.reactDashRouterMod.RouteChildrenProps
import typingsJapgolly.reactDashRouter.reactDashRouterMod.RouteComponentProps
import typingsJapgolly.reactDashRouter.reactDashRouterMod.RouteProps
import typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Route {
  def apply(
    component: ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    path: String | js.Array[String] = null,
    render: /* props */ RouteComponentProps[js.Any, StaticContext, LocationState] => CallbackTo[Node] = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: (js.Function1[/* props */ RouteChildrenProps[_, LocationState], Node]) | Node = null
  ): UnmountedWithRoot[
    RouteProps, 
    typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.Route[RouteProps], 
    Unit, 
    RouteProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashRouter.reactDashRouterMod.RouteComponentProps[
  js.Any, 
  typingsJapgolly.reactDashRouter.reactDashRouterMod.StaticContext, 
  typingsJapgolly.history.historyMod.LocationState]) => render(t0).runNow()))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashRouter.reactDashRouterMod.RouteProps, 
  japgolly.scalajs.react.Children.None, 
  typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.Route[typingsJapgolly.reactDashRouter.reactDashRouterMod.RouteProps]](js.constructorOf[typingsJapgolly.reactDashRouterDashDom.reactDashRouterDashDomMod.Route[typingsJapgolly.reactDashRouter.reactDashRouterMod.RouteProps]])
    f(__obj.asInstanceOf[typingsJapgolly.reactDashRouter.reactDashRouterMod.RouteProps])
  }
}

