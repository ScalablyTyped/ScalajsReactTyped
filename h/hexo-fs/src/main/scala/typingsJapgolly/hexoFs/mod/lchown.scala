package typingsJapgolly.hexoFs.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lchown")
@js.native
object lchown extends js.Object {
  def apply(path: PathLike, uid: Double, gid: Double): typingsJapgolly.bluebird.mod.^[Unit] = js.native
}

