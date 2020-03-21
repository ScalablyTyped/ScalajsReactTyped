package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoCampaignTargeting extends js.Object {
  def adSchedules(): AdWordsSelector[AdSchedule]
  def excludedContentLabels(): AdWordsSelector[ExcludedContentLabel]
  def excludedLocations(): AdWordsSelector[ExcludedLocation]
  def languages(): AdWordsSelector[Language]
  def platforms(): AdWordsSelector[Platform]
  def targetedLocations(): AdWordsSelector[TargetedLocation]
  def targetedProximities(): AdWordsSelector[TargetedProximity]
}

object VideoCampaignTargeting {
  @scala.inline
  def apply(
    adSchedules: CallbackTo[AdWordsSelector[AdSchedule]],
    excludedContentLabels: CallbackTo[AdWordsSelector[ExcludedContentLabel]],
    excludedLocations: CallbackTo[AdWordsSelector[ExcludedLocation]],
    languages: CallbackTo[AdWordsSelector[Language]],
    platforms: CallbackTo[AdWordsSelector[Platform]],
    targetedLocations: CallbackTo[AdWordsSelector[TargetedLocation]],
    targetedProximities: CallbackTo[AdWordsSelector[TargetedProximity]]
  ): VideoCampaignTargeting = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adSchedules")(adSchedules.toJsFn)
    __obj.updateDynamic("excludedContentLabels")(excludedContentLabels.toJsFn)
    __obj.updateDynamic("excludedLocations")(excludedLocations.toJsFn)
    __obj.updateDynamic("languages")(languages.toJsFn)
    __obj.updateDynamic("platforms")(platforms.toJsFn)
    __obj.updateDynamic("targetedLocations")(targetedLocations.toJsFn)
    __obj.updateDynamic("targetedProximities")(targetedProximities.toJsFn)
    __obj.asInstanceOf[VideoCampaignTargeting]
  }
}

