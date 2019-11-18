package typingsJapgolly.electron.Electron

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UploadData extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/upload-data
  /**
    * UUID of blob data. Use method to retrieve the data.
    */
  var blobUUID: String
  /**
    * Content being sent.
    */
  var bytes: Buffer
  /**
    * Path of file being uploaded.
    */
  var file: String
}

object UploadData {
  @scala.inline
  def apply(blobUUID: String, bytes: Buffer, file: String): UploadData = {
    val __obj = js.Dynamic.literal(blobUUID = blobUUID.asInstanceOf[js.Any], bytes = bytes.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UploadData]
  }
}

