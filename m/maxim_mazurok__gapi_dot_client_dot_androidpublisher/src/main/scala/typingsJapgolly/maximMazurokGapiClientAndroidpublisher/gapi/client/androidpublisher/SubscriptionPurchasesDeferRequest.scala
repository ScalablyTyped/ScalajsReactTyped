package typingsJapgolly.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionPurchasesDeferRequest extends StObject {
  
  /** The information about the new desired expiry time for the subscription. */
  var deferralInfo: js.UndefOr[SubscriptionDeferralInfo] = js.undefined
}
object SubscriptionPurchasesDeferRequest {
  
  inline def apply(): SubscriptionPurchasesDeferRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionPurchasesDeferRequest]
  }
  
  extension [Self <: SubscriptionPurchasesDeferRequest](x: Self) {
    
    inline def setDeferralInfo(value: SubscriptionDeferralInfo): Self = StObject.set(x, "deferralInfo", value.asInstanceOf[js.Any])
    
    inline def setDeferralInfoUndefined: Self = StObject.set(x, "deferralInfo", js.undefined)
  }
}
