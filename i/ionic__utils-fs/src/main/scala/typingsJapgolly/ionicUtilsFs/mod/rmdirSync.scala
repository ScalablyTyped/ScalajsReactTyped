package typingsJapgolly.ionicUtilsFs.mod

import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.RmDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/utils-fs", "rmdirSync")
@js.native
object rmdirSync extends js.Object {
  /**
    * Synchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike): Unit = js.native
  def apply(path: PathLike, options: RmDirOptions): Unit = js.native
}

