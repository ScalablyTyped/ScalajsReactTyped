package typingsJapgolly.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenedFileIoRequestedEventOptions extends OpenedFileRequestedEventOptions {
  /** Buffer of bytes to be operated on the file. */
  var data: scala.scalajs.js.typedarray.ArrayBuffer
  /** Position in the file (in bytes) to start operating from. */
  var offset: Double
}

object OpenedFileIoRequestedEventOptions {
  @scala.inline
  def apply(
    data: scala.scalajs.js.typedarray.ArrayBuffer,
    fileSystemId: String,
    offset: Double,
    openRequestId: Double,
    requestId: Double
  ): OpenedFileIoRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenedFileIoRequestedEventOptions]
  }
}

