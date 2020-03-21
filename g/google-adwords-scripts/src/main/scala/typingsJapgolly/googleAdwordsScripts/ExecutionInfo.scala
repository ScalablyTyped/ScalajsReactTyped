package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionInfo extends js.Object {
  def getRemainingCreateQuota(): Double
  def getRemainingGetQuota(): Double
  def getRemainingTime(): Double
  def isPreview(): Boolean
}

object ExecutionInfo {
  @scala.inline
  def apply(
    getRemainingCreateQuota: CallbackTo[Double],
    getRemainingGetQuota: CallbackTo[Double],
    getRemainingTime: CallbackTo[Double],
    isPreview: CallbackTo[Boolean]
  ): ExecutionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRemainingCreateQuota")(getRemainingCreateQuota.toJsFn)
    __obj.updateDynamic("getRemainingGetQuota")(getRemainingGetQuota.toJsFn)
    __obj.updateDynamic("getRemainingTime")(getRemainingTime.toJsFn)
    __obj.updateDynamic("isPreview")(isPreview.toJsFn)
    __obj.asInstanceOf[ExecutionInfo]
  }
}

