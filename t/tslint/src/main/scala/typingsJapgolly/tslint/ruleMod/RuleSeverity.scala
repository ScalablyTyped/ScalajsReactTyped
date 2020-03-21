package typingsJapgolly.tslint.ruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.tslint.tslintStrings.warning
  - typingsJapgolly.tslint.tslintStrings.error
  - typingsJapgolly.tslint.tslintStrings.off
*/
trait RuleSeverity extends js.Object

object RuleSeverity {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.tslint.tslintStrings.error = this.cast("error")
  @scala.inline
  def off: typingsJapgolly.tslint.tslintStrings.off = this.cast("off")
  @scala.inline
  def warning: typingsJapgolly.tslint.tslintStrings.warning = this.cast("warning")
}

