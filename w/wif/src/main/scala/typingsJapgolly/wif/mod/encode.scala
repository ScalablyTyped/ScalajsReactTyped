package typingsJapgolly.wif.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wif", "encode")
@js.native
object encode extends js.Object {
  def apply(version: Double, privateKey: Buffer, compressed: Boolean): String = js.native
}

