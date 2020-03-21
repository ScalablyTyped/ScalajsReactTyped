package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Targeting extends VideoCampaignTargeting {
  def audiences(): AdWordsSelector[SearchCampaignAudience]
  def excludedAudiences(): AdWordsSelector[SearchCampaignExcludedAudience]
}

object Targeting {
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adSchedules")(adSchedules.toJsFn)
    __obj.updateDynamic("audiences")(audiences.toJsFn)
    __obj.updateDynamic("excludedAudiences")(excludedAudiences.toJsFn)
    __obj.updateDynamic("excludedContentLabels")(excludedContentLabels.toJsFn)
    __obj.updateDynamic("excludedLocations")(excludedLocations.toJsFn)
    __obj.updateDynamic("languages")(languages.toJsFn)
    __obj.updateDynamic("platforms")(platforms.toJsFn)
    __obj.updateDynamic("targetedLocations")(targetedLocations.toJsFn)
    __obj.updateDynamic("targetedProximities")(targetedProximities.toJsFn)
    __obj.asInstanceOf[Targeting]
  }
}

