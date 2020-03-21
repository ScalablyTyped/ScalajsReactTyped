package typingsJapgolly.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkspacesRequest extends js.Object {
  /**
    * The WorkSpaces to create. You can specify up to 25 WorkSpaces.
    */
  var Workspaces: WorkspaceRequestList = js.native
}

object CreateWorkspacesRequest {
  @scala.inline
  def apply(Workspaces: WorkspaceRequestList): CreateWorkspacesRequest = {
    val __obj = js.Dynamic.literal(Workspaces = Workspaces.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateWorkspacesRequest]
  }
}

