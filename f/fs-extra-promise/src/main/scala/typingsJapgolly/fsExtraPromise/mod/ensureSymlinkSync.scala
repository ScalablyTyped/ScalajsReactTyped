package typingsJapgolly.fsExtraPromise.mod

import typingsJapgolly.fsExtra.mod.SymlinkType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "ensureSymlinkSync")
@js.native
object ensureSymlinkSync extends js.Object {
  def apply(src: String, dest: String): Unit = js.native
  def apply(src: String, dest: String, `type`: SymlinkType): Unit = js.native
}

