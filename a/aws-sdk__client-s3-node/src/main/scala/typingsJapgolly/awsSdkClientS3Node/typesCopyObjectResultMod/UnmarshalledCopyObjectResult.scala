package typingsJapgolly.awsSdkClientS3Node.typesCopyObjectResultMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledCopyObjectResult extends CopyObjectResult {
  /**
    * _LastModified shape
    */
  @JSName("LastModified")
  var LastModified_UnmarshalledCopyObjectResult: js.UndefOr[js.Date] = js.undefined
}

object UnmarshalledCopyObjectResult {
  @scala.inline
  def apply(ETag: String = null, LastModified: js.Date = null): UnmarshalledCopyObjectResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag.asInstanceOf[js.Any])
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledCopyObjectResult]
  }
}

