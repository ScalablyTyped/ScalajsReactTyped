package typingsJapgolly.libraCore.ledgerInfoPbMod.ValidatorSignature

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/ledger_info_pb", "ValidatorSignature")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.ledgerInfoPbMod.ValidatorSignature = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.ledgerInfoPbMod.ValidatorSignature, reader: BinaryReader): typingsJapgolly.libraCore.ledgerInfoPbMod.ValidatorSignature = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.ledgerInfoPbMod.ValidatorSignature, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.ledgerInfoPbMod.ValidatorSignature): AsObject = js.native
}

