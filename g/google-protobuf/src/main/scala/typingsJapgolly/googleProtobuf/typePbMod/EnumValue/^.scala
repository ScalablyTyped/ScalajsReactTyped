package typingsJapgolly.googleProtobuf.typePbMod.EnumValue

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/type_pb", "EnumValue")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.googleProtobuf.typePbMod.EnumValue = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.googleProtobuf.typePbMod.EnumValue, reader: BinaryReader): typingsJapgolly.googleProtobuf.typePbMod.EnumValue = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.googleProtobuf.typePbMod.EnumValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.googleProtobuf.typePbMod.EnumValue): AsObject = js.native
}

