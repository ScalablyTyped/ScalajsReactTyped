package typingsJapgolly.libraCore.transactionInfoPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_info_pb", "TransactionInfo")
@js.native
class TransactionInfo_ () extends Message {
  def getEventRootHash(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getEventRootHash_asB64(): String = js.native
  def getEventRootHash_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getGasUsed(): String = js.native
  def getSignedTransactionHash(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getSignedTransactionHash_asB64(): String = js.native
  def getSignedTransactionHash_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getStateRootHash(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getStateRootHash_asB64(): String = js.native
  def getStateRootHash_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def setEventRootHash(value: String): Unit = js.native
  def setEventRootHash(value: Uint8Array): Unit = js.native
  def setGasUsed(value: String): Unit = js.native
  def setSignedTransactionHash(value: String): Unit = js.native
  def setSignedTransactionHash(value: Uint8Array): Unit = js.native
  def setStateRootHash(value: String): Unit = js.native
  def setStateRootHash(value: Uint8Array): Unit = js.native
}

