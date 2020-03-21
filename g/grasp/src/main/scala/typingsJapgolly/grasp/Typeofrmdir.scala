package typingsJapgolly.grasp

import typingsJapgolly.node.fsMod.NoParamCallback
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.RmDirAsyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofrmdir extends js.Object {
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike, callback: NoParamCallback): Unit = js.native
  def apply(path: PathLike, options: RmDirAsyncOptions, callback: NoParamCallback): Unit = js.native
  /**
    * Asynchronous rmdir(2) - delete a directory.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: PathLike): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, options: RmDirAsyncOptions): js.Promise[Unit] = js.native
}

