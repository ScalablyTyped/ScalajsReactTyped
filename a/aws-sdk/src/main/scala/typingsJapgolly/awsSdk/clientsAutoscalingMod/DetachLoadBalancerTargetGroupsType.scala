package typingsJapgolly.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachLoadBalancerTargetGroupsType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * The Amazon Resource Names (ARN) of the target groups. You can specify up to 10 target groups.
    */
  var TargetGroupARNs: typingsJapgolly.awsSdk.clientsAutoscalingMod.TargetGroupARNs
}
object DetachLoadBalancerTargetGroupsType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255, TargetGroupARNs: TargetGroupARNs): DetachLoadBalancerTargetGroupsType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], TargetGroupARNs = TargetGroupARNs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachLoadBalancerTargetGroupsType]
  }
  
  extension [Self <: DetachLoadBalancerTargetGroupsType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupARNs(value: TargetGroupARNs): Self = StObject.set(x, "TargetGroupARNs", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupARNsVarargs(value: XmlStringMaxLen511*): Self = StObject.set(x, "TargetGroupARNs", js.Array(value*))
  }
}
