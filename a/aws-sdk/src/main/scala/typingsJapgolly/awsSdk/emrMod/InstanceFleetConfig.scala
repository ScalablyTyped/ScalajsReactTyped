package typingsJapgolly.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetConfig extends js.Object {
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER,CORE,and TASK.
    */
  var InstanceFleetType: typingsJapgolly.awsSdk.emrMod.InstanceFleetType = js.native
  /**
    * The instance type configurations that define the EC2 instances in the instance fleet.
    */
  var InstanceTypeConfigs: js.UndefOr[InstanceTypeConfigList] = js.native
  /**
    * The launch specification for the instance fleet.
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.native
  /**
    * The friendly name of the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only Spot instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.native
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units.  If not specified or set to 0, only On-Demand instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.native
}

object InstanceFleetConfig {
  @scala.inline
  def apply(
    InstanceFleetType: InstanceFleetType,
    InstanceTypeConfigs: InstanceTypeConfigList = null,
    LaunchSpecifications: InstanceFleetProvisioningSpecifications = null,
    Name: XmlStringMaxLen256 = null,
    TargetOnDemandCapacity: Int | Double = null,
    TargetSpotCapacity: Int | Double = null
  ): InstanceFleetConfig = {
    val __obj = js.Dynamic.literal(InstanceFleetType = InstanceFleetType.asInstanceOf[js.Any])
    if (InstanceTypeConfigs != null) __obj.updateDynamic("InstanceTypeConfigs")(InstanceTypeConfigs.asInstanceOf[js.Any])
    if (LaunchSpecifications != null) __obj.updateDynamic("LaunchSpecifications")(LaunchSpecifications.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (TargetOnDemandCapacity != null) __obj.updateDynamic("TargetOnDemandCapacity")(TargetOnDemandCapacity.asInstanceOf[js.Any])
    if (TargetSpotCapacity != null) __obj.updateDynamic("TargetSpotCapacity")(TargetSpotCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetConfig]
  }
}

