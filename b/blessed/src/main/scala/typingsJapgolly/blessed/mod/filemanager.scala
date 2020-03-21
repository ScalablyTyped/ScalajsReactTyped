package typingsJapgolly.blessed.mod

import typingsJapgolly.blessed.mod.Widgets.FileManagerElement
import typingsJapgolly.blessed.mod.Widgets.FileManagerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "filemanager")
@js.native
object filemanager extends js.Object {
  def apply(): FileManagerElement = js.native
  def apply(options: FileManagerOptions): FileManagerElement = js.native
}

