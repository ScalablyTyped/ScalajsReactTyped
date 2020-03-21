package typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "DynamicReferenceError")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError, reader: BinaryReader): typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.vmErrorsPbMod.DynamicReferenceError): AsObject = js.native
}

