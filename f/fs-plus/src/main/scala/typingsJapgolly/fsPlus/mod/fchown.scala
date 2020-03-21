package typingsJapgolly.fsPlus.mod

import typingsJapgolly.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-plus", "fchown")
@js.native
object fchown extends js.Object {
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  def apply(fd: Double, uid: Double, gid: Double, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous fchown(2) - Change ownership of a file.
    * @param fd A file descriptor.
    */
  @JSName("__promisify__")
  def promisify(fd: Double, uid: Double, gid: Double): js.Promise[Unit] = js.native
}

