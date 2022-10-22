package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse")
@js.native
/**
  * Constructs a new ClientTransactionListResponse.
  * @param [properties] Properties to set
  */
open class ClientTransactionListResponse ()
  extends StObject
     with IClientTransactionListResponse {
  def this(properties: IClientTransactionListResponse) = this()
  
  /** ClientTransactionListResponse headId. */
  @JSName("headId")
  var headId_ClientTransactionListResponse: String = js.native
  
  /** ClientTransactionListResponse status. */
  @JSName("status")
  var status_ClientTransactionListResponse: Status = js.native
  
  /**
    * Converts this ClientTransactionListResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ClientTransactionListResponse transactions. */
  @JSName("transactions")
  var transactions_ClientTransactionListResponse: js.Array[ITransaction] = js.native
}
/* static members */
object ClientTransactionListResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientTransactionListResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_ID
      extends StObject
         with Status
    /* 8 */ val INVALID_ID: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_ID & Double = js.native
    
    @js.native
    sealed trait INVALID_PAGING
      extends StObject
         with Status
    /* 6 */ val INVALID_PAGING: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_PAGING & Double = js.native
    
    @js.native
    sealed trait INVALID_SORT
      extends StObject
         with Status
    /* 7 */ val INVALID_SORT: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.INVALID_SORT & Double = js.native
    
    @js.native
    sealed trait NOT_READY
      extends StObject
         with Status
    /* 3 */ val NOT_READY: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NOT_READY & Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE
      extends StObject
         with Status
    /* 5 */ val NO_RESOURCE: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NO_RESOURCE & Double = js.native
    
    @js.native
    sealed trait NO_ROOT
      extends StObject
         with Status
    /* 4 */ val NO_ROOT: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.NO_ROOT & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ClientTransactionListResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientTransactionListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientTransactionListResponse instance
    */
  inline def create(): ClientTransactionListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientTransactionListResponse]
  inline def create(properties: IClientTransactionListResponse): ClientTransactionListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionListResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientTransactionListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionListResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientTransactionListResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientTransactionListResponse]
  /**
    * Decodes a ClientTransactionListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientTransactionListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientTransactionListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionListResponse]
  inline def decode(reader: Reader, length: Double): ClientTransactionListResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientTransactionListResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientTransactionListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionListResponse]
  /**
    * Decodes a ClientTransactionListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientTransactionListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientTransactionListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionListResponse]
  
  /**
    * Encodes the specified ClientTransactionListResponse message. Does not implicitly {@link ClientTransactionListResponse.verify|verify} messages.
    * @param message ClientTransactionListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientTransactionListResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientTransactionListResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientTransactionListResponse message, length delimited. Does not implicitly {@link ClientTransactionListResponse.verify|verify} messages.
    * @param message ClientTransactionListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientTransactionListResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientTransactionListResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientTransactionListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientTransactionListResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientTransactionListResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientTransactionListResponse]
  
  /**
    * Creates a plain object from a ClientTransactionListResponse message. Also converts values to other types if specified.
    * @param message ClientTransactionListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientTransactionListResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientTransactionListResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientTransactionListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
