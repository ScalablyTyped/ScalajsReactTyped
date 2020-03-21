package typingsJapgolly.libraCore.transactionPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.libraCore.accessPathPbMod.AccessPath
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "WriteOp")
@js.native
class WriteOp_ () extends Message {
  def clearAccessPath(): Unit = js.native
  def getAccessPath(): js.UndefOr[AccessPath] = js.native
  def getType(): WriteOpType = js.native
  def getValue(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getValue_asB64(): String = js.native
  def getValue_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def hasAccessPath(): Boolean = js.native
  def setAccessPath(): Unit = js.native
  def setAccessPath(value: AccessPath): Unit = js.native
  def setType(value: WriteOpType): Unit = js.native
  def setValue(value: String): Unit = js.native
  def setValue(value: Uint8Array): Unit = js.native
}

