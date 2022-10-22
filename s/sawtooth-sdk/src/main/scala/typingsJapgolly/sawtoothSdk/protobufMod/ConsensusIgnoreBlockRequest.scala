package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest")
@js.native
/**
  * Constructs a new ConsensusIgnoreBlockRequest.
  * @param [properties] Properties to set
  */
open class ConsensusIgnoreBlockRequest ()
  extends StObject
     with IConsensusIgnoreBlockRequest {
  def this(properties: IConsensusIgnoreBlockRequest) = this()
  
  /** ConsensusIgnoreBlockRequest blockId. */
  @JSName("blockId")
  var blockId_ConsensusIgnoreBlockRequest: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this ConsensusIgnoreBlockRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusIgnoreBlockRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusIgnoreBlockRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusIgnoreBlockRequest instance
    */
  inline def create(): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusIgnoreBlockRequest]
  inline def create(properties: IConsensusIgnoreBlockRequest): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusIgnoreBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusIgnoreBlockRequest]
  /**
    * Decodes a ConsensusIgnoreBlockRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusIgnoreBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  inline def decode(reader: Reader, length: Double): ConsensusIgnoreBlockRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusIgnoreBlockRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  /**
    * Decodes a ConsensusIgnoreBlockRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusIgnoreBlockRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  
  /**
    * Encodes the specified ConsensusIgnoreBlockRequest message. Does not implicitly {@link ConsensusIgnoreBlockRequest.verify|verify} messages.
    * @param message ConsensusIgnoreBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusIgnoreBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusIgnoreBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusIgnoreBlockRequest message, length delimited. Does not implicitly {@link ConsensusIgnoreBlockRequest.verify|verify} messages.
    * @param message ConsensusIgnoreBlockRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusIgnoreBlockRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusIgnoreBlockRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusIgnoreBlockRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusIgnoreBlockRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusIgnoreBlockRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockRequest]
  
  /**
    * Creates a plain object from a ConsensusIgnoreBlockRequest message. Also converts values to other types if specified.
    * @param message ConsensusIgnoreBlockRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusIgnoreBlockRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusIgnoreBlockRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusIgnoreBlockRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
