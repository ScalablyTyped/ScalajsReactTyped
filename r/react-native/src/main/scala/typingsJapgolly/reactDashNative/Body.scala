package typingsJapgolly.reactDashNative

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  val bodyUsed: Boolean
  def arrayBuffer(): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer]
  def blob(): js.Promise[Blob]
  def formData(): js.Promise[FormData]
  def json(): js.Promise[_]
  def text(): js.Promise[String]
}

object Body {
  @scala.inline
  def apply(
    arrayBuffer: CallbackTo[js.Promise[scala.scalajs.js.typedarray.ArrayBuffer]],
    blob: CallbackTo[js.Promise[Blob]],
    bodyUsed: Boolean,
    formData: CallbackTo[js.Promise[FormData]],
    json: CallbackTo[js.Promise[js.Any]],
    text: CallbackTo[js.Promise[String]]
  ): Body = {
    val __obj = js.Dynamic.literal(bodyUsed = bodyUsed.asInstanceOf[js.Any])
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("blob")(blob.toJsFn)
    __obj.updateDynamic("formData")(formData.toJsFn)
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.asInstanceOf[Body]
  }
}

