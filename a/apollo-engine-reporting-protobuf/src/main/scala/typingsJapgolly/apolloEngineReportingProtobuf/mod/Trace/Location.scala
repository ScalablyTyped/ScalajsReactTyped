package typingsJapgolly.apolloEngineReportingProtobuf.mod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.ILocation
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Location. */
@JSImport("apollo-engine-reporting-protobuf", "Trace.Location")
@js.native
/**
  * Constructs a new Location.
  * @param [properties] Properties to set
  */
class Location ()
  extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location {
  def this(properties: ILocation) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Trace.Location")
@js.native
object Location extends js.Object {
  /**
    * Creates a new Location instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Location instance
    */
  def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  def create(properties: ILocation): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  /**
    * Decodes a Location message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Location
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  /**
    * Decodes a Location message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Location
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  /**
    * Encodes the specified Location message. Does not implicitly {@link Trace.Location.verify|verify} messages.
    * @param message Location message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ILocation): Writer = js.native
  def encode(message: ILocation, writer: Writer): Writer = js.native
  /**
    * Encodes the specified Location message, length delimited. Does not implicitly {@link Trace.Location.verify|verify} messages.
    * @param message Location message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ILocation): Writer = js.native
  def encodeDelimited(message: ILocation, writer: Writer): Writer = js.native
  /**
    * Creates a Location message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Location
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location = js.native
  /**
    * Creates a plain object from a Location message. Also converts values to other types if specified.
    * @param message Location
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.Location,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a Location message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

