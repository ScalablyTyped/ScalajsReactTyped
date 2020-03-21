package typingsJapgolly.reactRouterNavigationCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.reactRouter.mod.RouterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-router-navigation-core.react-router-navigation-core.RouteProps & {  key  :string, onIndexChange ? (index : number): void} */
trait Tab extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ RouterProps, Node]) | Node] = js.undefined
  var component: js.UndefOr[ComponentClassP[RouterProps with js.Object]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var key: String
  var onIndexChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ RouterProps, Node]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Tab {
  @scala.inline
  def apply(
    key: String,
    children: (js.Function1[/* props */ RouterProps, Node]) | Node = null,
    component: ComponentClassP[RouterProps with js.Object] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    onIndexChange: /* index */ Double => Callback = null,
    path: String = null,
    render: /* props */ RouterProps => CallbackTo[Node] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Tab = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (onIndexChange != null) __obj.updateDynamic("onIndexChange")(js.Any.fromFunction1((t0: /* index */ scala.Double) => onIndexChange(t0).runNow()))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouter.mod.RouterProps) => render(t0).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

