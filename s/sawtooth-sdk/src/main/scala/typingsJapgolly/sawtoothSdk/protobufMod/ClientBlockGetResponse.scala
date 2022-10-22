package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetResponse")
@js.native
/**
  * Constructs a new ClientBlockGetResponse.
  * @param [properties] Properties to set
  */
open class ClientBlockGetResponse ()
  extends StObject
     with IClientBlockGetResponse {
  def this(properties: IClientBlockGetResponse) = this()
  
  /** ClientBlockGetResponse status. */
  @JSName("status")
  var status_ClientBlockGetResponse: Status = js.native
  
  /**
    * Converts this ClientBlockGetResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientBlockGetResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait INTERNAL_ERROR
      extends StObject
         with Status
    /* 2 */ val INTERNAL_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.INTERNAL_ERROR & Double = js.native
    
    @js.native
    sealed trait INVALID_ID
      extends StObject
         with Status
    /* 8 */ val INVALID_ID: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.INVALID_ID & Double = js.native
    
    @js.native
    sealed trait NO_RESOURCE
      extends StObject
         with Status
    /* 5 */ val NO_RESOURCE: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.NO_RESOURCE & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.ClientBlockGetResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new ClientBlockGetResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetResponse instance
    */
  inline def create(): ClientBlockGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBlockGetResponse]
  inline def create(properties: IClientBlockGetResponse): ClientBlockGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientBlockGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBlockGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetResponse]
  /**
    * Decodes a ClientBlockGetResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientBlockGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetResponse]
  inline def decode(reader: Reader, length: Double): ClientBlockGetResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBlockGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetResponse]
  /**
    * Decodes a ClientBlockGetResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientBlockGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetResponse]
  
  /**
    * Encodes the specified ClientBlockGetResponse message. Does not implicitly {@link ClientBlockGetResponse.verify|verify} messages.
    * @param message ClientBlockGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientBlockGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientBlockGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBlockGetResponse message, length delimited. Does not implicitly {@link ClientBlockGetResponse.verify|verify} messages.
    * @param message ClientBlockGetResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientBlockGetResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientBlockGetResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBlockGetResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientBlockGetResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetResponse]
  
  /**
    * Creates a plain object from a ClientBlockGetResponse message. Also converts values to other types if specified.
    * @param message ClientBlockGetResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientBlockGetResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientBlockGetResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientBlockGetResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
