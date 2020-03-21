package typingsJapgolly.chromeApps.chrome.syncFileSystem

import typingsJapgolly.chromeApps.AnonCONFLICTING
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.conflicting
import typingsJapgolly.chromeApps.chromeAppsStrings.pending
import typingsJapgolly.chromeApps.chromeAppsStrings.synced
import typingsJapgolly.filesystem.FileEntry
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getFileStatus")
@js.native
object getFileStatus extends js.Object {
  /**
    * Returns the FileStatus for the given fileEntry.
    * Note that 'conflicting' state only happens when
    * the service's conflict resolution policy is set to 'manual'.
    * @see FileStatus
    * */
  def apply(
    fileEntry: FileEntry,
    callback: js.Function1[
      /* status */ ToStringLiteral[AnonCONFLICTING, String, Exclude[String, synced | pending | conflicting]], 
      Unit
    ]
  ): Unit = js.native
}

