package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Targeting
  extends StObject
     with VideoCampaignTargeting {
  
  def audiences(): AdWordsSelector[SearchCampaignAudience]
  
  def excludedAudiences(): AdWordsSelector[SearchCampaignExcludedAudience]
}
object Targeting {
  
  inline def apply(
    adSchedules: CallbackTo[AdWordsSelector[AdSchedule]],
    audiences: CallbackTo[AdWordsSelector[SearchCampaignAudience]],
    excludedAudiences: CallbackTo[AdWordsSelector[SearchCampaignExcludedAudience]],
    excludedContentLabels: CallbackTo[AdWordsSelector[ExcludedContentLabel]],
    excludedLocations: CallbackTo[AdWordsSelector[ExcludedLocation]],
    languages: CallbackTo[AdWordsSelector[Language]],
    platforms: CallbackTo[AdWordsSelector[Platform]],
    targetedLocations: CallbackTo[AdWordsSelector[TargetedLocation]],
    targetedProximities: CallbackTo[AdWordsSelector[TargetedProximity]]
  ): Targeting = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules.toJsFn, audiences = audiences.toJsFn, excludedAudiences = excludedAudiences.toJsFn, excludedContentLabels = excludedContentLabels.toJsFn, excludedLocations = excludedLocations.toJsFn, languages = languages.toJsFn, platforms = platforms.toJsFn, targetedLocations = targetedLocations.toJsFn, targetedProximities = targetedProximities.toJsFn)
    __obj.asInstanceOf[Targeting]
  }
  
  extension [Self <: Targeting](x: Self) {
    
    inline def setAudiences(value: CallbackTo[AdWordsSelector[SearchCampaignAudience]]): Self = StObject.set(x, "audiences", value.toJsFn)
    
    inline def setExcludedAudiences(value: CallbackTo[AdWordsSelector[SearchCampaignExcludedAudience]]): Self = StObject.set(x, "excludedAudiences", value.toJsFn)
  }
}
