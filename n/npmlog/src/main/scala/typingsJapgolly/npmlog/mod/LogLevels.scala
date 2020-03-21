package typingsJapgolly.npmlog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.npmlog.npmlogStrings.silly
  - typingsJapgolly.npmlog.npmlogStrings.verbose
  - typingsJapgolly.npmlog.npmlogStrings.info
  - typingsJapgolly.npmlog.npmlogStrings.timing
  - typingsJapgolly.npmlog.npmlogStrings.http
  - typingsJapgolly.npmlog.npmlogStrings.notice
  - typingsJapgolly.npmlog.npmlogStrings.warn
  - typingsJapgolly.npmlog.npmlogStrings.error
  - typingsJapgolly.npmlog.npmlogStrings.silent
*/
trait LogLevels extends js.Object

object LogLevels {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.npmlog.npmlogStrings.error = this.cast("error")
  @scala.inline
  def http: typingsJapgolly.npmlog.npmlogStrings.http = this.cast("http")
  @scala.inline
  def info: typingsJapgolly.npmlog.npmlogStrings.info = this.cast("info")
  @scala.inline
  def notice: typingsJapgolly.npmlog.npmlogStrings.notice = this.cast("notice")
  @scala.inline
  def silent: typingsJapgolly.npmlog.npmlogStrings.silent = this.cast("silent")
  @scala.inline
  def silly: typingsJapgolly.npmlog.npmlogStrings.silly = this.cast("silly")
  @scala.inline
  def timing: typingsJapgolly.npmlog.npmlogStrings.timing = this.cast("timing")
  @scala.inline
  def verbose: typingsJapgolly.npmlog.npmlogStrings.verbose = this.cast("verbose")
  @scala.inline
  def warn: typingsJapgolly.npmlog.npmlogStrings.warn = this.cast("warn")
}

