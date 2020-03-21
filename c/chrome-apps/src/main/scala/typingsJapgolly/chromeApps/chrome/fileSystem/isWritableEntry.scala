package typingsJapgolly.chromeApps.chrome.fileSystem

import typingsJapgolly.filesystem.DirectoryEntry
import typingsJapgolly.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.fileSystem.isWritableEntry")
@js.native
object isWritableEntry extends js.Object {
  def apply(entry: DirectoryEntry, callback: js.Function1[/* isWritable */ Boolean, Unit]): Unit = js.native
  /** Gets whether this Entry is writable or not. */
  def apply(entry: FileEntry, callback: js.Function1[/* isWritable */ Boolean, Unit]): Unit = js.native
}

