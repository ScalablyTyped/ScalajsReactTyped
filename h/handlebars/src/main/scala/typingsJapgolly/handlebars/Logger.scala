package typingsJapgolly.handlebars

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var DEBUG: Double
  var ERROR: Double
  var INFO: Double
  var WARN: Double
  var level: Double
  var methodMap: NumberDictionary[String]
  def log(level: Double, obj: String): Unit
}

object Logger {
  @scala.inline
  def apply(
    DEBUG: Double,
    ERROR: Double,
    INFO: Double,
    WARN: Double,
    level: Double,
    log: (Double, String) => Callback,
    methodMap: NumberDictionary[String]
  ): Logger = {
    val __obj = js.Dynamic.literal(DEBUG = DEBUG.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], WARN = WARN.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], methodMap = methodMap.asInstanceOf[js.Any])
    __obj.updateDynamic("log")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => log(t0, t1).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

