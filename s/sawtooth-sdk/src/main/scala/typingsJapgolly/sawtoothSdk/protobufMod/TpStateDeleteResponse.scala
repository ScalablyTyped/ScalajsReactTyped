package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "TpStateDeleteResponse")
@js.native
/**
  * Constructs a new TpStateDeleteResponse.
  * @param [properties] Properties to set
  */
open class TpStateDeleteResponse ()
  extends StObject
     with ITpStateDeleteResponse {
  def this(properties: ITpStateDeleteResponse) = this()
  
  /** TpStateDeleteResponse addresses. */
  @JSName("addresses")
  var addresses_TpStateDeleteResponse: js.Array[String] = js.native
  
  /** TpStateDeleteResponse status. */
  @JSName("status")
  var status_TpStateDeleteResponse: Status = js.native
  
  /**
    * Converts this TpStateDeleteResponse to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object TpStateDeleteResponse {
  
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteResponse")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Status extends StObject
  /** Status enum. */
  @JSImport("sawtooth-sdk/protobuf", "TpStateDeleteResponse.Status")
  @js.native
  object Status extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Status & Double] = js.native
    
    @js.native
    sealed trait AUTHORIZATION_ERROR
      extends StObject
         with Status
    /* 2 */ val AUTHORIZATION_ERROR: typingsJapgolly.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.AUTHORIZATION_ERROR & Double = js.native
    
    @js.native
    sealed trait OK
      extends StObject
         with Status
    /* 1 */ val OK: typingsJapgolly.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.OK & Double = js.native
    
    @js.native
    sealed trait STATUS_UNSET
      extends StObject
         with Status
    /* 0 */ val STATUS_UNSET: typingsJapgolly.sawtoothSdk.protobufMod.TpStateDeleteResponse.Status.STATUS_UNSET & Double = js.native
  }
  
  /**
    * Creates a new TpStateDeleteResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TpStateDeleteResponse instance
    */
  inline def create(): TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[TpStateDeleteResponse]
  inline def create(properties: ITpStateDeleteResponse): TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[TpStateDeleteResponse]
  
  inline def decode(reader: js.typedarray.Uint8Array): TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateDeleteResponse]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): TpStateDeleteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpStateDeleteResponse]
  /**
    * Decodes a TpStateDeleteResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TpStateDeleteResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateDeleteResponse]
  inline def decode(reader: Reader, length: Double): TpStateDeleteResponse = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[TpStateDeleteResponse]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateDeleteResponse]
  /**
    * Decodes a TpStateDeleteResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TpStateDeleteResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[TpStateDeleteResponse]
  
  /**
    * Encodes the specified TpStateDeleteResponse message. Does not implicitly {@link TpStateDeleteResponse.verify|verify} messages.
    * @param message TpStateDeleteResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: ITpStateDeleteResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITpStateDeleteResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TpStateDeleteResponse message, length delimited. Does not implicitly {@link TpStateDeleteResponse.verify|verify} messages.
    * @param message TpStateDeleteResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: ITpStateDeleteResponse): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITpStateDeleteResponse, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TpStateDeleteResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TpStateDeleteResponse
    */
  inline def fromObject(`object`: StringDictionary[Any]): TpStateDeleteResponse = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[TpStateDeleteResponse]
  
  /**
    * Creates a plain object from a TpStateDeleteResponse message. Also converts values to other types if specified.
    * @param message TpStateDeleteResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: TpStateDeleteResponse): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: TpStateDeleteResponse, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TpStateDeleteResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
