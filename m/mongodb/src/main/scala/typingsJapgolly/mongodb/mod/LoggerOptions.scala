package typingsJapgolly.mongodb.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerOptions extends js.Object {
  /**
    * Override default global log level.
    */
  var logger: js.UndefOr[log] = js.undefined
  /**
    * Custom logger function
    */
  var loggerLevel: js.UndefOr[String] = js.undefined
}

object LoggerOptions {
  @scala.inline
  def apply(
    logger: (/* message */ js.UndefOr[String], /* state */ js.UndefOr[LoggerState]) => Callback = null,
    loggerLevel: String = null
  ): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    if (logger != null) __obj.updateDynamic("logger")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[java.lang.String], t1: /* state */ js.UndefOr[typingsJapgolly.mongodb.mod.LoggerState]) => logger(t0, t1).runNow()))
    if (loggerLevel != null) __obj.updateDynamic("loggerLevel")(loggerLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggerOptions]
  }
}

