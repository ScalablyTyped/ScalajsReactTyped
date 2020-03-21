package typingsJapgolly.bent.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.experimental.ReadableStream
import org.scalajs.dom.experimental.ResponseType
import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.FormData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Response & {  statusCode  :number} */
trait FetchResponse extends BentResponse {
  val body: ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | Null
  val bodyUsed: Boolean
  val headers: org.scalajs.dom.experimental.Headers
  val ok: Boolean
  val redirected: Boolean
  val status: Double
  var statusCode: Double
  val statusText: String
  val trailer: js.Promise[org.scalajs.dom.experimental.Headers]
  val `type`: ResponseType
  val url: String
  def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer]
  def blob(): js.Promise[Blob]
  def formData(): js.Promise[FormData]
  def json(): js.Promise[_]
  def text(): js.Promise[String]
}

object FetchResponse {
  @scala.inline
  def apply(
    arrayBuffer: CallbackTo[js.Promise[scala.scalajs.js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[Blob]],
    bodyUsed: Boolean,
    formData: CallbackTo[js.Promise[FormData]],
    headers: org.scalajs.dom.experimental.Headers,
    json: CallbackTo[js.Promise[js.Any]],
    ok: Boolean,
    redirected: Boolean,
    status: Double,
    statusCode: Double,
    statusText: String,
    text: CallbackTo[js.Promise[String]],
    trailer: js.Promise[org.scalajs.dom.experimental.Headers],
    `type`: ResponseType,
    url: String,
    body: ReadableStream[scala.scalajs.js.typedarray.Uint8Array] = null
  ): FetchResponse = {
    val __obj = js.Dynamic.literal(bodyUsed = bodyUsed.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], redirected = redirected.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], trailer = trailer.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("blob")(blob.toJsFn)
    __obj.updateDynamic("formData")(formData.toJsFn)
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResponse]
  }
}

