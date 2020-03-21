package typingsJapgolly.googleProtobuf.timestampPbMod.Timestamp

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/timestamp_pb", "Timestamp")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.googleProtobuf.timestampPbMod.Timestamp = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.googleProtobuf.timestampPbMod.Timestamp, reader: BinaryReader): typingsJapgolly.googleProtobuf.timestampPbMod.Timestamp = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.googleProtobuf.timestampPbMod.Timestamp, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.googleProtobuf.timestampPbMod.Timestamp): AsObject = js.native
}

