package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DetectIntentResponse. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse")
@js.native
/**
  * Constructs a new DetectIntentResponse.
  * @param [properties] Properties to set
  */
open class DetectIntentResponse ()
  extends StObject
     with IDetectIntentResponse {
  def this(properties: IDetectIntentResponse) = this()
  
  /** DetectIntentResponse outputAudio. */
  @JSName("outputAudio")
  var outputAudio_DetectIntentResponse: js.typedarray.Uint8Array | String = js.native
  
  /** DetectIntentResponse responseId. */
  @JSName("responseId")
  var responseId_DetectIntentResponse: String = js.native
  
  /**
    * Converts this DetectIntentResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DetectIntentResponse {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DetectIntentResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DetectIntentResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DetectIntentResponse instance
    */
  /* static member */
  inline def create(): DetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DetectIntentResponse]
  inline def create(properties: IDetectIntentResponse): DetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DetectIntentResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): DetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DetectIntentResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DetectIntentResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DetectIntentResponse]
  /**
    * Decodes a DetectIntentResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DetectIntentResponse]
  inline def decode(reader: Reader, length: Double): DetectIntentResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DetectIntentResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DetectIntentResponse]
  /**
    * Decodes a DetectIntentResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DetectIntentResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DetectIntentResponse]
  
  /**
    * Encodes the specified DetectIntentResponse message. Does not implicitly {@link google.cloud.dialogflow.v2.DetectIntentResponse.verify|verify} messages.
    * @param message DetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDetectIntentResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDetectIntentResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DetectIntentResponse message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DetectIntentResponse.verify|verify} messages.
    * @param message DetectIntentResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDetectIntentResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDetectIntentResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DetectIntentResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DetectIntentResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DetectIntentResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DetectIntentResponse]
  
  /**
    * Creates a plain object from a DetectIntentResponse message. Also converts values to other types if specified.
    * @param message DetectIntentResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DetectIntentResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DetectIntentResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DetectIntentResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
