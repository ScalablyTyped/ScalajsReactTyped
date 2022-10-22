package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringSubscription extends StObject {
  
  /**
    * A subscription configuration for additional CloudWatch metrics.
    */
  var RealtimeMetricsSubscriptionConfig: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.RealtimeMetricsSubscriptionConfig] = js.undefined
}
object MonitoringSubscription {
  
  inline def apply(): MonitoringSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitoringSubscription]
  }
  
  extension [Self <: MonitoringSubscription](x: Self) {
    
    inline def setRealtimeMetricsSubscriptionConfig(value: RealtimeMetricsSubscriptionConfig): Self = StObject.set(x, "RealtimeMetricsSubscriptionConfig", value.asInstanceOf[js.Any])
    
    inline def setRealtimeMetricsSubscriptionConfigUndefined: Self = StObject.set(x, "RealtimeMetricsSubscriptionConfig", js.undefined)
  }
}
