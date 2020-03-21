package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashVideoItem extends js.Object {
  var fileLastModifiedDate: String
  var sourceFileExists: Boolean
  var sourceFileIsCurrent: Boolean
  var sourceFilePath: String
  var videoType: String
  def exportToFLV(fileURI: String): Boolean
}

object FlashVideoItem {
  @scala.inline
  def apply(
    exportToFLV: String => CallbackTo[Boolean],
    fileLastModifiedDate: String,
    sourceFileExists: Boolean,
    sourceFileIsCurrent: Boolean,
    sourceFilePath: String,
    videoType: String
  ): FlashVideoItem = {
    val __obj = js.Dynamic.literal(fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any], sourceFileIsCurrent = sourceFileIsCurrent.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], videoType = videoType.asInstanceOf[js.Any])
    __obj.updateDynamic("exportToFLV")(js.Any.fromFunction1((t0: java.lang.String) => exportToFLV(t0).runNow()))
    __obj.asInstanceOf[FlashVideoItem]
  }
}

