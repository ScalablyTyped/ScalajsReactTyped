package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unavailable
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.enabled
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.terminated
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.rejected
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unresponsive
*/
trait DeviceManagementPartnerTenantState extends js.Object

object DeviceManagementPartnerTenantState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def enabled: typingsJapgolly.microsoftGraph.microsoftGraphStrings.enabled = this.cast("enabled")
  @scala.inline
  def rejected: typingsJapgolly.microsoftGraph.microsoftGraphStrings.rejected = this.cast("rejected")
  @scala.inline
  def terminated: typingsJapgolly.microsoftGraph.microsoftGraphStrings.terminated = this.cast("terminated")
  @scala.inline
  def unavailable: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unavailable = this.cast("unavailable")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
  @scala.inline
  def unresponsive: typingsJapgolly.microsoftGraph.microsoftGraphStrings.unresponsive = this.cast("unresponsive")
}

