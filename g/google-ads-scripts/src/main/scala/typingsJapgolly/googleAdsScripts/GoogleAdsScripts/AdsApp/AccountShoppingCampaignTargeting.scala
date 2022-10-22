package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to shopping campaign-level targeting criteria (currently just audiences).
  *
  * For instance, to select all audiences targeted by shopping campaigns you might use:
  *
  *      var shoppingAudienceSelector = AdsApp.shoppingCampaignTargeting()
  *       .audiences()
  *       .withCondition("Impressions > 100")
  *       .forDateRange("LAST_MONTH")
  *       .orderBy("Clicks DESC");
  *
  *      var shoppingAudienceIterator = shoppingAudienceSelector.get();
  *      while (shoppingAudienceIterator.hasNext()) {
  *        var shoppingAudience = shoppingAudienceIterator.next();
  *      }
  */
trait AccountShoppingCampaignTargeting extends StObject {
  
  /** Specializes this selector to return ShoppingCampaignAudience criteria. */
  def audiences(): ShoppingCampaignAudienceSelector
}
object AccountShoppingCampaignTargeting {
  
  inline def apply(audiences: CallbackTo[ShoppingCampaignAudienceSelector]): AccountShoppingCampaignTargeting = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn)
    __obj.asInstanceOf[AccountShoppingCampaignTargeting]
  }
  
  extension [Self <: AccountShoppingCampaignTargeting](x: Self) {
    
    inline def setAudiences(value: CallbackTo[ShoppingCampaignAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
  }
}
