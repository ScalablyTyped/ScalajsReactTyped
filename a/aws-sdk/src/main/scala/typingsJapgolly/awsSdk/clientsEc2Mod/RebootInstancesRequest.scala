package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootInstancesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The instance IDs.
    */
  var InstanceIds: InstanceIdStringList
}
object RebootInstancesRequest {
  
  inline def apply(InstanceIds: InstanceIdStringList): RebootInstancesRequest = {
    val __obj = js.Dynamic.literal(InstanceIds = InstanceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootInstancesRequest]
  }
  
  extension [Self <: RebootInstancesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceIds(value: InstanceIdStringList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value*))
  }
}
