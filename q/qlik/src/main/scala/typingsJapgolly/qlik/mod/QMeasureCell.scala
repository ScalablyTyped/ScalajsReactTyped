package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QMeasureCell extends js.Object {
  var qNum: js.UndefOr[Double] = js.undefined
  var qText: String
  def getPercent(): Double
  def getPercentOfMax(): Double
}

object QMeasureCell {
  @scala.inline
  def apply(
    getPercent: CallbackTo[Double],
    getPercentOfMax: CallbackTo[Double],
    qText: String,
    qNum: Int | Double = null
  ): QMeasureCell = {
    val __obj = js.Dynamic.literal(qText = qText.asInstanceOf[js.Any])
    __obj.updateDynamic("getPercent")(getPercent.toJsFn)
    __obj.updateDynamic("getPercentOfMax")(getPercentOfMax.toJsFn)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[QMeasureCell]
  }
}

