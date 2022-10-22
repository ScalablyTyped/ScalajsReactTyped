package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpRegisterRequest")
@js.native
/**
  * Constructs a new TpRegisterRequest.
  * @param [properties] Properties to set
  */
open class TpRegisterRequest ()
  extends StObject
     with ITpRegisterRequest {
  def this(properties: ITpRegisterRequest) = this()
  
  /** TpRegisterRequest family. */
  @JSName("family")
  var family_TpRegisterRequest: String = js.native
  
  /** TpRegisterRequest maxOccupancy. */
  @JSName("maxOccupancy")
  var maxOccupancy_TpRegisterRequest: Double = js.native
  
  /** TpRegisterRequest namespaces. */
  @JSName("namespaces")
  var namespaces_TpRegisterRequest: js.Array[String] = js.native
  
  /**
    * Converts this TpRegisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** TpRegisterRequest version. */
  @JSName("version")
  var version_TpRegisterRequest: String = js.native
}
/* static members */
object TpRegisterRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "TpRegisterRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TpRegisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpRegisterRequest instance
    */
  inline def create(): TpRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpRegisterRequest]
  inline def create(properties: ITpRegisterRequest): TpRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpRegisterRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): TpRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpRegisterRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TpRegisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpRegisterRequest]
  /**
    * Decodes a TpRegisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): TpRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpRegisterRequest]
  inline def decode(reader: Reader, length: Double): TpRegisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpRegisterRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TpRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpRegisterRequest]
  /**
    * Decodes a TpRegisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): TpRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpRegisterRequest]
  
  /**
    * Encodes the specified TpRegisterRequest message. Does not implicitly {@link TpRegisterRequest.verify|verify} messages.
    * @param message TpRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpRegisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpRegisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpRegisterRequest message, length delimited. Does not implicitly {@link TpRegisterRequest.verify|verify} messages.
    * @param message TpRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpRegisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpRegisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpRegisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpRegisterRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): TpRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpRegisterRequest]
  
  /**
    * Creates a plain object from a TpRegisterRequest message. Also converts values to other types if specified.
    * @param message TpRegisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: TpRegisterRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TpRegisterRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TpRegisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
