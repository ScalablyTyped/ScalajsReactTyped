package typingsJapgolly.chrome.chrome.runtime

import typingsJapgolly.filesystem.DirectoryEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.getPackageDirectoryEntry")
@js.native
object getPackageDirectoryEntry extends js.Object {
  def apply(callback: js.Function1[/* directoryEntry */ DirectoryEntry, Unit]): Unit = js.native
}

