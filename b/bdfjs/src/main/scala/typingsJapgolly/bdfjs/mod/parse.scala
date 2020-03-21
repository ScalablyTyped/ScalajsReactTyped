package typingsJapgolly.bdfjs.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bdfjs", "parse")
@js.native
object parse extends js.Object {
  def apply(text: String): Font = js.native
  def apply(text: String, options: ParseOptions): Font = js.native
  def apply(text: Buffer): Font = js.native
  def apply(text: Buffer, options: ParseOptions): Font = js.native
}

