package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.company
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.personal
*/
trait ManagedDeviceOwnerType extends js.Object

object ManagedDeviceOwnerType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def company: typingsJapgolly.microsoftGraph.microsoftGraphStrings.company = this.cast("company")
  @scala.inline
  def personal: typingsJapgolly.microsoftGraph.microsoftGraphStrings.personal = this.cast("personal")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

