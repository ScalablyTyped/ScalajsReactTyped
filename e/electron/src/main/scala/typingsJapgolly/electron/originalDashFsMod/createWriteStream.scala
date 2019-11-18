package typingsJapgolly.electron.originalDashFsMod

import typingsJapgolly.node.Anon_AutoCloseEncoding
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "createWriteStream")
@js.native
object createWriteStream extends js.Object {
  /**
    * Returns a new `WriteStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): typingsJapgolly.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: String): typingsJapgolly.node.fsMod.WriteStream = js.native
  def apply(path: PathLike, options: Anon_AutoCloseEncoding): typingsJapgolly.node.fsMod.WriteStream = js.native
}

