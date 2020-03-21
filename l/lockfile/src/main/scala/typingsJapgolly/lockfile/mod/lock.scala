package typingsJapgolly.lockfile.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lockfile", "lock")
@js.native
object lock extends js.Object {
  def apply(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def apply(path: String, opts: Options, callback: js.Function1[/* err */ js.Error | Null, Unit]): Unit = js.native
}

