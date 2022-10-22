package typingsJapgolly.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAcceleratorAttributesRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the accelerator with the attributes that you want to describe.
    */
  var AcceleratorArn: GenericString
}
object DescribeAcceleratorAttributesRequest {
  
  inline def apply(AcceleratorArn: GenericString): DescribeAcceleratorAttributesRequest = {
    val __obj = js.Dynamic.literal(AcceleratorArn = AcceleratorArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAcceleratorAttributesRequest]
  }
  
  extension [Self <: DescribeAcceleratorAttributesRequest](x: Self) {
    
    inline def setAcceleratorArn(value: GenericString): Self = StObject.set(x, "AcceleratorArn", value.asInstanceOf[js.Any])
  }
}
