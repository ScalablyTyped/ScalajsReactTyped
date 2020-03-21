package typingsJapgolly.bunyan.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.bunyan.bunyanStrings.trace
  - typingsJapgolly.bunyan.bunyanStrings.debug
  - typingsJapgolly.bunyan.bunyanStrings.info
  - typingsJapgolly.bunyan.bunyanStrings.warn
  - typingsJapgolly.bunyan.bunyanStrings.error
  - typingsJapgolly.bunyan.bunyanStrings.fatal
*/
trait LogLevelString extends js.Object

object LogLevelString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def debug: typingsJapgolly.bunyan.bunyanStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.bunyan.bunyanStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.bunyan.bunyanStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.bunyan.bunyanStrings.info = this.cast("info")
  @scala.inline
  def trace: typingsJapgolly.bunyan.bunyanStrings.trace = this.cast("trace")
  @scala.inline
  def warn: typingsJapgolly.bunyan.bunyanStrings.warn = this.cast("warn")
}

