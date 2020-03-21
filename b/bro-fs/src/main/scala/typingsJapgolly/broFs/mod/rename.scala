package typingsJapgolly.broFs.mod

import typingsJapgolly.broFs.AnonCreate
import typingsJapgolly.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "rename")
@js.native
object rename extends js.Object {
  def apply(oldPath: String, newPath: String): js.Promise[FileEntry] = js.native
  def apply(oldPath: String, newPath: String, options: AnonCreate): js.Promise[FileEntry] = js.native
  def apply(oldPath: FileEntry, newPath: String): js.Promise[FileEntry] = js.native
  def apply(oldPath: FileEntry, newPath: String, options: AnonCreate): js.Promise[FileEntry] = js.native
}

