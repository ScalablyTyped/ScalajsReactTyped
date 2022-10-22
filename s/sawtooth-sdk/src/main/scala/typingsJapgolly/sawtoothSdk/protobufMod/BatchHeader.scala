package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "BatchHeader")
@js.native
/**
  * Constructs a new BatchHeader.
  * @param [properties] Properties to set
  */
open class BatchHeader ()
  extends StObject
     with IBatchHeader {
  def this(properties: IBatchHeader) = this()
  
  /** BatchHeader signerPublicKey. */
  @JSName("signerPublicKey")
  var signerPublicKey_BatchHeader: String = js.native
  
  /**
    * Converts this BatchHeader to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** BatchHeader transactionIds. */
  @JSName("transactionIds")
  var transactionIds_BatchHeader: js.Array[String] = js.native
}
/* static members */
object BatchHeader {
  
  @JSImport("sawtooth-sdk/protobuf", "BatchHeader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchHeader instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchHeader instance
    */
  inline def create(): BatchHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchHeader]
  inline def create(properties: IBatchHeader): BatchHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchHeader]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchHeader]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchHeader]
  /**
    * Decodes a BatchHeader message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): BatchHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchHeader]
  inline def decode(reader: Reader, length: Double): BatchHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchHeader]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchHeader]
  /**
    * Decodes a BatchHeader message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchHeader
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): BatchHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchHeader]
  
  /**
    * Encodes the specified BatchHeader message. Does not implicitly {@link BatchHeader.verify|verify} messages.
    * @param message BatchHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IBatchHeader): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchHeader, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchHeader message, length delimited. Does not implicitly {@link BatchHeader.verify|verify} messages.
    * @param message BatchHeader message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IBatchHeader): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchHeader, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchHeader message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchHeader
    */
  inline def fromObject(`object`: StringDictionary[Any]): BatchHeader = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchHeader]
  
  /**
    * Creates a plain object from a BatchHeader message. Also converts values to other types if specified.
    * @param message BatchHeader
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: BatchHeader): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchHeader, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchHeader message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
