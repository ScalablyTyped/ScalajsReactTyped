package typingsJapgolly.hexoFs.mod

import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hexo-fs", "utimesSync")
@js.native
object utimesSync extends js.Object {
  /**
    * Synchronously change file timestamps of the file referenced by the supplied path.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def apply(path: PathLike, atime: String, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Date): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: String): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Date): Unit = js.native
}

