package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpStateEntry")
@js.native
/**
  * Constructs a new TpStateEntry.
  * @param [properties] Properties to set
  */
open class TpStateEntry ()
  extends StObject
     with ITpStateEntry {
  def this(properties: ITpStateEntry) = this()
  
  /** TpStateEntry address. */
  @JSName("address")
  var address_TpStateEntry: String = js.native
  
  /** TpStateEntry data. */
  @JSName("data")
  var data_TpStateEntry: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this TpStateEntry to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object TpStateEntry {
  
  @JSImport("sawtooth-sdk/protobuf", "TpStateEntry")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TpStateEntry instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateEntry instance
    */
  inline def create(): TpStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpStateEntry]
  inline def create(properties: ITpStateEntry): TpStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpStateEntry]
  
  inline def decode(reader: js.typedarray.Uint8Array): TpStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateEntry]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TpStateEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpStateEntry]
  /**
    * Decodes a TpStateEntry message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): TpStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateEntry]
  inline def decode(reader: Reader, length: Double): TpStateEntry = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpStateEntry]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TpStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateEntry]
  /**
    * Decodes a TpStateEntry message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateEntry
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): TpStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateEntry]
  
  /**
    * Encodes the specified TpStateEntry message. Does not implicitly {@link TpStateEntry.verify|verify} messages.
    * @param message TpStateEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpStateEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpStateEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpStateEntry message, length delimited. Does not implicitly {@link TpStateEntry.verify|verify} messages.
    * @param message TpStateEntry message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpStateEntry): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpStateEntry, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpStateEntry message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateEntry
    */
  inline def fromObject(`object`: StringDictionary[Any]): TpStateEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpStateEntry]
  
  /**
    * Creates a plain object from a TpStateEntry message. Also converts values to other types if specified.
    * @param message TpStateEntry
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: TpStateEntry): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TpStateEntry, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TpStateEntry message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
