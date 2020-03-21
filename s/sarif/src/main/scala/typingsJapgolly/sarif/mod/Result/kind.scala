package typingsJapgolly.sarif.mod.Result

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sarif.sarifStrings.notApplicable
  - typingsJapgolly.sarif.sarifStrings.pass
  - typingsJapgolly.sarif.sarifStrings.fail
  - typingsJapgolly.sarif.sarifStrings.review
  - typingsJapgolly.sarif.sarifStrings.open
  - typingsJapgolly.sarif.sarifStrings.informational
*/
trait kind extends js.Object

object kind {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fail: typingsJapgolly.sarif.sarifStrings.fail = this.cast("fail")
  @scala.inline
  def informational: typingsJapgolly.sarif.sarifStrings.informational = this.cast("informational")
  @scala.inline
  def notApplicable: typingsJapgolly.sarif.sarifStrings.notApplicable = this.cast("notApplicable")
  @scala.inline
  def open: typingsJapgolly.sarif.sarifStrings.open = this.cast("open")
  @scala.inline
  def pass: typingsJapgolly.sarif.sarifStrings.pass = this.cast("pass")
  @scala.inline
  def review: typingsJapgolly.sarif.sarifStrings.review = this.cast("review")
}

