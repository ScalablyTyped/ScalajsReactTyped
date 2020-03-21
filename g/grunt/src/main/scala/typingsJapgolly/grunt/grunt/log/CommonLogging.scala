package typingsJapgolly.grunt.grunt.log

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Grunt output should look consistent, and maybe even pretty.
  * As such, there is a plethora of logging methods, and a few useful patterns.
  * All of the methods that actually log something are chainable.
  */
trait CommonLogging[T] extends js.Object {
  /**
    * If msg string is omitted, logs ERROR in red,
    * otherwise logs >> msg, with trailing newline.
    */
  def error(msg: String): T
  /**
    * Log an error with grunt.log.error, wrapping text to 80 columns using grunt.log.wraptext.
    */
  def errorlns(msg: String): T
  /**
    * If msg string is omitted, logs OK in green, otherwise logs >> msg, with trailing newline.
    */
  def ok(msg: String): T
  /**
    * Log an ok message with grunt.log.ok, wrapping text to 80 columns using grunt.log.wraptext.
    */
  def oklns(msg: String): T
  /**
    * Log the specified msg string in bold, with trailing newline.
    */
  def subhead(msg: String): T
  /**
    * Log an warning with grunt.log.warn
    */
  def warn(msg: String): T
  /**
    * Log the specified msg string, with no trailing newline.
    */
  def write(msg: String): T
  /**
    * Log a list of obj properties (good for debugging flags).
    */
  def writeflags(obj: js.Any): T
  /**
    * Log the specified msg string, with trailing newline.
    */
  def writeln(msg: String): T
}

object CommonLogging {
  @scala.inline
  def apply[T](
    error: String => CallbackTo[T],
    errorlns: String => CallbackTo[T],
    ok: String => CallbackTo[T],
    oklns: String => CallbackTo[T],
    subhead: String => CallbackTo[T],
    warn: String => CallbackTo[T],
    write: String => CallbackTo[T],
    writeflags: js.Any => CallbackTo[T],
    writeln: String => CallbackTo[T]
  ): CommonLogging[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: java.lang.String) => error(t0).runNow()))
    __obj.updateDynamic("errorlns")(js.Any.fromFunction1((t0: java.lang.String) => errorlns(t0).runNow()))
    __obj.updateDynamic("ok")(js.Any.fromFunction1((t0: java.lang.String) => ok(t0).runNow()))
    __obj.updateDynamic("oklns")(js.Any.fromFunction1((t0: java.lang.String) => oklns(t0).runNow()))
    __obj.updateDynamic("subhead")(js.Any.fromFunction1((t0: java.lang.String) => subhead(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: java.lang.String) => warn(t0).runNow()))
    __obj.updateDynamic("write")(js.Any.fromFunction1((t0: java.lang.String) => write(t0).runNow()))
    __obj.updateDynamic("writeflags")(js.Any.fromFunction1((t0: js.Any) => writeflags(t0).runNow()))
    __obj.updateDynamic("writeln")(js.Any.fromFunction1((t0: java.lang.String) => writeln(t0).runNow()))
    __obj.asInstanceOf[CommonLogging[T]]
  }
}

