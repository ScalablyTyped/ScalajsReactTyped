package typingsJapgolly.electron.originalFsMod

import typingsJapgolly.node.fsMod.MakeDirectoryOptions
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "mkdirSync")
@js.native
object mkdirSync extends js.Object {
  /**
    * Synchronous mkdir(2) - create a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
    * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
    */
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, options: String): Unit = js.native
  def apply(path: PathLike, options: Double): Unit = js.native
  def apply(path: PathLike, options: MakeDirectoryOptions): Unit = js.native
}

