package typingsJapgolly.fsExtra.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "openSync")
@js.native
object openSync extends js.Object {
  /**
    * Synchronous open(2) - open and possibly create a file, returning a file descriptor..
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param mode A file mode. If a string is passed, it is parsed as an octal integer. If not supplied, defaults to `0o666`.
    */
  def apply(path: PathLike, flags: String): Double = js.native
  def apply(path: PathLike, flags: String, mode: String): Double = js.native
  def apply(path: PathLike, flags: String, mode: Double): Double = js.native
  def apply(path: PathLike, flags: Double): Double = js.native
  def apply(path: PathLike, flags: Double, mode: String): Double = js.native
  def apply(path: PathLike, flags: Double, mode: Double): Double = js.native
}

