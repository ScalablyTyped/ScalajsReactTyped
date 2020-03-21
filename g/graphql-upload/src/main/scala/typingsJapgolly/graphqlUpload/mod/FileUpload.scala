package typingsJapgolly.graphqlUpload.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fsCapacitor.mod.ReadStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUpload extends js.Object {
  var encoding: String
  var filename: String
  var mimetype: String
  def createReadStream(): ReadStream
}

object FileUpload {
  @scala.inline
  def apply(createReadStream: CallbackTo[ReadStream], encoding: String, filename: String, mimetype: String): FileUpload = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any])
    __obj.updateDynamic("createReadStream")(createReadStream.toJsFn)
    __obj.asInstanceOf[FileUpload]
  }
}

