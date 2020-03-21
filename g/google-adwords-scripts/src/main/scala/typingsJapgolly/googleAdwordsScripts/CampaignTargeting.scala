package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] extends AdWordsTargeting[AdWordsEntity, AdWordsEntity] {
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
  @scala.inline
  def apply[SearchCampaignAudience, SearchCampaignExcludedAudience](
    adSchedules: CallbackTo[AdWordsSelector[AdSchedule]],
    audiences: CallbackTo[AdWordsSelector[AdWordsEntity]],
    excludedContentLabels: CallbackTo[AdWordsSelector[ExcludedContentLabel]],
    excludedLocations: CallbackTo[AdWordsSelector[ExcludedLocation]],
    exculdedAudiences: CallbackTo[AdWordsSelector[AdWordsEntity]],
    getTargetingSetting: CriterionTypeGroup => CallbackTo[TargetingSetting],
    languages: CallbackTo[AdWordsSelector[Language]],
    newUserListBuilder: CallbackTo[SearchCampaignAudienceBuilder[SearchCampaignAudience]],
    platforms: CallbackTo[AdWordsSelector[Platform]],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Callback,
    targetedLocations: CallbackTo[AdWordsSelector[TargetedLocation]],
    targetedProximities: CallbackTo[AdWordsSelector[TargetedProximity]]
  ): CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adSchedules")(adSchedules.toJsFn)
    __obj.updateDynamic("audiences")(audiences.toJsFn)
    __obj.updateDynamic("excludedContentLabels")(excludedContentLabels.toJsFn)
    __obj.updateDynamic("excludedLocations")(excludedLocations.toJsFn)
    __obj.updateDynamic("exculdedAudiences")(exculdedAudiences.toJsFn)
    __obj.updateDynamic("getTargetingSetting")(js.Any.fromFunction1((t0: typingsJapgolly.googleAdwordsScripts.CriterionTypeGroup) => getTargetingSetting(t0).runNow()))
    __obj.updateDynamic("languages")(languages.toJsFn)
    __obj.updateDynamic("newUserListBuilder")(newUserListBuilder.toJsFn)
    __obj.updateDynamic("platforms")(platforms.toJsFn)
    __obj.updateDynamic("setTargetingSetting")(js.Any.fromFunction2((t0: typingsJapgolly.googleAdwordsScripts.CriterionTypeGroup, t1: typingsJapgolly.googleAdwordsScripts.TargetingSetting) => setTargetingSetting(t0, t1).runNow()))
    __obj.updateDynamic("targetedLocations")(targetedLocations.toJsFn)
    __obj.updateDynamic("targetedProximities")(targetedProximities.toJsFn)
    __obj.asInstanceOf[CampaignTargeting[SearchCampaignAudience, SearchCampaignExcludedAudience]]
  }
}

