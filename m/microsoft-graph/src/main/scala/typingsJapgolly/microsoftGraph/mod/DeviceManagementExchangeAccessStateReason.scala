package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeGlobalRule
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeIndividualRule
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeDeviceRule
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeUpgrade
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeMailboxPolicy
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.other
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.compliant
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notCompliant
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notEnrolled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownLocation
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.mfaRequired
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.azureADBlockDueToAccessPolicy
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.compromisedPassword
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceNotKnownWithManagedApp
*/
trait DeviceManagementExchangeAccessStateReason extends js.Object

object DeviceManagementExchangeAccessStateReason {
  @scala.inline
  def azureADBlockDueToAccessPolicy: typingsJapgolly.microsoftGraph.microsoftGraphStrings.azureADBlockDueToAccessPolicy = this.cast("azureADBlockDueToAccessPolicy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compliant: typingsJapgolly.microsoftGraph.microsoftGraphStrings.compliant = this.cast("compliant")
  @scala.inline
  def compromisedPassword: typingsJapgolly.microsoftGraph.microsoftGraphStrings.compromisedPassword = this.cast("compromisedPassword")
  @scala.inline
  def deviceNotKnownWithManagedApp: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deviceNotKnownWithManagedApp = this.cast("deviceNotKnownWithManagedApp")
  @scala.inline
  def exchangeDeviceRule: typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeDeviceRule = this.cast("exchangeDeviceRule")
  @scala.inline
  def exchangeGlobalRule: typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeGlobalRule = this.cast("exchangeGlobalRule")
  @scala.inline
  def exchangeIndividualRule: typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeIndividualRule = this.cast("exchangeIndividualRule")
  @scala.inline
  def exchangeMailboxPolicy: typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeMailboxPolicy = this.cast("exchangeMailboxPolicy")
  @scala.inline
  def exchangeUpgrade: typingsJapgolly.microsoftGraph.microsoftGraphStrings.exchangeUpgrade = this.cast("exchangeUpgrade")
  @scala.inline
  def mfaRequired: typingsJapgolly.microsoftGraph.microsoftGraphStrings.mfaRequired = this.cast("mfaRequired")
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def notCompliant: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notCompliant = this.cast("notCompliant")
  @scala.inline
  def notEnrolled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notEnrolled = this.cast("notEnrolled")
  @scala.inline
  def other: typingsJapgolly.microsoftGraph.microsoftGraphStrings.other = this.cast("other")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unknownLocation: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownLocation = this.cast("unknownLocation")
}

