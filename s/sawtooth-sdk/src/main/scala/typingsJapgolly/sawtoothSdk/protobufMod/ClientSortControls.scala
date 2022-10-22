package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "ClientSortControls")
@js.native
/**
  * Constructs a new ClientSortControls.
  * @param [properties] Properties to set
  */
open class ClientSortControls ()
  extends StObject
     with IClientSortControls {
  def this(properties: IClientSortControls) = this()
  
  /** ClientSortControls keys. */
  @JSName("keys")
  var keys_ClientSortControls: js.Array[String] = js.native
  
  /** ClientSortControls reverse. */
  @JSName("reverse")
  var reverse_ClientSortControls: Boolean = js.native
  
  /**
    * Converts this ClientSortControls to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object ClientSortControls {
  
  @JSImport("sawtooth-sdk/protobuf", "ClientSortControls")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ClientSortControls instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientSortControls instance
    */
  inline def create(): ClientSortControls = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ClientSortControls]
  inline def create(properties: IClientSortControls): ClientSortControls = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ClientSortControls]
  
  inline def decode(reader: js.typedarray.Uint8Array): ClientSortControls = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientSortControls]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ClientSortControls = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientSortControls]
  /**
    * Decodes a ClientSortControls message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientSortControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): ClientSortControls = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientSortControls]
  inline def decode(reader: Reader, length: Double): ClientSortControls = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ClientSortControls]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ClientSortControls = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientSortControls]
  /**
    * Decodes a ClientSortControls message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientSortControls
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): ClientSortControls = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ClientSortControls]
  
  /**
    * Encodes the specified ClientSortControls message. Does not implicitly {@link ClientSortControls.verify|verify} messages.
    * @param message ClientSortControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IClientSortControls): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IClientSortControls, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ClientSortControls message, length delimited. Does not implicitly {@link ClientSortControls.verify|verify} messages.
    * @param message ClientSortControls message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IClientSortControls): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IClientSortControls, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ClientSortControls message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientSortControls
    */
  inline def fromObject(`object`: StringDictionary[Any]): ClientSortControls = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ClientSortControls]
  
  /**
    * Creates a plain object from a ClientSortControls message. Also converts values to other types if specified.
    * @param message ClientSortControls
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: ClientSortControls): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ClientSortControls, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ClientSortControls message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
