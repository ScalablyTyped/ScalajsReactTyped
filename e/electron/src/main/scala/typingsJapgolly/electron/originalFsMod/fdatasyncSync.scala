package typingsJapgolly.electron.originalFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "fdatasyncSync")
@js.native
object fdatasyncSync extends js.Object {
  /**
    * Synchronous fdatasync(2) - synchronize a file's in-core state with storage device.
    * @param fd A file descriptor.
    */
  def apply(fd: Double): Unit = js.native
}

