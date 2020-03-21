package typingsJapgolly.libraCore.mempoolPbMod.CommittedTransaction

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommittedTransaction")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.mempoolPbMod.CommittedTransaction = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.mempoolPbMod.CommittedTransaction, reader: BinaryReader): typingsJapgolly.libraCore.mempoolPbMod.CommittedTransaction = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.mempoolPbMod.CommittedTransaction, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.mempoolPbMod.CommittedTransaction): AsObject = js.native
}

