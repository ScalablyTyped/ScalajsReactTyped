package typingsJapgolly.apolloProtobufjs.lightMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.apolloProtobufjs.mod.IConversionOptions
import typingsJapgolly.apolloProtobufjs.mod.Properties
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@apollo/protobufjs/light", "Message")
@js.native
/**
  * Constructs a new message instance.
  * @param [properties] Properties to set
  */
class Message[T /* <: js.Object */] ()
  extends typingsJapgolly.apolloProtobufjs.mod.Message[T] {
  def this(properties: Properties[T]) = this()
}

/* static members */
@JSImport("@apollo/protobufjs/light", "Message")
@js.native
object Message extends js.Object {
  /** Reference to the reflected type. */
  @JSName("$type")
  val $type: typingsJapgolly.apolloProtobufjs.mod.Type = js.native
  /**
    * Creates a new message of this type using the specified properties.
    * @param [properties] Properties to set
    * @returns Message instance
    */
  def create[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](): typingsJapgolly.apolloProtobufjs.mod.Message[T] = js.native
  def create[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](properties: StringDictionary[js.Any]): typingsJapgolly.apolloProtobufjs.mod.Message[T] = js.native
  /**
    * Decodes a message of this type.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decode[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](reader: typingsJapgolly.apolloProtobufjs.mod.Reader): T = js.native
  def decode[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](reader: Uint8Array): T = js.native
  /**
    * Decodes a message of this type preceeded by its length as a varint.
    * @param reader Reader or buffer to decode
    * @returns Decoded message
    */
  def decodeDelimited[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](reader: typingsJapgolly.apolloProtobufjs.mod.Reader): T = js.native
  def decodeDelimited[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](reader: Uint8Array): T = js.native
  /**
    * Encodes a message of this type.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encode[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: T): typingsJapgolly.apolloProtobufjs.mod.Writer = js.native
  def encode[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: T, writer: typingsJapgolly.apolloProtobufjs.mod.Writer): typingsJapgolly.apolloProtobufjs.mod.Writer = js.native
  def encode[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: StringDictionary[js.Any]): typingsJapgolly.apolloProtobufjs.mod.Writer = js.native
  def encode[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: StringDictionary[js.Any], writer: typingsJapgolly.apolloProtobufjs.mod.Writer): typingsJapgolly.apolloProtobufjs.mod.Writer = js.native
  /**
    * Encodes a message of this type preceeded by its length as a varint.
    * @param message Message to encode
    * @param [writer] Writer to use
    * @returns Writer
    */
  def encodeDelimited[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: T): typingsJapgolly.apolloProtobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: T, writer: typingsJapgolly.apolloProtobufjs.mod.Writer): typingsJapgolly.apolloProtobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: StringDictionary[js.Any]): typingsJapgolly.apolloProtobufjs.mod.Writer = js.native
  def encodeDelimited[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: StringDictionary[js.Any], writer: typingsJapgolly.apolloProtobufjs.mod.Writer): typingsJapgolly.apolloProtobufjs.mod.Writer = js.native
  /**
    * Creates a new message of this type from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Message instance
    */
  def fromObject[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](`object`: StringDictionary[js.Any]): T = js.native
  /**
    * Creates a plain object from a message of this type. Also converts values to other types if specified.
    * @param message Message instance
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: T): StringDictionary[js.Any] = js.native
  def toObject[T /* <: typingsJapgolly.apolloProtobufjs.mod.Message[T] */](message: T, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a message of this type.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

