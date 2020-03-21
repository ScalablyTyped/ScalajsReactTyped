package typingsJapgolly.karma.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config_ extends js.Object {
  var LOG_DEBUG: String
  var LOG_DISABLE: String
  var LOG_ERROR: String
  var LOG_INFO: String
  var LOG_WARN: String
  def set(config: ConfigOptions): Unit
}

object Config_ {
  @scala.inline
  def apply(
    LOG_DEBUG: String,
    LOG_DISABLE: String,
    LOG_ERROR: String,
    LOG_INFO: String,
    LOG_WARN: String,
    set: ConfigOptions => Callback
  ): Config_ = {
    val __obj = js.Dynamic.literal(LOG_DEBUG = LOG_DEBUG.asInstanceOf[js.Any], LOG_DISABLE = LOG_DISABLE.asInstanceOf[js.Any], LOG_ERROR = LOG_ERROR.asInstanceOf[js.Any], LOG_INFO = LOG_INFO.asInstanceOf[js.Any], LOG_WARN = LOG_WARN.asInstanceOf[js.Any])
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.karma.mod.ConfigOptions) => set(t0).runNow()))
    __obj.asInstanceOf[Config_]
  }
}

