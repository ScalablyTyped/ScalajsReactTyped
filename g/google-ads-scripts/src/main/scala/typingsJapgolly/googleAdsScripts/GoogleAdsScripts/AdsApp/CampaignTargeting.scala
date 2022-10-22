package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to campaign-level targeting criteria: device targeting, ad scheduling, location targeting, and audiences.
  *
  * For instance, to select all locations targeted by a campaign you might use:
  *
  *      var campaign = AdsApp.campaigns().get().next();
  *      var locations = campaign.targeting().targetedLocations().get();
  *      while (locations.hasNext()) {
  *        var location = locations.next();
  *      }
  */
trait CampaignTargeting extends StObject {
  
  /** Specializes this selector to return AdSchedule criteria. */
  def adSchedules(): AdScheduleSelector
  
  /** Specializes this selector to return SearchCampaignAudience criteria. */
  def audiences(): SearchCampaignAudienceSelector
  
  /** Specializes this selector to return SearchCampaignExcludedAudience criteria. */
  def excludedAudiences(): SearchCampaignExcludedAudienceSelector
  
  /** Specializes this selector to return ExcludedContentLabel criteria. */
  def excludedContentLabels(): ExcludedContentLabelSelector
  
  /** Specializes this selector to return ExcludedLocation criteria. */
  def excludedLocations(): ExcludedLocationSelector
  
  /** Returns the current targeting setting of the specified criterion type group for this campaign. */
  def getTargetingSetting(): String
  
  /** Specializes this selector to return Language criteria. */
  def languages(): LanguageSelector
  
  /** Returns a new user list audience builder for this campaign. */
  def newUserListBuilder(): SearchCampaignAudienceBuilder
  
  /** Specializes this selector to return Platform criteria. */
  def platforms(): PlatformSelector
  
  /** Sets the targeting setting for this campaign. */
  def setTargetingSetting(criterionTypeGroup: String, targetingSetting: String): Unit
  
  /** Specializes this selector to return TargetedLocation criteria. */
  def targetedLocations(): TargetedLocationSelector
  
  /** Specializes this selector to return TargetedProximity criteria. */
  def targetedProximities(): TargetedProximitySelector
}
object CampaignTargeting {
  
  inline def apply(
    adSchedules: CallbackTo[AdScheduleSelector],
    audiences: CallbackTo[SearchCampaignAudienceSelector],
    excludedAudiences: CallbackTo[SearchCampaignExcludedAudienceSelector],
    excludedContentLabels: CallbackTo[ExcludedContentLabelSelector],
    excludedLocations: CallbackTo[ExcludedLocationSelector],
    getTargetingSetting: CallbackTo[String],
    languages: CallbackTo[LanguageSelector],
    newUserListBuilder: CallbackTo[SearchCampaignAudienceBuilder],
    platforms: CallbackTo[PlatformSelector],
    setTargetingSetting: (String, String) => Callback,
    targetedLocations: CallbackTo[TargetedLocationSelector],
    targetedProximities: CallbackTo[TargetedProximitySelector]
  ): CampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules.toJsFn, audiences = audiences.toJsFn, excludedAudiences = excludedAudiences.toJsFn, excludedContentLabels = excludedContentLabels.toJsFn, excludedLocations = excludedLocations.toJsFn, getTargetingSetting = getTargetingSetting.toJsFn, languages = languages.toJsFn, newUserListBuilder = newUserListBuilder.toJsFn, platforms = platforms.toJsFn, setTargetingSetting = js.Any.fromFunction2((t0: String, t1: String) => (setTargetingSetting(t0, t1)).runNow()), targetedLocations = targetedLocations.toJsFn, targetedProximities = targetedProximities.toJsFn)
    __obj.asInstanceOf[CampaignTargeting]
  }
  
  extension [Self <: CampaignTargeting](x: Self) {
    
    inline def setAdSchedules(value: CallbackTo[AdScheduleSelector]): Self = StObject.set(x, "adSchedules", value.toJsFn)
    
    inline def setAudiences(value: CallbackTo[SearchCampaignAudienceSelector]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setExcludedAudiences(value: CallbackTo[SearchCampaignExcludedAudienceSelector]): Self = StObject.set(x, "excludedAudiences", value.toJsFn)
    
    inline def setExcludedContentLabels(value: CallbackTo[ExcludedContentLabelSelector]): Self = StObject.set(x, "excludedContentLabels", value.toJsFn)
    
    inline def setExcludedLocations(value: CallbackTo[ExcludedLocationSelector]): Self = StObject.set(x, "excludedLocations", value.toJsFn)
    
    inline def setGetTargetingSetting(value: CallbackTo[String]): Self = StObject.set(x, "getTargetingSetting", value.toJsFn)
    
    inline def setLanguages(value: CallbackTo[LanguageSelector]): Self = StObject.set(x, "languages", value.toJsFn)
    
    inline def setNewUserListBuilder(value: CallbackTo[SearchCampaignAudienceBuilder]): Self = StObject.set(x, "newUserListBuilder", value.toJsFn)
    
    inline def setPlatforms(value: CallbackTo[PlatformSelector]): Self = StObject.set(x, "platforms", value.toJsFn)
    
    inline def setSetTargetingSetting(value: (String, String) => Callback): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setTargetedLocations(value: CallbackTo[TargetedLocationSelector]): Self = StObject.set(x, "targetedLocations", value.toJsFn)
    
    inline def setTargetedProximities(value: CallbackTo[TargetedProximitySelector]): Self = StObject.set(x, "targetedProximities", value.toJsFn)
  }
}
