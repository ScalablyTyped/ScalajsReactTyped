package typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.protobuf.IEnumDescriptorProto
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.protobuf.EnumDescriptorProto")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new EnumDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumDescriptorProto instance
    */
  def create(): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  def create(properties: IEnumDescriptorProto): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  def decode(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  /**
    * Decodes an EnumDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  /**
    * Encodes the specified EnumDescriptorProto message. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IEnumDescriptorProto): Writer = js.native
  def encode(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified EnumDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.EnumDescriptorProto.verify|verify} messages.
    * @param message EnumDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IEnumDescriptorProto): Writer = js.native
  def encodeDelimited(message: IEnumDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates an EnumDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumDescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto = js.native
  /**
    * Creates a plain object from an EnumDescriptorProto message. Also converts values to other types if specified.
    * @param message EnumDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.dialogflow.mod.google.protobuf.EnumDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies an EnumDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

