package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetCapacitySpecificationRequest extends StObject {
  
  /**
    * The default TotalTargetCapacity, which is either Spot or On-Demand.
    */
  var DefaultTargetCapacityType: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.DefaultTargetCapacityType] = js.undefined
  
  /**
    * The number of On-Demand units to request.
    */
  var OnDemandTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of Spot units to request.
    */
  var SpotTargetCapacity: js.UndefOr[Integer] = js.undefined
  
  /**
    * The unit for the target capacity. Default: units (translates to number of instances)
    */
  var TargetCapacityUnitType: js.UndefOr[typingsJapgolly.awsSdk.clientsEc2Mod.TargetCapacityUnitType] = js.undefined
  
  /**
    * The number of units to request, filled using DefaultTargetCapacityType.
    */
  var TotalTargetCapacity: Integer
}
object TargetCapacitySpecificationRequest {
  
  inline def apply(TotalTargetCapacity: Integer): TargetCapacitySpecificationRequest = {
    val __obj = js.Dynamic.literal(TotalTargetCapacity = TotalTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetCapacitySpecificationRequest]
  }
  
  extension [Self <: TargetCapacitySpecificationRequest](x: Self) {
    
    inline def setDefaultTargetCapacityType(value: DefaultTargetCapacityType): Self = StObject.set(x, "DefaultTargetCapacityType", value.asInstanceOf[js.Any])
    
    inline def setDefaultTargetCapacityTypeUndefined: Self = StObject.set(x, "DefaultTargetCapacityType", js.undefined)
    
    inline def setOnDemandTargetCapacity(value: Integer): Self = StObject.set(x, "OnDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "OnDemandTargetCapacity", js.undefined)
    
    inline def setSpotTargetCapacity(value: Integer): Self = StObject.set(x, "SpotTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setSpotTargetCapacityUndefined: Self = StObject.set(x, "SpotTargetCapacity", js.undefined)
    
    inline def setTargetCapacityUnitType(value: TargetCapacityUnitType): Self = StObject.set(x, "TargetCapacityUnitType", value.asInstanceOf[js.Any])
    
    inline def setTargetCapacityUnitTypeUndefined: Self = StObject.set(x, "TargetCapacityUnitType", js.undefined)
    
    inline def setTotalTargetCapacity(value: Integer): Self = StObject.set(x, "TotalTargetCapacity", value.asInstanceOf[js.Any])
  }
}
