package typingsJapgolly.libraCore.`lib@GeneratedMempoolPbMod`

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse")
@js.native
open class CommitTransactionsResponse () extends Message
/* static members */
object CommitTransactionsResponse {
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): CommitTransactionsResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[CommitTransactionsResponse]
  
  inline def deserializeBinaryFromReader(message: CommitTransactionsResponse, reader: BinaryReader): CommitTransactionsResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[CommitTransactionsResponse]
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("libra-core/lib/@/generated/mempool_pb", "CommitTransactionsResponse.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: CommitTransactionsResponse, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: CommitTransactionsResponse): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  type AsObject = js.Object
}
