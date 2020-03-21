package typingsJapgolly.libraCore.transactionPbMod.TransactionToCommit

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionToCommit")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.transactionPbMod.TransactionToCommit = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.transactionPbMod.TransactionToCommit, reader: BinaryReader): typingsJapgolly.libraCore.transactionPbMod.TransactionToCommit = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.transactionPbMod.TransactionToCommit, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.transactionPbMod.TransactionToCommit): AsObject = js.native
}

