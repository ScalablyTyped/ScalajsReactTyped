package typingsJapgolly.sarif.mod.Suppression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.sarif.sarifStrings.accepted
  - typingsJapgolly.sarif.sarifStrings.underReview
  - typingsJapgolly.sarif.sarifStrings.rejected
*/
trait state extends js.Object

object state {
  @scala.inline
  def accepted: typingsJapgolly.sarif.sarifStrings.accepted = this.cast("accepted")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def rejected: typingsJapgolly.sarif.sarifStrings.rejected = this.cast("rejected")
  @scala.inline
  def underReview: typingsJapgolly.sarif.sarifStrings.underReview = this.cast("underReview")
}

