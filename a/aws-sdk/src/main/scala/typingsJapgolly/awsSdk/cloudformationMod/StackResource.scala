package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StackResource extends js.Object {
  /**
    * User defined description associated with the resource.
    */
  var Description: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.Description] = js.native
  /**
    * Information about whether the resource's actual configuration differs, or has drifted, from its expected configuration, as defined in the stack template and any values specified as template parameters. For more information, see Detecting Unregulated Configuration Changes to Stacks and Resources.
    */
  var DriftInformation: js.UndefOr[StackResourceDriftInformation] = js.native
  /**
    * The logical name of the resource specified in the template.
    */
  var LogicalResourceId: typingsJapgolly.awsSdk.cloudformationMod.LogicalResourceId = js.native
  /**
    * The name or unique identifier that corresponds to a physical instance ID of a resource supported by AWS CloudFormation.
    */
  var PhysicalResourceId: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.PhysicalResourceId] = js.native
  /**
    * Current status of the resource.
    */
  var ResourceStatus: typingsJapgolly.awsSdk.cloudformationMod.ResourceStatus = js.native
  /**
    * Success/failure message associated with the resource.
    */
  var ResourceStatusReason: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.ResourceStatusReason] = js.native
  /**
    * Type of resource. (For more information, go to  AWS Resource Types Reference in the AWS CloudFormation User Guide.)
    */
  var ResourceType: typingsJapgolly.awsSdk.cloudformationMod.ResourceType = js.native
  /**
    * Unique identifier of the stack.
    */
  var StackId: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackId] = js.native
  /**
    * The name associated with the stack.
    */
  var StackName: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.StackName] = js.native
  /**
    * Time the status was updated.
    */
  var Timestamp: js.Date = js.native
}

object StackResource {
  @scala.inline
  def apply(
    LogicalResourceId: LogicalResourceId,
    ResourceStatus: ResourceStatus,
    ResourceType: ResourceType,
    Timestamp: js.Date,
    Description: Description = null,
    DriftInformation: StackResourceDriftInformation = null,
    PhysicalResourceId: PhysicalResourceId = null,
    ResourceStatusReason: ResourceStatusReason = null,
    StackId: StackId = null,
    StackName: StackName = null
  ): StackResource = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], ResourceStatus = ResourceStatus.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], Timestamp = Timestamp.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DriftInformation != null) __obj.updateDynamic("DriftInformation")(DriftInformation.asInstanceOf[js.Any])
    if (PhysicalResourceId != null) __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId.asInstanceOf[js.Any])
    if (ResourceStatusReason != null) __obj.updateDynamic("ResourceStatusReason")(ResourceStatusReason.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (StackName != null) __obj.updateDynamic("StackName")(StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackResource]
  }
}

