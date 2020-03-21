package typingsJapgolly.d3pie.d3pie

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ID3PieChart extends js.Object {
  def closeSegment(index: Unit): Unit
  def destroy(): Unit
  def getOpenSegment(): js.Any
  def openSegment(index: Double): Unit
  def redraw(): Unit
  def updateProp(propKey: String, value: js.Any): Unit
}

object ID3PieChart {
  @scala.inline
  def apply(
    closeSegment: Unit => Callback,
    destroy: Callback,
    getOpenSegment: CallbackTo[js.Any],
    openSegment: Double => Callback,
    redraw: Callback,
    updateProp: (String, js.Any) => Callback
  ): ID3PieChart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("closeSegment")(js.Any.fromFunction1((t0: scala.Unit) => closeSegment(t0).runNow()))
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("getOpenSegment")(getOpenSegment.toJsFn)
    __obj.updateDynamic("openSegment")(js.Any.fromFunction1((t0: scala.Double) => openSegment(t0).runNow()))
    __obj.updateDynamic("redraw")(redraw.toJsFn)
    __obj.updateDynamic("updateProp")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => updateProp(t0, t1).runNow()))
    __obj.asInstanceOf[ID3PieChart]
  }
}

