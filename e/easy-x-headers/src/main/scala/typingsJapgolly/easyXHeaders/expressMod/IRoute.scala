package typingsJapgolly.easyXHeaders.expressMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRoute extends js.Object {
  var path: String
  var stack: js.Any
  def all(handler: RequestHandler*): IRoute
  def delete(handler: RequestHandler*): IRoute
  def get(handler: RequestHandler*): IRoute
  def options(handler: RequestHandler*): IRoute
  def patch(handler: RequestHandler*): IRoute
  def post(handler: RequestHandler*): IRoute
  def put(handler: RequestHandler*): IRoute
}

object IRoute {
  @scala.inline
  def apply(
    all: /* repeated */ RequestHandler => CallbackTo[IRoute],
    delete: /* repeated */ RequestHandler => CallbackTo[IRoute],
    get: /* repeated */ RequestHandler => CallbackTo[IRoute],
    options: /* repeated */ RequestHandler => CallbackTo[IRoute],
    patch: /* repeated */ RequestHandler => CallbackTo[IRoute],
    path: String,
    post: /* repeated */ RequestHandler => CallbackTo[IRoute],
    put: /* repeated */ RequestHandler => CallbackTo[IRoute],
    stack: js.Any
  ): IRoute = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.updateDynamic("all")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.easyXHeaders.expressMod.RequestHandler) => all(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.easyXHeaders.expressMod.RequestHandler) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.easyXHeaders.expressMod.RequestHandler) => get(t0).runNow()))
    __obj.updateDynamic("options")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.easyXHeaders.expressMod.RequestHandler) => options(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.easyXHeaders.expressMod.RequestHandler) => patch(t0).runNow()))
    __obj.updateDynamic("post")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.easyXHeaders.expressMod.RequestHandler) => post(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction1((t0: /* repeated */ typingsJapgolly.easyXHeaders.expressMod.RequestHandler) => put(t0).runNow()))
    __obj.asInstanceOf[IRoute]
  }
}

