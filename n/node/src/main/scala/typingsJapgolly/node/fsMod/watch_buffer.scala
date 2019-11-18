package typingsJapgolly.node.fsMod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.nodeStrings.buffer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fs", "watch")
@js.native
object watch_buffer extends js.Object {
  def apply(filename: PathLike, options: buffer_): FSWatcher = js.native
  def apply(
    filename: PathLike,
    options: buffer_,
    listener: js.Function2[/* event */ java.lang.String, /* filename */ Buffer, Unit]
  ): FSWatcher = js.native
}

