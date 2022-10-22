package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access to the targeting criteria for video campaigns.
  *
  * For example, to select the ad schedules for all video campaigns:
  *
  *  var adSchedules = AdsApp.videoCampaignTargeting().adSchedules().get();
  *  while (adSchedules.hasNext()) {
  *    var adSchedule = adSchedules.next();
  *  }
  */
trait VideoCampaignTargeting extends StObject {
  
  /** Specializes this selector to return AdSchedule criteria. */
  def adSchedules(): AdScheduleSelector
  
  /** Specializes this selector to return ExcludedContentLabel criteria. */
  def excludedContentLabels(): ExcludedContentLabelSelector
  
  /** Specializes this selector to return ExcludedLocation criteria. */
  def excludedLocations(): ExcludedLocationSelector
  
  /** Specializes this selector to return Language criteria. */
  def languages(): LanguageSelector
  
  /** Specializes this selector to return Platform criteria. */
  def platforms(): PlatformSelector
  
  /** Specializes this selector to return TargetedLocation criteria. */
  def targetedLocations(): TargetedLocationSelector
  
  /** Specializes this selector to return TargetedProximity criteria. */
  def targetedProximities(): TargetedProximitySelector
}
object VideoCampaignTargeting {
  
  inline def apply(
    adSchedules: CallbackTo[AdScheduleSelector],
    excludedContentLabels: CallbackTo[ExcludedContentLabelSelector],
    excludedLocations: CallbackTo[ExcludedLocationSelector],
    languages: CallbackTo[LanguageSelector],
    platforms: CallbackTo[PlatformSelector],
    targetedLocations: CallbackTo[TargetedLocationSelector],
    targetedProximities: CallbackTo[TargetedProximitySelector]
  ): VideoCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules.toJsFn, excludedContentLabels = excludedContentLabels.toJsFn, excludedLocations = excludedLocations.toJsFn, languages = languages.toJsFn, platforms = platforms.toJsFn, targetedLocations = targetedLocations.toJsFn, targetedProximities = targetedProximities.toJsFn)
    __obj.asInstanceOf[VideoCampaignTargeting]
  }
  
  extension [Self <: VideoCampaignTargeting](x: Self) {
    
    inline def setAdSchedules(value: CallbackTo[AdScheduleSelector]): Self = StObject.set(x, "adSchedules", value.toJsFn)
    
    inline def setExcludedContentLabels(value: CallbackTo[ExcludedContentLabelSelector]): Self = StObject.set(x, "excludedContentLabels", value.toJsFn)
    
    inline def setExcludedLocations(value: CallbackTo[ExcludedLocationSelector]): Self = StObject.set(x, "excludedLocations", value.toJsFn)
    
    inline def setLanguages(value: CallbackTo[LanguageSelector]): Self = StObject.set(x, "languages", value.toJsFn)
    
    inline def setPlatforms(value: CallbackTo[PlatformSelector]): Self = StObject.set(x, "platforms", value.toJsFn)
    
    inline def setTargetedLocations(value: CallbackTo[TargetedLocationSelector]): Self = StObject.set(x, "targetedLocations", value.toJsFn)
    
    inline def setTargetedProximities(value: CallbackTo[TargetedProximitySelector]): Self = StObject.set(x, "targetedProximities", value.toJsFn)
  }
}
