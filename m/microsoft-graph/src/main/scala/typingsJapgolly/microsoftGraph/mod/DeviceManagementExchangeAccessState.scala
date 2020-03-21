package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowed
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.quarantined
*/
trait DeviceManagementExchangeAccessState extends js.Object

object DeviceManagementExchangeAccessState {
  @scala.inline
  def allowed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowed = this.cast("allowed")
  @scala.inline
  def blocked: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: none_ = this.cast("none")
  @scala.inline
  def quarantined: typingsJapgolly.microsoftGraph.microsoftGraphStrings.quarantined = this.cast("quarantined")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

