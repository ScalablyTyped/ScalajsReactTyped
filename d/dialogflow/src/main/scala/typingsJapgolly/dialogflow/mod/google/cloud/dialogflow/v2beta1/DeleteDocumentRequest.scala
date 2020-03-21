package typingsJapgolly.dialogflow.mod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a DeleteDocumentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest")
@js.native
/**
  * Constructs a new DeleteDocumentRequest.
  * @param [properties] Properties to set
  */
class DeleteDocumentRequest () extends IDeleteDocumentRequest {
  def this(properties: IDeleteDocumentRequest) = this()
  /** DeleteDocumentRequest name. */
  @JSName("name")
  var name_DeleteDocumentRequest: String = js.native
  /**
    * Converts this DeleteDocumentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteDocumentRequest")
@js.native
object DeleteDocumentRequest extends js.Object {
  /**
    * Creates a new DeleteDocumentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteDocumentRequest instance
    */
  def create(): DeleteDocumentRequest = js.native
  def create(properties: IDeleteDocumentRequest): DeleteDocumentRequest = js.native
  /**
    * Decodes a DeleteDocumentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): DeleteDocumentRequest = js.native
  def decode(reader: Reader, length: Double): DeleteDocumentRequest = js.native
  def decode(reader: Uint8Array): DeleteDocumentRequest = js.native
  def decode(reader: Uint8Array, length: Double): DeleteDocumentRequest = js.native
  /**
    * Decodes a DeleteDocumentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteDocumentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): DeleteDocumentRequest = js.native
  def decodeDelimited(reader: Uint8Array): DeleteDocumentRequest = js.native
  /**
    * Encodes the specified DeleteDocumentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.verify|verify} messages.
    * @param message DeleteDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IDeleteDocumentRequest): Writer = js.native
  def encode(message: IDeleteDocumentRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified DeleteDocumentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteDocumentRequest.verify|verify} messages.
    * @param message DeleteDocumentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IDeleteDocumentRequest): Writer = js.native
  def encodeDelimited(message: IDeleteDocumentRequest, writer: Writer): Writer = js.native
  /**
    * Creates a DeleteDocumentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteDocumentRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): DeleteDocumentRequest = js.native
  /**
    * Creates a plain object from a DeleteDocumentRequest message. Also converts values to other types if specified.
    * @param message DeleteDocumentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: DeleteDocumentRequest): StringDictionary[js.Any] = js.native
  def toObject(message: DeleteDocumentRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a DeleteDocumentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

