package typingsJapgolly.reactRouterConfig.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteConfig
  extends /* propName */ StringDictionary[js.Any] {
  var component: js.UndefOr[ComponentType[js.Object | RouteConfigComponentProps[_]]] = js.undefined
  var exact: js.UndefOr[Boolean] = js.undefined
  var key: js.UndefOr[Key] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  var path: js.UndefOr[String | js.Array[String]] = js.undefined
  var render: js.UndefOr[js.Function1[/* props */ RouteConfigComponentProps[_], Node]] = js.undefined
  var routes: js.UndefOr[js.Array[RouteConfig]] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object RouteConfig {
  @scala.inline
  def apply(
    StringDictionary: /* propName */ StringDictionary[js.Any] = null,
    component: ComponentType[js.Object | RouteConfigComponentProps[_]] = null,
    exact: js.UndefOr[Boolean] = js.undefined,
    key: Key = null,
    location: Location[LocationState] = null,
    path: String | js.Array[String] = null,
    render: /* props */ RouteConfigComponentProps[js.Any] => CallbackTo[Node] = null,
    routes: js.Array[RouteConfig] = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): RouteConfig = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(exact)) __obj.updateDynamic("exact")(exact.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactRouterConfig.mod.RouteConfigComponentProps[js.Any]) => render(t0).runNow()))
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfig]
  }
}

