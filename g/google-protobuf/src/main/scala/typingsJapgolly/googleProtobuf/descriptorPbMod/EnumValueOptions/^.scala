package typingsJapgolly.googleProtobuf.descriptorPbMod.EnumValueOptions

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "EnumValueOptions")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.googleProtobuf.descriptorPbMod.EnumValueOptions = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.googleProtobuf.descriptorPbMod.EnumValueOptions, reader: BinaryReader): typingsJapgolly.googleProtobuf.descriptorPbMod.EnumValueOptions = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.googleProtobuf.descriptorPbMod.EnumValueOptions, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.googleProtobuf.descriptorPbMod.EnumValueOptions): AsObject = js.native
}

