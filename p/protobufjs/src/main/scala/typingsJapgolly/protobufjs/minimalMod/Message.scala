package typingsJapgolly.protobufjs.minimalMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Properties
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs/minimal", "Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
class Message[T /* <: js.Object */] ()
  extends typingsJapgolly.protobufjs.mod.Message[T] {
  def this(properties: Properties[T]) = this()
}

/* static members */
@JSImport("protobufjs/minimal", "Message")
@js.native
object Message extends js.Object {
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: typingsJapgolly.protobufjs.mod.Type = js.native
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](): typingsJapgolly.protobufjs.mod.Message[T] = js.native
  def create[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](properties: StringDictionary[js.Any]): typingsJapgolly.protobufjs.mod.Message[T] = js.native
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decode[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](reader: typingsJapgolly.protobufjs.mod.Reader): T = js.native
  def decode[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](reader: Uint8Array): T = js.native
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decodeDelimited[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](reader: typingsJapgolly.protobufjs.mod.Reader): T = js.native
  def decodeDelimited[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](reader: Uint8Array): T = js.native
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encode[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: T): typingsJapgolly.protobufjs.mod.Writer = js.native
  def encode[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: T, writer: typingsJapgolly.protobufjs.mod.Writer): typingsJapgolly.protobufjs.mod.Writer = js.native
  def encode[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: StringDictionary[js.Any]): typingsJapgolly.protobufjs.mod.Writer = js.native
  def encode[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: StringDictionary[js.Any], writer: typingsJapgolly.protobufjs.mod.Writer): typingsJapgolly.protobufjs.mod.Writer = js.native
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encodeDelimited[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: T): typingsJapgolly.protobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: T, writer: typingsJapgolly.protobufjs.mod.Writer): typingsJapgolly.protobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: StringDictionary[js.Any]): typingsJapgolly.protobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: StringDictionary[js.Any], writer: typingsJapgolly.protobufjs.mod.Writer): typingsJapgolly.protobufjs.mod.Writer = js.native
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  def fromObject[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](`object`: StringDictionary[js.Any]): T = js.native
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: T): StringDictionary[js.Any] = js.native
  def toObject[T /* <: typingsJapgolly.protobufjs.mod.Message[T] */](message: T, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

