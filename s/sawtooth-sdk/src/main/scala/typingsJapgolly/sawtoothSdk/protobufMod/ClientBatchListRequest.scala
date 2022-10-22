package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBatchListRequest")
@js.native
/**
  * Constructs a new ClientBatchListRequest.
  * @param [properties] Properties to set
  */
open class ClientBatchListRequest ()
  extends StObject
     with IClientBatchListRequest {
  def this(properties: IClientBatchListRequest) = this()
  
  /** ClientBatchListRequest batchIds. */
  @JSName("batchIds")
  var batchIds_ClientBatchListRequest: js.Array[String] = js.native
  
  /** ClientBatchListRequest headId. */
  @JSName("headId")
  var headId_ClientBatchListRequest: String = js.native
  
  /** ClientBatchListRequest sorting. */
  @JSName("sorting")
  var sorting_ClientBatchListRequest: js.Array[IClientSortControls] = js.native
  
  /**
    * Converts this ClientBatchListRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientBatchListRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBatchListRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientBatchListRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBatchListRequest instance
    */
  inline def create(): ClientBatchListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBatchListRequest]
  inline def create(properties: IClientBatchListRequest): ClientBatchListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientBatchListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBatchListRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchListRequest]
  /**
    * Decodes a ClientBatchListRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBatchListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientBatchListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListRequest]
  inline def decode(reader: Reader, length: Double): ClientBatchListRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBatchListRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBatchListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListRequest]
  /**
    * Decodes a ClientBatchListRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBatchListRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientBatchListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListRequest]
  
  /**
    * Encodes the specified ClientBatchListRequest message. Does not implicitly {@link ClientBatchListRequest.verify|verify} messages.
    * @param message ClientBatchListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientBatchListRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientBatchListRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBatchListRequest message, length delimited. Does not implicitly {@link ClientBatchListRequest.verify|verify} messages.
    * @param message ClientBatchListRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientBatchListRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientBatchListRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBatchListRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBatchListRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientBatchListRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBatchListRequest]
  
  /**
    * Creates a plain object from a ClientBatchListRequest message. Also converts values to other types if specified.
    * @param message ClientBatchListRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientBatchListRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientBatchListRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientBatchListRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
