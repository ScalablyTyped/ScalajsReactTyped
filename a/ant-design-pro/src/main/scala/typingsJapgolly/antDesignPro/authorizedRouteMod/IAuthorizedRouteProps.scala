package typingsJapgolly.antDesignPro.authorizedRouteMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRouter.mod.RouteChildrenProps
import typingsJapgolly.reactRouter.mod.RouteComponentProps
import typingsJapgolly.reactRouter.mod.RouteProps
import typingsJapgolly.reactRouter.mod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAuthorizedRouteProps extends RouteProps {
  var authority: typingsJapgolly.antDesignPro.authorizedRouteMod.authority
}

object IAuthorizedRouteProps {
  @scala.inline
  def apply(
    authority: authority,
    children: (js.Function1[/* props */ RouteChildrenProps[_, LocationState], Node]) | Node = null,
    component: ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    path: String | js.Array[String] = null,
    render: /* props */ RouteComponentProps[js.Any, StaticContext, LocationState] => CallbackTo[Node] = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): IAuthorizedRouteProps = {
    val __obj = js.Dynamic.literal(authority = authority.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouter.mod.RouteComponentProps[
  js.Any, 
  typingsJapgolly.reactRouter.mod.StaticContext, 
  typingsJapgolly.history.mod.LocationState]) => render(t0).runNow()))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAuthorizedRouteProps]
  }
}

