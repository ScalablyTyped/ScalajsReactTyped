package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackSetSummary extends js.Object {
  /**
    * [Service-managed permissions] Describes whether StackSets automatically deploys to AWS Organizations accounts that are added to a target organizational unit (OU).
    */
  var AutoDeployment: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.AutoDeployment] = js.native
  /**
    * A description of the stack set that you specify when the stack set is created or updated.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.Description] = js.native
  /**
    * Status of the stack set's actual configuration compared to its expected template and parameter configuration. A stack set is considered to have drifted if one or more of its stack instances have drifted from their expected template and parameter configuration.    DRIFTED: One or more of the stack instances belonging to the stack set stack differs from the expected template and parameter configuration. A stack instance is considered to have drifted if one or more of the resources in the associated stack have drifted.    NOT_CHECKED: AWS CloudFormation has not checked the stack set for drift.    IN_SYNC: All of the stack instances belonging to the stack set stack match from the expected template and parameter configuration.    UNKNOWN: This value is reserved for future use.  
    */
  var DriftStatus: js.UndefOr[StackDriftStatus] = js.native
  /**
    * Most recent time when CloudFormation performed a drift detection operation on the stack set. This value will be NULL for any stack set on which drift detection has not yet been performed.
    */
  var LastDriftCheckTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * Describes how the IAM roles required for stack set operations are created.   With self-managed permissions, you must create the administrator and execution roles required to deploy to target accounts. For more information, see Grant Self-Managed Stack Set Permissions.   With service-managed permissions, StackSets automatically creates the IAM roles required to deploy to accounts managed by AWS Organizations. For more information, see Grant Service-Managed Stack Set Permissions.  
    */
  var PermissionModel: js.UndefOr[PermissionModels] = js.native
  /**
    * The ID of the stack set.
    */
  var StackSetId: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackSetId] = js.native
  /**
    * The name of the stack set.
    */
  var StackSetName: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackSetName] = js.native
  /**
    * The status of the stack set.
    */
  var Status: js.UndefOr[StackSetStatus] = js.native
}

object StackSetSummary {
  @scala.inline
  def apply(
    AutoDeployment: AutoDeployment = null,
    Description: Description = null,
    DriftStatus: StackDriftStatus = null,
    LastDriftCheckTimestamp: js.Date = null,
    PermissionModel: PermissionModels = null,
    StackSetId: StackSetId = null,
    StackSetName: StackSetName = null,
    Status: StackSetStatus = null
  ): StackSetSummary = {
    val __obj = js.Dynamic.literal()
    if (AutoDeployment != null) __obj.updateDynamic("AutoDeployment")(AutoDeployment.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DriftStatus != null) __obj.updateDynamic("DriftStatus")(DriftStatus.asInstanceOf[js.Any])
    if (LastDriftCheckTimestamp != null) __obj.updateDynamic("LastDriftCheckTimestamp")(LastDriftCheckTimestamp.asInstanceOf[js.Any])
    if (PermissionModel != null) __obj.updateDynamic("PermissionModel")(PermissionModel.asInstanceOf[js.Any])
    if (StackSetId != null) __obj.updateDynamic("StackSetId")(StackSetId.asInstanceOf[js.Any])
    if (StackSetName != null) __obj.updateDynamic("StackSetName")(StackSetName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackSetSummary]
  }
}

