package typingsJapgolly.hexoFs.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "exists")
@js.native
object exists extends js.Object {
  def apply(path: PathLike): typingsJapgolly.bluebird.mod.^[Boolean] = js.native
  def apply(path: PathLike, callback: js.Function1[/* exist */ Boolean, Unit]): typingsJapgolly.bluebird.mod.^[Boolean] = js.native
}

