package typingsJapgolly.firebaseMessaging

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushMessageData extends js.Object {
  def arrayBuffer(): scala.scalajs.js.typedarray.ArrayBuffer
  def blob(): Blob
  def json(): js.Any
  def text(): String
}

object PushMessageData {
  @scala.inline
  def apply(
    arrayBuffer: CallbackTo[scala.scalajs.js.typedarray.ArrayBuffer],
    blob: CallbackTo[Blob],
    json: CallbackTo[js.Any],
    text: CallbackTo[String]
  ): PushMessageData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arrayBuffer")(arrayBuffer.toJsFn)
    __obj.updateDynamic("blob")(blob.toJsFn)
    __obj.updateDynamic("json")(json.toJsFn)
    __obj.updateDynamic("text")(text.toJsFn)
    __obj.asInstanceOf[PushMessageData]
  }
}

