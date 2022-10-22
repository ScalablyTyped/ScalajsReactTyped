package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TransactionReceipt")
@js.native
/**
  * Constructs a new TransactionReceipt.
  * @param [properties] Properties to set
  */
open class TransactionReceipt ()
  extends StObject
     with ITransactionReceipt {
  def this(properties: ITransactionReceipt) = this()
  
  /** TransactionReceipt data. */
  @JSName("data")
  var data_TransactionReceipt: js.Array[js.typedarray.Uint8Array] = js.native
  
  /** TransactionReceipt events. */
  @JSName("events")
  var events_TransactionReceipt: js.Array[IEvent] = js.native
  
  /** TransactionReceipt stateChanges. */
  @JSName("stateChanges")
  var stateChanges_TransactionReceipt: js.Array[IStateChange] = js.native
  
  /**
    * Converts this TransactionReceipt to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
  
  /** TransactionReceipt transactionId. */
  @JSName("transactionId")
  var transactionId_TransactionReceipt: String = js.native
}
/* static members */
object TransactionReceipt {
  
  @JSImport("sawtooth-sdk/protobuf", "TransactionReceipt")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TransactionReceipt instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TransactionReceipt instance
    */
  inline def create(): TransactionReceipt = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TransactionReceipt]
  inline def create(properties: ITransactionReceipt): TransactionReceipt = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TransactionReceipt]
  
  inline def decode(reader: js.typedarray.Uint8Array): TransactionReceipt = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionReceipt]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TransactionReceipt = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TransactionReceipt]
  /**
    * Decodes a TransactionReceipt message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TransactionReceipt
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): TransactionReceipt = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionReceipt]
  inline def decode(reader: Reader, length: Double): TransactionReceipt = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TransactionReceipt]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TransactionReceipt = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionReceipt]
  /**
    * Decodes a TransactionReceipt message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TransactionReceipt
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): TransactionReceipt = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TransactionReceipt]
  
  /**
    * Encodes the specified TransactionReceipt message. Does not implicitly {@link TransactionReceipt.verify|verify} messages.
    * @param message TransactionReceipt message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITransactionReceipt): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITransactionReceipt, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TransactionReceipt message, length delimited. Does not implicitly {@link TransactionReceipt.verify|verify} messages.
    * @param message TransactionReceipt message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITransactionReceipt): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITransactionReceipt, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TransactionReceipt message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TransactionReceipt
    */
  inline def fromObject(`object`: StringDictionary[Any]): TransactionReceipt = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TransactionReceipt]
  
  /**
    * Creates a plain object from a TransactionReceipt message. Also converts values to other types if specified.
    * @param message TransactionReceipt
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: TransactionReceipt): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TransactionReceipt, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TransactionReceipt message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
