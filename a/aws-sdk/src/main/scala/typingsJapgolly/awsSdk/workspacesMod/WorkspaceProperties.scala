package typingsJapgolly.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceProperties extends js.Object {
  /**
    * The compute type. For more information, see Amazon WorkSpaces Bundles.
    */
  var ComputeTypeName: js.UndefOr[Compute] = js.native
  /**
    * The size of the root volume.
    */
  var RootVolumeSizeGib: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.RootVolumeSizeGib] = js.native
  /**
    * The running mode. For more information, see Manage the WorkSpace Running Mode.
    */
  var RunningMode: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.RunningMode] = js.native
  /**
    * The time after a user logs off when WorkSpaces are automatically stopped. Configured in 60-minute intervals.
    */
  var RunningModeAutoStopTimeoutInMinutes: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.RunningModeAutoStopTimeoutInMinutes] = js.native
  /**
    * The size of the user storage.
    */
  var UserVolumeSizeGib: js.UndefOr[typingsJapgolly.awsSdk.workspacesMod.UserVolumeSizeGib] = js.native
}

object WorkspaceProperties {
  @scala.inline
  def apply(
    ComputeTypeName: Compute = null,
    RootVolumeSizeGib: Int | Double = null,
    RunningMode: RunningMode = null,
    RunningModeAutoStopTimeoutInMinutes: Int | Double = null,
    UserVolumeSizeGib: Int | Double = null
  ): WorkspaceProperties = {
    val __obj = js.Dynamic.literal()
    if (ComputeTypeName != null) __obj.updateDynamic("ComputeTypeName")(ComputeTypeName.asInstanceOf[js.Any])
    if (RootVolumeSizeGib != null) __obj.updateDynamic("RootVolumeSizeGib")(RootVolumeSizeGib.asInstanceOf[js.Any])
    if (RunningMode != null) __obj.updateDynamic("RunningMode")(RunningMode.asInstanceOf[js.Any])
    if (RunningModeAutoStopTimeoutInMinutes != null) __obj.updateDynamic("RunningModeAutoStopTimeoutInMinutes")(RunningModeAutoStopTimeoutInMinutes.asInstanceOf[js.Any])
    if (UserVolumeSizeGib != null) __obj.updateDynamic("UserVolumeSizeGib")(UserVolumeSizeGib.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceProperties]
  }
}

