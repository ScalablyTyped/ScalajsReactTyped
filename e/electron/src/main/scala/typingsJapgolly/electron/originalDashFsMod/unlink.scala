package typingsJapgolly.electron.originalDashFsMod

import typingsJapgolly.node.fsMod.NoParamCallback
import typingsJapgolly.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "unlink")
@js.native
object unlink extends js.Object {
  /**
    * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous unlink(2) - delete a name and possibly the file it refers to.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: PathLike): js.Promise[Unit] = js.native
}

