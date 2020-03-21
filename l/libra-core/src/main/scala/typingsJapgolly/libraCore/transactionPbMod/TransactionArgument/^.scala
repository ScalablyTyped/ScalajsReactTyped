package typingsJapgolly.libraCore.transactionPbMod.TransactionArgument

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/transaction_pb", "TransactionArgument")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.transactionPbMod.TransactionArgument = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.transactionPbMod.TransactionArgument, reader: BinaryReader): typingsJapgolly.libraCore.transactionPbMod.TransactionArgument = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.transactionPbMod.TransactionArgument, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.transactionPbMod.TransactionArgument): AsObject = js.native
}

