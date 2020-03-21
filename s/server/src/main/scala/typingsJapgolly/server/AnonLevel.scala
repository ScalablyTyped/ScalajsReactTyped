package typingsJapgolly.server

import japgolly.scalajs.react.Callback
import typingsJapgolly.server.commonMod.LogLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLevel extends js.Object {
  var level: LogLevel
  def report(content: String, `type`: LogLevel): Unit
}

object AnonLevel {
  @scala.inline
  def apply(level: LogLevel, report: (String, LogLevel) => Callback): AnonLevel = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("report")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.server.commonMod.LogLevel) => report(t0, t1).runNow()))
    __obj.asInstanceOf[AnonLevel]
  }
}

