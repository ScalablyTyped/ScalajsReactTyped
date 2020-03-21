package typingsJapgolly.qrImage.mod

import typingsJapgolly.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qr-image", "image")
@js.native
object image extends js.Object {
  def apply(text: String): ReadableStream = js.native
  def apply(text: String, level: ecLevel): ReadableStream = js.native
  def apply(text: String, options: Options): ReadableStream = js.native
}

