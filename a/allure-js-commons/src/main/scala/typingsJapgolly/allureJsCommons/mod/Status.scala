package typingsJapgolly.allureJsCommons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.allureJsCommons.allureJsCommonsStrings.passed
  - typingsJapgolly.allureJsCommons.allureJsCommonsStrings.pending
  - typingsJapgolly.allureJsCommons.allureJsCommonsStrings.skipped
  - typingsJapgolly.allureJsCommons.allureJsCommonsStrings.failed
  - typingsJapgolly.allureJsCommons.allureJsCommonsStrings.broken
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def broken: typingsJapgolly.allureJsCommons.allureJsCommonsStrings.broken = this.cast("broken")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def failed: typingsJapgolly.allureJsCommons.allureJsCommonsStrings.failed = this.cast("failed")
  @scala.inline
  def passed: typingsJapgolly.allureJsCommons.allureJsCommonsStrings.passed = this.cast("passed")
  @scala.inline
  def pending: typingsJapgolly.allureJsCommons.allureJsCommonsStrings.pending = this.cast("pending")
  @scala.inline
  def skipped: typingsJapgolly.allureJsCommons.allureJsCommonsStrings.skipped = this.cast("skipped")
}

