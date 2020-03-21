package typingsJapgolly.libraCore.proofPbMod.AccountStateProof

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/proof_pb", "AccountStateProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.proofPbMod.AccountStateProof = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.proofPbMod.AccountStateProof, reader: BinaryReader): typingsJapgolly.libraCore.proofPbMod.AccountStateProof = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.proofPbMod.AccountStateProof, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.proofPbMod.AccountStateProof): AsObject = js.native
}

