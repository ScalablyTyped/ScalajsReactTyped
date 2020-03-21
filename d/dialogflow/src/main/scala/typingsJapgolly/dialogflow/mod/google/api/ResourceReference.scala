package typingsJapgolly.dialogflow.mod.google.api

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a ResourceReference. */
@JSImport("dialogflow/protos/protos", "google.api.ResourceReference")
@js.native
/**
  * Constructs a new ResourceReference.
  * @param [properties] Properties to set
  */
class ResourceReference () extends IResourceReference {
  def this(properties: IResourceReference) = this()
  /** ResourceReference childType. */
  @JSName("childType")
  var childType_ResourceReference: String = js.native
  /** ResourceReference type. */
  @JSName("type")
  var type_ResourceReference: String = js.native
  /**
    * Converts this ResourceReference to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.api.ResourceReference")
@js.native
object ResourceReference extends js.Object {
  /**
    * Creates a new ResourceReference instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ResourceReference instance
    */
  def create(): ResourceReference = js.native
  def create(properties: IResourceReference): ResourceReference = js.native
  /**
    * Decodes a ResourceReference message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ResourceReference
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): ResourceReference = js.native
  def decode(reader: Reader, length: Double): ResourceReference = js.native
  def decode(reader: Uint8Array): ResourceReference = js.native
  def decode(reader: Uint8Array, length: Double): ResourceReference = js.native
  /**
    * Decodes a ResourceReference message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ResourceReference
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): ResourceReference = js.native
  def decodeDelimited(reader: Uint8Array): ResourceReference = js.native
  /**
    * Encodes the specified ResourceReference message. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
    * @param message ResourceReference message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IResourceReference): Writer = js.native
  def encode(message: IResourceReference, writer: Writer): Writer = js.native
  /**
    * Encodes the specified ResourceReference message, length delimited. Does not implicitly {@link google.api.ResourceReference.verify|verify} messages.
    * @param message ResourceReference message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IResourceReference): Writer = js.native
  def encodeDelimited(message: IResourceReference, writer: Writer): Writer = js.native
  /**
    * Creates a ResourceReference message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ResourceReference
    */
  def fromObject(`object`: StringDictionary[js.Any]): ResourceReference = js.native
  /**
    * Creates a plain object from a ResourceReference message. Also converts values to other types if specified.
    * @param message ResourceReference
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: ResourceReference): StringDictionary[js.Any] = js.native
  def toObject(message: ResourceReference, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a ResourceReference message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

