package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "PeerRegisterRequest")
@js.native
/**
  * Constructs a new PeerRegisterRequest.
  * @param [properties] Properties to set
  */
open class PeerRegisterRequest ()
  extends StObject
     with IPeerRegisterRequest {
  def this(properties: IPeerRegisterRequest) = this()
  
  /** PeerRegisterRequest endpoint. */
  @JSName("endpoint")
  var endpoint_PeerRegisterRequest: String = js.native
  
  /** PeerRegisterRequest protocolVersion. */
  @JSName("protocolVersion")
  var protocolVersion_PeerRegisterRequest: Double = js.native
  
  /**
    * Converts this PeerRegisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object PeerRegisterRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "PeerRegisterRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PeerRegisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PeerRegisterRequest instance
    */
  inline def create(): PeerRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PeerRegisterRequest]
  inline def create(properties: IPeerRegisterRequest): PeerRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PeerRegisterRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): PeerRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerRegisterRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PeerRegisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PeerRegisterRequest]
  /**
    * Decodes a PeerRegisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PeerRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): PeerRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerRegisterRequest]
  inline def decode(reader: Reader, length: Double): PeerRegisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PeerRegisterRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PeerRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerRegisterRequest]
  /**
    * Decodes a PeerRegisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PeerRegisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): PeerRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerRegisterRequest]
  
  /**
    * Encodes the specified PeerRegisterRequest message. Does not implicitly {@link PeerRegisterRequest.verify|verify} messages.
    * @param message PeerRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IPeerRegisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPeerRegisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PeerRegisterRequest message, length delimited. Does not implicitly {@link PeerRegisterRequest.verify|verify} messages.
    * @param message PeerRegisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IPeerRegisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPeerRegisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PeerRegisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PeerRegisterRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): PeerRegisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PeerRegisterRequest]
  
  /**
    * Creates a plain object from a PeerRegisterRequest message. Also converts values to other types if specified.
    * @param message PeerRegisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: PeerRegisterRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PeerRegisterRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PeerRegisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
