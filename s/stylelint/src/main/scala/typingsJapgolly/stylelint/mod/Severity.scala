package typingsJapgolly.stylelint.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stylelint.stylelintStrings.warning
  - typingsJapgolly.stylelint.stylelintStrings.error
*/
trait Severity extends js.Object

object Severity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.stylelint.stylelintStrings.error = this.cast("error")
  @scala.inline
  def warning: typingsJapgolly.stylelint.stylelintStrings.warning = this.cast("warning")
}

