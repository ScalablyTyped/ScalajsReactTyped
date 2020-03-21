package typingsJapgolly.fsExtra.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs-extra", "unwatchFile")
@js.native
object unwatchFile extends js.Object {
  /**
    * Stop watching for changes on `filename`.
    * @param filename A path to a file or directory. If a URL is provided, it must use the `file:` protocol.
    * URL support is _experimental_.
    */
  def apply(filename: PathLike): Unit = js.native
  def apply(
    filename: PathLike,
    listener: js.Function2[
      /* curr */ typingsJapgolly.node.fsMod.Stats, 
      /* prev */ typingsJapgolly.node.fsMod.Stats, 
      Unit
    ]
  ): Unit = js.native
}

