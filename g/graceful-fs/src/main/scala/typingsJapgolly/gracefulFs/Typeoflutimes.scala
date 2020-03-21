package typingsJapgolly.gracefulFs

import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoflutimes extends js.Object {
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
    * of the symbolic link are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def apply(path: PathLike, atime: String, mtime: String): Unit = js.native
  def apply(
    path: PathLike,
    atime: String,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Double): Unit = js.native
  def apply(
    path: PathLike,
    atime: String,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: String, mtime: Date): Unit = js.native
  def apply(
    path: PathLike,
    atime: String,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: String): Unit = js.native
  def apply(
    path: PathLike,
    atime: Double,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Double): Unit = js.native
  def apply(
    path: PathLike,
    atime: Double,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: Double, mtime: Date): Unit = js.native
  def apply(
    path: PathLike,
    atime: Double,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: String): Unit = js.native
  def apply(
    path: PathLike,
    atime: Date,
    mtime: String,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Double): Unit = js.native
  def apply(
    path: PathLike,
    atime: Date,
    mtime: Double,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  def apply(path: PathLike, atime: Date, mtime: Date): Unit = js.native
  def apply(
    path: PathLike,
    atime: Date,
    mtime: Date,
    callback: js.Function1[/* err */ ErrnoException | Null, Unit]
  ): Unit = js.native
  /**
    * Asynchronously change file timestamps of the file referenced by the supplied path.
    * If path refers to a symbolic link, then the link is not dereferenced: instead, the timestamps
    * of the symbolic link are changed.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param atime The last access time. If a string is provided, it will be coerced to number.
    * @param mtime The last modified time. If a string is provided, it will be coerced to number.
    */
  def __promisify__(path: PathLike, atime: String, mtime: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: String, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: String, mtime: Date): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Double, mtime: Date): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: String): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: Double): js.Promise[Unit] = js.native
  def __promisify__(path: PathLike, atime: Date, mtime: Date): js.Promise[Unit] = js.native
}

