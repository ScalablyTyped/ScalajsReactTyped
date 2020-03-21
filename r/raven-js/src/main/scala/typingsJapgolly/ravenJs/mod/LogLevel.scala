package typingsJapgolly.ravenJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Event/Breadcrumb Severity. `critical` is for Breadcrumbs only and `fatal` is for Events only. */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ravenJs.ravenJsStrings.critical
  - typingsJapgolly.ravenJs.ravenJsStrings.fatal
  - typingsJapgolly.ravenJs.ravenJsStrings.error
  - typingsJapgolly.ravenJs.ravenJsStrings.warning
  - typingsJapgolly.ravenJs.ravenJsStrings.info
  - typingsJapgolly.ravenJs.ravenJsStrings.debug
  - typingsJapgolly.ravenJs.ravenJsStrings.warn
  - typingsJapgolly.ravenJs.ravenJsStrings.log
*/
trait LogLevel extends js.Object

object LogLevel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def critical: typingsJapgolly.ravenJs.ravenJsStrings.critical = this.cast("critical")
  @scala.inline
  def debug: typingsJapgolly.ravenJs.ravenJsStrings.debug = this.cast("debug")
  @scala.inline
  def error: typingsJapgolly.ravenJs.ravenJsStrings.error = this.cast("error")
  @scala.inline
  def fatal: typingsJapgolly.ravenJs.ravenJsStrings.fatal = this.cast("fatal")
  @scala.inline
  def info: typingsJapgolly.ravenJs.ravenJsStrings.info = this.cast("info")
  @scala.inline
  def log: typingsJapgolly.ravenJs.ravenJsStrings.log = this.cast("log")
  @scala.inline
  def warn: typingsJapgolly.ravenJs.ravenJsStrings.warn = this.cast("warn")
  @scala.inline
  def warning: typingsJapgolly.ravenJs.ravenJsStrings.warning = this.cast("warning")
}

