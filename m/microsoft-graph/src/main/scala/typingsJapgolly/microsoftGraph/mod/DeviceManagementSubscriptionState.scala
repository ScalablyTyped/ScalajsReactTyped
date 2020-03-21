package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.pending
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.active
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.warning
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deleted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.lockedOut
*/
trait DeviceManagementSubscriptionState extends js.Object

object DeviceManagementSubscriptionState {
  @scala.inline
  def active: typingsJapgolly.microsoftGraph.microsoftGraphStrings.active = this.cast("active")
  @scala.inline
  def blocked: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def deleted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deleted = this.cast("deleted")
  @scala.inline
  def disabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.disabled = this.cast("disabled")
  @scala.inline
  def lockedOut: typingsJapgolly.microsoftGraph.microsoftGraphStrings.lockedOut = this.cast("lockedOut")
  @scala.inline
  def pending: typingsJapgolly.microsoftGraph.microsoftGraphStrings.pending = this.cast("pending")
  @scala.inline
  def warning: typingsJapgolly.microsoftGraph.microsoftGraphStrings.warning = this.cast("warning")
}

