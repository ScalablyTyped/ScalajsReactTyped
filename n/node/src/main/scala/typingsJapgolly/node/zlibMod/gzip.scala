package typingsJapgolly.node.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", "gzip")
@js.native
object gzip extends js.Object {
  def apply(buf: InputType, callback: CompressCallback): Unit = js.native
  def apply(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
}

