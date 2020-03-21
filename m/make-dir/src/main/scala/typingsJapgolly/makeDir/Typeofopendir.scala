package typingsJapgolly.makeDir

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.Dir
import typingsJapgolly.node.fsMod.OpenDirOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofopendir extends js.Object {
  def apply(path: String, cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]): Unit = js.native
  def apply(
    path: String,
    options: OpenDirOptions,
    cb: js.Function2[/* err */ ErrnoException | Null, /* dir */ Dir, Unit]
  ): Unit = js.native
  def __promisify__(path: String): js.Promise[Dir] = js.native
  def __promisify__(path: String, options: OpenDirOptions): js.Promise[Dir] = js.native
}

