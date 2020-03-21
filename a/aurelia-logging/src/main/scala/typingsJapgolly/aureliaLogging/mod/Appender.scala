package typingsJapgolly.aureliaLogging.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Appender extends js.Object {
  /**
    * Appends a debug log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def debug(logger: Logger, rest: js.Any*): Unit
  /**
    * Appends an error log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def error(logger: Logger, rest: js.Any*): Unit
  /**
    * Appends an info log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def info(logger: Logger, rest: js.Any*): Unit
  /**
    * Appends a warning log.
    *
    * @param logger The source logger.
    * @param rest The data to log.
    */
  def warn(logger: Logger, rest: js.Any*): Unit
}

object Appender {
  @scala.inline
  def apply(
    debug: (Logger, /* repeated */ js.Any) => Callback,
    error: (Logger, /* repeated */ js.Any) => Callback,
    info: (Logger, /* repeated */ js.Any) => Callback,
    warn: (Logger, /* repeated */ js.Any) => Callback
  ): Appender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction2((t0: typingsJapgolly.aureliaLogging.mod.Logger, t1: /* repeated */ js.Any) => debug(t0, t1).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction2((t0: typingsJapgolly.aureliaLogging.mod.Logger, t1: /* repeated */ js.Any) => error(t0, t1).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction2((t0: typingsJapgolly.aureliaLogging.mod.Logger, t1: /* repeated */ js.Any) => info(t0, t1).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction2((t0: typingsJapgolly.aureliaLogging.mod.Logger, t1: /* repeated */ js.Any) => warn(t0, t1).runNow()))
    __obj.asInstanceOf[Appender]
  }
}

