package typingsJapgolly.fsExtra.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "copy")
@js.native
object copy extends js.Object {
  def apply(src: String, dest: String): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def apply(src: String, dest: String, options: CopyOptions): js.Promise[Unit] = js.native
  def apply(src: String, dest: String, options: CopyOptions, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

