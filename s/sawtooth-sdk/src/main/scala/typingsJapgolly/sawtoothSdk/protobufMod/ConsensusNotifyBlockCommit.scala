package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockCommit")
@js.native
/**
  * Constructs a new ConsensusNotifyBlockCommit.
  * @param [properties] Properties to set
  */
open class ConsensusNotifyBlockCommit ()
  extends StObject
     with IConsensusNotifyBlockCommit {
  def this(properties: IConsensusNotifyBlockCommit) = this()
  
  /** ConsensusNotifyBlockCommit blockId. */
  @JSName("blockId")
  var blockId_ConsensusNotifyBlockCommit: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this ConsensusNotifyBlockCommit to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusNotifyBlockCommit {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusNotifyBlockCommit")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusNotifyBlockCommit instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusNotifyBlockCommit instance
    */
  inline def create(): ConsensusNotifyBlockCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusNotifyBlockCommit]
  inline def create(properties: IConsensusNotifyBlockCommit): ConsensusNotifyBlockCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockCommit]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusNotifyBlockCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockCommit]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusNotifyBlockCommit = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusNotifyBlockCommit]
  /**
    * Decodes a ConsensusNotifyBlockCommit message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusNotifyBlockCommit
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusNotifyBlockCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockCommit]
  inline def decode(reader: Reader, length: Double): ConsensusNotifyBlockCommit = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusNotifyBlockCommit]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusNotifyBlockCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockCommit]
  /**
    * Decodes a ConsensusNotifyBlockCommit message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusNotifyBlockCommit
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusNotifyBlockCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockCommit]
  
  /**
    * Encodes the specified ConsensusNotifyBlockCommit message. Does not implicitly {@link ConsensusNotifyBlockCommit.verify|verify} messages.
    * @param message ConsensusNotifyBlockCommit message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusNotifyBlockCommit): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusNotifyBlockCommit, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusNotifyBlockCommit message, length delimited. Does not implicitly {@link ConsensusNotifyBlockCommit.verify|verify} messages.
    * @param message ConsensusNotifyBlockCommit message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusNotifyBlockCommit): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusNotifyBlockCommit, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusNotifyBlockCommit message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusNotifyBlockCommit
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusNotifyBlockCommit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusNotifyBlockCommit]
  
  /**
    * Creates a plain object from a ConsensusNotifyBlockCommit message. Also converts values to other types if specified.
    * @param message ConsensusNotifyBlockCommit
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusNotifyBlockCommit): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusNotifyBlockCommit, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusNotifyBlockCommit message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
