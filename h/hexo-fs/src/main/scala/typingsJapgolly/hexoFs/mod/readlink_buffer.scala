package typingsJapgolly.hexoFs.mod

import typingsJapgolly.hexoFs.hexoFsStrings.buffer
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "readlink")
@js.native
object readlink_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): typingsJapgolly.bluebird.mod.^[Buffer] = js.native
}

