package typingsJapgolly.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.ITimestamp
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "google")
@js.native
object google extends js.Object {
  /** Namespace protobuf. */
  @js.native
  object protobuf extends js.Object {
    /** Represents a Timestamp. */
    @js.native
    /**
      * Constructs a new Timestamp.
      * @param [properties] Properties to set
      */
    class Timestamp ()
      extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp {
      def this(properties: ITimestamp) = this()
    }
    
    /* static members */
    @js.native
    object Timestamp extends js.Object {
      /**
        * Creates a new Timestamp instance using the specified properties.
        * @param [properties] Properties to set
        * @returns Timestamp instance
        */
      def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def create(properties: ITimestamp): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      /**
        * Decodes a Timestamp message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      /**
        * Decodes a Timestamp message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns Timestamp
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      /**
        * Encodes the specified Timestamp message. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encode(message: ITimestamp): Writer = js.native
      def encode(message: ITimestamp, writer: Writer): Writer = js.native
      /**
        * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link google.protobuf.Timestamp.verify|verify} messages.
        * @param message Timestamp message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      def encodeDelimited(message: ITimestamp): Writer = js.native
      def encodeDelimited(message: ITimestamp, writer: Writer): Writer = js.native
      /**
        * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns Timestamp
        */
      def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp = js.native
      /**
        * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
        * @param message Timestamp
        * @param [options] Conversion options
        * @returns Plain object
        */
      def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp): StringDictionary[js.Any] = js.native
      def toObject(
        message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.google.protobuf.Timestamp,
        options: IConversionOptions
      ): StringDictionary[js.Any] = js.native
      /**
        * Verifies a Timestamp message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
  }
  
}

