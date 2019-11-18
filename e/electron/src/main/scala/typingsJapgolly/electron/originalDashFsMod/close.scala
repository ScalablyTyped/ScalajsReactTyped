package typingsJapgolly.electron.originalDashFsMod

import typingsJapgolly.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "close")
@js.native
object close extends js.Object {
  /**
    * Asynchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def apply(fd: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def __promisify__(fd: Double): js.Promise[Unit] = js.native
}

