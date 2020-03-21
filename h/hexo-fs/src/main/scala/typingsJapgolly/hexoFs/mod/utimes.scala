package typingsJapgolly.hexoFs.mod

import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "utimes")
@js.native
object utimes extends js.Object {
  def apply(path: PathLike, atime: String, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: String, mtime: Date): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Double, mtime: Date): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(path: PathLike, atime: Date, mtime: Date): typingsJapgolly.bluebird.mod.^[Unit] = js.native
}

