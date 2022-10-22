package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience]
  extends StObject
     with AdWordsTargeting[AdWordsEntity, AdWordsEntity] {
  
  def adSchedules(): AdWordsSelector[AdSchedule]
  
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel]
  
  def excludedLocations(): AdWordsSelector[ExcludedLocation]
  
  def getTargetingSetting(criterionTypeGroup: CriterionTypeGroup): TargetingSetting
  
  def languages(): AdWordsSelector[Language]
  
  def newUserListBuilder(): SearchCampaignAudienceBuilder[SearchCampaignAudience]
  
  def platforms(): AdWordsSelector[Platform]
  
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit
  
  def targetedLocations(): AdWordsSelector[TargetedLocation]
  
  def targetedProximities(): AdWordsSelector[TargetedProximity]
}
object CampaignTargeting {
  
  inline def apply[SearchCampaignAudience, SearchCampaignExcludedAudience](
    adSchedules: CallbackTo[AdWordsSelector[AdSchedule]],
    audiences: CallbackTo[AdWordsSelector[AdWordsEntity]],
    excludedContentLabels: CallbackTo[AdWordsSelector[ExcludedContentLabel]],
    excludedLocations: CallbackTo[AdWordsSelector[ExcludedLocation]],
    exculdedAudiences: CallbackTo[AdWordsSelector[AdWordsEntity]],
    getTargetingSetting: CriterionTypeGroup => TargetingSetting,
    languages: CallbackTo[AdWordsSelector[Language]],
    newUserListBuilder: CallbackTo[SearchCampaignAudienceBuilder[SearchCampaignAudience]],
    platforms: CallbackTo[AdWordsSelector[Platform]],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Callback,
    targetedLocations: CallbackTo[AdWordsSelector[TargetedLocation]],
    targetedProximities: CallbackTo[AdWordsSelector[TargetedProximity]]
  ): CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
    val __obj = js.Dynamic.literal(adSchedules = adSchedules.toJsFn, audiences = audiences.toJsFn, excludedContentLabels = excludedContentLabels.toJsFn, excludedLocations = excludedLocations.toJsFn, exculdedAudiences = exculdedAudiences.toJsFn, getTargetingSetting = js.Any.fromFunction1(getTargetingSetting), languages = languages.toJsFn, newUserListBuilder = newUserListBuilder.toJsFn, platforms = platforms.toJsFn, setTargetingSetting = js.Any.fromFunction2((t0: CriterionTypeGroup, t1: TargetingSetting) => (setTargetingSetting(t0, t1)).runNow()), targetedLocations = targetedLocations.toJsFn, targetedProximities = targetedProximities.toJsFn)
    __obj.asInstanceOf[CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience]]
  }
  
  extension [Self <: CampaignTargeting[?, ?], SearchCampaignAudience, SearchCampaignExcludedAudience](x: Self & (CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience])) {
    
    inline def setAdSchedules(value: CallbackTo[AdWordsSelector[AdSchedule]]): Self = StObject.set(x, "adSchedules", value.toJsFn)
    
    inline def setExcludedContentLabels(value: CallbackTo[AdWordsSelector[ExcludedContentLabel]]): Self = StObject.set(x, "excludedContentLabels", value.toJsFn)
    
    inline def setExcludedLocations(value: CallbackTo[AdWordsSelector[ExcludedLocation]]): Self = StObject.set(x, "excludedLocations", value.toJsFn)
    
    inline def setGetTargetingSetting(value: CriterionTypeGroup => TargetingSetting): Self = StObject.set(x, "getTargetingSetting", js.Any.fromFunction1(value))
    
    inline def setLanguages(value: CallbackTo[AdWordsSelector[Language]]): Self = StObject.set(x, "languages", value.toJsFn)
    
    inline def setNewUserListBuilder(value: CallbackTo[SearchCampaignAudienceBuilder[SearchCampaignAudience]]): Self = StObject.set(x, "newUserListBuilder", value.toJsFn)
    
    inline def setPlatforms(value: CallbackTo[AdWordsSelector[Platform]]): Self = StObject.set(x, "platforms", value.toJsFn)
    
    inline def setSetTargetingSetting(value: (CriterionTypeGroup, TargetingSetting) => Callback): Self = StObject.set(x, "setTargetingSetting", js.Any.fromFunction2((t0: CriterionTypeGroup, t1: TargetingSetting) => (value(t0, t1)).runNow()))
    
    inline def setTargetedLocations(value: CallbackTo[AdWordsSelector[TargetedLocation]]): Self = StObject.set(x, "targetedLocations", value.toJsFn)
    
    inline def setTargetedProximities(value: CallbackTo[AdWordsSelector[TargetedProximity]]): Self = StObject.set(x, "targetedProximities", value.toJsFn)
  }
}
