package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnshareDirectoryRequest extends js.Object {
  /**
    * The identifier of the AWS Managed Microsoft AD directory that you want to stop sharing.
    */
  var DirectoryId: typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * Identifier for the directory consumer account with whom the directory has to be unshared.
    */
  var UnshareTarget: typingsJapgolly.awsSdk.directoryserviceMod.UnshareTarget = js.native
}

object UnshareDirectoryRequest {
  @scala.inline
  def apply(DirectoryId: DirectoryId, UnshareTarget: UnshareTarget): UnshareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], UnshareTarget = UnshareTarget.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnshareDirectoryRequest]
  }
}

