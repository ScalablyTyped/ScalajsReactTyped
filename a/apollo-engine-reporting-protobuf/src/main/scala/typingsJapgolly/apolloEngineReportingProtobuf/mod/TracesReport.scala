package typingsJapgolly.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ITracesReport
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "TracesReport")
@js.native
/**
  * Constructs a new TracesReport.
  * @param [properties] Properties to set
  */
class TracesReport ()
  extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport {
  def this(properties: ITracesReport) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "TracesReport")
@js.native
object TracesReport extends js.Object {
  /**
    * Creates a new TracesReport instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TracesReport instance
    */
  def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  def create(properties: ITracesReport): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  /**
    * Decodes a TracesReport message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TracesReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  /**
    * Decodes a TracesReport message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TracesReport
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  /**
    * Encodes the specified TracesReport message. Does not implicitly {@link TracesReport.verify|verify} messages.
    * @param message TracesReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITracesReport): Writer = js.native
  def encode(message: ITracesReport, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TracesReport message, length delimited. Does not implicitly {@link TracesReport.verify|verify} messages.
    * @param message TracesReport message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITracesReport): Writer = js.native
  def encodeDelimited(message: ITracesReport, writer: Writer): Writer = js.native
  /**
    * Creates a TracesReport message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TracesReport
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport = js.native
  /**
    * Creates a plain object from a TracesReport message. Also converts values to other types if specified.
    * @param message TracesReport
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TracesReport,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TracesReport message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

