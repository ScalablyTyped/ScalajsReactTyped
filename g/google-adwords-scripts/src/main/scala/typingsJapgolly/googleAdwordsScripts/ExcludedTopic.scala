package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExcludedTopic extends isAdGroupChild {
  def getId(): Double
  def getTopicId(): Double
  def remove(): Unit
}

object ExcludedTopic {
  @scala.inline
  def apply(
    getAdGroup: CallbackTo[AdGroup],
    getCampaign: CallbackTo[Campaign],
    getId: CallbackTo[Double],
    getTopicId: CallbackTo[Double],
    remove: Callback
  ): ExcludedTopic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAdGroup")(getAdGroup.toJsFn)
    __obj.updateDynamic("getCampaign")(getCampaign.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getTopicId")(getTopicId.toJsFn)
    __obj.updateDynamic("remove")(remove.toJsFn)
    __obj.asInstanceOf[ExcludedTopic]
  }
}

