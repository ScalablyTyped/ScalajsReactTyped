package typingsJapgolly.fsExtra.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "chownSync")
@js.native
object chownSync extends js.Object {
  /**
    * Synchronous chown(2) - Change ownership of a file.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike, uid: Double, gid: Double): Unit = js.native
}

