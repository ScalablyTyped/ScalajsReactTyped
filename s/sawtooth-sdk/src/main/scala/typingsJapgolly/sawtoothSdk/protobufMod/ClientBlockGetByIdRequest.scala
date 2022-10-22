package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest")
@js.native
/**
  * Constructs a new ClientBlockGetByIdRequest.
  * @param [properties] Properties to set
  */
open class ClientBlockGetByIdRequest ()
  extends StObject
     with IClientBlockGetByIdRequest {
  def this(properties: IClientBlockGetByIdRequest) = this()
  
  /** ClientBlockGetByIdRequest blockId. */
  @JSName("blockId")
  var blockId_ClientBlockGetByIdRequest: String = js.native
  
  /**
    * Converts this ClientBlockGetByIdRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientBlockGetByIdRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientBlockGetByIdRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientBlockGetByIdRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientBlockGetByIdRequest instance
    */
  inline def create(): ClientBlockGetByIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientBlockGetByIdRequest]
  inline def create(properties: IClientBlockGetByIdRequest): ClientBlockGetByIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByIdRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientBlockGetByIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByIdRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientBlockGetByIdRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetByIdRequest]
  /**
    * Decodes a ClientBlockGetByIdRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientBlockGetByIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientBlockGetByIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByIdRequest]
  inline def decode(reader: Reader, length: Double): ClientBlockGetByIdRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientBlockGetByIdRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientBlockGetByIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByIdRequest]
  /**
    * Decodes a ClientBlockGetByIdRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientBlockGetByIdRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientBlockGetByIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByIdRequest]
  
  /**
    * Encodes the specified ClientBlockGetByIdRequest message. Does not implicitly {@link ClientBlockGetByIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientBlockGetByIdRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientBlockGetByIdRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientBlockGetByIdRequest message, length delimited. Does not implicitly {@link ClientBlockGetByIdRequest.verify|verify} messages.
    * @param message ClientBlockGetByIdRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientBlockGetByIdRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientBlockGetByIdRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientBlockGetByIdRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientBlockGetByIdRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientBlockGetByIdRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientBlockGetByIdRequest]
  
  /**
    * Creates a plain object from a ClientBlockGetByIdRequest message. Also converts values to other types if specified.
    * @param message ClientBlockGetByIdRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientBlockGetByIdRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientBlockGetByIdRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientBlockGetByIdRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
