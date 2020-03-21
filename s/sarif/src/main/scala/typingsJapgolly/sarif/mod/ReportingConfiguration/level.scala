package typingsJapgolly.sarif.mod.ReportingConfiguration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sarif.sarifStrings.none
  - typingsJapgolly.sarif.sarifStrings.note
  - typingsJapgolly.sarif.sarifStrings.warning
  - typingsJapgolly.sarif.sarifStrings.error
*/
trait level extends js.Object

object level {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.sarif.sarifStrings.error = this.cast("error")
  @scala.inline
  def none: typingsJapgolly.sarif.sarifStrings.none = this.cast("none")
  @scala.inline
  def note: typingsJapgolly.sarif.sarifStrings.note = this.cast("note")
  @scala.inline
  def warning: typingsJapgolly.sarif.sarifStrings.warning = this.cast("warning")
}

