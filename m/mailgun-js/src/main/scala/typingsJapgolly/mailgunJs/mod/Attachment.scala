package typingsJapgolly.mailgunJs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.NodeJS.ReadWriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var contentType: js.UndefOr[String] = js.undefined
  var data: String | Buffer | ReadWriteStream
  var filename: js.UndefOr[String] = js.undefined
  var knownLength: js.UndefOr[Double] = js.undefined
  def getType(): String
}

object Attachment {
  @scala.inline
  def apply(
    data: String | Buffer | ReadWriteStream,
    getType: CallbackTo[String],
    contentType: String = null,
    filename: String = null,
    knownLength: Int | Double = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("getType")(getType.toJsFn)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (knownLength != null) __obj.updateDynamic("knownLength")(knownLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

