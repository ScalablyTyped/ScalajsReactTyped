package typingsJapgolly.consoleLogLevel.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.trace
  - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.debug
  - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.info
  - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.warn
  - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.error
  - typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.fatal
*/
trait LogLevelNames extends js.Object

object LogLevelNames {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsJapgolly.consoleLogLevel.consoleLogLevelStrings.warn = this.cast("warn")
}

