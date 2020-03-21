package typingsJapgolly.ionicCliFramework.loggerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerHandler extends js.Object {
  var formatter: js.UndefOr[LoggerFormatter] = js.undefined
  def handle(record: LogRecord): Unit
}

object LoggerHandler {
  @scala.inline
  def apply(handle: LogRecord => Callback, formatter: /* record */ LogRecord => CallbackTo[String] = null): LoggerHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(js.Any.fromFunction1((t0: typingsJapgolly.ionicCliFramework.loggerMod.LogRecord) => handle(t0).runNow()))
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* record */ typingsJapgolly.ionicCliFramework.loggerMod.LogRecord) => formatter(t0).runNow()))
    __obj.asInstanceOf[LoggerHandler]
  }
}

