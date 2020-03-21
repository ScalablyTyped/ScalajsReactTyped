package typingsJapgolly.libraCore.getWithProofPbMod.ResponseItem

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "ResponseItem")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.getWithProofPbMod.ResponseItem = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.getWithProofPbMod.ResponseItem, reader: BinaryReader): typingsJapgolly.libraCore.getWithProofPbMod.ResponseItem = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.getWithProofPbMod.ResponseItem, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.getWithProofPbMod.ResponseItem): AsObject = js.native
}

