package typingsJapgolly.next

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.routerMod.RouteInfo
import typingsJapgolly.next.routerMod.Subscription
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonApp extends js.Object {
  var App: ComponentType[js.Object]
  var Component: ComponentType[js.Object]
  var err: js.UndefOr[js.Error] = js.undefined
  var initialProps: js.Any
  var pageLoader: js.Any
  var subscription: Subscription
  def wrapApp(App: ComponentType[js.Object]): js.Any
}

object AnonApp {
  @scala.inline
  def apply(
    App: ComponentType[js.Object],
    Component: ComponentType[js.Object],
    initialProps: js.Any,
    pageLoader: js.Any,
    subscription: (/* data */ RouteInfo, /* App */ js.UndefOr[ComponentType[js.Object]]) => Callback,
    wrapApp: ComponentType[js.Object] => CallbackTo[js.Any],
    err: js.Error = null
  ): AnonApp = {
    val __obj = js.Dynamic.literal(App = App.asInstanceOf[js.Any], Component = Component.asInstanceOf[js.Any], initialProps = initialProps.asInstanceOf[js.Any], pageLoader = pageLoader.asInstanceOf[js.Any])
    __obj.updateDynamic("subscription")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.next.routerMod.RouteInfo, t1: /* App */ js.UndefOr[typingsJapgolly.react.mod.ComponentType[js.Object]]) => subscription(t0, t1).runNow()))
    __obj.updateDynamic("wrapApp")(js.Any.fromFunction1((t0: typingsJapgolly.react.mod.ComponentType[js.Object]) => wrapApp(t0).runNow()))
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApp]
  }
}

