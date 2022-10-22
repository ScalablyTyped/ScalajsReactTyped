package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "DisconnectMessage")
@js.native
/**
  * Constructs a new DisconnectMessage.
  * @param [properties] Properties to set
  */
open class DisconnectMessage ()
  extends StObject
     with IDisconnectMessage {
  def this(properties: IDisconnectMessage) = this()
  
  /**
    * Converts this DisconnectMessage to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object DisconnectMessage {
  
  @JSImport("sawtooth-sdk/protobuf", "DisconnectMessage")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DisconnectMessage instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DisconnectMessage instance
    */
  inline def create(): DisconnectMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DisconnectMessage]
  inline def create(properties: IDisconnectMessage): DisconnectMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DisconnectMessage]
  
  inline def decode(reader: js.typedarray.Uint8Array): DisconnectMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DisconnectMessage]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DisconnectMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DisconnectMessage]
  /**
    * Decodes a DisconnectMessage message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DisconnectMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): DisconnectMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DisconnectMessage]
  inline def decode(reader: Reader, length: Double): DisconnectMessage = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DisconnectMessage]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DisconnectMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DisconnectMessage]
  /**
    * Decodes a DisconnectMessage message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DisconnectMessage
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): DisconnectMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DisconnectMessage]
  
  /**
    * Encodes the specified DisconnectMessage message. Does not implicitly {@link DisconnectMessage.verify|verify} messages.
    * @param message DisconnectMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IDisconnectMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDisconnectMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DisconnectMessage message, length delimited. Does not implicitly {@link DisconnectMessage.verify|verify} messages.
    * @param message DisconnectMessage message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IDisconnectMessage): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDisconnectMessage, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DisconnectMessage message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DisconnectMessage
    */
  inline def fromObject(`object`: StringDictionary[Any]): DisconnectMessage = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DisconnectMessage]
  
  /**
    * Creates a plain object from a DisconnectMessage message. Also converts values to other types if specified.
    * @param message DisconnectMessage
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: DisconnectMessage): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DisconnectMessage, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DisconnectMessage message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
