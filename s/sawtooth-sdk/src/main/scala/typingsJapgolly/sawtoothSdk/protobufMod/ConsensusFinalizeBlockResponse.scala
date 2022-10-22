package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse")
@js.native
/**
  * Constructs a new ConsensusFinalizeBlockResponse.
  * @param [properties] Properties to set
  */
open class ConsensusFinalizeBlockResponse ()
  extends StObject
     with IConsensusFinalizeBlockResponse {
  def this(properties: IConsensusFinalizeBlockResponse) = this()
  
  /** ConsensusFinalizeBlockResponse blockId. */
  @JSName("blockId")
  var blockId_ConsensusFinalizeBlockResponse: js.typedarray.Uint8Array = js.native
  
  /** ConsensusFinalizeBlockResponse status. */
  @JSName("status")
  var status_ConsensusFinalizeBlockResponse: Status = js.native
  
  /**
    * Converts this ConsensusFinalizeBlockResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ConsensusFinalizeBlockResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ConsensusFinalizeBlockResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait BAD_REQUEST
      extends StObject
         with Status
    /* 2 */ val BAD_REQUEST: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.BAD_REQUEST & Double = js.native
    
    @js.native
    sealed trait BLOCK_NOT_READY
      extends StObject
         with Status
    /* 6 */ val BLOCK_NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.BLOCK_NOT_READY & Double = js.native
    
    @js.native
    sealed trait INVALID_STATE
      extends StObject
         with Status
    /* 5 */ val INVALID_STATE: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.INVALID_STATE & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 4 */ val NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait SERVICE_ERROR
      extends StObject
         with Status
    /* 3 */ val SERVICE_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.SERVICE_ERROR & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ConsensusFinalizeBlockResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ConsensusFinalizeBlockResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ConsensusFinalizeBlockResponse instance
    */
  inline def create(): ConsensusFinalizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ConsensusFinalizeBlockResponse]
  inline def create(properties: IConsensusFinalizeBlockResponse): ConsensusFinalizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ConsensusFinalizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ConsensusFinalizeBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusFinalizeBlockResponse]
  /**
    * Decodes a ConsensusFinalizeBlockResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ConsensusFinalizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ConsensusFinalizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockResponse]
  inline def decode(reader: Reader, length: Double): ConsensusFinalizeBlockResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ConsensusFinalizeBlockResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ConsensusFinalizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockResponse]
  /**
    * Decodes a ConsensusFinalizeBlockResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ConsensusFinalizeBlockResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ConsensusFinalizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockResponse]
  
  /**
    * Encodes the specified ConsensusFinalizeBlockResponse message. Does not implicitly {@link ConsensusFinalizeBlockResponse.verify|verify} messages.
    * @param message ConsensusFinalizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IConsensusFinalizeBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IConsensusFinalizeBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ConsensusFinalizeBlockResponse message, length delimited. Does not implicitly {@link ConsensusFinalizeBlockResponse.verify|verify} messages.
    * @param message ConsensusFinalizeBlockResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IConsensusFinalizeBlockResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IConsensusFinalizeBlockResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ConsensusFinalizeBlockResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ConsensusFinalizeBlockResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ConsensusFinalizeBlockResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ConsensusFinalizeBlockResponse]
  
  /**
    * Creates a plain object from a ConsensusFinalizeBlockResponse message. Also converts values to other types if specified.
    * @param message ConsensusFinalizeBlockResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ConsensusFinalizeBlockResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ConsensusFinalizeBlockResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ConsensusFinalizeBlockResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
