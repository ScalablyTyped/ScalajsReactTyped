package typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod

import org.scalablytyped.runtime.NumberDictionary
import typingsJapgolly.googleProtobuf.mod.BinaryReader
import typingsJapgolly.googleProtobuf.mod.BinaryWriter
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldBinaryInfo
import typingsJapgolly.googleProtobuf.mod.ExtensionFieldInfo
import typingsJapgolly.googleProtobuf.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
@js.native
open class MessageOptions () extends Message {
  
  def addUninterpretedOption(): UninterpretedOption = js.native
  def addUninterpretedOption(value: Unit, index: Double): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption): UninterpretedOption = js.native
  def addUninterpretedOption(value: UninterpretedOption, index: Double): UninterpretedOption = js.native
  
  def clearDeprecated(): MessageOptions = js.native
  
  def clearMapEntry(): MessageOptions = js.native
  
  def clearMessageSetWireFormat(): MessageOptions = js.native
  
  def clearNoStandardDescriptorAccessor(): MessageOptions = js.native
  
  def clearUninterpretedOptionList(): MessageOptions = js.native
  
  def getDeprecated(): js.UndefOr[Boolean] = js.native
  
  def getMapEntry(): js.UndefOr[Boolean] = js.native
  
  def getMessageSetWireFormat(): js.UndefOr[Boolean] = js.native
  
  def getNoStandardDescriptorAccessor(): js.UndefOr[Boolean] = js.native
  
  def getUninterpretedOptionList(): js.Array[UninterpretedOption] = js.native
  
  def hasDeprecated(): Boolean = js.native
  
  def hasMapEntry(): Boolean = js.native
  
  def hasMessageSetWireFormat(): Boolean = js.native
  
  def hasNoStandardDescriptorAccessor(): Boolean = js.native
  
  def setDeprecated(value: Boolean): MessageOptions = js.native
  
  def setMapEntry(value: Boolean): MessageOptions = js.native
  
  def setMessageSetWireFormat(value: Boolean): MessageOptions = js.native
  
  def setNoStandardDescriptorAccessor(value: Boolean): MessageOptions = js.native
  
  def setUninterpretedOptionList(value: js.Array[UninterpretedOption]): MessageOptions = js.native
}
/* static members */
object MessageOptions {
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions")
  @js.native
  val ^ : js.Any = js.native
  
  inline def deserializeBinary(bytes: js.typedarray.Uint8Array): MessageOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinary")(bytes.asInstanceOf[js.Any]).asInstanceOf[MessageOptions]
  
  inline def deserializeBinaryFromReader(message: MessageOptions, reader: BinaryReader): MessageOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeBinaryFromReader")(message.asInstanceOf[js.Any], reader.asInstanceOf[js.Any])).asInstanceOf[MessageOptions]
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions.extensions")
  @js.native
  def extensions: NumberDictionary[ExtensionFieldInfo[Message]] = js.native
  
  @JSImport("google-protobuf/google/protobuf/descriptor_pb", "MessageOptions.extensionsBinary")
  @js.native
  def extensionsBinary: NumberDictionary[ExtensionFieldBinaryInfo[Message]] = js.native
  inline def extensionsBinary_=(x: NumberDictionary[ExtensionFieldBinaryInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensionsBinary")(x.asInstanceOf[js.Any])
  
  inline def extensions_=(x: NumberDictionary[ExtensionFieldInfo[Message]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extensions")(x.asInstanceOf[js.Any])
  
  inline def serializeBinaryToWriter(message: MessageOptions, writer: BinaryWriter): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeBinaryToWriter")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toObject(includeInstance: Boolean, msg: MessageOptions): AsObject = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(includeInstance.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[AsObject]
  
  trait AsObject extends StObject {
    
    var deprecated: js.UndefOr[Boolean] = js.undefined
    
    var mapEntry: js.UndefOr[Boolean] = js.undefined
    
    var messageSetWireFormat: js.UndefOr[Boolean] = js.undefined
    
    var noStandardDescriptorAccessor: js.UndefOr[Boolean] = js.undefined
    
    var uninterpretedOptionList: js.Array[
        typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
      ]
  }
  object AsObject {
    
    inline def apply(
      uninterpretedOptionList: js.Array[
          typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
        ]
    ): AsObject = {
      val __obj = js.Dynamic.literal(uninterpretedOptionList = uninterpretedOptionList.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsObject]
    }
    
    extension [Self <: AsObject](x: Self) {
      
      inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
      
      inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
      
      inline def setMapEntry(value: Boolean): Self = StObject.set(x, "mapEntry", value.asInstanceOf[js.Any])
      
      inline def setMapEntryUndefined: Self = StObject.set(x, "mapEntry", js.undefined)
      
      inline def setMessageSetWireFormat(value: Boolean): Self = StObject.set(x, "messageSetWireFormat", value.asInstanceOf[js.Any])
      
      inline def setMessageSetWireFormatUndefined: Self = StObject.set(x, "messageSetWireFormat", js.undefined)
      
      inline def setNoStandardDescriptorAccessor(value: Boolean): Self = StObject.set(x, "noStandardDescriptorAccessor", value.asInstanceOf[js.Any])
      
      inline def setNoStandardDescriptorAccessorUndefined: Self = StObject.set(x, "noStandardDescriptorAccessor", js.undefined)
      
      inline def setUninterpretedOptionList(
        value: js.Array[
              typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject
            ]
      ): Self = StObject.set(x, "uninterpretedOptionList", value.asInstanceOf[js.Any])
      
      inline def setUninterpretedOptionListVarargs(value: typingsJapgolly.googleProtobuf.googleProtobufDescriptorPbMod.UninterpretedOption.AsObject*): Self = StObject.set(x, "uninterpretedOptionList", js.Array(value*))
    }
  }
}
