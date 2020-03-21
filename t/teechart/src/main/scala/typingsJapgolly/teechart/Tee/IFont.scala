package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFont extends js.Object {
  var baseLine: String
  var chart: IChart
  var fill: String
  var gradient: IGradient
  var shadow: IShadow
  var stroke: IStroke
  var style: String
  var textAlign: String
  def getSize(): Double
  def setSize(size: Double): Unit
}

object IFont {
  @scala.inline
  def apply(
    baseLine: String,
    chart: IChart,
    fill: String,
    getSize: CallbackTo[Double],
    gradient: IGradient,
    setSize: Double => Callback,
    shadow: IShadow,
    stroke: IStroke,
    style: String,
    textAlign: String
  ): IFont = {
    val __obj = js.Dynamic.literal(baseLine = baseLine.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], gradient = gradient.asInstanceOf[js.Any], shadow = shadow.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any])
    __obj.updateDynamic("getSize")(getSize.toJsFn)
    __obj.updateDynamic("setSize")(js.Any.fromFunction1((t0: scala.Double) => setSize(t0).runNow()))
    __obj.asInstanceOf[IFont]
  }
}

