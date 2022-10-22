package typingsJapgolly.dialogflow.protosProtosMod.google.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an EnumValueOptions. */
@JSImport("dialogflow/protos/protos", "google.protobuf.EnumValueOptions")
@js.native
/**
  * Constructs a new EnumValueOptions.
  * @param [properties] Properties to set
  */
open class EnumValueOptions ()
  extends StObject
     with IEnumValueOptions {
  def this(properties: IEnumValueOptions) = this()
  
  /** EnumValueOptions deprecated. */
  @JSName("deprecated")
  var deprecated_EnumValueOptions: Boolean = js.native
  
  /**
    * Converts this EnumValueOptions to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[scala.Any] = js.native
  
  /** EnumValueOptions uninterpretedOption. */
  @JSName("uninterpretedOption")
  var uninterpretedOption_EnumValueOptions: js.Array[IUninterpretedOption] = js.native
}
object EnumValueOptions {
  
  @JSImport("dialogflow/protos/protos", "google.protobuf.EnumValueOptions")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new EnumValueOptions instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EnumValueOptions instance
    */
  /* static member */
  inline def create(): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EnumValueOptions]
  inline def create(properties: IEnumValueOptions): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  
  inline def decode(reader: js.typedarray.Uint8Array): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): EnumValueOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EnumValueOptions]
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  inline def decode(reader: Reader, length: Double): EnumValueOptions = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EnumValueOptions]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  /**
    * Decodes an EnumValueOptions message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EnumValueOptions
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  
  /**
    * Encodes the specified EnumValueOptions message. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IEnumValueOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEnumValueOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EnumValueOptions message, length delimited. Does not implicitly {@link google.protobuf.EnumValueOptions.verify|verify} messages.
    * @param message EnumValueOptions message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IEnumValueOptions): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEnumValueOptions, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EnumValueOptions message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EnumValueOptions
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[scala.Any]): EnumValueOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EnumValueOptions]
  
  /**
    * Creates a plain object from an EnumValueOptions message. Also converts values to other types if specified.
    * @param message EnumValueOptions
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: EnumValueOptions): StringDictionary[scala.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[scala.Any]]
  inline def toObject(message: EnumValueOptions, options: IConversionOptions): StringDictionary[scala.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[scala.Any]]
  
  /**
    * Verifies an EnumValueOptions message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[scala.Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
