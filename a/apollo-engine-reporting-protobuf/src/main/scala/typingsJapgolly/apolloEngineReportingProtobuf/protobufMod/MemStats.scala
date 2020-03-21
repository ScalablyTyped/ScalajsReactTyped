package typingsJapgolly.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "MemStats")
@js.native
/**
  * Constructs a new MemStats.
  * @param [properties] Properties to set
  */
class MemStats () extends IMemStats {
  def this(properties: IMemStats) = this()
  /** MemStats gcCountDelta. */
  @JSName("gcCountDelta")
  var gcCountDelta_MemStats: Double = js.native
  /** MemStats gcOverheadBytes. */
  @JSName("gcOverheadBytes")
  var gcOverheadBytes_MemStats: Double = js.native
  /** MemStats gcStwNsDelta. */
  @JSName("gcStwNsDelta")
  var gcStwNsDelta_MemStats: Double = js.native
  /** MemStats heapAllocatedBytesDelta. */
  @JSName("heapAllocatedBytesDelta")
  var heapAllocatedBytesDelta_MemStats: Double = js.native
  /** MemStats heapAllocatedBytes. */
  @JSName("heapAllocatedBytes")
  var heapAllocatedBytes_MemStats: Double = js.native
  /** MemStats heapAllocatedObjectsDelta. */
  @JSName("heapAllocatedObjectsDelta")
  var heapAllocatedObjectsDelta_MemStats: Double = js.native
  /** MemStats heapAllocatedObjects. */
  @JSName("heapAllocatedObjects")
  var heapAllocatedObjects_MemStats: Double = js.native
  /** MemStats heapBytes. */
  @JSName("heapBytes")
  var heapBytes_MemStats: Double = js.native
  /** MemStats heapFreedObjectsDelta. */
  @JSName("heapFreedObjectsDelta")
  var heapFreedObjectsDelta_MemStats: Double = js.native
  /** MemStats heapReleasedBytes. */
  @JSName("heapReleasedBytes")
  var heapReleasedBytes_MemStats: Double = js.native
  /** MemStats stackBytes. */
  @JSName("stackBytes")
  var stackBytes_MemStats: Double = js.native
  /** MemStats stackUsedBytes. */
  @JSName("stackUsedBytes")
  var stackUsedBytes_MemStats: Double = js.native
  /** MemStats totalBytes. */
  @JSName("totalBytes")
  var totalBytes_MemStats: Double = js.native
  /**
    * Converts this MemStats to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf/dist/protobuf", "MemStats")
@js.native
object MemStats extends js.Object {
  /**
    * Creates a new MemStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns MemStats instance
    */
  def create(): MemStats = js.native
  def create(properties: IMemStats): MemStats = js.native
  /**
    * Decodes a MemStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns MemStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): MemStats = js.native
  def decode(reader: Reader, length: Double): MemStats = js.native
  def decode(reader: Uint8Array): MemStats = js.native
  def decode(reader: Uint8Array, length: Double): MemStats = js.native
  /**
    * Decodes a MemStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns MemStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): MemStats = js.native
  def decodeDelimited(reader: Uint8Array): MemStats = js.native
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
  def fromObject(`object`: StringDictionary[js.Any]): MemStats = js.native
  /**
    * Creates a plain object from a MemStats message. Also converts values to other types if specified.
    * @param message MemStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: MemStats): StringDictionary[js.Any] = js.native
  def toObject(message: MemStats, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a MemStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

