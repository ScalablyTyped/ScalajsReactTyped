package typingsJapgolly.readdirEnhanced

import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("readdir-enhanced/lib/stream", JSImport.Namespace)
@js.native
object streamMod extends js.Object {
  def readdirStream(dir: String): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatsfalse): Readable = js.native
  def readdirStream(dir: String, options: Optionsstatstrue): Readable = js.native
}

