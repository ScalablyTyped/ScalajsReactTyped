package typingsJapgolly.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainDeliverabilityTrackingOption extends StObject {
  
  /**
    * A verified domain that’s associated with your Amazon Web Services account and currently has an active Deliverability dashboard subscription.
    */
  var Domain: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.Domain] = js.undefined
  
  /**
    * An object that contains information about the inbox placement data settings for the domain.
    */
  var InboxPlacementTrackingOption: js.UndefOr[typingsJapgolly.awsSdk.clientsSesv2Mod.InboxPlacementTrackingOption] = js.undefined
  
  /**
    * The date, in Unix time format, when you enabled the Deliverability dashboard for the domain.
    */
  var SubscriptionStartDate: js.UndefOr[js.Date] = js.undefined
}
object DomainDeliverabilityTrackingOption {
  
  inline def apply(): DomainDeliverabilityTrackingOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDeliverabilityTrackingOption]
  }
  
  extension [Self <: DomainDeliverabilityTrackingOption](x: Self) {
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setInboxPlacementTrackingOption(value: InboxPlacementTrackingOption): Self = StObject.set(x, "InboxPlacementTrackingOption", value.asInstanceOf[js.Any])
    
    inline def setInboxPlacementTrackingOptionUndefined: Self = StObject.set(x, "InboxPlacementTrackingOption", js.undefined)
    
    inline def setSubscriptionStartDate(value: js.Date): Self = StObject.set(x, "SubscriptionStartDate", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionStartDateUndefined: Self = StObject.set(x, "SubscriptionStartDate", js.undefined)
  }
}
