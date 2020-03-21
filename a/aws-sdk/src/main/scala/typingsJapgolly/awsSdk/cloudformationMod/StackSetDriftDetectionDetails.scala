package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetDriftDetectionDetails extends js.Object {
  /**
    * The status of the stack set drift detection operation.    COMPLETED: The drift detection operation completed without failing on any stack instances.    FAILED: The drift detection operation exceeded the specified failure tolerance.     PARTIAL_SUCCESS: The drift detection operation completed without exceeding the failure tolerance for the operation.    IN_PROGRESS: The drift detection operation is currently being performed.    STOPPED: The user has cancelled the drift detection operation.  
    */
  var DriftDetectionStatus: js.UndefOr[StackSetDriftDetectionStatus] = js.native
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.  
    */
  var DriftStatus: js.UndefOr[StackSetDriftStatus] = js.native
  /**
    * The number of stack instances that have drifted from the expected template and parameter configuration of the stack set. A stack instance is considered to have drifted if one or more of the resources in the associated stack do not match their expected configuration.
    */
  var DriftedStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.DriftedStackInstancesCount] = js.native
  /**
    * The number of stack instances for which the drift detection operation failed.
    */
  var FailedStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.FailedStackInstancesCount] = js.native
  /**
    * The number of stack instances that are currently being checked for drift.
    */
  var InProgressStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.InProgressStackInstancesCount] = js.native
  /**
    * The number of stack instances which match the expected template and parameter configuration of the stack set.
    */
  var InSyncStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.InSyncStackInstancesCount] = js.native
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The total number of stack instances belonging to this stack set.  The total number of stack instances is equal to the total of:   Stack instances that match the stack set configuration.    Stack instances that have drifted from the stack set configuration.    Stack instances where the drift detection operation has failed.   Stack instances currently being checked for drift.  
    */
  var TotalStackInstancesCount: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.TotalStackInstancesCount] = js.native
}

object StackSetDriftDetectionDetails {
  @scala.inline
  def apply(
    DriftDetectionStatus: StackSetDriftDetectionStatus = null,
    DriftStatus: StackSetDriftStatus = null,
    DriftedStackInstancesCount: Int | Double = null,
    FailedStackInstancesCount: Int | Double = null,
    InProgressStackInstancesCount: Int | Double = null,
    InSyncStackInstancesCount: Int | Double = null,
    LastDriftCheckTimestamp: js.Date = null,
    TotalStackInstancesCount: Int | Double = null
  ): StackSetDriftDetectionDetails = {
    val __obj = js.Dynamic.literal()
    if (DriftDetectionStatus != null) __obj.updateDynamic("DriftDetectionStatus")(DriftDetectionStatus.asInstanceOf[js.Any])
    if (DriftStatus != null) __obj.updateDynamic("DriftStatus")(DriftStatus.asInstanceOf[js.Any])
    if (DriftedStackInstancesCount != null) __obj.updateDynamic("DriftedStackInstancesCount")(DriftedStackInstancesCount.asInstanceOf[js.Any])
    if (FailedStackInstancesCount != null) __obj.updateDynamic("FailedStackInstancesCount")(FailedStackInstancesCount.asInstanceOf[js.Any])
    if (InProgressStackInstancesCount != null) __obj.updateDynamic("InProgressStackInstancesCount")(InProgressStackInstancesCount.asInstanceOf[js.Any])
    if (InSyncStackInstancesCount != null) __obj.updateDynamic("InSyncStackInstancesCount")(InSyncStackInstancesCount.asInstanceOf[js.Any])
    if (LastDriftCheckTimestamp != null) __obj.updateDynamic("LastDriftCheckTimestamp")(LastDriftCheckTimestamp.asInstanceOf[js.Any])
    if (TotalStackInstancesCount != null) __obj.updateDynamic("TotalStackInstancesCount")(TotalStackInstancesCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetDriftDetectionDetails]
  }
}

