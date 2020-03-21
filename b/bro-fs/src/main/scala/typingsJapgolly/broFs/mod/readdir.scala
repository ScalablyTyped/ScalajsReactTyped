package typingsJapgolly.broFs.mod

import typingsJapgolly.broFs.AnonDeep
import typingsJapgolly.filesystem.DirectoryEntry
import typingsJapgolly.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "readdir")
@js.native
object readdir extends js.Object {
  def apply(path: String): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: String, options: AnonDeep): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: DirectoryEntry): js.Promise[js.Array[FileEntry]] = js.native
  def apply(path: DirectoryEntry, options: AnonDeep): js.Promise[js.Array[FileEntry]] = js.native
}

