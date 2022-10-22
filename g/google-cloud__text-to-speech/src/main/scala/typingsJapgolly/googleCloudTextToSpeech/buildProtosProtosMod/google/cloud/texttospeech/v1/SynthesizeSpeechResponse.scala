package typingsJapgolly.googleCloudTextToSpeech.buildProtosProtosMod.google.cloud.texttospeech.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.googleGax.mod.protobuf.Reader
import typingsJapgolly.googleGax.mod.protobuf.Writer
import typingsJapgolly.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a SynthesizeSpeechResponse. */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse")
@js.native
/**
  * Constructs a new SynthesizeSpeechResponse.
  * @param [properties] Properties to set
  */
open class SynthesizeSpeechResponse ()
  extends StObject
     with ISynthesizeSpeechResponse {
  def this(properties: ISynthesizeSpeechResponse) = this()
  
  /** SynthesizeSpeechResponse audioContent. */
  @JSName("audioContent")
  var audioContent_SynthesizeSpeechResponse: js.typedarray.Uint8Array | String = js.native
  
  /**
    * Converts this SynthesizeSpeechResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object SynthesizeSpeechResponse {
  
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1.SynthesizeSpeechResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SynthesizeSpeechResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SynthesizeSpeechResponse instance
    */
  /* static member */
  inline def create(): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[SynthesizeSpeechResponse]
  inline def create(properties: ISynthesizeSpeechResponse): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): SynthesizeSpeechResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeSpeechResponse]
  /**
    * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SynthesizeSpeechResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  inline def decode(reader: Reader, length: Double): SynthesizeSpeechResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[SynthesizeSpeechResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  /**
    * Decodes a SynthesizeSpeechResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SynthesizeSpeechResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  
  /**
    * Encodes the specified SynthesizeSpeechResponse message. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify|verify} messages.
    * @param message SynthesizeSpeechResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ISynthesizeSpeechResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ISynthesizeSpeechResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified SynthesizeSpeechResponse message, length delimited. Does not implicitly {@link google.cloud.texttospeech.v1.SynthesizeSpeechResponse.verify|verify} messages.
    * @param message SynthesizeSpeechResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ISynthesizeSpeechResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ISynthesizeSpeechResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a SynthesizeSpeechResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SynthesizeSpeechResponse
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): SynthesizeSpeechResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[SynthesizeSpeechResponse]
  
  /**
    * Gets the default type url for SynthesizeSpeechResponse
    * @param [typeUrlPrefix] your custom typeUrlPrefix(default "type.googleapis.com")
    * @returns The default type url
    */
  /* static member */
  inline def getTypeUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")().asInstanceOf[String]
  inline def getTypeUrl(typeUrlPrefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUrl")(typeUrlPrefix.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Creates a plain object from a SynthesizeSpeechResponse message. Also converts values to other types if specified.
    * @param message SynthesizeSpeechResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: SynthesizeSpeechResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: SynthesizeSpeechResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a SynthesizeSpeechResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
