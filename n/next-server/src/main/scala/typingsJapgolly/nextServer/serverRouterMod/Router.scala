package typingsJapgolly.nextServer.serverRouterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Router extends js.Object {
  var routes: js.Array[Route_]
  def add(route: Route_): Unit
  def `match`(req: IncomingMessage, res: ServerResponse, parsedUrl: UrlWithParsedQuery): js.UndefOr[js.Function0[Unit]]
}

object Router {
  @scala.inline
  def apply(
    add: Route_ => Callback,
    `match`: (IncomingMessage, ServerResponse, UrlWithParsedQuery) => CallbackTo[js.UndefOr[js.Function0[Unit]]],
    routes: js.Array[Route_]
  ): Router = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.nextServer.serverRouterMod.Route_) => add(t0).runNow()))
    __obj.updateDynamic("match")(js.Any.fromFunction3((t0: typingsJapgolly.node.httpMod.IncomingMessage, t1: typingsJapgolly.node.httpMod.ServerResponse, t2: typingsJapgolly.node.urlMod.UrlWithParsedQuery) => `match`(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Router]
  }
}

