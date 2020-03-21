package typingsJapgolly.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.IType
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "Type")
@js.native
/**
  * Constructs a new Type.
  * @param [properties] Properties to set
  */
class Type ()
  extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type {
  def this(properties: IType) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Type")
@js.native
object Type extends js.Object {
  /**
    * Creates a new Type instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Type instance
    */
  def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  def create(properties: IType): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  /**
    * Decodes a Type message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Type
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  /**
    * Decodes a Type message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Type
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  /**
    * Encodes the specified Type message. Does not implicitly {@link Type.verify|verify} messages.
    * @param message Type message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IType): Writer = js.native
  def encode(message: IType, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Type message, length delimited. Does not implicitly {@link Type.verify|verify} messages.
    * @param message Type message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IType): Writer = js.native
  def encodeDelimited(message: IType, writer: Writer): Writer = js.native
  /**
    * Creates a Type message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Type
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type = js.native
  /**
    * Creates a plain object from a Type message. Also converts values to other types if specified.
    * @param message Type
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Type,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Type message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

