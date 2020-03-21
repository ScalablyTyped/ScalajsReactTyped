package typingsJapgolly.next.serverRouterMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.nextBooleans.`false`
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import typingsJapgolly.node.urlMod.UrlWithParsedQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route_ extends js.Object {
  var check: js.UndefOr[Boolean] = js.undefined
  var `match`: RouteMatch
  var name: String
  var statusCode: js.UndefOr[Double] = js.undefined
  var `type`: String
  def fn(req: IncomingMessage, res: ServerResponse, params: Params, parsedUrl: UrlWithParsedQuery): js.Promise[RouteResult] | RouteResult
}

object Route_ {
  @scala.inline
  def apply(
    fn: (IncomingMessage, ServerResponse, Params, UrlWithParsedQuery) => CallbackTo[js.Promise[RouteResult] | RouteResult],
    `match`: /* pathname */ js.UndefOr[String | Null] => CallbackTo[`false` | Params],
    name: String,
    `type`: String,
    check: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null
  ): Route_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("fn")(js.Any.fromFunction4((t0: typingsJapgolly.node.httpMod.IncomingMessage, t1: typingsJapgolly.node.httpMod.ServerResponse, t2: typingsJapgolly.next.serverRouterMod.Params, t3: typingsJapgolly.node.urlMod.UrlWithParsedQuery) => fn(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("match")(js.Any.fromFunction1((t0: /* pathname */ js.UndefOr[java.lang.String | scala.Null]) => `match`(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route_]
  }
}

