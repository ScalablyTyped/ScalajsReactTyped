package typingsJapgolly.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "createSymlink")
@js.native
object createSymlink extends js.Object {
  def apply(src: String, dest: String, `type`: SymlinkType): Unit = js.native
  def apply(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

