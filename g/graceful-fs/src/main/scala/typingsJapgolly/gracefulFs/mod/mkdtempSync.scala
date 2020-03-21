package typingsJapgolly.gracefulFs.mod

import typingsJapgolly.node.Anon2
import typingsJapgolly.node.Anon3
import typingsJapgolly.node.AnonEncoding
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graceful-fs", "mkdtempSync")
@js.native
object mkdtempSync extends js.Object {
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(prefix: String): String = js.native
  def apply(prefix: String, options: String): String | Buffer = js.native
  /**
    * Synchronously creates a unique temporary directory.
    * Generates six random characters to be appended behind a required prefix to create a unique temporary directory.
    * @param options The encoding (or an object specifying the encoding), used as the encoding of the result. If not provided, `'utf8'` is used.
    */
  def apply(prefix: String, options: Anon2): Buffer = js.native
  def apply(prefix: String, options: Anon3): String | Buffer = js.native
  def apply(prefix: String, options: AnonEncoding): String = js.native
  def apply(prefix: String, options: BufferEncoding): String = js.native
}

