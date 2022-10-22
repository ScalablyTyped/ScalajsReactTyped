package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeHoursOfOperationRequest extends StObject {
  
  /**
    * The identifier for the hours of operation.
    */
  var HoursOfOperationId: typingsJapgolly.awsSdk.clientsConnectMod.HoursOfOperationId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
}
object DescribeHoursOfOperationRequest {
  
  inline def apply(HoursOfOperationId: HoursOfOperationId, InstanceId: InstanceId): DescribeHoursOfOperationRequest = {
    val __obj = js.Dynamic.literal(HoursOfOperationId = HoursOfOperationId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHoursOfOperationRequest]
  }
  
  extension [Self <: DescribeHoursOfOperationRequest](x: Self) {
    
    inline def setHoursOfOperationId(value: HoursOfOperationId): Self = StObject.set(x, "HoursOfOperationId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
