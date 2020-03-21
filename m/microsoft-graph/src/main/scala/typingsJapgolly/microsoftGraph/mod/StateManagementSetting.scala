package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notConfigured
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowed
*/
trait StateManagementSetting extends js.Object

object StateManagementSetting {
  @scala.inline
  def allowed: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allowed = this.cast("allowed")
  @scala.inline
  def blocked: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def notConfigured: typingsJapgolly.microsoftGraph.microsoftGraphStrings.notConfigured = this.cast("notConfigured")
}

