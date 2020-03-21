package typingsJapgolly.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareDirectoryRequest extends js.Object {
  /**
    * Identifier of the AWS Managed Microsoft AD directory that you want to share with other AWS accounts.
    */
  var DirectoryId: typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId = js.native
  /**
    * The method used when sharing a directory to determine whether the directory should be shared within your AWS organization (ORGANIZATIONS) or with any AWS account by sending a directory sharing request (HANDSHAKE).
    */
  var ShareMethod: typingsJapgolly.awsSdk.directoryserviceMod.ShareMethod = js.native
  /**
    * A directory share request that is sent by the directory owner to the directory consumer. The request includes a typed message to help the directory consumer administrator determine whether to approve or reject the share invitation.
    */
  var ShareNotes: js.UndefOr[Notes] = js.native
  /**
    * Identifier for the directory consumer account with whom the directory is to be shared.
    */
  var ShareTarget: typingsJapgolly.awsSdk.directoryserviceMod.ShareTarget = js.native
}

object ShareDirectoryRequest {
  @scala.inline
  def apply(
    DirectoryId: DirectoryId,
    ShareMethod: ShareMethod,
    ShareTarget: ShareTarget,
    ShareNotes: Notes = null
  ): ShareDirectoryRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], ShareMethod = ShareMethod.asInstanceOf[js.Any], ShareTarget = ShareTarget.asInstanceOf[js.Any])
    if (ShareNotes != null) __obj.updateDynamic("ShareNotes")(ShareNotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDirectoryRequest]
  }
}

