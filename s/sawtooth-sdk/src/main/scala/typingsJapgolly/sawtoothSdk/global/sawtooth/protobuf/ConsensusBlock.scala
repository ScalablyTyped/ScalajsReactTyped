package typingsJapgolly.sawtoothSdk.global.sawtooth.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.IConsensusBlock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sawtooth.protobuf.ConsensusBlock")
@js.native
/**
  * Constructs a new ConsensusBlock.
  * @param [properties] Properties to set
  */
open class ConsensusBlock ()
  extends typingsJapgolly.sawtoothSdk.mod.protobuf.ConsensusBlock {
  def this(properties: IConsensusBlock) = this()
}
/* static members */
object ConsensusBlock {
  
  @JSGlobal("sawtooth.protobuf.ConsensusBlock")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusBlock instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusBlock instance
    */
  inline def create(): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  inline def create(properties: IConsensusBlock): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  /**
    * Decodes a ConsensusBlock message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusBlock
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  /**
    * Decodes a ConsensusBlock message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusBlock
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  
  /**
    * Encodes the specified ConsensusBlock message. Does not implicitly {@link ConsensusBlock.verify|verify} messages.
    * @param message ConsensusBlock message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusBlock): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusBlock, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusBlock message, length delimited. Does not implicitly {@link ConsensusBlock.verify|verify} messages.
    * @param message ConsensusBlock message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusBlock): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusBlock, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusBlock message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusBlock
    */
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock]
  
  /**
    * Creates a plain object from a ConsensusBlock message. Also converts values to other types if specified.
    * @param message ConsensusBlock
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusBlock, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusBlock message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
