package typingsJapgolly.makeDir

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofstat extends js.Object {
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def apply(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  /**
    * Asynchronous stat(2) - Get file status.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    */
  def __promisify__(path: PathLike): js.Promise[Stats] = js.native
}

