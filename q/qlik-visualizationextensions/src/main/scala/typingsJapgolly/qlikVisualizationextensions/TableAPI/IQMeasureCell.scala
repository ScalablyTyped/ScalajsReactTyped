package typingsJapgolly.qlikVisualizationextensions.TableAPI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQMeasureCell extends js.Object {
  /**
    * Optional. Cell numeric value, if cell is numeric.
    */
  var qNum: js.UndefOr[Double] = js.undefined
  /**
    * Cell value formatted as set up in properties.
    */
  var qText: String
  /**
    * Gets the value of this cell as a percentage of the total.
    * Might be more than 100% if this is an average.
    */
  def getPercent(): Double
  /**
    * Gets the value of this cell as a percentage of the maximum.
    */
  def getPercentOfMax(): Double
}

object IQMeasureCell {
  @scala.inline
  def apply(
    getPercent: CallbackTo[Double],
    getPercentOfMax: CallbackTo[Double],
    qText: String,
    qNum: Int | Double = null
  ): IQMeasureCell = {
    val __obj = js.Dynamic.literal(qText = qText.asInstanceOf[js.Any])
    __obj.updateDynamic("getPercent")(getPercent.toJsFn)
    __obj.updateDynamic("getPercentOfMax")(getPercentOfMax.toJsFn)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQMeasureCell]
  }
}

