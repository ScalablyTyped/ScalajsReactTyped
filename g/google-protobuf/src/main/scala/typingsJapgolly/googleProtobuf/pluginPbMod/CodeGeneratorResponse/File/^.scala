package typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/compiler/plugin_pb", "CodeGeneratorResponse.File")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File = js.native
  def deserializeBinaryFromReader(
    message: typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File,
    reader: BinaryReader
  ): typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File = js.native
  def serializeBinaryToWriter(
    message: typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File,
    writer: BinaryWriter
  ): Unit = js.native
  def toObject(
    includeInstance: Boolean,
    msg: typingsJapgolly.googleProtobuf.pluginPbMod.CodeGeneratorResponse.File
  ): AsObject = js.native
}

