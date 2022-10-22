package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to ad group-level targeting criteria.
  *
  * For instance, to select all audiences targeted by an ad group you might use:
  *
  *      var adgroup = AdsApp.shoppingAdGroups().get().next();
  *      var audiences = adgroup.targeting().audiences().get();
  *      while (audiences.hasNext()) {
  *        var audience = audiences.next();
  *      }
  */
trait ShoppingAdGroupTargeting extends StObject {
  
  /** Specializes this selector to return ShoppingAdGroupAudience criteria. */
  def audiences(): ShoppingAdGroupAudienceSelector
  
  /** Returns the current targeting setting of the specified criterion type group for this shopping ad group. */
  def getTargetingSetting(criterionTypeGroup: String): String
  
  /** Returns a new user list audience builder for this ad group. */
  def newUserListBuilder(): ShoppingAdGroupAudienceBuilder
  
  /** Sets the targeting setting for this ad group. */
  def setTargetingSetting(criterionTypeGroup: String, targetingSetting: String): Unit
}
object ShoppingAdGroupTargeting {
  
  inline def apply(
    audiences: CallbackTo[ShoppingAdGroupAudienceSelector],
    getTargetingSetting: String => String,
    newUserListBuilder: CallbackTo[ShoppingAdGroupAudienceBuilder],
    setTargetingSetting: (String, String) => Callback
  ): ShoppingAdGroupTargeting = {
    val __obj = js.Dynamic.literal(audiences = audiences.toJsFn, getTargetingSetting = js.Any.fromFunction1(getTargetingSetting), newUserListBuilder = newUserListBuilder.toJsFn, setTargetingSetting = js.Any.fromFunction2((t0: String, t1: String) => (setTargetingSetting(t0, t1)).runNow()))
    __obj.asInstanceOf[ShoppingAdGroupTargeting]
  }
  
  extension [Self <: ShoppingAdGroupTargeting](x: Self) {
    
    inline def setAudiences(value: CallbackTo[ShoppingAdGroupAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setGetTargetingSetting(value: String => String): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction1(value))
    
    inline def setNewUserListBuilder(value: CallbackTo[ShoppingAdGroupAudienceBuilder]): Self = StObject.set(x, "newUserListBuilder", value.toJsFn)
    
    inline def setSetTargetingSetting(value: (String, String) => Callback): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
  }
}
