package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "BatchList")
@js.native
/**
  * Constructs a new BatchList.
  * @param [properties] Properties to set
  */
open class BatchList ()
  extends StObject
     with IBatchList {
  def this(properties: IBatchList) = this()
  
  /** BatchList batches. */
  @JSName("batches")
  var batches_BatchList: js.Array[IBatch] = js.native
  
  /**
    * Converts this BatchList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object BatchList {
  
  @JSImport("sawtooth-sdk/protobuf", "BatchList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new BatchList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns BatchList instance
    */
  inline def create(): BatchList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[BatchList]
  inline def create(properties: IBatchList): BatchList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[BatchList]
  
  inline def decode(reader: js.typedarray.Uint8Array): BatchList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchList]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): BatchList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchList]
  /**
    * Decodes a BatchList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns BatchList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): BatchList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchList]
  inline def decode(reader: Reader, length: Double): BatchList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[BatchList]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): BatchList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchList]
  /**
    * Decodes a BatchList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns BatchList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): BatchList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[BatchList]
  
  /**
    * Encodes the specified BatchList message. Does not implicitly {@link BatchList.verify|verify} messages.
    * @param message BatchList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IBatchList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IBatchList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified BatchList message, length delimited. Does not implicitly {@link BatchList.verify|verify} messages.
    * @param message BatchList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IBatchList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IBatchList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a BatchList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns BatchList
    */
  inline def fromObject(`object`: StringDictionary[Any]): BatchList = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[BatchList]
  
  /**
    * Creates a plain object from a BatchList message. Also converts values to other types if specified.
    * @param message BatchList
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: BatchList): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: BatchList, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a BatchList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
