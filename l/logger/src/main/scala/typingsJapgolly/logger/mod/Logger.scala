package typingsJapgolly.logger.mod

import typingsJapgolly.logger.loggerBooleans.`false`
import typingsJapgolly.logger.loggerStrings.debug
import typingsJapgolly.logger.loggerStrings.error
import typingsJapgolly.logger.loggerStrings.fatal
import typingsJapgolly.logger.loggerStrings.info
import typingsJapgolly.logger.loggerStrings.warn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("logger", "Logger")
@js.native
class Logger () extends js.Object {
  def this(logFilePath: String) = this()
  @JSName("debug")
  var debug_Original: Args = js.native
  @JSName("error")
  var error_Original: Args = js.native
  @JSName("fatal")
  var fatal_Original: Args = js.native
  @JSName("info")
  var info_Original: Args = js.native
  @JSName("warn")
  var warn_Original: Args = js.native
  def debug(args: String*): String | `false` = js.native
  def error(args: String*): String | `false` = js.native
  def fatal(args: String*): String | `false` = js.native
  def format(level: LogLevel, data: String, message: String): String = js.native
  def info(args: String*): String | `false` = js.native
  def log(level: LogLevel, args: String*): String | `false` = js.native
  def setLevel(level: LogLevel): Double | `false` = js.native
  def warn(args: String*): String | `false` = js.native
}

@JSImport("logger", "Logger")
@js.native
object Logger extends js.Object {
  val levels: js.Tuple5[fatal, error, warn, info, debug] = js.native
}

