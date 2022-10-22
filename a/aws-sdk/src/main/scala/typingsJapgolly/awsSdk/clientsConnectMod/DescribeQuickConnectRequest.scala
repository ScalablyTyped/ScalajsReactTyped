package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeQuickConnectRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The identifier for the quick connect.
    */
  var QuickConnectId: typingsJapgolly.awsSdk.clientsConnectMod.QuickConnectId
}
object DescribeQuickConnectRequest {
  
  inline def apply(InstanceId: InstanceId, QuickConnectId: QuickConnectId): DescribeQuickConnectRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], QuickConnectId = QuickConnectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeQuickConnectRequest]
  }
  
  extension [Self <: DescribeQuickConnectRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setQuickConnectId(value: QuickConnectId): Self = StObject.set(x, "QuickConnectId", value.asInstanceOf[js.Any])
  }
}
