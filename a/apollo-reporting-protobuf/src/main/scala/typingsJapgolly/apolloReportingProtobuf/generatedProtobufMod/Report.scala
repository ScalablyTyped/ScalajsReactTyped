package typingsJapgolly.apolloReportingProtobuf.generatedProtobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Reader
import typingsJapgolly.apolloProtobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-reporting-protobuf/generated/protobuf", "Report")
@js.native
/**
  * Constructs a new Report.
  * @param [properties] Properties to set
  */
open class Report ()
  extends StObject
     with IReport {
  def this(properties: IReport) = this()
  
  /** Report operationCount. */
  @JSName("operationCount")
  var operationCount_Report: Double = js.native
  
  /**
    * Converts this Report to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Report tracesPerQuery. */
  @JSName("tracesPerQuery")
  var tracesPerQuery_Report: StringDictionary[ITracesAndStats] = js.native
}
/* static members */
object Report {
  
  @JSImport("apollo-reporting-protobuf/generated/protobuf", "Report")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Report instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Report instance
    */
  inline def create(): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Report]
  inline def create(properties: IReport): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Report]
  
  inline def decode(reader: js.typedarray.Uint8Array): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Report]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Report = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Report]
  /**
    * Decodes a Report message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Report
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Report]
  inline def decode(reader: Reader, length: Double): Report = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Report]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Report]
  /**
    * Decodes a Report message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Report
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): Report = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Report]
  
  /**
    * Encodes the specified Report message. Does not implicitly {@link Report.verify|verify} messages.
    * @param message Report message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IReport): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IReport, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Report message, length delimited. Does not implicitly {@link Report.verify|verify} messages.
    * @param message Report message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IReport): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IReport, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a plain object from a Report message. Also converts values to other types if specified.
    * @param message Report
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: Report): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Report, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Report message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
