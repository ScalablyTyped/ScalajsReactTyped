package typingsJapgolly.broFs.mod

import typingsJapgolly.filesystem.FileEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bro-fs", "getEntry")
@js.native
object getEntry extends js.Object {
  def apply(path: FileEntry): js.Promise[FileEntry] = js.native
}

