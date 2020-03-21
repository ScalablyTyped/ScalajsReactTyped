package typingsJapgolly.centra.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: Buffer
  var coreRes: IncomingMessage
  var headers: IncomingHttpHeaders
  var statusCode: js.UndefOr[Double] = js.undefined
  def json(): js.Promise[_]
  def text(): js.Promise[String]
}

object Response {
  @scala.inline
  def apply(
    body: Buffer,
    coreRes: IncomingMessage,
    headers: IncomingHttpHeaders,
    json: CallbackTo[js.Promise[js.Any]],
    text: CallbackTo[js.Promise[String]],
    statusCode: Int | Double = null
  ): Response = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], coreRes = coreRes.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

