package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusInitializeBlockResponse.
  * @param [properties] Properties to set
  */
open class ConsensusInitializeBlockResponse ()
  extends StObject
     with IConsensusInitializeBlockResponse {
  def this(properties: IConsensusInitializeBlockResponse) = this()
  
  /** ConsensusInitializeBlockResponse status. */
  @JSName("status")
  var status_ConsensusInitializeBlockResponse: Status = js.native
  
  /**
    * Converts this ConsensusInitializeBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusInitializeBlockResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusInitializeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST
      extends StObject
         with Status
    /* 2 */ val BAD_REQUEST: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.BAD_REQUEST & Double = js.native
    
    @js.native
    sealed trait INVALID_STATE
      extends StObject
         with Status
    /* 5 */ val INVALID_STATE: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.INVALID_STATE & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 4 */ val NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR
      extends StObject
         with Status
    /* 3 */ val SERVICE_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.SERVICE_ERROR & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.STATUS_UNSET & Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK
      extends StObject
         with Status
    /* 6 */ val UNKNOWN_BLOCK: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusInitializeBlockResponse.Status.UNKNOWN_BLOCK & Double = js.native
  }
  
  /**
    * Creates a new ConsensusInitializeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusInitializeBlockResponse instance
    */
  inline def create(): ConsensusInitializeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusInitializeBlockResponse]
  inline def create(properties: IConsensusInitializeBlockResponse): ConsensusInitializeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusInitializeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusInitializeBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusInitializeBlockResponse]
  /**
    * Decodes a ConsensusInitializeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusInitializeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusInitializeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockResponse]
  inline def decode(reader: Reader, length: Double): ConsensusInitializeBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusInitializeBlockResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusInitializeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockResponse]
  /**
    * Decodes a ConsensusInitializeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusInitializeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusInitializeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockResponse]
  
  /**
    * Encodes the specified ConsensusInitializeBlockResponse message. Does not implicitly {@link ConsensusInitializeBlockResponse.verify|verify} messages.
    * @param message ConsensusInitializeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusInitializeBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusInitializeBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusInitializeBlockResponse message, length delimited. Does not implicitly {@link ConsensusInitializeBlockResponse.verify|verify} messages.
    * @param message ConsensusInitializeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusInitializeBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusInitializeBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusInitializeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusInitializeBlockResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusInitializeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusInitializeBlockResponse]
  
  /**
    * Creates a plain object from a ConsensusInitializeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusInitializeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusInitializeBlockResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusInitializeBlockResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusInitializeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
