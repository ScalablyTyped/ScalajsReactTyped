package typingsJapgolly.apolloEngineReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.ITypeStat
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting-protobuf", "TypeStat")
@js.native
/**
  * Constructs a new TypeStat.
  * @param [properties] Properties to set
  */
class TypeStat ()
  extends typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat {
  def this(properties: ITypeStat) = this()
}

/* static members */
@JSImport("apollo-engine-reporting-protobuf", "TypeStat")
@js.native
object TypeStat extends js.Object {
  /**
    * Creates a new TypeStat instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TypeStat instance
    */
  def create(): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  def create(properties: ITypeStat): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  /**
    * Decodes a TypeStat message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  def decode(reader: Reader, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  def decode(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  def decode(reader: Uint8Array, length: Double): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  /**
    * Decodes a TypeStat message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TypeStat
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  def decodeDelimited(reader: Uint8Array): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  /**
    * Encodes the specified TypeStat message. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: ITypeStat): Writer = js.native
  def encode(message: ITypeStat, writer: Writer): Writer = js.native
  /**
    * Encodes the specified TypeStat message, length delimited. Does not implicitly {@link TypeStat.verify|verify} messages.
    * @param message TypeStat message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: ITypeStat): Writer = js.native
  def encodeDelimited(message: ITypeStat, writer: Writer): Writer = js.native
  /**
    * Creates a TypeStat message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TypeStat
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat = js.native
  /**
    * Creates a plain object from a TypeStat message. Also converts values to other types if specified.
    * @param message TypeStat
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsJapgolly.apolloEngineReportingProtobuf.protobufMod.TypeStat,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  /**
    * Verifies a TypeStat message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

