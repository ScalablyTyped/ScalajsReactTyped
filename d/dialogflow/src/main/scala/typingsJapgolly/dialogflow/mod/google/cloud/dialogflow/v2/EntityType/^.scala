package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.IEntityType
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.EntityType")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new EntityType instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EntityType instance
    */
  def create(): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  def create(properties: IEntityType): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  /**
    * Decodes an EntityType message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  def decode(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  /**
    * Decodes an EntityType message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EntityType
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  /**
    * Encodes the specified EntityType message. Does not implicitly {@link google.cloud.dialogflow.v2.EntityType.verify|verify} messages.
    * @param message EntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEntityType): Writer = js.native
  def encode(message: IEntityType, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EntityType message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.EntityType.verify|verify} messages.
    * @param message EntityType message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEntityType): Writer = js.native
  def encodeDelimited(message: IEntityType, writer: Writer): Writer = js.native
  /**
    * Creates an EntityType message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EntityType
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType = js.native
  /**
    * Creates a plain object from an EntityType message. Also converts values to other types if specified.
    * @param message EntityType
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2.EntityType,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EntityType message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

