package typingsJapgolly.node.fsMod

import typingsJapgolly.node.Anon2
import typingsJapgolly.node.Anon3
import typingsJapgolly.node.AnonEncoding
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "readlinkSync")
@js.native
object readlinkSync extends js.Object {
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike): String = js.native
  def apply(path: PathLike, options: String): String | Buffer = js.native
  /**
    * Synchronous readlink(2) - read value of a symbolic link.
    * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(path: PathLike, options: Anon2): Buffer = js.native
  def apply(path: PathLike, options: Anon3): String | Buffer = js.native
  def apply(path: PathLike, options: AnonEncoding): String = js.native
  def apply(path: PathLike, options: BufferEncoding): String = js.native
}

