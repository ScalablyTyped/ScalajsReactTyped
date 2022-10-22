package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "Role")
@js.native
/**
  * Constructs a new Role.
  * @param [properties] Properties to set
  */
open class Role ()
  extends StObject
     with IRole {
  def this(properties: IRole) = this()
  
  /** Role name. */
  @JSName("name")
  var name_Role: String = js.native
  
  /** Role policyName. */
  @JSName("policyName")
  var policyName_Role: String = js.native
  
  /**
    * Converts this Role to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object Role {
  
  @JSImport("sawtooth-sdk/protobuf", "Role")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Role instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Role instance
    */
  inline def create(): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Role]
  inline def create(properties: IRole): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Role]
  
  inline def decode(reader: js.typedarray.Uint8Array): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Role]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Role = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Role]
  /**
    * Decodes a Role message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Role
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Role]
  inline def decode(reader: Reader, length: Double): Role = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Role]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Role]
  /**
    * Decodes a Role message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Role
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Role]
  
  /**
    * Encodes the specified Role message. Does not implicitly {@link Role.verify|verify} messages.
    * @param message Role message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IRole): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRole, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Role message, length delimited. Does not implicitly {@link Role.verify|verify} messages.
    * @param message Role message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IRole): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRole, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Role message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Role
    */
  inline def fromObject(`object`: StringDictionary[Any]): Role = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Role]
  
  /**
    * Creates a plain object from a Role message. Also converts values to other types if specified.
    * @param message Role
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: Role): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Role, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Role message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
