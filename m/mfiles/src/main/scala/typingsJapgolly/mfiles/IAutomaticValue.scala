package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAutomaticValue extends js.Object {
  var ANSIncrement: Double
  var ANVCode: String
  var CVSExpression: String
  var CVVCode: String
  var CalculationOrderNumber: Double
  def Clone(): IAutomaticValue
}

object IAutomaticValue {
  @scala.inline
  def apply(
    ANSIncrement: Double,
    ANVCode: String,
    CVSExpression: String,
    CVVCode: String,
    CalculationOrderNumber: Double,
    Clone: CallbackTo[IAutomaticValue]
  ): IAutomaticValue = {
    val __obj = js.Dynamic.literal(ANSIncrement = ANSIncrement.asInstanceOf[js.Any], ANVCode = ANVCode.asInstanceOf[js.Any], CVSExpression = CVSExpression.asInstanceOf[js.Any], CVVCode = CVVCode.asInstanceOf[js.Any], CalculationOrderNumber = CalculationOrderNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IAutomaticValue]
  }
}

