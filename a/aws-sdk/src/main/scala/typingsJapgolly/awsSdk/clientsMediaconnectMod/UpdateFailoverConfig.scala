package typingsJapgolly.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFailoverConfig extends StObject {
  
  /**
    * The type of failover you choose for this flow. MERGE combines the source streams into a single stream, allowing graceful recovery from any single-source loss. FAILOVER allows switching between different streams.
    */
  var FailoverMode: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconnectMod.FailoverMode] = js.undefined
  
  /**
    * Recovery window time to look for dash-7 packets
    */
  var RecoveryWindow: js.UndefOr[integer] = js.undefined
  
  /**
    * The priority you want to assign to a source. You can have a primary stream and a backup stream or two equally prioritized streams.
    */
  var SourcePriority: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconnectMod.SourcePriority] = js.undefined
  
  var State: js.UndefOr[typingsJapgolly.awsSdk.clientsMediaconnectMod.State] = js.undefined
}
object UpdateFailoverConfig {
  
  inline def apply(): UpdateFailoverConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateFailoverConfig]
  }
  
  extension [Self <: UpdateFailoverConfig](x: Self) {
    
    inline def setFailoverMode(value: FailoverMode): Self = StObject.set(x, "FailoverMode", value.asInstanceOf[js.Any])
    
    inline def setFailoverModeUndefined: Self = StObject.set(x, "FailoverMode", js.undefined)
    
    inline def setRecoveryWindow(value: integer): Self = StObject.set(x, "RecoveryWindow", value.asInstanceOf[js.Any])
    
    inline def setRecoveryWindowUndefined: Self = StObject.set(x, "RecoveryWindow", js.undefined)
    
    inline def setSourcePriority(value: SourcePriority): Self = StObject.set(x, "SourcePriority", value.asInstanceOf[js.Any])
    
    inline def setSourcePriorityUndefined: Self = StObject.set(x, "SourcePriority", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
