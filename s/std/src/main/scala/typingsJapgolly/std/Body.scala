package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  val body: org.scalajs.dom.experimental.ReadableStream[scala.scalajs.js.typedarray.Uint8Array] | Null
  val bodyUsed: scala.Boolean
  def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer]
  def blob(): js.Promise[org.scalajs.dom.raw.Blob]
  def formData(): js.Promise[org.scalajs.dom.raw.FormData]
  def json(): js.Promise[_]
  def text(): js.Promise[java.lang.String]
}

object Body {
  @scala.inline
  def apply(
    arrayBuffer: CallbackTo[js.Promise[scala.scalajs.js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[org.scalajs.dom.raw.Blob]],
    bodyUsed: scala.Boolean,
    formData: CallbackTo[js.Promise[org.scalajs.dom.raw.FormData]],
    json: CallbackTo[js.Promise[_]],
    text: CallbackTo[js.Promise[java.lang.String]],
    body: org.scalajs.dom.experimental.ReadableStream[scala.scalajs.js.typedarray.Uint8Array] = null
  ): Body = {
    val __obj = js.Dynamic.literal(bodyUsed = bodyUsed.asInstanceOf[js.Any])
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("blob")(blob.toJsFn)
    __obj.updateDynamic("formData")(formData.toJsFn)
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

