package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.pending
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.canceled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.active
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.done
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notSupported
*/
trait ActionState extends js.Object

object ActionState {
  @scala.inline
  def active: typingsJapgolly.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  def canceled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.canceled = this.cast("canceled")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def done: typingsJapgolly.microsoftGraph.microsoftGraphStrings.done = this.cast("done")
  @scala.inline
  def failed: failed_ = this.cast("failed")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notSupported: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notSupported = this.cast("notSupported")
  @scala.inline
  def pending: typingsJapgolly.microsoftGraph.microsoftGraphStrings.pending = this.cast("pending")
}

