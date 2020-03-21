package typingsJapgolly.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/validator_change_pb", "ValidatorChangeEventWithProof")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof = js.native
  def deserializeBinaryFromReader(
    message: typingsJapgolly.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof,
    reader: BinaryReader
  ): typingsJapgolly.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof = js.native
  def serializeBinaryToWriter(
    message: typingsJapgolly.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsJapgolly.libraCore.validatorChangePbMod.ValidatorChangeEventWithProof
  ): AsObject = js.native
}

