package typingsJapgolly.nextServer.serverRouterMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nextServer.nextServerBooleans.`false`
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route_ extends js.Object {
  var `match`: RouteMatch
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): Unit
}

object Route_ {
  @scala.inline
  def apply(
    fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => Callback,
    `match`: /* pathname */ js.UndefOr[String] => CallbackTo[`false` | Params]
  ): Route_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fn")(js.Any.fromFunction4((t0: typingsJapgolly.node.httpMod.IncomingMessage, t1: typingsJapgolly.node.httpMod.ServerResponse, t2: typingsJapgolly.nextServer.serverRouterMod.Params, t3: typingsJapgolly.node.urlMod.UrlWithParsedQuery) => fn(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: /* pathname */ js.UndefOr[java.lang.String]) => `match`(t0).runNow()))
    __obj.asInstanceOf[Route_]
  }
}

