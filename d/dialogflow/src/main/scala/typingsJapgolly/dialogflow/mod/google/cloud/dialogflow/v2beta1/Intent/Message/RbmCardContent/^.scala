package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.IRbmCardContent
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new RbmCardContent instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RbmCardContent instance
    */
  def create(): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  def create(properties: IRbmCardContent): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  /**
    * Decodes a RbmCardContent message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RbmCardContent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  def decode(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  /**
    * Decodes a RbmCardContent message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RbmCardContent
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  /**
    * Encodes the specified RbmCardContent message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.verify|verify} messages.
    * @param message RbmCardContent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IRbmCardContent): Writer = js.native
  def encode(message: IRbmCardContent, writer: Writer): Writer = js.native
  /**
    * Encodes the specified RbmCardContent message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent.verify|verify} messages.
    * @param message RbmCardContent message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IRbmCardContent): Writer = js.native
  def encodeDelimited(message: IRbmCardContent, writer: Writer): Writer = js.native
  /**
    * Creates a RbmCardContent message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RbmCardContent
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent = js.native
  /**
    * Creates a plain object from a RbmCardContent message. Also converts values to other types if specified.
    * @param message RbmCardContent
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(
    message: typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent
  ): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmCardContent,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a RbmCardContent message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

