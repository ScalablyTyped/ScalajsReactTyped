package typingsJapgolly.googleProtobuf.structPbMod.Value

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import typingsJapgolly.googleProtobuf.structPbMod.JavaScriptValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf/google/protobuf/struct_pb", "Value")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.googleProtobuf.structPbMod.Value = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.googleProtobuf.structPbMod.Value, reader: BinaryReader): typingsJapgolly.googleProtobuf.structPbMod.Value = js.native
  def fromJavaScript(value: JavaScriptValue): typingsJapgolly.googleProtobuf.structPbMod.Value = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.googleProtobuf.structPbMod.Value, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.googleProtobuf.structPbMod.Value): AsObject = js.native
}

