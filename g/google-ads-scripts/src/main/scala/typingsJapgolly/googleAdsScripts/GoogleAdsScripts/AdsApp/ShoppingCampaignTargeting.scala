package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to campaign-level targeting criteria.
  *
  * For instance, to select all locations targeted by a campaign you might use:
  *
  *  var campaign = AdsApp.shoppingCampaigns().get().next();
  *  var locations = campaign.targeting().targetedLocations().get();
  *  while (locations.hasNext()) {
  *    var location = locations.next();
  *  }
  */
trait ShoppingCampaignTargeting extends StObject {
  
  /** Specializes this selector to return AdSchedule criteria. */
  def adSchedules(): AdScheduleSelector
  
  /** Specializes this selector to return ShoppingCampaignAudience criteria. */
  def audiences(): ShoppingCampaignAudienceSelector
  
  /** Specializes this selector to return ExcludedLocation criteria. */
  def excludedLocations(): ExcludedLocationSelector
  
  /** Returns the current targeting setting of the specified criterion type group for this campaign. */
  def getTargetingSetting(criterionTypeGroup: String): String
  
  /** Returns a new user list audience builder for this campaign. */
  def newUserListBuilder(): ShoppingCampaignAudienceBuilder
  
  /** Specializes this selector to return Platform criteria. */
  def platforms(): PlatformSelector
  
  /** Sets the targeting setting for this campaign. */
  def setTargetingSetting(criterionTypeGroup: String, targetingSetting: String): Unit
  
  /** Specializes this selector to return TargetedLocation criteria. */
  def targetedLocations(): TargetedLocationSelector
  
  /** Specializes this selector to return TargetedProximity criteria. */
  def targetedProximities(): TargetedProximitySelector
}
object ShoppingCampaignTargeting {
  
  inline def apply(
    adSchedules: CallbackTo[AdScheduleSelector],
    audiences: CallbackTo[ShoppingCampaignAudienceSelector],
    excludedLocations: CallbackTo[ExcludedLocationSelector],
    getTargetingSetting: String => String,
    newUserListBuilder: CallbackTo[ShoppingCampaignAudienceBuilder],
    platforms: CallbackTo[PlatformSelector],
    setTargetingSetting: (String, String) => Callback,
    targetedLocations: CallbackTo[TargetedLocationSelector],
    targetedProximities: CallbackTo[TargetedProximitySelector]
  ): ShoppingCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules.toJsFn, audiences = audiences.toJsFn, excludedLocations = excludedLocations.toJsFn, getTargetingSetting = js.Any.fromFunction1(getTargetingSetting), newUserListBuilder = newUserListBuilder.toJsFn, platforms = platforms.toJsFn, setTargetingSetting = js.Any.fromFunction2((t0: String, t1: String) => (setTargetingSetting(t0, t1)).runNow()), targetedLocations = targetedLocations.toJsFn, targetedProximities = targetedProximities.toJsFn)
    __obj.asInstanceOf[ShoppingCampaignTargeting]
  }
  
  extension [Self <: ShoppingCampaignTargeting](x: Self) {
    
    inline def setAdSchedules(value: CallbackTo[AdScheduleSelector]): Self = StObject.set(x, "adSchedules", value.toJsFn)
    
    inline def setAudiences(value: CallbackTo[ShoppingCampaignAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setExcludedLocations(value: CallbackTo[ExcludedLocationSelector]): Self = StObject.set(x, "excludedLocations", value.toJsFn)
    
    inline def setGetTargetingSetting(value: String => String): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction1(value))
    
    inline def setNewUserListBuilder(value: CallbackTo[ShoppingCampaignAudienceBuilder]): Self = StObject.set(x, "newUserListBuilder", value.toJsFn)
    
    inline def setPlatforms(value: CallbackTo[PlatformSelector]): Self = StObject.set(x, "platforms", value.toJsFn)
    
    inline def setSetTargetingSetting(value: (String, String) => Callback): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setTargetedLocations(value: CallbackTo[TargetedLocationSelector]): Self = StObject.set(x, "targetedLocations", value.toJsFn)
    
    inline def setTargetedProximities(value: CallbackTo[TargetedProximitySelector]): Self = StObject.set(x, "targetedProximities", value.toJsFn)
  }
}
