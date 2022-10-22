package typingsJapgolly.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleet extends StObject {
  
  /**
    * The unique identifier of the instance fleet.
    */
  var Id: js.UndefOr[InstanceFleetId] = js.undefined
  
  /**
    * The node type that the instance fleet hosts. Valid values are MASTER, CORE, or TASK. 
    */
  var InstanceFleetType: js.UndefOr[typingsJapgolly.awsSdk.clientsEmrMod.InstanceFleetType] = js.undefined
  
  /**
    * An array of specifications for the instance types that comprise an instance fleet.
    */
  var InstanceTypeSpecifications: js.UndefOr[InstanceTypeSpecificationList] = js.undefined
  
  /**
    * Describes the launch specification for an instance fleet. 
    */
  var LaunchSpecifications: js.UndefOr[InstanceFleetProvisioningSpecifications] = js.undefined
  
  /**
    * A friendly name for the instance fleet.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  
  /**
    * The number of On-Demand units that have been provisioned for the instance fleet to fulfill TargetOnDemandCapacity. This provisioned capacity might be less than or greater than TargetOnDemandCapacity.
    */
  var ProvisionedOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The number of Spot units that have been provisioned for this instance fleet to fulfill TargetSpotCapacity. This provisioned capacity might be less than or greater than TargetSpotCapacity.
    */
  var ProvisionedSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The current status of the instance fleet. 
    */
  var Status: js.UndefOr[InstanceFleetStatus] = js.undefined
  
  /**
    * The target capacity of On-Demand units for the instance fleet, which determines how many On-Demand Instances to provision. When the instance fleet launches, Amazon EMR tries to provision On-Demand Instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When an On-Demand Instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedOnDemandCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only Spot Instances are provisioned for the instance fleet using TargetSpotCapacity. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetOnDemandCapacity: js.UndefOr[WholeNumber] = js.undefined
  
  /**
    * The target capacity of Spot units for the instance fleet, which determines how many Spot Instances to provision. When the instance fleet launches, Amazon EMR tries to provision Spot Instances as specified by InstanceTypeConfig. Each instance configuration has a specified WeightedCapacity. When a Spot instance is provisioned, the WeightedCapacity units count toward the target capacity. Amazon EMR provisions instances until the target capacity is totally fulfilled, even if this results in an overage. For example, if there are 2 units remaining to fulfill capacity, and Amazon EMR can only provision an instance with a WeightedCapacity of 5 units, the instance is provisioned, and the target capacity is exceeded by 3 units. You can use InstanceFleet$ProvisionedSpotCapacity to determine the Spot capacity units that have been provisioned for the instance fleet.  If not specified or set to 0, only On-Demand Instances are provisioned for the instance fleet. At least one of TargetSpotCapacity and TargetOnDemandCapacity should be greater than 0. For a master instance fleet, only one of TargetSpotCapacity and TargetOnDemandCapacity can be specified, and its value must be 1. 
    */
  var TargetSpotCapacity: js.UndefOr[WholeNumber] = js.undefined
}
object InstanceFleet {
  
  inline def apply(): InstanceFleet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleet]
  }
  
  extension [Self <: InstanceFleet](x: Self) {
    
    inline def setId(value: InstanceFleetId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setInstanceFleetType(value: InstanceFleetType): Self = StObject.set(x, "InstanceFleetType", value.asInstanceOf[js.Any])
    
    inline def setInstanceFleetTypeUndefined: Self = StObject.set(x, "InstanceFleetType", js.undefined)
    
    inline def setInstanceTypeSpecifications(value: InstanceTypeSpecificationList): Self = StObject.set(x, "InstanceTypeSpecifications", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeSpecificationsUndefined: Self = StObject.set(x, "InstanceTypeSpecifications", js.undefined)
    
    inline def setInstanceTypeSpecificationsVarargs(value: InstanceTypeSpecification*): Self = StObject.set(x, "InstanceTypeSpecifications", js.Array(value*))
    
    inline def setLaunchSpecifications(value: InstanceFleetProvisioningSpecifications): Self = StObject.set(x, "LaunchSpecifications", value.asInstanceOf[js.Any])
    
    inline def setLaunchSpecificationsUndefined: Self = StObject.set(x, "LaunchSpecifications", js.undefined)
    
    inline def setName(value: XmlStringMaxLen256): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProvisionedOnDemandCapacity(value: WholeNumber): Self = StObject.set(x, "ProvisionedOnDemandCapacity", value.asInstanceOf[js.Any])
    
    inline def setProvisionedOnDemandCapacityUndefined: Self = StObject.set(x, "ProvisionedOnDemandCapacity", js.undefined)
    
    inline def setProvisionedSpotCapacity(value: WholeNumber): Self = StObject.set(x, "ProvisionedSpotCapacity", value.asInstanceOf[js.Any])
    
    inline def setProvisionedSpotCapacityUndefined: Self = StObject.set(x, "ProvisionedSpotCapacity", js.undefined)
    
    inline def setStatus(value: InstanceFleetStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTargetOnDemandCapacity(value: WholeNumber): Self = StObject.set(x, "TargetOnDemandCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetOnDemandCapacityUndefined: Self = StObject.set(x, "TargetOnDemandCapacity", js.undefined)
    
    inline def setTargetSpotCapacity(value: WholeNumber): Self = StObject.set(x, "TargetSpotCapacity", value.asInstanceOf[js.Any])
    
    inline def setTargetSpotCapacityUndefined: Self = StObject.set(x, "TargetSpotCapacity", js.undefined)
  }
}
