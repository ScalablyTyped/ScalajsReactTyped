package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to shopping ad group-level targeting criteria (currently just audiences).
  *
  * For instance, to select all audiences targeted by shopping ad groups you might use:
  *
  *      var shoppingAudienceSelector = AdsApp.shoppingAdGroupTargeting()
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
trait AccountShoppingAdGroupTargeting extends StObject {
  
  /** Specializes this selector to return ShoppingAdGroupAudience criteria. */
  def audiences(): ShoppingAdGroupAudienceSelector
}
object AccountShoppingAdGroupTargeting {
  
  inline def apply(audiences: CallbackTo[ShoppingAdGroupAudienceSelector]): AccountShoppingAdGroupTargeting = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn)
    __obj.asInstanceOf[AccountShoppingAdGroupTargeting]
  }
  
  extension [Self <: AccountShoppingAdGroupTargeting](x: Self) {
    
    inline def setAudiences(value: CallbackTo[ShoppingAdGroupAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
  }
}
