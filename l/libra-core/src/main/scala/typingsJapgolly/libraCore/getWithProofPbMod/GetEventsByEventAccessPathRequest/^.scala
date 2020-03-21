package typingsJapgolly.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/get_with_proof_pb", "GetEventsByEventAccessPathRequest")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest = js.native
  def deserializeBinaryFromReader(
    message: typingsJapgolly.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest,
    reader: BinaryReader
  ): typingsJapgolly.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest = js.native
  def serializeBinaryToWriter(
    message: typingsJapgolly.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsJapgolly.libraCore.getWithProofPbMod.GetEventsByEventAccessPathRequest
  ): AsObject = js.native
}

