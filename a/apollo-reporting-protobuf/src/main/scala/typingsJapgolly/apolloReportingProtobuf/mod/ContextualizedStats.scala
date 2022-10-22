package typingsJapgolly.apolloReportingProtobuf.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.IContextualizedStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf", "ContextualizedStats")
@js.native
/**
  * Constructs a new ContextualizedStats.
  * @param [properties] Properties to set
  */
open class ContextualizedStats ()
  extends typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats {
  def this(properties: IContextualizedStats) = this()
}
/* static members */
object ContextualizedStats {
  
  @JSImport("apollo-reporting-protobuf", "ContextualizedStats")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ContextualizedStats instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ContextualizedStats instance
    */
  inline def create(): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats]
  inline def create(properties: IContextualizedStats): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats]
  /**
    * Decodes a ContextualizedStats message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ContextualizedStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats]
  /**
    * Decodes a ContextualizedStats message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ContextualizedStats
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats]
  
  /**
    * Encodes the specified ContextualizedStats message. Does not implicitly {@link ContextualizedStats.verify|verify} messages.
    * @param message ContextualizedStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IContextualizedStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IContextualizedStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ContextualizedStats message, length delimited. Does not implicitly {@link ContextualizedStats.verify|verify} messages.
    * @param message ContextualizedStats message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IContextualizedStats): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IContextualizedStats, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a ContextualizedStats message. Also converts values to other types if specified.
    * @param message ContextualizedStats
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod.ContextualizedStats,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ContextualizedStats message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
