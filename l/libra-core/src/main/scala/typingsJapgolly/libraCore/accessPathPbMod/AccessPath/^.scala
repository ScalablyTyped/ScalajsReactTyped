package typingsJapgolly.libraCore.accessPathPbMod.AccessPath

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/access_path_pb", "AccessPath")
@js.native
object ^ extends js.Object {
  var extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  var extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  def deserializeBinary(bytes: scala.scalajs.js.typedarray.Uint8Array): typingsJapgolly.libraCore.accessPathPbMod.AccessPath = js.native
  def deserializeBinaryFromReader(message: typingsJapgolly.libraCore.accessPathPbMod.AccessPath, reader: BinaryReader): typingsJapgolly.libraCore.accessPathPbMod.AccessPath = js.native
  def serializeBinaryToWriter(message: typingsJapgolly.libraCore.accessPathPbMod.AccessPath, writer: BinaryWriter): Unit = js.native
  def toObject(includeInstance: Boolean, msg: typingsJapgolly.libraCore.accessPathPbMod.AccessPath): AsObject = js.native
}

