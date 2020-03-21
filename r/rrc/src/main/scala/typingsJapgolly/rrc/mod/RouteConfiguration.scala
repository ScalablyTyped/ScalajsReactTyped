package typingsJapgolly.rrc.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactRouter.mod.RouteChildrenProps
import typingsJapgolly.reactRouter.mod.RouteComponentProps
import typingsJapgolly.reactRouter.mod.StaticContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-router-dom.react-router-dom.RouteProps & {  inject ? :{[key: string] : any}} */
trait RouteConfiguration extends js.Object {
  var children: js.UndefOr[(js.Function1[/* props */ RouteChildrenProps[_, LocationState], Node]) | Node] = js.undefined
  var component: js.UndefOr[ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var inject: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  var path: js.UndefOr[String | js.Array[String]] = js.undefined
  var render: js.UndefOr[
    js.Function1[/* props */ RouteComponentProps[_, StaticContext, LocationState], Node]
  ] = js.undefined
  var sensitive: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouteConfiguration {
  @scala.inline
  def apply(
    children: (js.Function1[/* props */ RouteChildrenProps[_, LocationState], Node]) | Node = null,
    component: ComponentType[_ | (RouteComponentProps[_, StaticContext, LocationState])] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    inject: StringDictionary[js.Any] = null,
    location: Location[LocationState] = null,
    path: String | js.Array[String] = null,
    render: /* props */ RouteComponentProps[js.Any, StaticContext, LocationState] => CallbackTo[Node] = null,
    sensitive: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouteConfiguration = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (inject != null) __obj.updateDynamic("inject")(inject.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouter.mod.RouteComponentProps[
  js.Any, 
  typingsJapgolly.reactRouter.mod.StaticContext, 
  typingsJapgolly.history.mod.LocationState]) => render(t0).runNow()))
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfiguration]
  }
}

