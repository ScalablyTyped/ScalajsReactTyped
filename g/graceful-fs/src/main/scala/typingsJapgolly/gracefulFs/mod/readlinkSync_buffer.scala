package typingsJapgolly.gracefulFs.mod

import typingsJapgolly.gracefulFs.gracefulFsStrings.buffer
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "readlinkSync")
@js.native
object readlinkSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): Buffer = js.native
}

