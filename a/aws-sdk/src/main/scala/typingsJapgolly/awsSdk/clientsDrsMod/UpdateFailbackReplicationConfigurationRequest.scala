package typingsJapgolly.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFailbackReplicationConfigurationRequest extends StObject {
  
  /**
    * Configure bandwidth throttling for the outbound data transfer rate of the Recovery Instance in Mbps.
    */
  var bandwidthThrottling: js.UndefOr[PositiveInteger] = js.undefined
  
  /**
    * The name of the Failback Replication Configuration.
    */
  var name: js.UndefOr[BoundedString] = js.undefined
  
  /**
    * The ID of the Recovery Instance.
    */
  var recoveryInstanceID: RecoveryInstanceID
  
  /**
    * Whether to use Private IP for the failback replication of the Recovery Instance.
    */
  var usePrivateIP: js.UndefOr[Boolean] = js.undefined
}
object UpdateFailbackReplicationConfigurationRequest {
  
  inline def apply(recoveryInstanceID: RecoveryInstanceID): UpdateFailbackReplicationConfigurationRequest = {
    val __obj = js.Dynamic.literal(recoveryInstanceID = recoveryInstanceID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFailbackReplicationConfigurationRequest]
  }
  
  extension [Self <: UpdateFailbackReplicationConfigurationRequest](x: Self) {
    
    inline def setBandwidthThrottling(value: PositiveInteger): Self = StObject.set(x, "bandwidthThrottling", value.asInstanceOf[js.Any])
    
    inline def setBandwidthThrottlingUndefined: Self = StObject.set(x, "bandwidthThrottling", js.undefined)
    
    inline def setName(value: BoundedString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRecoveryInstanceID(value: RecoveryInstanceID): Self = StObject.set(x, "recoveryInstanceID", value.asInstanceOf[js.Any])
    
    inline def setUsePrivateIP(value: Boolean): Self = StObject.set(x, "usePrivateIP", value.asInstanceOf[js.Any])
    
    inline def setUsePrivateIPUndefined: Self = StObject.set(x, "usePrivateIP", js.undefined)
  }
}
