package typingsJapgolly.emscripten.FS

import typingsJapgolly.emscripten.AnonFlagsString
import typingsJapgolly.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.writeFile")
@js.native
object writeFile extends js.Object {
  def apply(path: String, data: String): Unit = js.native
  def apply(path: String, data: String, opts: AnonFlagsString): Unit = js.native
  def apply(path: String, data: ArrayBufferView): Unit = js.native
  def apply(path: String, data: ArrayBufferView, opts: AnonFlagsString): Unit = js.native
}

