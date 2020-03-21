package typingsJapgolly.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.IStatsReport
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "StatsReport")
@js.native
/**
  * Constructs a new StatsReport.
  * @param [properties] Properties to set
  */
class StatsReport ()
  extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport {
  def this(properties: IStatsReport) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "StatsReport")
@js.native
object StatsReport extends js.Object {
  /**
    * Creates a new StatsReport instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StatsReport instance
    */
  def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def create(properties: IStatsReport): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  /**
    * Decodes a StatsReport message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StatsReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  /**
    * Decodes a StatsReport message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StatsReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  /**
    * Encodes the specified StatsReport message. Does not implicitly {@link StatsReport.verify|verify} messages.
    * @param message StatsReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IStatsReport): Writer = js.native
  def encode(message: IStatsReport, writer: Writer): Writer = js.native
  /**
    * Encodes the specified StatsReport message, length delimited. Does not implicitly {@link StatsReport.verify|verify} messages.
    * @param message StatsReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IStatsReport): Writer = js.native
  def encodeDelimited(message: IStatsReport, writer: Writer): Writer = js.native
  /**
    * Creates a StatsReport message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StatsReport
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport = js.native
  /**
    * Creates a plain object from a StatsReport message. Also converts values to other types if specified.
    * @param message StatsReport
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.StatsReport,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a StatsReport message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

