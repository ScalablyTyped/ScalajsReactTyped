package typingsJapgolly.libraCore.transactionPbMod

import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionsBlock")
@js.native
class SignedTransactionsBlock_ () extends Message {
  def addTransactions(): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction): SignedTransaction = js.native
  def addTransactions(value: SignedTransaction, index: Double): SignedTransaction = js.native
  def clearTransactionsList(): Unit = js.native
  def getTransactionsList(): js.Array[SignedTransaction] = js.native
  def getValidatorPublicKey(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getValidatorPublicKey_asB64(): String = js.native
  def getValidatorPublicKey_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getValidatorSignature(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getValidatorSignature_asB64(): String = js.native
  def getValidatorSignature_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def setTransactionsList(value: js.Array[SignedTransaction]): Unit = js.native
  def setValidatorPublicKey(value: String): Unit = js.native
  def setValidatorPublicKey(value: Uint8Array): Unit = js.native
  def setValidatorSignature(value: String): Unit = js.native
  def setValidatorSignature(value: Uint8Array): Unit = js.native
}

