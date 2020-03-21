package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociationExecution extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.AssociationId] = js.native
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.AssociationVersion] = js.native
  /**
    * The time the execution started.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.native
  /**
    * Detailed status information about the execution.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The execution ID for the association.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.native
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.native
  /**
    * An aggregate status of the resources in the execution based on the status type.
    */
  var ResourceCountByStatus: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.ResourceCountByStatus] = js.native
  /**
    * The status of the association execution.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object AssociationExecution {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationVersion: AssociationVersion = null,
    CreatedTime: js.Date = null,
    DetailedStatus: StatusName = null,
    ExecutionId: AssociationExecutionId = null,
    LastExecutionDate: js.Date = null,
    ResourceCountByStatus: ResourceCountByStatus = null,
    Status: StatusName = null
  ): AssociationExecution = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus.asInstanceOf[js.Any])
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId.asInstanceOf[js.Any])
    if (LastExecutionDate != null) __obj.updateDynamic("LastExecutionDate")(LastExecutionDate.asInstanceOf[js.Any])
    if (ResourceCountByStatus != null) __obj.updateDynamic("ResourceCountByStatus")(ResourceCountByStatus.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociationExecution]
  }
}

