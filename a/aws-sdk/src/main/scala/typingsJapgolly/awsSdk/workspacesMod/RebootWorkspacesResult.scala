package typingsJapgolly.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be rebooted.
    */
  var FailedRequests: js.UndefOr[FailedRebootWorkspaceRequests] = js.native
}

object RebootWorkspacesResult {
  @scala.inline
  def apply(FailedRequests: FailedRebootWorkspaceRequests = null): RebootWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    if (FailedRequests != null) __obj.updateDynamic("FailedRequests")(FailedRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootWorkspacesResult]
  }
}

