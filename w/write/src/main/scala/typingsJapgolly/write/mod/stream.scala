package typingsJapgolly.write.mod

import typingsJapgolly.node.fsMod.WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write", "stream")
@js.native
object stream extends js.Object {
  def apply(filepath: String): WriteStream = js.native
  def apply(filepath: String, options: StreamOptions): WriteStream = js.native
}

