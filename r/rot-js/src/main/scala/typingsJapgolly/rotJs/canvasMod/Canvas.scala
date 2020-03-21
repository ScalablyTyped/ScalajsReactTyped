package typingsJapgolly.rotJs.canvasMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rotJs.backendMod.Backend
import typingsJapgolly.rotJs.typesMod.DisplayData
import typingsJapgolly.rotJs.typesMod.DisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends Backend {
  var _ctx: CanvasRenderingContext2D
  def _normalizedEventToPosition(x: Double, y: Double): js.Tuple2[Double, Double]
  def _updateSize(): Unit
}

object Canvas {
  @scala.inline
  def apply(
    _ctx: CanvasRenderingContext2D,
    _normalizedEventToPosition: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    _options: DisplayOptions,
    _updateSize: Callback,
    clear: Callback,
    computeFontSize: (Double, Double) => CallbackTo[Double],
    computeSize: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    draw: (DisplayData, Boolean) => Callback,
    eventToPosition: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    getContainer: CallbackTo[HTMLElement | Null],
    schedule: js.Function0[Unit] => Callback,
    setOptions: DisplayOptions => Callback
  ): Canvas = {
    val __obj = js.Dynamic.literal(_ctx = _ctx.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any])
    __obj.updateDynamic("_normalizedEventToPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => _normalizedEventToPosition(t0, t1).runNow()))
    __obj.updateDynamic("_updateSize")(_updateSize.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("computeFontSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => computeFontSize(t0, t1).runNow()))
    __obj.updateDynamic("computeSize")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => computeSize(t0, t1).runNow()))
    __obj.updateDynamic("draw")(js.Any.fromFunction2((t0: typingsJapgolly.rotJs.typesMod.DisplayData, t1: scala.Boolean) => draw(t0, t1).runNow()))
    __obj.updateDynamic("eventToPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => eventToPosition(t0, t1).runNow()))
    __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    __obj.updateDynamic("schedule")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => schedule(t0).runNow()))
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.rotJs.typesMod.DisplayOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[Canvas]
  }
}

