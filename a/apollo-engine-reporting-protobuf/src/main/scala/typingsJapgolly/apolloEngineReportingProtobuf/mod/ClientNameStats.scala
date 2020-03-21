package typingsJapgolly.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.IClientNameStats
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "ClientNameStats")
@js.native
/**
  * Constructs a new ClientNameStats.
  * @param [properties] Properties to set
  */
class ClientNameStats ()
  extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats {
  def this(properties: IClientNameStats) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "ClientNameStats")
@js.native
object ClientNameStats extends js.Object {
  /**
    * Creates a new ClientNameStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientNameStats instance
    */
  def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  def create(properties: IClientNameStats): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  /**
    * Decodes a ClientNameStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientNameStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  /**
    * Decodes a ClientNameStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientNameStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  /**
    * Encodes the specified ClientNameStats message. Does not implicitly {@link ClientNameStats.verify|verify} messages.
    * @param message ClientNameStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientNameStats): Writer = js.native
  def encode(message: IClientNameStats, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ClientNameStats message, length delimited. Does not implicitly {@link ClientNameStats.verify|verify} messages.
    * @param message ClientNameStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientNameStats): Writer = js.native
  def encodeDelimited(message: IClientNameStats, writer: Writer): Writer = js.native
  /**
    * Creates a ClientNameStats message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientNameStats
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats = js.native
  /**
    * Creates a plain object from a ClientNameStats message. Also converts values to other types if specified.
    * @param message ClientNameStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ClientNameStats,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ClientNameStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

