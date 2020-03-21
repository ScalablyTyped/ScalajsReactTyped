package typingsJapgolly.hexoFs.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "lstat")
@js.native
object lstat extends js.Object {
  def apply(path: PathLike): typingsJapgolly.bluebird.mod.^[typingsJapgolly.gracefulFs.mod.Stats] = js.native
}

