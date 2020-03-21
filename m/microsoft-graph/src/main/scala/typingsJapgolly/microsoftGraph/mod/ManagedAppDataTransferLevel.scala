package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allApps
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.managedApps
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.none_
*/
trait ManagedAppDataTransferLevel extends js.Object

object ManagedAppDataTransferLevel {
  @scala.inline
  def allApps: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allApps = this.cast("allApps")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managedApps: typingsJapgolly.microsoftGraph.microsoftGraphStrings.managedApps = this.cast("managedApps")
  @scala.inline
  def none: none_ = this.cast("none")
}

