package typingsJapgolly.hexoFs.mod

import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "futimes")
@js.native
object futimes extends js.Object {
  def apply(fd: Double, atime: String, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: String, mtime: Date): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Double, mtime: Date): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: String): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: Double): typingsJapgolly.bluebird.mod.^[Unit] = js.native
  def apply(fd: Double, atime: Date, mtime: Date): typingsJapgolly.bluebird.mod.^[Unit] = js.native
}

