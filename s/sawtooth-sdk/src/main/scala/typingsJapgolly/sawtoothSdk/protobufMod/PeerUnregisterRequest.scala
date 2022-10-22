package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest")
@js.native
/**
  * Constructs a new PeerUnregisterRequest.
  * @param [properties] Properties to set
  */
open class PeerUnregisterRequest ()
  extends StObject
     with IPeerUnregisterRequest {
  def this(properties: IPeerUnregisterRequest) = this()
  
  /**
    * Converts this PeerUnregisterRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object PeerUnregisterRequest {
  
  @JSImport("sawtooth-sdk/protobuf", "PeerUnregisterRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new PeerUnregisterRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns PeerUnregisterRequest instance
    */
  inline def create(): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[PeerUnregisterRequest]
  inline def create(properties: IPeerUnregisterRequest): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): PeerUnregisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PeerUnregisterRequest]
  /**
    * Decodes a PeerUnregisterRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns PeerUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  inline def decode(reader: Reader, length: Double): PeerUnregisterRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[PeerUnregisterRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  /**
    * Decodes a PeerUnregisterRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns PeerUnregisterRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  
  /**
    * Encodes the specified PeerUnregisterRequest message. Does not implicitly {@link PeerUnregisterRequest.verify|verify} messages.
    * @param message PeerUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IPeerUnregisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IPeerUnregisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified PeerUnregisterRequest message, length delimited. Does not implicitly {@link PeerUnregisterRequest.verify|verify} messages.
    * @param message PeerUnregisterRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IPeerUnregisterRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IPeerUnregisterRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a PeerUnregisterRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns PeerUnregisterRequest
    */
  inline def fromObject(`object`: StringDictionary[Any]): PeerUnregisterRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[PeerUnregisterRequest]
  
  /**
    * Creates a plain object from a PeerUnregisterRequest message. Also converts values to other types if specified.
    * @param message PeerUnregisterRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: PeerUnregisterRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: PeerUnregisterRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a PeerUnregisterRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
