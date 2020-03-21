package typingsJapgolly.libraCore.vmErrorsPbMod.VMStatus

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/vm_errors_pb", "VMStatus")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.vmErrorsPbMod.VMStatus = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.vmErrorsPbMod.VMStatus, reader: BinaryReader): typingsJapgolly.libraCore.vmErrorsPbMod.VMStatus = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.vmErrorsPbMod.VMStatus, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.vmErrorsPbMod.VMStatus): AsObject = js.native
}

