package typingsJapgolly.sawtoothSdk.global.sawtooth.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.ITpReceiptAddDataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sawtooth.protobuf.TpReceiptAddDataResponse")
@js.native
/**
  * Constructs a new TpReceiptAddDataResponse.
  * @param [properties] Properties to set
  */
open class TpReceiptAddDataResponse ()
  extends typingsJapgolly.sawtoothSdk.mod.protobuf.TpReceiptAddDataResponse {
  def this(properties: ITpReceiptAddDataResponse) = this()
}
/* static members */
object TpReceiptAddDataResponse {
  
  @JSGlobal("sawtooth.protobuf.TpReceiptAddDataResponse")
  @js.native
  val ^ : js.Any = js.native
  
  /** Status enum. */
  @JSGlobal("sawtooth.protobuf.TpReceiptAddDataResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status & Double] = js.native
    
    /* 2 */ val ERROR: typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.ERROR & Double = js.native
    
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.OK & Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpReceiptAddDataResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpReceiptAddDataResponse instance
    */
  inline def create(): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  inline def create(properties: ITpReceiptAddDataResponse): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  /**
    * Decodes a TpReceiptAddDataResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpReceiptAddDataResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  
  /**
    * Encodes the specified TpReceiptAddDataResponse message. Does not implicitly {@link TpReceiptAddDataResponse.verify|verify} messages.
    * @param message TpReceiptAddDataResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpReceiptAddDataResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpReceiptAddDataResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpReceiptAddDataResponse message, length delimited. Does not implicitly {@link TpReceiptAddDataResponse.verify|verify} messages.
    * @param message TpReceiptAddDataResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpReceiptAddDataResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpReceiptAddDataResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpReceiptAddDataResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpReceiptAddDataResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse]
  
  /**
    * Creates a plain object from a TpReceiptAddDataResponse message. Also converts values to other types if specified.
    * @param message TpReceiptAddDataResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.sawtoothSdk.protobufMod.TpReceiptAddDataResponse,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TpReceiptAddDataResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
