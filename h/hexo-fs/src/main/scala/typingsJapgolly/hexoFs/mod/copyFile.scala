package typingsJapgolly.hexoFs.mod

import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "copyFile")
@js.native
object copyFile extends js.Object {
  def apply(src: PathLike, dest: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(src: PathLike, dest: String, callback: js.Function1[/* err */ js.Any, Unit]): typingsJapgolly.bluebird.mod.^[Unit] = js.native
}

