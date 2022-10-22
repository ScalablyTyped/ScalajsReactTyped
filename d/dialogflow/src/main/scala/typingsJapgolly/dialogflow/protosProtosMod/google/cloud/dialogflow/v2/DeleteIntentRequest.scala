package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteIntentRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest")
@js.native
/**
  * Constructs a new DeleteIntentRequest.
  * @param [properties] Properties to set
  */
open class DeleteIntentRequest ()
  extends StObject
     with IDeleteIntentRequest {
  def this(properties: IDeleteIntentRequest) = this()
  
  /** DeleteIntentRequest name. */
  @JSName("name")
  var name_DeleteIntentRequest: String = js.native
  
  /**
    * Converts this DeleteIntentRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DeleteIntentRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2.DeleteIntentRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeleteIntentRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteIntentRequest instance
    */
  /* static member */
  inline def create(): DeleteIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeleteIntentRequest]
  inline def create(properties: IDeleteIntentRequest): DeleteIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeleteIntentRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): DeleteIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteIntentRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteIntentRequest]
  /**
    * Decodes a DeleteIntentRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DeleteIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteIntentRequest]
  inline def decode(reader: Reader, length: Double): DeleteIntentRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteIntentRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteIntentRequest]
  /**
    * Decodes a DeleteIntentRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteIntentRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DeleteIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteIntentRequest]
  
  /**
    * Encodes the specified DeleteIntentRequest message. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteIntentRequest.verify|verify} messages.
    * @param message DeleteIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDeleteIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDeleteIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteIntentRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2.DeleteIntentRequest.verify|verify} messages.
    * @param message DeleteIntentRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDeleteIntentRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDeleteIntentRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteIntentRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteIntentRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DeleteIntentRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteIntentRequest]
  
  /**
    * Creates a plain object from a DeleteIntentRequest message. Also converts values to other types if specified.
    * @param message DeleteIntentRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DeleteIntentRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DeleteIntentRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DeleteIntentRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
