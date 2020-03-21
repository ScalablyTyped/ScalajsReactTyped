package typingsJapgolly.logger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.logger.loggerStrings.fatal
  - typingsJapgolly.logger.loggerStrings.error
  - typingsJapgolly.logger.loggerStrings.warn
  - typingsJapgolly.logger.loggerStrings.info
  - typingsJapgolly.logger.loggerStrings.debug
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.logger.loggerStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.logger.loggerStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.logger.loggerStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.logger.loggerStrings.info = this.cast("info")
  @scala.inline
  def warn: typingsJapgolly.logger.loggerStrings.warn = this.cast("warn")
}

