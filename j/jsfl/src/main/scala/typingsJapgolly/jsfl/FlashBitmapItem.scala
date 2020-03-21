package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashBitmapItem extends js.Object {
  var allowSmoothing: Boolean
  var compressionType: String
  var fileLastModifiedDate: String
  var originalCompressionType: String
  var sourceFileExists: Boolean
  var sourceFileIsCurrent: Boolean
  var sourceFilePath: String
  var useDeblocking: Boolean
  var useImportedJPEGQuality: Boolean
  def exportToFile(fileURI: String): Boolean
}

object FlashBitmapItem {
  @scala.inline
  def apply(
    allowSmoothing: Boolean,
    compressionType: String,
    exportToFile: String => CallbackTo[Boolean],
    fileLastModifiedDate: String,
    originalCompressionType: String,
    sourceFileExists: Boolean,
    sourceFileIsCurrent: Boolean,
    sourceFilePath: String,
    useDeblocking: Boolean,
    useImportedJPEGQuality: Boolean
  ): FlashBitmapItem = {
    val __obj = js.Dynamic.literal(allowSmoothing = allowSmoothing.asInstanceOf[js.Any], compressionType = compressionType.asInstanceOf[js.Any], fileLastModifiedDate = fileLastModifiedDate.asInstanceOf[js.Any], originalCompressionType = originalCompressionType.asInstanceOf[js.Any], sourceFileExists = sourceFileExists.asInstanceOf[js.Any], sourceFileIsCurrent = sourceFileIsCurrent.asInstanceOf[js.Any], sourceFilePath = sourceFilePath.asInstanceOf[js.Any], useDeblocking = useDeblocking.asInstanceOf[js.Any], useImportedJPEGQuality = useImportedJPEGQuality.asInstanceOf[js.Any])
    __obj.updateDynamic("exportToFile")(js.Any.fromFunction1((t0: java.lang.String) => exportToFile(t0).runNow()))
    __obj.asInstanceOf[FlashBitmapItem]
  }
}

