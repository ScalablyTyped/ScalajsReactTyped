package typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.protobuf.IFieldDescriptorProto
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.protobuf.FieldDescriptorProto")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new FieldDescriptorProto instance using the specified properties.
    * @param [properties] Properties to set
    * @returns FieldDescriptorProto instance
    */
  def create(): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  def create(properties: IFieldDescriptorProto): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  def decode(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  /**
    * Decodes a FieldDescriptorProto message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns FieldDescriptorProto
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  /**
    * Encodes the specified FieldDescriptorProto message. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IFieldDescriptorProto): Writer = js.native
  def encode(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Encodes the specified FieldDescriptorProto message, length delimited. Does not implicitly {@link google.protobuf.FieldDescriptorProto.verify|verify} messages.
    * @param message FieldDescriptorProto message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IFieldDescriptorProto): Writer = js.native
  def encodeDelimited(message: IFieldDescriptorProto, writer: Writer): Writer = js.native
  /**
    * Creates a FieldDescriptorProto message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns FieldDescriptorProto
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto = js.native
  /**
    * Creates a plain object from a FieldDescriptorProto message. Also converts values to other types if specified.
    * @param message FieldDescriptorProto
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.dialogflow.mod.google.protobuf.FieldDescriptorProto,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a FieldDescriptorProto message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

