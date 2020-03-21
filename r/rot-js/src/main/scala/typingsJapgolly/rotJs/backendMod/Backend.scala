package typingsJapgolly.rotJs.backendMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rotJs.typesMod.DisplayData
import typingsJapgolly.rotJs.typesMod.DisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backend extends js.Object {
  var _options: DisplayOptions
  def clear(): Unit
  def computeFontSize(availWidth: Double, availHeight: Double): Double
  def computeSize(availWidth: Double, availHeight: Double): js.Tuple2[Double, Double]
  def draw(data: DisplayData, clearBefore: Boolean): Unit
  def eventToPosition(x: Double, y: Double): js.Tuple2[Double, Double]
  def getContainer(): HTMLElement | Null
  def schedule(cb: js.Function0[Unit]): Unit
  def setOptions(options: DisplayOptions): Unit
}

object Backend {
  @scala.inline
  def apply(
    _options: DisplayOptions,
    clear: Callback,
    computeFontSize: (Double, Double) => CallbackTo[Double],
    computeSize: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    draw: (DisplayData, Boolean) => Callback,
    eventToPosition: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    getContainer: CallbackTo[HTMLElement | Null],
    schedule: js.Function0[Unit] => Callback,
    setOptions: DisplayOptions => Callback
  ): Backend = {
    val __obj = js.Dynamic.literal(_options = _options.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("computeFontSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => computeFontSize(t0, t1).runNow()))
    __obj.updateDynamic("computeSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => computeSize(t0, t1).runNow()))
    __obj.updateDynamic("draw")(js.Any.fromFunction2((t0: typingsJapgolly.rotJs.typesMod.DisplayData, t1: scala.Boolean) => draw(t0, t1).runNow()))
    __obj.updateDynamic("eventToPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => eventToPosition(t0, t1).runNow()))
    __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    __obj.updateDynamic("schedule")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => schedule(t0).runNow()))
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.rotJs.typesMod.DisplayOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[Backend]
  }
}

