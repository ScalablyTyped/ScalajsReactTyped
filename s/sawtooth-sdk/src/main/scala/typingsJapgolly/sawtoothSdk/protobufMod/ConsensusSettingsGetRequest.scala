package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetRequest")
@js.native
/**
  * Constructs a new ConsensusSettingsGetRequest.
  * @param [properties] Properties to set
  */
open class ConsensusSettingsGetRequest ()
  extends StObject
     with IConsensusSettingsGetRequest {
  def this(properties: IConsensusSettingsGetRequest) = this()
  
  /** ConsensusSettingsGetRequest blockId. */
  @JSName("blockId")
  var blockId_ConsensusSettingsGetRequest: js.typedarray.Uint8Array = js.native
  
  /** ConsensusSettingsGetRequest keys. */
  @JSName("keys")
  var keys_ConsensusSettingsGetRequest: js.Array[String] = js.native
  
  /**
    * Converts this ConsensusSettingsGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusSettingsGetRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ConsensusSettingsGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsGetRequest instance
    */
  inline def create(): ConsensusSettingsGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusSettingsGetRequest]
  inline def create(properties: IConsensusSettingsGetRequest): ConsensusSettingsGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusSettingsGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusSettingsGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusSettingsGetRequest]
  /**
    * Decodes a ConsensusSettingsGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusSettingsGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetRequest]
  inline def decode(reader: Reader, length: Double): ConsensusSettingsGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusSettingsGetRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusSettingsGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetRequest]
  /**
    * Decodes a ConsensusSettingsGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusSettingsGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetRequest]
  
  /**
    * Encodes the specified ConsensusSettingsGetRequest message. Does not implicitly {@link ConsensusSettingsGetRequest.verify|verify} messages.
    * @param message ConsensusSettingsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusSettingsGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusSettingsGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusSettingsGetRequest message, length delimited. Does not implicitly {@link ConsensusSettingsGetRequest.verify|verify} messages.
    * @param message ConsensusSettingsGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusSettingsGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusSettingsGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusSettingsGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsGetRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusSettingsGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetRequest]
  
  /**
    * Creates a plain object from a ConsensusSettingsGetRequest message. Also converts values to other types if specified.
    * @param message ConsensusSettingsGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusSettingsGetRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusSettingsGetRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusSettingsGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
