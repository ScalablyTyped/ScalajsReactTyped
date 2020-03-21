package typingsJapgolly.adalAngular.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggingConfig extends js.Object {
  var level: LoggingLevel
  var piiLoggingEnabled: Boolean
  def log(message: String): Unit
}

object LoggingConfig {
  @scala.inline
  def apply(level: LoggingLevel, log: String => Callback, piiLoggingEnabled: Boolean): LoggingConfig = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], piiLoggingEnabled = piiLoggingEnabled.asInstanceOf[js.Any])
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.asInstanceOf[LoggingConfig]
  }
}

