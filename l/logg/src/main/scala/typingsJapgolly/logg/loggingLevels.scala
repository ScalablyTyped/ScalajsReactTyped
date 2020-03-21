package typingsJapgolly.logg

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait loggingLevels extends js.Object {
  var FINE: Double
  var FINER: Double
  var FINEST: Double
  var INFO: Double
  var SEVERE: Double
  var WARN: Double
  def toString(level: Double): String
}

object loggingLevels {
  @scala.inline
  def apply(
    FINE: Double,
    FINER: Double,
    FINEST: Double,
    INFO: Double,
    SEVERE: Double,
    WARN: Double,
    toString: Double => CallbackTo[String]
  ): loggingLevels = {
    val __obj = js.Dynamic.literal(FINE = FINE.asInstanceOf[js.Any], FINER = FINER.asInstanceOf[js.Any], FINEST = FINEST.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SEVERE = SEVERE.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any])
    __obj.updateDynamic("toString")(js.Any.fromFunction1((t0: scala.Double) => toString(t0).runNow()))
    __obj.asInstanceOf[loggingLevels]
  }
}

