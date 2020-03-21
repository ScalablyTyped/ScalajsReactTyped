package typingsJapgolly.apolloEngineReportingProtobuf.mod.Trace

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.ICachePolicy
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a CachePolicy. */
@JSImport("apollo-engine-reporting-protobuf", "Trace.CachePolicy")
@js.native
/**
  * Constructs a new CachePolicy.
  * @param [properties] Properties to set
  */
class CachePolicy ()
  extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy {
  def this(properties: ICachePolicy) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "Trace.CachePolicy")
@js.native
object CachePolicy extends js.Object {
  /**
    * Creates a new CachePolicy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns CachePolicy instance
    */
  def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def create(properties: ICachePolicy): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  /**
    * Decodes a CachePolicy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns CachePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  /**
    * Decodes a CachePolicy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns CachePolicy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  /**
    * Encodes the specified CachePolicy message. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
    * @param message CachePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ICachePolicy): Writer = js.native
  def encode(message: ICachePolicy, writer: Writer): Writer = js.native
  /**
    * Encodes the specified CachePolicy message, length delimited. Does not implicitly {@link Trace.CachePolicy.verify|verify} messages.
    * @param message CachePolicy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ICachePolicy): Writer = js.native
  def encodeDelimited(message: ICachePolicy, writer: Writer): Writer = js.native
  /**
    * Creates a CachePolicy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns CachePolicy
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy = js.native
  /**
    * Creates a plain object from a CachePolicy message. Also converts values to other types if specified.
    * @param message CachePolicy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a CachePolicy message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  /** Scope enum. */
  @js.native
  object Scope extends js.Object {
    /* 2 */ val PRIVATE: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PRIVATE with Double = js.native
    /* 1 */ val PUBLIC: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.PUBLIC with Double = js.native
    /* 0 */ val UNKNOWN: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope.UNKNOWN with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.Trace.CachePolicy.Scope with Double
      ] = js.native
  }
  
}

