package typingsJapgolly.pathjs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPath extends js.Object {
  var core: IPathCore
  var history: IPathHistory
  var routes: IPathRoutes
  def dispatch(passed_route: String): Unit
  def listen(): Unit
  def map(path: String): IPathRoute
  def `match`(path: String, parameterize: Boolean): IPathRoute | Null
  def rescue(fn: js.Function): Unit
  def root(path: String): Unit
}

object IPath {
  @scala.inline
  def apply(
    core: IPathCore,
    dispatch: String => Callback,
    history: IPathHistory,
    listen: Callback,
    map: String => CallbackTo[IPathRoute],
    `match`: (String, Boolean) => CallbackTo[IPathRoute | Null],
    rescue: js.Function => Callback,
    root: String => Callback,
    routes: IPathRoutes
  ): IPath = {
    val __obj = js.Dynamic.literal(core = core.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: java.lang.String) => dispatch(t0).runNow()))
    __obj.updateDynamic("listen")(listen.toJsFn)
    __obj.updateDynamic("map")(js.Any.fromFunction1((t0: java.lang.String) => map(t0).runNow()))
    __obj.updateDynamic("match")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => `match`(t0, t1).runNow()))
    __obj.updateDynamic("rescue")(js.Any.fromFunction1((t0: js.Function) => rescue(t0).runNow()))
    __obj.updateDynamic("root")(js.Any.fromFunction1((t0: java.lang.String) => root(t0).runNow()))
    __obj.asInstanceOf[IPath]
  }
}

