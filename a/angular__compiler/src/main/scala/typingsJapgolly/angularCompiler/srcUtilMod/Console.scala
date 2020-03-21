package typingsJapgolly.angularCompiler.srcUtilMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Console extends js.Object {
  def log(message: String): Unit
  def warn(message: String): Unit
}

object Console {
  @scala.inline
  def apply(log: String => Callback, warn: String => Callback): Console = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.asInstanceOf[Console]
  }
}

