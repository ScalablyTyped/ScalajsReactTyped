package typingsJapgolly.googleProtobuf.descriptorPbMod.MethodDescriptorProto

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MethodDescriptorProto")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.googleProtobuf.descriptorPbMod.MethodDescriptorProto = js.native
  def deserializeBinaryFromReader(
    message: typingsJapgolly.googleProtobuf.descriptorPbMod.MethodDescriptorProto,
    reader: BinaryReader
  ): typingsJapgolly.googleProtobuf.descriptorPbMod.MethodDescriptorProto = js.native
  def serializeBinaryToWriter(
    message: typingsJapgolly.googleProtobuf.descriptorPbMod.MethodDescriptorProto,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsJapgolly.googleProtobuf.descriptorPbMod.MethodDescriptorProto
  ): AsObject = js.native
}

