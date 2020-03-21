package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bit
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/esm/buffer/read", JSImport.Namespace)
@js.native
object bufferReadMod extends js.Object {
  def default(buffer: Buffer): js.Array[Bit] = js.native
  def default(buffer: Buffer, offset: Double): js.Array[Bit] = js.native
  def default(buffer: Buffer, offset: Double, length: Double): js.Array[Bit] = js.native
}

