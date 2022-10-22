package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoCampaignTargeting extends StObject {
  
  def adSchedules(): AdWordsSelector[AdSchedule]
  
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel]
  
  def excludedLocations(): AdWordsSelector[ExcludedLocation]
  
  def languages(): AdWordsSelector[Language]
  
  def platforms(): AdWordsSelector[Platform]
  
  def targetedLocations(): AdWordsSelector[TargetedLocation]
  
  def targetedProximities(): AdWordsSelector[TargetedProximity]
}
object VideoCampaignTargeting {
  
  inline def apply(
    adSchedules: CallbackTo[AdWordsSelector[AdSchedule]],
    excludedContentLabels: CallbackTo[AdWordsSelector[ExcludedContentLabel]],
    excludedLocations: CallbackTo[AdWordsSelector[ExcludedLocation]],
    languages: CallbackTo[AdWordsSelector[Language]],
    platforms: CallbackTo[AdWordsSelector[Platform]],
    targetedLocations: CallbackTo[AdWordsSelector[TargetedLocation]],
    targetedProximities: CallbackTo[AdWordsSelector[TargetedProximity]]
  ): VideoCampaignTargeting = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules.toJsFn, excludedContentLabels = excludedContentLabels.toJsFn, excludedLocations = excludedLocations.toJsFn, languages = languages.toJsFn, platforms = platforms.toJsFn, targetedLocations = targetedLocations.toJsFn, targetedProximities = targetedProximities.toJsFn)
    __obj.asInstanceOf[VideoCampaignTargeting]
  }
  
  extension [Self <: VideoCampaignTargeting](x: Self) {
    
    inline def setAdSchedules(value: CallbackTo[AdWordsSelector[AdSchedule]]): Self = StObject.set(x, "adSchedules", value.toJsFn)
    
    inline def setExcludedContentLabels(value: CallbackTo[AdWordsSelector[ExcludedContentLabel]]): Self = StObject.set(x, "excludedContentLabels", value.toJsFn)
    
    inline def setExcludedLocations(value: CallbackTo[AdWordsSelector[ExcludedLocation]]): Self = StObject.set(x, "excludedLocations", value.toJsFn)
    
    inline def setLanguages(value: CallbackTo[AdWordsSelector[Language]]): Self = StObject.set(x, "languages", value.toJsFn)
    
    inline def setPlatforms(value: CallbackTo[AdWordsSelector[Platform]]): Self = StObject.set(x, "platforms", value.toJsFn)
    
    inline def setTargetedLocations(value: CallbackTo[AdWordsSelector[TargetedLocation]]): Self = StObject.set(x, "targetedLocations", value.toJsFn)
    
    inline def setTargetedProximities(value: CallbackTo[AdWordsSelector[TargetedProximity]]): Self = StObject.set(x, "targetedProximities", value.toJsFn)
  }
}
