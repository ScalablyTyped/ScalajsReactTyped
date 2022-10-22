package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse")
@js.native
/**
  * Constructs a new GossipBatchResponse.
  * @param [properties] Properties to set
  */
open class GossipBatchResponse ()
  extends StObject
     with IGossipBatchResponse {
  def this(properties: IGossipBatchResponse) = this()
  
  /** GossipBatchResponse content. */
  @JSName("content")
  var content_GossipBatchResponse: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this GossipBatchResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object GossipBatchResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "GossipBatchResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new GossipBatchResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GossipBatchResponse instance
    */
  inline def create(): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[GossipBatchResponse]
  inline def create(properties: IGossipBatchResponse): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): GossipBatchResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipBatchResponse]
  /**
    * Decodes a GossipBatchResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GossipBatchResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  inline def decode(reader: Reader, length: Double): GossipBatchResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[GossipBatchResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  /**
    * Decodes a GossipBatchResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GossipBatchResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  
  /**
    * Encodes the specified GossipBatchResponse message. Does not implicitly {@link GossipBatchResponse.verify|verify} messages.
    * @param message GossipBatchResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IGossipBatchResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IGossipBatchResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified GossipBatchResponse message, length delimited. Does not implicitly {@link GossipBatchResponse.verify|verify} messages.
    * @param message GossipBatchResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IGossipBatchResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IGossipBatchResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a GossipBatchResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GossipBatchResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): GossipBatchResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[GossipBatchResponse]
  
  /**
    * Creates a plain object from a GossipBatchResponse message. Also converts values to other types if specified.
    * @param message GossipBatchResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: GossipBatchResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: GossipBatchResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a GossipBatchResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
