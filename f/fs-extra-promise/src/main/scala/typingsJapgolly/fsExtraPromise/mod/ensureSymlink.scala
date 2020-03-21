package typingsJapgolly.fsExtraPromise.mod

import typingsJapgolly.fsExtra.mod.SymlinkType
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra-promise", "ensureSymlink")
@js.native
object ensureSymlink extends js.Object {
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, `type`: SymlinkType): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, `type`: SymlinkType, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

