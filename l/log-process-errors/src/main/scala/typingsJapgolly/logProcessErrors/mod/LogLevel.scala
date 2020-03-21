package typingsJapgolly.logProcessErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Log level
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.debug
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.info
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.warn
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.error
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.silent
  - typingsJapgolly.logProcessErrors.logProcessErrorsStrings.default
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.debug = this.cast("debug")
  @scala.inline
  def default: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.default = this.cast("default")
  @scala.inline
  def error: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.error = this.cast("error")
  @scala.inline
  def info: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.info = this.cast("info")
  @scala.inline
  def silent: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.silent = this.cast("silent")
  @scala.inline
  def warn: typingsJapgolly.logProcessErrors.logProcessErrorsStrings.warn = this.cast("warn")
}

