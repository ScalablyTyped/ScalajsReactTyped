package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.busy
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.forbidden
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue
*/
trait RejectReason extends js.Object

object RejectReason {
  @scala.inline
  def busy: typingsJapgolly.microsoftGraph.microsoftGraphStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def forbidden: typingsJapgolly.microsoftGraph.microsoftGraphStrings.forbidden = this.cast("forbidden")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def unknownFutureValue: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue = this.cast("unknownFutureValue")
}

