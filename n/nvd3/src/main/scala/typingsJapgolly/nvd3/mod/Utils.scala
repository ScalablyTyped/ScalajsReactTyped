package typingsJapgolly.nvd3.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  var symbolMap: SymbolMap
  /* Default color chooser uses a color scale of 20 colors from D3  https://github.com/mbostock/d3/wiki/Ordinal-Scales#categorical-colors */
  def defaultColor(): js.Array[String]
  def getColor(arg: js.Any): js.Array[String]
  def state(): State
  /* Binds callback function to run when window is resized */
  def windowResize(listener: js.Function1[/* ev */ Event_, _]): Unit
  /* Gets the browser window size */
  def windowSize(): Size
}

object Utils {
  @scala.inline
  def apply(
    defaultColor: CallbackTo[js.Array[String]],
    getColor: js.Any => CallbackTo[js.Array[String]],
    state: CallbackTo[State],
    symbolMap: SymbolMap,
    windowResize: js.Function1[/* ev */ Event_, js.Any] => Callback,
    windowSize: CallbackTo[Size]
  ): Utils = {
    val __obj = js.Dynamic.literal(symbolMap = symbolMap.asInstanceOf[js.Any])
    __obj.updateDynamic("defaultColor")(defaultColor.toJsFn)
    __obj.updateDynamic("getColor")(js.Any.fromFunction1((t0: js.Any) => getColor(t0).runNow()))
    __obj.updateDynamic("state")(state.toJsFn)
    __obj.updateDynamic("windowResize")(js.Any.fromFunction1((t0: js.Function1[/* ev */ typingsJapgolly.std.Event_, js.Any]) => windowResize(t0).runNow()))
    __obj.updateDynamic("windowSize")(windowSize.toJsFn)
    __obj.asInstanceOf[Utils]
  }
}

