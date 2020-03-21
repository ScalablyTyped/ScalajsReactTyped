package typingsJapgolly.googleProtobuf.anyPbMod.Any

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/any_pb", "Any")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.googleProtobuf.anyPbMod.Any = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.googleProtobuf.anyPbMod.Any, reader: BinaryReader): typingsJapgolly.googleProtobuf.anyPbMod.Any = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.googleProtobuf.anyPbMod.Any, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.googleProtobuf.anyPbMod.Any): AsObject = js.native
}

