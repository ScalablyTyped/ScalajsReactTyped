package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse")
@js.native
/**
  * Constructs a new ConsensusSettingsGetResponse.
  * @param [properties] Properties to set
  */
open class ConsensusSettingsGetResponse ()
  extends StObject
     with IConsensusSettingsGetResponse {
  def this(properties: IConsensusSettingsGetResponse) = this()
  
  /** ConsensusSettingsGetResponse entries. */
  @JSName("entries")
  var entries_ConsensusSettingsGetResponse: js.Array[IConsensusSettingsEntry] = js.native
  
  /** ConsensusSettingsGetResponse status. */
  @JSName("status")
  var status_ConsensusSettingsGetResponse: Status = js.native
  
  /**
    * Converts this ConsensusSettingsGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusSettingsGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusSettingsGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST
      extends StObject
         with Status
    /* 2 */ val BAD_REQUEST: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.BAD_REQUEST & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 4 */ val NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR
      extends StObject
         with Status
    /* 3 */ val SERVICE_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.SERVICE_ERROR & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.STATUS_UNSET & Double = js.native
    
    @js.native
    sealed trait UNKNOWN_BLOCK
      extends StObject
         with Status
    /* 5 */ val UNKNOWN_BLOCK: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusSettingsGetResponse.Status.UNKNOWN_BLOCK & Double = js.native
  }
  
  /**
    * Creates a new ConsensusSettingsGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusSettingsGetResponse instance
    */
  inline def create(): ConsensusSettingsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusSettingsGetResponse]
  inline def create(properties: IConsensusSettingsGetResponse): ConsensusSettingsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusSettingsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusSettingsGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusSettingsGetResponse]
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusSettingsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetResponse]
  inline def decode(reader: Reader, length: Double): ConsensusSettingsGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusSettingsGetResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusSettingsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetResponse]
  /**
    * Decodes a ConsensusSettingsGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusSettingsGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusSettingsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetResponse]
  
  /**
    * Encodes the specified ConsensusSettingsGetResponse message. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusSettingsGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusSettingsGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusSettingsGetResponse message, length delimited. Does not implicitly {@link ConsensusSettingsGetResponse.verify|verify} messages.
    * @param message ConsensusSettingsGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusSettingsGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusSettingsGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusSettingsGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusSettingsGetResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusSettingsGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusSettingsGetResponse]
  
  /**
    * Creates a plain object from a ConsensusSettingsGetResponse message. Also converts values to other types if specified.
    * @param message ConsensusSettingsGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusSettingsGetResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusSettingsGetResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusSettingsGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
