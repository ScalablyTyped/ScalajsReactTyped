package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockResponse")
@js.native
/**
  * Constructs a new ConsensusIgnoreBlockResponse.
  * @param [properties] Properties to set
  */
open class ConsensusIgnoreBlockResponse ()
  extends StObject
     with IConsensusIgnoreBlockResponse {
  def this(properties: IConsensusIgnoreBlockResponse) = this()
  
  /** ConsensusIgnoreBlockResponse status. */
  @JSName("status")
  var status_ConsensusIgnoreBlockResponse: Status = js.native
  
  /**
    * Converts this ConsensusIgnoreBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusIgnoreBlockResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusIgnoreBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST
      extends StObject
         with Status
    /* 2 */ val BAD_REQUEST: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.BAD_REQUEST & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 4 */ val NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR
      extends StObject
         with Status
    /* 3 */ val SERVICE_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.SERVICE_ERROR & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.STATUS_UNSET & Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK
      extends StObject
         with Status
    /* 5 */ val UNKNOWN_BLOCK: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusIgnoreBlockResponse.Status.UNKNOWN_BLOCK & Double = js.native
  }
  
  /**
    * Creates a new ConsensusIgnoreBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusIgnoreBlockResponse instance
    */
  inline def create(): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusIgnoreBlockResponse]
  inline def create(properties: IConsensusIgnoreBlockResponse): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusIgnoreBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusIgnoreBlockResponse]
  /**
    * Decodes a ConsensusIgnoreBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusIgnoreBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  inline def decode(reader: Reader, length: Double): ConsensusIgnoreBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusIgnoreBlockResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  /**
    * Decodes a ConsensusIgnoreBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusIgnoreBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  
  /**
    * Encodes the specified ConsensusIgnoreBlockResponse message. Does not implicitly {@link ConsensusIgnoreBlockResponse.verify|verify} messages.
    * @param message ConsensusIgnoreBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusIgnoreBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusIgnoreBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusIgnoreBlockResponse message, length delimited. Does not implicitly {@link ConsensusIgnoreBlockResponse.verify|verify} messages.
    * @param message ConsensusIgnoreBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusIgnoreBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusIgnoreBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusIgnoreBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusIgnoreBlockResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusIgnoreBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusIgnoreBlockResponse]
  
  /**
    * Creates a plain object from a ConsensusIgnoreBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusIgnoreBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusIgnoreBlockResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusIgnoreBlockResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusIgnoreBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
