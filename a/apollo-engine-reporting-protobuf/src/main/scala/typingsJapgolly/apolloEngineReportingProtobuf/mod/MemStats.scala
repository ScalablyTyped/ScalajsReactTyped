package typingsJapgolly.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.IMemStats
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "MemStats")
@js.native
/**
  * Constructs a new MemStats.
  * @param [properties] Properties to set
  */
class MemStats ()
  extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats {
  def this(properties: IMemStats) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "MemStats")
@js.native
object MemStats extends js.Object {
  /**
    * Creates a new MemStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MemStats instance
    */
  def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  def create(properties: IMemStats): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  /**
    * Decodes a MemStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MemStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  /**
    * Decodes a MemStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MemStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  /**
    * Encodes the specified MemStats message. Does not implicitly {@link MemStats.verify|verify} messages.
    * @param message MemStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IMemStats): Writer = js.native
  def encode(message: IMemStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified MemStats message, length delimited. Does not implicitly {@link MemStats.verify|verify} messages.
    * @param message MemStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IMemStats): Writer = js.native
  def encodeDelimited(message: IMemStats, writer: Writer): Writer = js.native
  /**
    * Creates a MemStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns MemStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats = js.native
  /**
    * Creates a plain object from a MemStats message. Also converts values to other types if specified.
    * @param message MemStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.MemStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a MemStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

