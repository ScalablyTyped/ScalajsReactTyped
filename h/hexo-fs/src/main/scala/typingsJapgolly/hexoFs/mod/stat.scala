package typingsJapgolly.hexoFs.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "stat")
@js.native
object stat extends js.Object {
  def apply(path: PathLike): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.Stats] = js.native
}

