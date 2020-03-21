package typingsJapgolly.libraCore.getWithProofPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetAccountTransactionBySequenceNumberRequest")
@js.native
class GetAccountTransactionBySequenceNumberRequest_ () extends Message {
  def getAccount(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getAccount_asB64(): String = js.native
  def getAccount_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getFetchEvents(): Boolean = js.native
  def getSequenceNumber(): String = js.native
  def setAccount(value: String): Unit = js.native
  def setAccount(value: Uint8Array): Unit = js.native
  def setFetchEvents(value: Boolean): Unit = js.native
  def setSequenceNumber(value: String): Unit = js.native
}

