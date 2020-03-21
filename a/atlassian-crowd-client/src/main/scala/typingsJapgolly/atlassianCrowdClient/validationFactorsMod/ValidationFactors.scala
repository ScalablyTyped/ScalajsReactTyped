package typingsJapgolly.atlassianCrowdClient.validationFactorsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationFactors extends js.Object {
  val validationFactors: js.Any
  def toCrowd(): ValidationFactorsObj
}

object ValidationFactors {
  @scala.inline
  def apply(toCrowd: CallbackTo[ValidationFactorsObj], validationFactors: js.Any): ValidationFactors = {
    val __obj = js.Dynamic.literal(validationFactors = validationFactors.asInstanceOf[js.Any])
    __obj.updateDynamic("toCrowd")(toCrowd.toJsFn)
    __obj.asInstanceOf[ValidationFactors]
  }
}

