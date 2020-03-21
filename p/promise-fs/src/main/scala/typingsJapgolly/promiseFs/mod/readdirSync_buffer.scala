package typingsJapgolly.promiseFs.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.promiseFs.promiseFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-fs", "readdirSync")
@js.native
object readdirSync_buffer extends js.Object {
  def apply(path: PathLike, options: buffer): js.Array[Buffer] = js.native
}

