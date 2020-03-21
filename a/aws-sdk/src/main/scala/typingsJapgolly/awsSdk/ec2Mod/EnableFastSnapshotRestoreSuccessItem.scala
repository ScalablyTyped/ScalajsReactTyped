package typingsJapgolly.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableFastSnapshotRestoreSuccessItem extends js.Object {
  /**
    * The Availability Zone.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The time at which fast snapshot restores entered the disabled state.
    */
  var DisabledTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which fast snapshot restores entered the disabling state.
    */
  var DisablingTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which fast snapshot restores entered the enabled state.
    */
  var EnabledTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which fast snapshot restores entered the enabling state.
    */
  var EnablingTime: js.UndefOr[js.Date] = js.native
  /**
    * The time at which fast snapshot restores entered the optimizing state.
    */
  var OptimizingTime: js.UndefOr[js.Date] = js.native
  /**
    * The alias of the snapshot owner.
    */
  var OwnerAlias: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  /**
    * The state of fast snapshot restores.
    */
  var State: js.UndefOr[FastSnapshotRestoreStateCode] = js.native
  /**
    * The reason for the state transition. The possible values are as follows:    Client.UserInitiated - The state successfully transitioned to enabling or disabling.    Client.UserInitiated - Lifecycle state transition - The state successfully transitioned to optimizing, enabled, or disabled.  
    */
  var StateTransitionReason: js.UndefOr[String] = js.native
}

object EnableFastSnapshotRestoreSuccessItem {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    DisabledTime: js.Date = null,
    DisablingTime: js.Date = null,
    EnabledTime: js.Date = null,
    EnablingTime: js.Date = null,
    OptimizingTime: js.Date = null,
    OwnerAlias: String = null,
    OwnerId: String = null,
    SnapshotId: String = null,
    State: FastSnapshotRestoreStateCode = null,
    StateTransitionReason: String = null
  ): EnableFastSnapshotRestoreSuccessItem = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (DisabledTime != null) __obj.updateDynamic("DisabledTime")(DisabledTime.asInstanceOf[js.Any])
    if (DisablingTime != null) __obj.updateDynamic("DisablingTime")(DisablingTime.asInstanceOf[js.Any])
    if (EnabledTime != null) __obj.updateDynamic("EnabledTime")(EnabledTime.asInstanceOf[js.Any])
    if (EnablingTime != null) __obj.updateDynamic("EnablingTime")(EnablingTime.asInstanceOf[js.Any])
    if (OptimizingTime != null) __obj.updateDynamic("OptimizingTime")(OptimizingTime.asInstanceOf[js.Any])
    if (OwnerAlias != null) __obj.updateDynamic("OwnerAlias")(OwnerAlias.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateTransitionReason != null) __obj.updateDynamic("StateTransitionReason")(StateTransitionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableFastSnapshotRestoreSuccessItem]
  }
}

