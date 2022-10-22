package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "RoleList")
@js.native
/**
  * Constructs a new RoleList.
  * @param [properties] Properties to set
  */
open class RoleList ()
  extends StObject
     with IRoleList {
  def this(properties: IRoleList) = this()
  
  /** RoleList roles. */
  @JSName("roles")
  var roles_RoleList: js.Array[IRole] = js.native
  
  /**
    * Converts this RoleList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object RoleList {
  
  @JSImport("sawtooth-sdk/protobuf", "RoleList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new RoleList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns RoleList instance
    */
  inline def create(): RoleList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RoleList]
  inline def create(properties: IRoleList): RoleList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[RoleList]
  
  inline def decode(reader: js.typedarray.Uint8Array): RoleList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RoleList]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): RoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RoleList]
  /**
    * Decodes a RoleList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns RoleList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): RoleList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[RoleList]
  inline def decode(reader: Reader, length: Double): RoleList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[RoleList]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): RoleList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RoleList]
  /**
    * Decodes a RoleList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns RoleList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): RoleList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[RoleList]
  
  /**
    * Encodes the specified RoleList message. Does not implicitly {@link RoleList.verify|verify} messages.
    * @param message RoleList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IRoleList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IRoleList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified RoleList message, length delimited. Does not implicitly {@link RoleList.verify|verify} messages.
    * @param message RoleList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IRoleList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IRoleList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a RoleList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns RoleList
    */
  inline def fromObject(`object`: StringDictionary[Any]): RoleList = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[RoleList]
  
  /**
    * Creates a plain object from a RoleList message. Also converts values to other types if specified.
    * @param message RoleList
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: RoleList): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: RoleList, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a RoleList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
