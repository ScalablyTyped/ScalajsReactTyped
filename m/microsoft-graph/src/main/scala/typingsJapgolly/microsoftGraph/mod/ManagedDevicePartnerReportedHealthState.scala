package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.activated
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deactivated
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.secured
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.lowSeverity
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.mediumSeverity
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.highSeverity
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unresponsive
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.compromised
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.misconfigured
*/
trait ManagedDevicePartnerReportedHealthState extends js.Object

object ManagedDevicePartnerReportedHealthState {
  @scala.inline
  def activated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.activated = this.cast("activated")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def compromised: typingsJapgolly.microsoftGraph.microsoftGraphStrings.compromised = this.cast("compromised")
  @scala.inline
  def deactivated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deactivated = this.cast("deactivated")
  @scala.inline
  def highSeverity: typingsJapgolly.microsoftGraph.microsoftGraphStrings.highSeverity = this.cast("highSeverity")
  @scala.inline
  def lowSeverity: typingsJapgolly.microsoftGraph.microsoftGraphStrings.lowSeverity = this.cast("lowSeverity")
  @scala.inline
  def mediumSeverity: typingsJapgolly.microsoftGraph.microsoftGraphStrings.mediumSeverity = this.cast("mediumSeverity")
  @scala.inline
  def misconfigured: typingsJapgolly.microsoftGraph.microsoftGraphStrings.misconfigured = this.cast("misconfigured")
  @scala.inline
  def secured: typingsJapgolly.microsoftGraph.microsoftGraphStrings.secured = this.cast("secured")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unresponsive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unresponsive = this.cast("unresponsive")
}

