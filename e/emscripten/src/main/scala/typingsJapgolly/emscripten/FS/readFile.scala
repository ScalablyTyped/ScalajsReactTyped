package typingsJapgolly.emscripten.FS

import typingsJapgolly.emscripten.AnonEncoding
import typingsJapgolly.emscripten.AnonFlags
import typingsJapgolly.emscripten.AnonFlagsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.readFile")
@js.native
object readFile extends js.Object {
  def apply(path: String): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(path: String, opts: AnonEncoding): scala.scalajs.js.typedarray.Uint8Array = js.native
  def apply(path: String, opts: AnonFlags): String = js.native
  def apply(path: String, opts: AnonFlagsString): scala.scalajs.js.typedarray.Uint8Array = js.native
}

