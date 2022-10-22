package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a StreamingDetectIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest")
@js.native
/**
  * Constructs a new StreamingDetectIntentRequest.
  * @param [properties] Properties to set
  */
open class StreamingDetectIntentRequest ()
  extends StObject
     with IStreamingDetectIntentRequest {
  def this(properties: IStreamingDetectIntentRequest) = this()
  
  /** StreamingDetectIntentRequest inputAudio. */
  @JSName("inputAudio")
  var inputAudio_StreamingDetectIntentRequest: js.typedarray.Uint8Array | String = js.native
  
  /** StreamingDetectIntentRequest session. */
  @JSName("session")
  var session_StreamingDetectIntentRequest: String = js.native
  
  /** StreamingDetectIntentRequest singleUtterance. */
  @JSName("singleUtterance")
  var singleUtterance_StreamingDetectIntentRequest: Boolean = js.native
  
  /**
    * Converts this StreamingDetectIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object StreamingDetectIntentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new StreamingDetectIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StreamingDetectIntentRequest instance
    */
  /* static member */
  inline def create(): StreamingDetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[StreamingDetectIntentRequest]
  inline def create(properties: IStreamingDetectIntentRequest): StreamingDetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): StreamingDetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): StreamingDetectIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingDetectIntentRequest]
  /**
    * Decodes a StreamingDetectIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StreamingDetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): StreamingDetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentRequest]
  inline def decode(reader: Reader, length: Double): StreamingDetectIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[StreamingDetectIntentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): StreamingDetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentRequest]
  /**
    * Decodes a StreamingDetectIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StreamingDetectIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): StreamingDetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentRequest]
  
  /**
    * Encodes the specified StreamingDetectIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.verify|verify} messages.
    * @param message StreamingDetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IStreamingDetectIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IStreamingDetectIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified StreamingDetectIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.StreamingDetectIntentRequest.verify|verify} messages.
    * @param message StreamingDetectIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IStreamingDetectIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IStreamingDetectIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a StreamingDetectIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StreamingDetectIntentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): StreamingDetectIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[StreamingDetectIntentRequest]
  
  /**
    * Creates a plain object from a StreamingDetectIntentRequest message. Also converts values to other types if specified.
    * @param message StreamingDetectIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: StreamingDetectIntentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: StreamingDetectIntentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a StreamingDetectIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
