package typingsJapgolly.libraCore.validatorSetPbMod.ValidatorSet

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/validator_set_pb", "ValidatorSet")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.validatorSetPbMod.ValidatorSet = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.validatorSetPbMod.ValidatorSet, reader: BinaryReader): typingsJapgolly.libraCore.validatorSetPbMod.ValidatorSet = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.validatorSetPbMod.ValidatorSet, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.validatorSetPbMod.ValidatorSet): AsObject = js.native
}

