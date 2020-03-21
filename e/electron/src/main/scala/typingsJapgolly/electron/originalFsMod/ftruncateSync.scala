package typingsJapgolly.electron.originalFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("original-fs", "ftruncateSync")
@js.native
object ftruncateSync extends js.Object {
  /**
    * Synchronous ftruncate(2) - Truncate a file to a specified length.
    * @param fd A file descriptor.
    * @param len If not specified, defaults to `0`.
    */
  def apply(fd: Double): Unit = js.native
  def apply(fd: Double, len: Double): Unit = js.native
}

