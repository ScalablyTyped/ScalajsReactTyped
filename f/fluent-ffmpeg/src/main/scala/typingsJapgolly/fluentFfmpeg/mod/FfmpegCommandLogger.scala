package typingsJapgolly.fluentFfmpeg.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FfmpegCommandLogger extends js.Object {
  def debug(data: js.Any*): Unit
  def error(data: js.Any*): Unit
  def info(data: js.Any*): Unit
  def warn(data: js.Any*): Unit
}

object FfmpegCommandLogger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Callback,
    error: /* repeated */ js.Any => Callback,
    info: /* repeated */ js.Any => Callback,
    warn: /* repeated */ js.Any => Callback
  ): FfmpegCommandLogger = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => error(t0).runNow()))
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[FfmpegCommandLogger]
  }
}

