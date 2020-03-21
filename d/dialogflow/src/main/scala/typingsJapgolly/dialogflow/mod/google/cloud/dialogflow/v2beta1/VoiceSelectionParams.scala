package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a VoiceSelectionParams. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.VoiceSelectionParams")
@js.native
/**
  * Constructs a new VoiceSelectionParams.
  * @param [properties] Properties to set
  */
class VoiceSelectionParams () extends IVoiceSelectionParams {
  def this(properties: IVoiceSelectionParams) = this()
  /** VoiceSelectionParams name. */
  @JSName("name")
  var name_VoiceSelectionParams: String = js.native
  /** VoiceSelectionParams ssmlGender. */
  @JSName("ssmlGender")
  var ssmlGender_VoiceSelectionParams: SsmlVoiceGender = js.native
  /**
    * Converts this VoiceSelectionParams to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.VoiceSelectionParams")
@js.native
object VoiceSelectionParams extends js.Object {
  /**
    * Creates a new VoiceSelectionParams instance using the specified properties.
    * @param [properties] Properties to set
    * @returns VoiceSelectionParams instance
    */
  def create(): VoiceSelectionParams = js.native
  def create(properties: IVoiceSelectionParams): VoiceSelectionParams = js.native
  /**
    * Decodes a VoiceSelectionParams message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns VoiceSelectionParams
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): VoiceSelectionParams = js.native
  def decode(reader: Reader, length: Double): VoiceSelectionParams = js.native
  def decode(reader: Uint8Array): VoiceSelectionParams = js.native
  def decode(reader: Uint8Array, length: Double): VoiceSelectionParams = js.native
  /**
    * Decodes a VoiceSelectionParams message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns VoiceSelectionParams
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): VoiceSelectionParams = js.native
  def decodeDelimited(reader: Uint8Array): VoiceSelectionParams = js.native
  /**
    * Encodes the specified VoiceSelectionParams message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.VoiceSelectionParams.verify|verify} messages.
    * @param message VoiceSelectionParams message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IVoiceSelectionParams): Writer = js.native
  def encode(message: IVoiceSelectionParams, writer: Writer): Writer = js.native
  /**
    * Encodes the specified VoiceSelectionParams message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.VoiceSelectionParams.verify|verify} messages.
    * @param message VoiceSelectionParams message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IVoiceSelectionParams): Writer = js.native
  def encodeDelimited(message: IVoiceSelectionParams, writer: Writer): Writer = js.native
  /**
    * Creates a VoiceSelectionParams message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns VoiceSelectionParams
    */
  def fromObject(`object`: StringDictionary[js.Any]): VoiceSelectionParams = js.native
  /**
    * Creates a plain object from a VoiceSelectionParams message. Also converts values to other types if specified.
    * @param message VoiceSelectionParams
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: VoiceSelectionParams): StringDictionary[js.Any] = js.native
  def toObject(message: VoiceSelectionParams, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a VoiceSelectionParams message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

