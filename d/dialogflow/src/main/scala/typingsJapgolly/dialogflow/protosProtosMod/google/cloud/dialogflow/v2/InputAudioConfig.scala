package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an InputAudioConfig. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig")
@js.native
/**
  * Constructs a new InputAudioConfig.
  * @param [properties] Properties to set
  */
open class InputAudioConfig ()
  extends StObject
     with IInputAudioConfig {
  def this(properties: IInputAudioConfig) = this()
  
  /** InputAudioConfig audioEncoding. */
  @JSName("audioEncoding")
  var audioEncoding_InputAudioConfig: AudioEncoding | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.AudioEncoding * / any */ String) = js.native
  
  /** InputAudioConfig enableWordInfo. */
  @JSName("enableWordInfo")
  var enableWordInfo_InputAudioConfig: Boolean = js.native
  
  /** InputAudioConfig languageCode. */
  @JSName("languageCode")
  var languageCode_InputAudioConfig: String = js.native
  
  /** InputAudioConfig modelVariant. */
  @JSName("modelVariant")
  var modelVariant_InputAudioConfig: SpeechModelVariant | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.cloud.dialogflow.v2.SpeechModelVariant * / any */ String) = js.native
  
  /** InputAudioConfig model. */
  @JSName("model")
  var model_InputAudioConfig: String = js.native
  
  /** InputAudioConfig phraseHints. */
  @JSName("phraseHints")
  var phraseHints_InputAudioConfig: js.Array[String] = js.native
  
  /** InputAudioConfig sampleRateHertz. */
  @JSName("sampleRateHertz")
  var sampleRateHertz_InputAudioConfig: Double = js.native
  
  /** InputAudioConfig singleUtterance. */
  @JSName("singleUtterance")
  var singleUtterance_InputAudioConfig: Boolean = js.native
  
  /** InputAudioConfig speechContexts. */
  @JSName("speechContexts")
  var speechContexts_InputAudioConfig: js.Array[ISpeechContext] = js.native
  
  /**
    * Converts this InputAudioConfig to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object InputAudioConfig {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.InputAudioConfig")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new InputAudioConfig instance using the specified properties.
    * @param [properties] Properties to set
    * @returns InputAudioConfig instance
    */
  /* static member */
  inline def create(): InputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[InputAudioConfig]
  inline def create(properties: IInputAudioConfig): InputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[InputAudioConfig]
  
  inline def decode(reader: js.typedarray.Uint8Array): InputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[InputAudioConfig]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): InputAudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[InputAudioConfig]
  /**
    * Decodes an InputAudioConfig message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns InputAudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): InputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[InputAudioConfig]
  inline def decode(reader: Reader, length: Double): InputAudioConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[InputAudioConfig]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): InputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[InputAudioConfig]
  /**
    * Decodes an InputAudioConfig message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns InputAudioConfig
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): InputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[InputAudioConfig]
  
  /**
    * Encodes the specified InputAudioConfig message. Does not implicitly {@link google.cloud.dialogflow.v2.InputAudioConfig.verify|verify} messages.
    * @param message InputAudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IInputAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IInputAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified InputAudioConfig message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.InputAudioConfig.verify|verify} messages.
    * @param message InputAudioConfig message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IInputAudioConfig): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IInputAudioConfig, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an InputAudioConfig message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns InputAudioConfig
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): InputAudioConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[InputAudioConfig]
  
  /**
    * Creates a plain object from an InputAudioConfig message. Also converts values to other types if specified.
    * @param message InputAudioConfig
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: InputAudioConfig): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: InputAudioConfig, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an InputAudioConfig message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
