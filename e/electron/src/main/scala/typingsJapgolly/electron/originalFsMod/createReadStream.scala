package typingsJapgolly.electron.originalFsMod

import typingsJapgolly.node.AnonAutoClose
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "createReadStream")
@js.native
object createReadStream extends js.Object {
  /**
    * Returns a new `ReadStream` object.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(path: PathLike): typingsJapgolly.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: String): typingsJapgolly.node.fsMod.ReadStream = js.native
  def apply(path: PathLike, options: AnonAutoClose): typingsJapgolly.node.fsMod.ReadStream = js.native
}

