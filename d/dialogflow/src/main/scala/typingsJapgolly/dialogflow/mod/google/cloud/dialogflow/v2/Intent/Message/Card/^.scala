package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.ICard
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.Intent.Message.Card")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new Card instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Card instance
    */
  def create(): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  def create(properties: ICard): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  /**
    * Decodes a Card message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Card
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  def decode(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  /**
    * Decodes a Card message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Card
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  /**
    * Encodes the specified Card message. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.verify|verify} messages.
    * @param message Card message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICard): Writer = js.native
  def encode(message: ICard, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Card message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.Intent.Message.Card.verify|verify} messages.
    * @param message Card message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICard): Writer = js.native
  def encodeDelimited(message: ICard, writer: Writer): Writer = js.native
  /**
    * Creates a Card message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Card
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card = js.native
  /**
    * Creates a plain object from a Card message. Also converts values to other types if specified.
    * @param message Card
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.Card,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Card message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

