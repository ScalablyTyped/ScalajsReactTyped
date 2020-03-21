package typingsJapgolly.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceConnectionStatus extends js.Object {
  /**
    * The connection state of the WorkSpace. The connection state is unknown if the WorkSpace is stopped.
    */
  var ConnectionState: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.ConnectionState] = js.native
  /**
    * The timestamp of the connection status check.
    */
  var ConnectionStateCheckTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The timestamp of the last known user connection.
    */
  var LastKnownUserConnectionTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The identifier of the WorkSpace.
    */
  var WorkspaceId: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.WorkspaceId] = js.native
}

object WorkspaceConnectionStatus {
  @scala.inline
  def apply(
    ConnectionState: ConnectionState = null,
    ConnectionStateCheckTimestamp: js.Date = null,
    LastKnownUserConnectionTimestamp: js.Date = null,
    WorkspaceId: WorkspaceId = null
  ): WorkspaceConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (ConnectionState != null) __obj.updateDynamic("ConnectionState")(ConnectionState.asInstanceOf[js.Any])
    if (ConnectionStateCheckTimestamp != null) __obj.updateDynamic("ConnectionStateCheckTimestamp")(ConnectionStateCheckTimestamp.asInstanceOf[js.Any])
    if (LastKnownUserConnectionTimestamp != null) __obj.updateDynamic("LastKnownUserConnectionTimestamp")(LastKnownUserConnectionTimestamp.asInstanceOf[js.Any])
    if (WorkspaceId != null) __obj.updateDynamic("WorkspaceId")(WorkspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceConnectionStatus]
  }
}

