package typingsJapgolly.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceFileUpload extends js.Object {
  // name of the file
  var file_name: String
  // size of the file in bytes
  var file_size: Double
  // time of file upload
  var file_upload_time: String
}

object SourceFileUpload {
  @scala.inline
  def apply(file_name: String, file_size: Double, file_upload_time: String): SourceFileUpload = {
    val __obj = js.Dynamic.literal(file_name = file_name.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any], file_upload_time = file_upload_time.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SourceFileUpload]
  }
}

