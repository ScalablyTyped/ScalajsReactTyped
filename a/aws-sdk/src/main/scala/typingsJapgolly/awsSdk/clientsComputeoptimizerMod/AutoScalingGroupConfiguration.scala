package typingsJapgolly.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingGroupConfiguration extends StObject {
  
  /**
    * The desired capacity, or number of instances, for the Auto Scaling group.
    */
  var desiredCapacity: js.UndefOr[DesiredCapacity] = js.undefined
  
  /**
    * The instance type for the Auto Scaling group.
    */
  var instanceType: js.UndefOr[InstanceType] = js.undefined
  
  /**
    * The maximum size, or maximum number of instances, for the Auto Scaling group.
    */
  var maxSize: js.UndefOr[MaxSize] = js.undefined
  
  /**
    * The minimum size, or minimum number of instances, for the Auto Scaling group.
    */
  var minSize: js.UndefOr[MinSize] = js.undefined
}
object AutoScalingGroupConfiguration {
  
  inline def apply(): AutoScalingGroupConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroupConfiguration]
  }
  
  extension [Self <: AutoScalingGroupConfiguration](x: Self) {
    
    inline def setDesiredCapacity(value: DesiredCapacity): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
    
    inline def setDesiredCapacityUndefined: Self = StObject.set(x, "desiredCapacity", js.undefined)
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setMaxSize(value: MaxSize): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMinSize(value: MinSize): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
  }
}
