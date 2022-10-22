package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunScheduledInstancesRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that ensures the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of instances. Default: 1
    */
  var InstanceCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The launch specification. You must match the instance type, Availability Zone, network, and platform of the schedule that you purchased.
    */
  var LaunchSpecification: ScheduledInstancesLaunchSpecification
  
  /**
    * The Scheduled Instance ID.
    */
  var ScheduledInstanceId: typingsJapgolly.awsSdk.clientsEc2Mod.ScheduledInstanceId
}
object RunScheduledInstancesRequest {
  
  inline def apply(
    LaunchSpecification: ScheduledInstancesLaunchSpecification,
    ScheduledInstanceId: ScheduledInstanceId
  ): RunScheduledInstancesRequest = {
    val __obj = js.Dynamic.literal(LaunchSpecification = LaunchSpecification.asInstanceOf[js.Any], ScheduledInstanceId = ScheduledInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunScheduledInstancesRequest]
  }
  
  extension [Self <: RunScheduledInstancesRequest](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceCount(value: Integer): Self = StObject.set(x, "InstanceCount", value.asInstanceOf[js.Any])
    
    inline def setInstanceCountUndefined: Self = StObject.set(x, "InstanceCount", js.undefined)
    
    inline def setLaunchSpecification(value: ScheduledInstancesLaunchSpecification): Self = StObject.set(x, "LaunchSpecification", value.asInstanceOf[js.Any])
    
    inline def setScheduledInstanceId(value: ScheduledInstanceId): Self = StObject.set(x, "ScheduledInstanceId", value.asInstanceOf[js.Any])
  }
}
