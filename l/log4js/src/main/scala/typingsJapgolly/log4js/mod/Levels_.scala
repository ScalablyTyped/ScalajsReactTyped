package typingsJapgolly.log4js.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Levels_ extends js.Object {
  var ALL: Level
  var DEBUG: Level
  var ERROR: Level
  var FATAL: Level
  var INFO: Level
  var MARK: Level
  var OFF: Level
  var TRACE: Level
  var WARN: Level
  var levels: js.Array[Level]
  def addLevels(customLevels: js.Object): Unit
  def getLevel(level: String): Level
}

object Levels_ {
  @scala.inline
  def apply(
    ALL: Level,
    DEBUG: Level,
    ERROR: Level,
    FATAL: Level,
    INFO: Level,
    MARK: Level,
    OFF: Level,
    TRACE: Level,
    WARN: Level,
    addLevels: js.Object => Callback,
    getLevel: String => CallbackTo[Level],
    levels: js.Array[Level]
  ): Levels_ = {
    val __obj = js.Dynamic.literal(ALL = ALL.asInstanceOf[js.Any], DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], FATAL = FATAL.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], MARK = MARK.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any], TRACE = TRACE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.updateDynamic("addLevels")(js.Any.fromFunction1((t0: js.Object) => addLevels(t0).runNow()))
    __obj.updateDynamic("getLevel")(js.Any.fromFunction1((t0: java.lang.String) => getLevel(t0).runNow()))
    __obj.asInstanceOf[Levels_]
  }
}

