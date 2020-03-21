package typingsJapgolly.pinoStdSerializers.mod

import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedRequest extends js.Object {
  /**
    * Reference to the `headers` object from the request (as per req.headers in core HTTP).
    */
  var headers: Record[String, String]
  /**
    * Defaults to `undefined`, unless there is an `id` property already attached to the `request` object or
    * to the `request.info` object. Attach a synchronous function to the `request.id` that returns an
    * identifier to have the value filled.
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * HTTP method.
    */
  var method: String
  /**
    * Non-enumerable, i.e. will not be in the output, original request object. This is available for subsequent
    * serializers to use. In cases where the `request` input already has  a `raw` property this will
    * replace the original `request.raw` property.
    */
  var raw: IncomingMessage
  var remoteAddress: String
  var remotePort: Double
  /**
    * Request pathname (as per req.url in core HTTP).
    */
  var url: String
}

object SerializedRequest {
  @scala.inline
  def apply(
    headers: Record[String, String],
    method: String,
    raw: IncomingMessage,
    remoteAddress: String,
    remotePort: Double,
    url: String,
    id: String = null
  ): SerializedRequest = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedRequest]
  }
}

