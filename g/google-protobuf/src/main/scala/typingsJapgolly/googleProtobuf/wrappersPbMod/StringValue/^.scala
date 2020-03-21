package typingsJapgolly.googleProtobuf.wrappersPbMod.StringValue

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/wrappers_pb", "StringValue")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.googleProtobuf.wrappersPbMod.StringValue = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.googleProtobuf.wrappersPbMod.StringValue, reader: BinaryReader): typingsJapgolly.googleProtobuf.wrappersPbMod.StringValue = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.googleProtobuf.wrappersPbMod.StringValue, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.googleProtobuf.wrappersPbMod.StringValue): AsObject = js.native
}

