package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest")
@js.native
/**
  * Constructs a new ClientReceiptGetRequest.
  * @param [properties] Properties to set
  */
open class ClientReceiptGetRequest ()
  extends StObject
     with IClientReceiptGetRequest {
  def this(properties: IClientReceiptGetRequest) = this()
  
  /**
    * Converts this ClientReceiptGetRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** ClientReceiptGetRequest transactionIds. */
  @JSName("transactionIds")
  var transactionIds_ClientReceiptGetRequest: js.Array[String] = js.native
}
/* static members */
object ClientReceiptGetRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientReceiptGetRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientReceiptGetRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientReceiptGetRequest instance
    */
  inline def create(): ClientReceiptGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientReceiptGetRequest]
  inline def create(properties: IClientReceiptGetRequest): ClientReceiptGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientReceiptGetRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientReceiptGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientReceiptGetRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientReceiptGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientReceiptGetRequest]
  /**
    * Decodes a ClientReceiptGetRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientReceiptGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientReceiptGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientReceiptGetRequest]
  inline def decode(reader: Reader, length: Double): ClientReceiptGetRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientReceiptGetRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientReceiptGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientReceiptGetRequest]
  /**
    * Decodes a ClientReceiptGetRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientReceiptGetRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientReceiptGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientReceiptGetRequest]
  
  /**
    * Encodes the specified ClientReceiptGetRequest message. Does not implicitly {@link ClientReceiptGetRequest.verify|verify} messages.
    * @param message ClientReceiptGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientReceiptGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientReceiptGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientReceiptGetRequest message, length delimited. Does not implicitly {@link ClientReceiptGetRequest.verify|verify} messages.
    * @param message ClientReceiptGetRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientReceiptGetRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientReceiptGetRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientReceiptGetRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientReceiptGetRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientReceiptGetRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientReceiptGetRequest]
  
  /**
    * Creates a plain object from a ClientReceiptGetRequest message. Also converts values to other types if specified.
    * @param message ClientReceiptGetRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientReceiptGetRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientReceiptGetRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientReceiptGetRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
