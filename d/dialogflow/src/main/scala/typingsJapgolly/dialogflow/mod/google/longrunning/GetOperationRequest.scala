package typingsJapgolly.dialogflow.mod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import typingsJapgolly.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a GetOperationRequest. */
@JSImport("dialogflow/protos/protos", "google.longrunning.GetOperationRequest")
@js.native
/**
  * Constructs a new GetOperationRequest.
  * @param [properties] Properties to set
  */
class GetOperationRequest () extends IGetOperationRequest {
  def this(properties: IGetOperationRequest) = this()
  /** GetOperationRequest name. */
  @JSName("name")
  var name_GetOperationRequest: String = js.native
  /**
    * Converts this GetOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}

/* static members */
@JSImport("dialogflow/protos/protos", "google.longrunning.GetOperationRequest")
@js.native
object GetOperationRequest extends js.Object {
  /**
    * Creates a new GetOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns GetOperationRequest instance
    */
  def create(): GetOperationRequest = js.native
  def create(properties: IGetOperationRequest): GetOperationRequest = js.native
  /**
    * Decodes a GetOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns GetOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): GetOperationRequest = js.native
  def decode(reader: Reader, length: Double): GetOperationRequest = js.native
  def decode(reader: Uint8Array): GetOperationRequest = js.native
  def decode(reader: Uint8Array, length: Double): GetOperationRequest = js.native
  /**
    * Decodes a GetOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns GetOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): GetOperationRequest = js.native
  def decodeDelimited(reader: Uint8Array): GetOperationRequest = js.native
  /**
    * Encodes the specified GetOperationRequest message. Does not implicitly {@link google.longrunning.GetOperationRequest.verify|verify} messages.
    * @param message GetOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IGetOperationRequest): Writer = js.native
  def encode(message: IGetOperationRequest, writer: Writer): Writer = js.native
  /**
    * Encodes the specified GetOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.GetOperationRequest.verify|verify} messages.
    * @param message GetOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IGetOperationRequest): Writer = js.native
  def encodeDelimited(message: IGetOperationRequest, writer: Writer): Writer = js.native
  /**
    * Creates a GetOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns GetOperationRequest
    */
  def fromObject(`object`: StringDictionary[js.Any]): GetOperationRequest = js.native
  /**
    * Creates a plain object from a GetOperationRequest message. Also converts values to other types if specified.
    * @param message GetOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: GetOperationRequest): StringDictionary[js.Any] = js.native
  def toObject(message: GetOperationRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  /**
    * Verifies a GetOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}

