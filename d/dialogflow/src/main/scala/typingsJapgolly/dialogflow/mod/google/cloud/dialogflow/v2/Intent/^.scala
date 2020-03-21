package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.IIntent
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Intent instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Intent instance
    */
  def create(): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  def create(properties: IIntent): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  /**
    * Decodes an Intent message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Intent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  def decode(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  /**
    * Decodes an Intent message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Intent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  /**
    * Encodes the specified Intent message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.verify|verify} messages.
    * @param message Intent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IIntent): Writer = js.native
  def encode(message: IIntent, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Intent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.verify|verify} messages.
    * @param message Intent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IIntent): Writer = js.native
  def encodeDelimited(message: IIntent, writer: Writer): Writer = js.native
  /**
    * Creates an Intent message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Intent
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent = js.native
  /**
    * Creates a plain object from an Intent message. Also converts values to other types if specified.
    * @param message Intent
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an Intent message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

