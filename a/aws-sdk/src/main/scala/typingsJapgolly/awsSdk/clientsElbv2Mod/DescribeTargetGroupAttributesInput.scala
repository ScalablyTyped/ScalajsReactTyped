package typingsJapgolly.awsSdk.clientsElbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTargetGroupAttributesInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typingsJapgolly.awsSdk.clientsElbv2Mod.TargetGroupArn
}
object DescribeTargetGroupAttributesInput {
  
  inline def apply(TargetGroupArn: TargetGroupArn): DescribeTargetGroupAttributesInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetGroupAttributesInput]
  }
  
  extension [Self <: DescribeTargetGroupAttributesInput](x: Self) {
    
    inline def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
  }
}
