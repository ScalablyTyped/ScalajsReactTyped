package typingsJapgolly.fsExtra.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "mkdirp")
@js.native
object mkdirp extends js.Object {
  def apply(dir: String): js.Promise[Unit] = js.native
  def apply(dir: String, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

