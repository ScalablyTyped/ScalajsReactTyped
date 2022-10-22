package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusChainHeadGetResponse")
@js.native
/**
  * Constructs a new ConsensusChainHeadGetResponse.
  * @param [properties] Properties to set
  */
open class ConsensusChainHeadGetResponse ()
  extends StObject
     with IConsensusChainHeadGetResponse {
  def this(properties: IConsensusChainHeadGetResponse) = this()
  
  /** ConsensusChainHeadGetResponse status. */
  @JSName("status")
  var status_ConsensusChainHeadGetResponse: Status = js.native
  
  /**
    * Converts this ConsensusChainHeadGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusChainHeadGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusChainHeadGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusChainHeadGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST
      extends StObject
         with Status
    /* 2 */ val BAD_REQUEST: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.BAD_REQUEST & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 4 */ val NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait NO_CHAIN_HEAD
      extends StObject
         with Status
    /* 5 */ val NO_CHAIN_HEAD: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.NO_CHAIN_HEAD & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR
      extends StObject
         with Status
    /* 3 */ val SERVICE_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.SERVICE_ERROR & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusChainHeadGetResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ConsensusChainHeadGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusChainHeadGetResponse instance
    */
  inline def create(): ConsensusChainHeadGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusChainHeadGetResponse]
  inline def create(properties: IConsensusChainHeadGetResponse): ConsensusChainHeadGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusChainHeadGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusChainHeadGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusChainHeadGetResponse]
  /**
    * Decodes a ConsensusChainHeadGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusChainHeadGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusChainHeadGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetResponse]
  inline def decode(reader: Reader, length: Double): ConsensusChainHeadGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusChainHeadGetResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusChainHeadGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetResponse]
  /**
    * Decodes a ConsensusChainHeadGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusChainHeadGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusChainHeadGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetResponse]
  
  /**
    * Encodes the specified ConsensusChainHeadGetResponse message. Does not implicitly {@link ConsensusChainHeadGetResponse.verify|verify} messages.
    * @param message ConsensusChainHeadGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusChainHeadGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusChainHeadGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusChainHeadGetResponse message, length delimited. Does not implicitly {@link ConsensusChainHeadGetResponse.verify|verify} messages.
    * @param message ConsensusChainHeadGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusChainHeadGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusChainHeadGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusChainHeadGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusChainHeadGetResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusChainHeadGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusChainHeadGetResponse]
  
  /**
    * Creates a plain object from a ConsensusChainHeadGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusChainHeadGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusChainHeadGetResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusChainHeadGetResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusChainHeadGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
