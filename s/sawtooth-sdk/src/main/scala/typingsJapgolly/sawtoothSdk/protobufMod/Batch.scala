package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Batch")
@js.native
/**
  * Constructs a new Batch.
  * @param [properties] Properties to set
  */
open class Batch ()
  extends StObject
     with IBatch {
  def this(properties: IBatch) = this()
  
  /** Batch headerSignature. */
  @JSName("headerSignature")
  var headerSignature_Batch: String = js.native
  
  /** Batch header. */
  @JSName("header")
  var header_Batch: js.typedarray.Uint8Array = js.native
  
  /**
    * Converts this Batch to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** Batch trace. */
  @JSName("trace")
  var trace_Batch: Boolean = js.native
  
  /** Batch transactions. */
  @JSName("transactions")
  var transactions_Batch: js.Array[ITransaction] = js.native
}
/* static members */
object Batch {
  
  @JSImport("sawtooth-sdk/protobuf", "Batch")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Batch instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Batch instance
    */
  inline def create(): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Batch]
  inline def create(properties: IBatch): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Batch]
  
  inline def decode(reader: js.typedarray.Uint8Array): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Batch]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Batch = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Batch]
  /**
    * Decodes a Batch message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Batch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Batch]
  inline def decode(reader: Reader, length: Double): Batch = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Batch]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Batch]
  /**
    * Decodes a Batch message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Batch
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Batch]
  
  /**
    * Encodes the specified Batch message. Does not implicitly {@link Batch.verify|verify} messages.
    * @param message Batch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IBatch): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatch, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Batch message, length delimited. Does not implicitly {@link Batch.verify|verify} messages.
    * @param message Batch message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IBatch): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatch, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Batch message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Batch
    */
  inline def fromObject(`object`: StringDictionary[Any]): Batch = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Batch]
  
  /**
    * Creates a plain object from a Batch message. Also converts values to other types if specified.
    * @param message Batch
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: Batch): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Batch, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Batch message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
