package typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_status_pb", "MempoolAddTransactionStatus")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus = js.native
  def deserializeBinaryFromReader(
    message: typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus,
    reader: BinaryReader
  ): typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus = js.native
  def serializeBinaryToWriter(
    message: typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsJapgolly.libraCore.mempoolStatusPbMod.MempoolAddTransactionStatus
  ): AsObject = js.native
}

