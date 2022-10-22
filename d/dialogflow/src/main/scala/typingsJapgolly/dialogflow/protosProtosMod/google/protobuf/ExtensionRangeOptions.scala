package typingsJapgolly.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ExtensionRangeOptions. */
@JSImport("dialogflow/protos/protos", "google.protobuf.ExtensionRangeOptions")
@js.native
/**
  * Constructs a new ExtensionRangeOptions.
  * @param [properties] Properties to set
  */
open class ExtensionRangeOptions ()
  extends StObject
     with IExtensionRangeOptions {
  def this(properties: IExtensionRangeOptions) = this()
  
  /**
    * Converts this ExtensionRangeOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** ExtensionRangeOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_ExtensionRangeOptions: js.Array[IUninterpretedOption] = js.native
}
object ExtensionRangeOptions {
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.ExtensionRangeOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ExtensionRangeOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ExtensionRangeOptions instance
    */
  /* static member */
  inline def create(): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ExtensionRangeOptions]
  inline def create(properties: IExtensionRangeOptions): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ExtensionRangeOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExtensionRangeOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ExtensionRangeOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExtensionRangeOptions]
  /**
    * Decodes an ExtensionRangeOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ExtensionRangeOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ExtensionRangeOptions]
  inline def decode(reader: Reader, length: Double): ExtensionRangeOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ExtensionRangeOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExtensionRangeOptions]
  /**
    * Decodes an ExtensionRangeOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ExtensionRangeOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ExtensionRangeOptions]
  
  /**
    * Encodes the specified ExtensionRangeOptions message. Does not implicitly {@link google.protobuf.ExtensionRangeOptions.verify|verify} messages.
    * @param message ExtensionRangeOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IExtensionRangeOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IExtensionRangeOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ExtensionRangeOptions message, length delimited. Does not implicitly {@link google.protobuf.ExtensionRangeOptions.verify|verify} messages.
    * @param message ExtensionRangeOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IExtensionRangeOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IExtensionRangeOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an ExtensionRangeOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ExtensionRangeOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): ExtensionRangeOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ExtensionRangeOptions]
  
  /**
    * Creates a plain object from an ExtensionRangeOptions message. Also converts values to other types if specified.
    * @param message ExtensionRangeOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ExtensionRangeOptions): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: ExtensionRangeOptions, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /**
    * Verifies an ExtensionRangeOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[scala.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
