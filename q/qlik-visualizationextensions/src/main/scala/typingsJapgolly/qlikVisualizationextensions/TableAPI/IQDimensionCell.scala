package typingsJapgolly.qlikVisualizationextensions.TableAPI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQDimensionCell extends IQMeasureCell {
  /**
    * Cell value index.
    */
  var qElemNumber: Double
  /**
    * Cell state.
    */
  var qState: String
  /**
    * Selects the value in this cell.
    */
  def select(): Unit
}

object IQDimensionCell {
  @scala.inline
  def apply(
    getPercent: CallbackTo[Double],
    getPercentOfMax: CallbackTo[Double],
    qElemNumber: Double,
    qState: String,
    qText: String,
    select: Callback,
    qNum: Int | Double = null
  ): IQDimensionCell = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.updateDynamic("getPercent")(getPercent.toJsFn)
    __obj.updateDynamic("getPercentOfMax")(getPercentOfMax.toJsFn)
    __obj.updateDynamic("select")(select.toJsFn)
    if (qNum != null) __obj.updateDynamic("qNum")(qNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQDimensionCell]
  }
}

