package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DedicatedIp extends StObject {
  
  /**
    * An IPv4 address.
    */
  var Ip: typingsJapgolly.awsSdk.clientsSesv2Mod.Ip
  
  /**
    * The name of the dedicated IP pool that the IP address is associated with.
    */
  var PoolName: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.PoolName] = js.undefined
  
  /**
    * Indicates how complete the dedicated IP warm-up process is. When this value equals 1, the address has completed the warm-up process and is ready for use.
    */
  var WarmupPercentage: Percentage100Wrapper
  
  /**
    * The warm-up status of a dedicated IP address. The status can have one of the following values:    IN_PROGRESS – The IP address isn't ready to use because the dedicated IP warm-up process is ongoing.    DONE – The dedicated IP warm-up process is complete, and the IP address is ready to use.  
    */
  var WarmupStatus: typingsJapgolly.awsSdk.clientsSesv2Mod.WarmupStatus
}
object DedicatedIp {
  
  inline def apply(Ip: Ip, WarmupPercentage: Percentage100Wrapper, WarmupStatus: WarmupStatus): DedicatedIp = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any], WarmupPercentage = WarmupPercentage.asInstanceOf[js.Any], WarmupStatus = WarmupStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[DedicatedIp]
  }
  
  extension [Self <: DedicatedIp](x: Self) {
    
    inline def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    inline def setPoolName(value: PoolName): Self = StObject.set(x, "PoolName", value.asInstanceOf[js.Any])
    
    inline def setPoolNameUndefined: Self = StObject.set(x, "PoolName", js.undefined)
    
    inline def setWarmupPercentage(value: Percentage100Wrapper): Self = StObject.set(x, "WarmupPercentage", value.asInstanceOf[js.Any])
    
    inline def setWarmupStatus(value: WarmupStatus): Self = StObject.set(x, "WarmupStatus", value.asInstanceOf[js.Any])
  }
}
