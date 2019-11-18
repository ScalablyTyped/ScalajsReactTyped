package typingsJapgolly.electron.originalDashFsMod

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.OpenDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "opendir")
@js.native
object opendir extends js.Object {
  def apply(
    path: String,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsJapgolly.node.fsMod.Dir, Unit]
  ): Unit = js.native
  def apply(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ typingsJapgolly.node.fsMod.Dir, Unit]
  ): Unit = js.native
  def __promisify__(path: String): js.Promise[typingsJapgolly.node.fsMod.Dir] = js.native
  def __promisify__(path: String, options: OpenDirOptions): js.Promise[typingsJapgolly.node.fsMod.Dir] = js.native
}

