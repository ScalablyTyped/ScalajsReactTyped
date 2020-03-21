package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notRegistered
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.registered
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.revoked
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.keyConflict
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.approvalPending
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.certificateReset
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notRegisteredPendingEnrollment
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
*/
trait DeviceRegistrationState extends js.Object

object DeviceRegistrationState {
  @scala.inline
  def approvalPending: typingsJapgolly.microsoftGraph.microsoftGraphStrings.approvalPending = this.cast("approvalPending")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def certificateReset: typingsJapgolly.microsoftGraph.microsoftGraphStrings.certificateReset = this.cast("certificateReset")
  @scala.inline
  def keyConflict: typingsJapgolly.microsoftGraph.microsoftGraphStrings.keyConflict = this.cast("keyConflict")
  @scala.inline
  def notRegistered: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notRegistered = this.cast("notRegistered")
  @scala.inline
  def notRegisteredPendingEnrollment: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notRegisteredPendingEnrollment = this.cast("notRegisteredPendingEnrollment")
  @scala.inline
  def registered: typingsJapgolly.microsoftGraph.microsoftGraphStrings.registered = this.cast("registered")
  @scala.inline
  def revoked: typingsJapgolly.microsoftGraph.microsoftGraphStrings.revoked = this.cast("revoked")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

