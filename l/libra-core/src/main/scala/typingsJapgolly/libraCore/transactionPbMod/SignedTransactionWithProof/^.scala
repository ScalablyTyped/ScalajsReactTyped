package typingsJapgolly.libraCore.transactionPbMod.SignedTransactionWithProof

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "SignedTransactionWithProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.transactionPbMod.SignedTransactionWithProof = js.native
  def deserializeBinaryFromReader(
    message: typingsJapgolly.libraCore.transactionPbMod.SignedTransactionWithProof,
    reader: BinaryReader
  ): typingsJapgolly.libraCore.transactionPbMod.SignedTransactionWithProof = js.native
  def serializeBinaryToWriter(
    message: typingsJapgolly.libraCore.transactionPbMod.SignedTransactionWithProof,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsJapgolly.libraCore.transactionPbMod.SignedTransactionWithProof
  ): AsObject = js.native
}

