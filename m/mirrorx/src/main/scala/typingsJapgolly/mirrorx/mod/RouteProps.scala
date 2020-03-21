package typingsJapgolly.mirrorx.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteProps extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ RouteComponentProps[_], Node]) | Node] = js.undefined
  var component: js.UndefOr[ComponentType[_ | RouteComponentProps[_]]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ RouteComponentProps[_], Node]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouteProps {
  @scala.inline
  def apply(
    children: (js.Function1[/* props */ RouteComponentProps[_], Node]) | Node = null,
    component: ComponentType[_ | RouteComponentProps[_]] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    path: String = null,
    render: /* props */ RouteComponentProps[js.Any] => CallbackTo[Node] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouteProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.mirrorx.mod.RouteComponentProps[js.Any]) => render(t0).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteProps]
  }
}

