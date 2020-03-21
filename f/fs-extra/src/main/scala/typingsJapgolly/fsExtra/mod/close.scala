package typingsJapgolly.fsExtra.mod

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.NoParamCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("fs-extra", "close")
@js.native
object close extends js.Object {
  def apply(fd: Double): js.Promise[Unit] = js.native
  /**
    * Asynchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  def apply(fd: Double, callback: (js.Function1[/* err */ ErrnoException, Unit]) | NoParamCallback): Unit = js.native
  /**
    * Asynchronous close(2) - close a file descriptor.
    * @param fd A file descriptor.
    */
  @JSName("__promisify__")
  def promisify(fd: Double): js.Promise[Unit] = js.native
}

