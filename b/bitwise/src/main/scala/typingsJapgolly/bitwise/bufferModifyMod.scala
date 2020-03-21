package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bit
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bitwise/esm/buffer/modify", JSImport.Namespace)
@js.native
object bufferModifyMod extends js.Object {
  def default(buffer: Buffer, bits: js.Array[Bit]): Unit = js.native
  def default(buffer: Buffer, bits: js.Array[Bit], offset: Double): Unit = js.native
}

