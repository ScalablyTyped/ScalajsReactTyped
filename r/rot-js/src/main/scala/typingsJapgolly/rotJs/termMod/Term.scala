package typingsJapgolly.rotJs.termMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rotJs.backendMod.Backend
import typingsJapgolly.rotJs.typesMod.DisplayData
import typingsJapgolly.rotJs.typesMod.DisplayOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Term extends Backend {
  var _cursor: js.Tuple2[Double, Double]
  var _lastColor: String
  var _offset: js.Tuple2[Double, Double]
  def computeFontSize(): Double
  def computeSize(): js.Tuple2[Double, Double]
}

object Term {
  @scala.inline
  def apply(
    _cursor: js.Tuple2[Double, Double],
    _lastColor: String,
    _offset: js.Tuple2[Double, Double],
    _options: DisplayOptions,
    clear: Callback,
    computeFontSize: CallbackTo[Double],
    computeSize: CallbackTo[js.Tuple2[Double, Double]],
    draw: (DisplayData, Boolean) => Callback,
    eventToPosition: (Double, Double) => CallbackTo[js.Tuple2[Double, Double]],
    getContainer: CallbackTo[HTMLElement | Null],
    schedule: js.Function0[Unit] => Callback,
    setOptions: DisplayOptions => Callback
  ): Term = {
    val __obj = js.Dynamic.literal(_cursor = _cursor.asInstanceOf[js.Any], _lastColor = _lastColor.asInstanceOf[js.Any], _offset = _offset.asInstanceOf[js.Any], _options = _options.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("computeFontSize")(computeFontSize.toJsFn)
    __obj.updateDynamic("computeSize")(computeSize.toJsFn)
    __obj.updateDynamic("draw")(js.Any.fromFunction2((t0: typingsJapgolly.rotJs.typesMod.DisplayData, t1: scala.Boolean) => draw(t0, t1).runNow()))
    __obj.updateDynamic("eventToPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => eventToPosition(t0, t1).runNow()))
    __obj.updateDynamic("getContainer")(getContainer.toJsFn)
    __obj.updateDynamic("schedule")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => schedule(t0).runNow()))
    __obj.updateDynamic("setOptions")(js.Any.fromFunction1((t0: typingsJapgolly.rotJs.typesMod.DisplayOptions) => setOptions(t0).runNow()))
    __obj.asInstanceOf[Term]
  }
}

