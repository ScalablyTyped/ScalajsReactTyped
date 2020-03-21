package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogManager extends js.Object {
  /** [LogManager.debug()](LogManager.debug.md)
    *
    * 写 debug 日志 */
  def debug(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: js.Any*): Unit
  /** [LogManager.info()](LogManager.info.md)
    *
    * 写 info 日志 */
  def info(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: js.Any*): Unit
  /** [LogManager.log()](LogManager.log.md)
    *
    * 写 log 日志 */
  def log(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: js.Any*): Unit
  /** [LogManager.warn()](LogManager.warn.md)
    *
    * 写 warn 日志 */
  def warn(/** 日志内容，可以有任意多个。每次调用的参数的总大小不超过100Kb */
  args: js.Any*): Unit
}

object LogManager {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback,
    info: /* repeated */ js.Any => Callback,
    log: /* repeated */ js.Any => Callback,
    warn: /* repeated */ js.Any => Callback
  ): LogManager = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[LogManager]
  }
}

