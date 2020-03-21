package typingsJapgolly.agGrid.iLoggerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends js.Object {
  def log(message: String): Unit
}

object ILogger {
  @scala.inline
  def apply(log: String => Callback): ILogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.asInstanceOf[ILogger]
  }
}

