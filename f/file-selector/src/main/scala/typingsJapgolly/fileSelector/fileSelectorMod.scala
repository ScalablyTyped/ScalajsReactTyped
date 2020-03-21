package typingsJapgolly.fileSelector

import typingsJapgolly.fileSelector.fileMod.FileWithPath
import typingsJapgolly.std.DataTransferItem
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("file-selector/dist/file-selector", JSImport.Namespace)
@js.native
object fileSelectorMod extends js.Object {
  def fromEvent(evt: Event_): js.Promise[js.Array[FileWithPath | DataTransferItem]] = js.native
}

