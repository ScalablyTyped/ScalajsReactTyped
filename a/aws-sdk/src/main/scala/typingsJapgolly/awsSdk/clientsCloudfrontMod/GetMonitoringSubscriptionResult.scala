package typingsJapgolly.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMonitoringSubscriptionResult extends StObject {
  
  /**
    * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var MonitoringSubscription: js.UndefOr[typingsJapgolly.awsSdk.clientsCloudfrontMod.MonitoringSubscription] = js.undefined
}
object GetMonitoringSubscriptionResult {
  
  inline def apply(): GetMonitoringSubscriptionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMonitoringSubscriptionResult]
  }
  
  extension [Self <: GetMonitoringSubscriptionResult](x: Self) {
    
    inline def setMonitoringSubscription(value: MonitoringSubscription): Self = StObject.set(x, "MonitoringSubscription", value.asInstanceOf[js.Any])
    
    inline def setMonitoringSubscriptionUndefined: Self = StObject.set(x, "MonitoringSubscription", js.undefined)
  }
}
