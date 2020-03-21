package typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dialogflow.mod.google.protobuf.ISourceCodeInfo
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dialogflow/protos/protos", "google.protobuf.SourceCodeInfo")
@js.native
object ^ extends js.Object {
  /**
    * Creates a new SourceCodeInfo instance using the specified properties.
    * @param [properties] Properties to set
    * @returns SourceCodeInfo instance
    */
  def create(): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  def create(properties: ISourceCodeInfo): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  def decode(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  /**
    * Decodes a SourceCodeInfo message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns SourceCodeInfo
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  /**
    * Encodes the specified SourceCodeInfo message. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ISourceCodeInfo): Writer = js.native
  def encode(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  /**
    * Encodes the specified SourceCodeInfo message, length delimited. Does not implicitly {@link google.protobuf.SourceCodeInfo.verify|verify} messages.
    * @param message SourceCodeInfo message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ISourceCodeInfo): Writer = js.native
  def encodeDelimited(message: ISourceCodeInfo, writer: Writer): Writer = js.native
  /**
    * Creates a SourceCodeInfo message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns SourceCodeInfo
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo = js.native
  /**
    * Creates a plain object from a SourceCodeInfo message. Also converts values to other types if specified.
    * @param message SourceCodeInfo
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.dialogflow.mod.google.protobuf.SourceCodeInfo,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a SourceCodeInfo message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

