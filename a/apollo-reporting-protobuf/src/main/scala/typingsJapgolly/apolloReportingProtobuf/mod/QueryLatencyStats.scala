package typingsJapgolly.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.IQueryLatencyStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "QueryLatencyStats")
@js.native
/**
  * Constructs a new QueryLatencyStats.
  * @param [properties] Properties to set
  */
open class QueryLatencyStats ()
  extends typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats {
  def this(properties: IQueryLatencyStats) = this()
}
/* static members */
object QueryLatencyStats {
  
  @JSImport("apollo-reporting-protobuf", "QueryLatencyStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new QueryLatencyStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns QueryLatencyStats instance
    */
  inline def create(): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats]
  inline def create(properties: IQueryLatencyStats): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats]
  /**
    * Decodes a QueryLatencyStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns QueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats]
  /**
    * Decodes a QueryLatencyStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns QueryLatencyStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats]
  
  /**
    * Encodes the specified QueryLatencyStats message. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
    * @param message QueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IQueryLatencyStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IQueryLatencyStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified QueryLatencyStats message, length delimited. Does not implicitly {@link QueryLatencyStats.verify|verify} messages.
    * @param message QueryLatencyStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IQueryLatencyStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IQueryLatencyStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a QueryLatencyStats message. Also converts values to other types if specified.
    * @param message QueryLatencyStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.QueryLatencyStats,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a QueryLatencyStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
