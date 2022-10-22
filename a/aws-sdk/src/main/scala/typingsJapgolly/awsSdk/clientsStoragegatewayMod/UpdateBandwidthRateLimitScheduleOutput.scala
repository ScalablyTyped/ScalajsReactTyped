package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBandwidthRateLimitScheduleOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object UpdateBandwidthRateLimitScheduleOutput {
  
  inline def apply(): UpdateBandwidthRateLimitScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBandwidthRateLimitScheduleOutput]
  }
  
  extension [Self <: UpdateBandwidthRateLimitScheduleOutput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
