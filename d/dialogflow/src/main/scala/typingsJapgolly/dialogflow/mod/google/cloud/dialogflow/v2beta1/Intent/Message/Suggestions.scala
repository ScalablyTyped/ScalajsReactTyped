package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Suggestions. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Suggestions")
@js.native
/**
  * Constructs a new Suggestions.
  * @param [properties] Properties to set
  */
class Suggestions () extends ISuggestions {
  def this(properties: ISuggestions) = this()
  /** Suggestions suggestions. */
  @JSName("suggestions")
  var suggestions_Suggestions: js.Array[ISuggestion] = js.native
  /**
    * Converts this Suggestions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.Suggestions")
@js.native
object Suggestions extends js.Object {
  /**
    * Creates a new Suggestions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Suggestions instance
    */
  def create(): Suggestions = js.native
  def create(properties: ISuggestions): Suggestions = js.native
  /**
    * Decodes a Suggestions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Suggestions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): Suggestions = js.native
  def decode(reader: Reader, length: Double): Suggestions = js.native
  def decode(reader: Uint8Array): Suggestions = js.native
  def decode(reader: Uint8Array, length: Double): Suggestions = js.native
  /**
    * Decodes a Suggestions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Suggestions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): Suggestions = js.native
  def decodeDelimited(reader: Uint8Array): Suggestions = js.native
  /**
    * Encodes the specified Suggestions message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Suggestions.verify|verify} messages.
    * @param message Suggestions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISuggestions): Writer = js.native
  def encode(message: ISuggestions, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Suggestions message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.Suggestions.verify|verify} messages.
    * @param message Suggestions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISuggestions): Writer = js.native
  def encodeDelimited(message: ISuggestions, writer: Writer): Writer = js.native
  /**
    * Creates a Suggestions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Suggestions
    */
  def fromObject(`object`: StringDictionary[js.Any]): Suggestions = js.native
  /**
    * Creates a plain object from a Suggestions message. Also converts values to other types if specified.
    * @param message Suggestions
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: Suggestions): StringDictionary[js.Any] = js.native
  def toObject(message: Suggestions, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Suggestions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

