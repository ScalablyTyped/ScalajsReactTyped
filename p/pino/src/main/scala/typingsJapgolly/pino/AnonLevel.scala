package typingsJapgolly.pino

import japgolly.scalajs.react.Callback
import typingsJapgolly.pino.mod.Level
import typingsJapgolly.pino.mod.LogEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  /**
    * Specifies the minimum level (inclusive) of when the `send` function should be called, if not supplied
    * the `send` function will be called based on the main logging `level` (set via `options.level`,
    * defaulting to `info`).
    */
  var level: js.UndefOr[Level | String] = js.undefined
  /**
    * Remotely record log messages.
    *
    * @description Called after writing the log message.
    */
  def send(level: Level, logEvent: LogEvent): Unit
}

object AnonLevel {
  @scala.inline
  def apply(send: (Level, LogEvent) => Callback, level: Level | String = null): AnonLevel = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.pino.mod.Level, t1: typingsJapgolly.pino.mod.LogEvent) => send(t0, t1).runNow()))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLevel]
  }
}

