package typingsJapgolly.wif.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wif", "decodeRaw")
@js.native
object decodeRaw extends js.Object {
  def apply(buffer: Buffer): WIFReturn = js.native
  def apply(buffer: Buffer, version: Double): WIFReturn = js.native
}

