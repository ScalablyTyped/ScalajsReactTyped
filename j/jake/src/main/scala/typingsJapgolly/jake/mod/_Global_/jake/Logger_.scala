package typingsJapgolly.jake.mod._Global_.jake

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

////////////////////////////////////////////////////////////////////////////////////////////////////////////
// Logging and output ////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
trait Logger_ extends js.Object {
  def error(value: js.Any): Unit
  def log(value: js.Any): Unit
}

object Logger_ {
  @scala.inline
  def apply(error: js.Any => Callback, log: js.Any => Callback): Logger_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: js.Any) => log(t0).runNow()))
    __obj.asInstanceOf[Logger_]
  }
}

