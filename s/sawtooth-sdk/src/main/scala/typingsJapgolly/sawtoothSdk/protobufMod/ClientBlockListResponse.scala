package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockListResponse")
@js.native
/**
  * Constructs a new ClientBlockListResponse.
  * @param [properties] Properties to set
  */
open class ClientBlockListResponse ()
  extends StObject
     with IClientBlockListResponse {
  def this(properties: IClientBlockListResponse) = this()
  
  /** ClientBlockListResponse blocks. */
  @JSName("blocks")
  var blocks_ClientBlockListResponse: js.Array[IBlock] = js.native
  
  /** ClientBlockListResponse headId. */
  @JSName("headId")
  var headId_ClientBlockListResponse: String = js.native
  
  /** ClientBlockListResponse status. */
  @JSName("status")
  var status_ClientBlockListResponse: Status = js.native
  
  /**
    * Converts this ClientBlockListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientBlockListResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockListResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockListResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_ID
      extends StObject
         with Status
    /* 8 */ val INVALID_ID: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_ID & Double = js.native
    
    @js.native
    sealed trait INVALID_PAGING
      extends StObject
         with Status
    /* 6 */ val INVALID_PAGING: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_PAGING & Double = js.native
    
    @js.native
    sealed trait INVALID_SORT
      extends StObject
         with Status
    /* 7 */ val INVALID_SORT: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.INVALID_SORT & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 3 */ val NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE
      extends StObject
         with Status
    /* 5 */ val NO_RESOURCE: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NO_RESOURCE & Double = js.native
    
    @js.native
    sealed trait NO_ROOT
      extends StObject
         with Status
    /* 4 */ val NO_ROOT: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.NO_ROOT & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockListResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientBlockListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockListResponse instance
    */
  inline def create(): ClientBlockListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBlockListResponse]
  inline def create(properties: IClientBlockListResponse): ClientBlockListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientBlockListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBlockListResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockListResponse]
  /**
    * Decodes a ClientBlockListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientBlockListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListResponse]
  inline def decode(reader: Reader, length: Double): ClientBlockListResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockListResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBlockListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListResponse]
  /**
    * Decodes a ClientBlockListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientBlockListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListResponse]
  
  /**
    * Encodes the specified ClientBlockListResponse message. Does not implicitly {@link ClientBlockListResponse.verify|verify} messages.
    * @param message ClientBlockListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientBlockListResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientBlockListResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBlockListResponse message, length delimited. Does not implicitly {@link ClientBlockListResponse.verify|verify} messages.
    * @param message ClientBlockListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientBlockListResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientBlockListResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBlockListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockListResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientBlockListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBlockListResponse]
  
  /**
    * Creates a plain object from a ClientBlockListResponse message. Also converts values to other types if specified.
    * @param message ClientBlockListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientBlockListResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientBlockListResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientBlockListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
