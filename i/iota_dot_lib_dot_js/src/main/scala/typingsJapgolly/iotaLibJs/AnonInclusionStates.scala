package typingsJapgolly.iotaLibJs

import typingsJapgolly.iotaLibJs.mod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInclusionStates extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var inclusionStates: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[Security] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object AnonInclusionStates {
  @scala.inline
  def apply(
    end: Int | Double = null,
    inclusionStates: js.UndefOr[Boolean] = js.undefined,
    security: Security = null,
    start: Int | Double = null
  ): AnonInclusionStates = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusionStates)) __obj.updateDynamic("inclusionStates")(inclusionStates.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInclusionStates]
  }
}

