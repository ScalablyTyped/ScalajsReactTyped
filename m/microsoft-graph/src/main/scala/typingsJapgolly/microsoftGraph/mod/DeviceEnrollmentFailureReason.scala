package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.authentication
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.authorization
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.accountValidation
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userValidation
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceNotSupported
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.inMaintenance
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.badRequest
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.featureNotSupported
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.enrollmentRestrictionsEnforced
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.clientDisconnected
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.userAbandonment
*/
trait DeviceEnrollmentFailureReason extends js.Object

object DeviceEnrollmentFailureReason {
  @scala.inline
  def accountValidation: typingsJapgolly.microsoftGraph.microsoftGraphStrings.accountValidation = this.cast("accountValidation")
  @scala.inline
  def authentication: typingsJapgolly.microsoftGraph.microsoftGraphStrings.authentication = this.cast("authentication")
  @scala.inline
  def authorization: typingsJapgolly.microsoftGraph.microsoftGraphStrings.authorization = this.cast("authorization")
  @scala.inline
  def badRequest: typingsJapgolly.microsoftGraph.microsoftGraphStrings.badRequest = this.cast("badRequest")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clientDisconnected: typingsJapgolly.microsoftGraph.microsoftGraphStrings.clientDisconnected = this.cast("clientDisconnected")
  @scala.inline
  def deviceNotSupported: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceNotSupported = this.cast("deviceNotSupported")
  @scala.inline
  def enrollmentRestrictionsEnforced: typingsJapgolly.microsoftGraph.microsoftGraphStrings.enrollmentRestrictionsEnforced = this.cast("enrollmentRestrictionsEnforced")
  @scala.inline
  def featureNotSupported: typingsJapgolly.microsoftGraph.microsoftGraphStrings.featureNotSupported = this.cast("featureNotSupported")
  @scala.inline
  def inMaintenance: typingsJapgolly.microsoftGraph.microsoftGraphStrings.inMaintenance = this.cast("inMaintenance")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def userAbandonment: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userAbandonment = this.cast("userAbandonment")
  @scala.inline
  def userValidation: typingsJapgolly.microsoftGraph.microsoftGraphStrings.userValidation = this.cast("userValidation")
}

