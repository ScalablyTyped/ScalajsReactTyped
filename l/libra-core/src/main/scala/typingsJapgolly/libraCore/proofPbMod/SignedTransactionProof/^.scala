package typingsJapgolly.libraCore.proofPbMod.SignedTransactionProof

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/proof_pb", "SignedTransactionProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.proofPbMod.SignedTransactionProof = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.proofPbMod.SignedTransactionProof, reader: BinaryReader): typingsJapgolly.libraCore.proofPbMod.SignedTransactionProof = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.proofPbMod.SignedTransactionProof, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.proofPbMod.SignedTransactionProof): AsObject = js.native
}

