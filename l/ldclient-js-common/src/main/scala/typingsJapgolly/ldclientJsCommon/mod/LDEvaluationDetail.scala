package typingsJapgolly.ldclientJsCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDEvaluationDetail extends js.Object {
  /**
    * An object describing the main factor that influenced the flag evaluation value.
    */
  var reason: LDEvaluationReason
  /**
    * The result of the flag evaluation. This will be either one of the flag's variations or
    * the default value that was passed to [[LDClient.variationDetail]].
    */
  var value: LDFlagValue
  /**
    * The index of the returned value within the flag's list of variations, e.g. 0 for the
    * first variation-- or `null` if the default value was returned.
    */
  var variationIndex: js.UndefOr[Double] = js.undefined
}

object LDEvaluationDetail {
  @scala.inline
  def apply(reason: LDEvaluationReason, value: LDFlagValue, variationIndex: Int | Double = null): LDEvaluationDetail = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (variationIndex != null) __obj.updateDynamic("variationIndex")(variationIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDEvaluationDetail]
  }
}

