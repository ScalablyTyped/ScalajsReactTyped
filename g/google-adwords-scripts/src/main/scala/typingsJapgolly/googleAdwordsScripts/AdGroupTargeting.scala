package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] extends AdWordsTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] {
  def getTargetingSetting(): String
  def newUserListBuilder(): SearchAdGroupAudienceBuilder[SearchAdGroupAudience]
  def setTargetingSetting(criterionTypeGroup: CriterionTypeGroup, targetingSetting: TargetingSetting): Unit
}

object AdGroupTargeting {
  @scala.inline
  def apply[SearchAdGroupAudience, SearchAdGroupExcludedAudience](
    audiences: CallbackTo[AdWordsSelector[SearchAdGroupAudience]],
    exculdedAudiences: CallbackTo[AdWordsSelector[SearchAdGroupExcludedAudience]],
    getTargetingSetting: CallbackTo[String],
    newUserListBuilder: CallbackTo[SearchAdGroupAudienceBuilder[SearchAdGroupAudience]],
    setTargetingSetting: (CriterionTypeGroup, TargetingSetting) => Callback
  ): AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("audiences")(audiences.toJsFn)
    __obj.updateDynamic("exculdedAudiences")(exculdedAudiences.toJsFn)
    __obj.updateDynamic("getTargetingSetting")(getTargetingSetting.toJsFn)
    __obj.updateDynamic("newUserListBuilder")(newUserListBuilder.toJsFn)
    __obj.updateDynamic("setTargetingSetting")(js.Any.fromFunction2((t0: typingsJapgolly.googleAdwordsScripts.CriterionTypeGroup, t1: typingsJapgolly.googleAdwordsScripts.TargetingSetting) => setTargetingSetting(t0, t1).runNow()))
    __obj.asInstanceOf[AdGroupTargeting[SearchAdGroupAudience, SearchAdGroupExcludedAudience]]
  }
}

