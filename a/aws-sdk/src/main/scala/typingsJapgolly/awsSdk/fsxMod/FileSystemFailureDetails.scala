package typingsJapgolly.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemFailureDetails extends js.Object {
  /**
    * A message describing any failures that occurred during file system creation.
    */
  var Message: js.UndefOr[ErrorMessage] = js.native
}

object FileSystemFailureDetails {
  @scala.inline
  def apply(Message: ErrorMessage = null): FileSystemFailureDetails = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemFailureDetails]
  }
}

