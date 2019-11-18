package typingsJapgolly.electron.originalDashFsMod

import typingsJapgolly.node.fsMod.NoParamCallback
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.symlink.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// NOTE: This namespace provides design-time support for util.promisify. Exported members do not exist at runtime.
@JSImport("original-fs", "symlink")
@js.native
object symlink extends js.Object {
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(target: PathLike, path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: js.UndefOr[scala.Nothing], callback: NoParamCallback): Unit = js.native
  def apply(target: PathLike, path: PathLike, `type`: Null, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def apply(target: PathLike, path: PathLike, `type`: Type, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
    * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
    * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
    * @param type May be set to `'dir'`, `'file'`, or `'junction'` (default is `'file'`) and is only available on Windows (ignored on other platforms).
    * When using `'junction'`, the `target` argument will automatically be normalized to an absolute path.
    */
  def __promisify__(target: PathLike, path: PathLike): js.Promise[Unit] = js.native
  def __promisify__(target: PathLike, path: PathLike, `type`: String): js.Promise[Unit] = js.native
}

