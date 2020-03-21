package typingsJapgolly.promiseFs.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.fsMod.FSWatcher
import typingsJapgolly.node.fsMod.PathLike
import typingsJapgolly.promiseFs.promiseFsStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("promise-fs", "watch")
@js.native
object watch_buffer extends js.Object {
  def apply(filename: PathLike, options: buffer): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: buffer,
    listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
}

