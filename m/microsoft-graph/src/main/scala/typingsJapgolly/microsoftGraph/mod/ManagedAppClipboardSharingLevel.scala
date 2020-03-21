package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.allApps
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.managedAppsWithPasteIn
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.managedApps
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked
*/
trait ManagedAppClipboardSharingLevel extends js.Object

object ManagedAppClipboardSharingLevel {
  @scala.inline
  def allApps: typingsJapgolly.microsoftGraph.microsoftGraphStrings.allApps = this.cast("allApps")
  @scala.inline
  def blocked: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked = this.cast("blocked")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def managedApps: typingsJapgolly.microsoftGraph.microsoftGraphStrings.managedApps = this.cast("managedApps")
  @scala.inline
  def managedAppsWithPasteIn: typingsJapgolly.microsoftGraph.microsoftGraphStrings.managedAppsWithPasteIn = this.cast("managedAppsWithPasteIn")
}

