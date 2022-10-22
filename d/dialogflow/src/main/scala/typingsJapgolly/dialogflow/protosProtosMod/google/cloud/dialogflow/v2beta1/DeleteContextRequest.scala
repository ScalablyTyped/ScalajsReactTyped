package typingsJapgolly.dialogflow.protosProtosMod.google.cloud.dialogflow.v2beta1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteContextRequest. */
@JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest")
@js.native
/**
  * Constructs a new DeleteContextRequest.
  * @param [properties] Properties to set
  */
open class DeleteContextRequest ()
  extends StObject
     with IDeleteContextRequest {
  def this(properties: IDeleteContextRequest) = this()
  
  /** DeleteContextRequest name. */
  @JSName("name")
  var name_DeleteContextRequest: String = js.native
  
  /**
    * Converts this DeleteContextRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object DeleteContextRequest {
  
  @JSImport("dialogflow/protos/protos", "google.cloud.dialogflow.v2beta1.DeleteContextRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new DeleteContextRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteContextRequest instance
    */
  /* static member */
  inline def create(): DeleteContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[DeleteContextRequest]
  inline def create(properties: IDeleteContextRequest): DeleteContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[DeleteContextRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): DeleteContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteContextRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteContextRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteContextRequest]
  /**
    * Decodes a DeleteContextRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): DeleteContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteContextRequest]
  inline def decode(reader: Reader, length: Double): DeleteContextRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[DeleteContextRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteContextRequest]
  /**
    * Decodes a DeleteContextRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteContextRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): DeleteContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[DeleteContextRequest]
  
  /**
    * Encodes the specified DeleteContextRequest message. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteContextRequest.verify|verify} messages.
    * @param message DeleteContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IDeleteContextRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IDeleteContextRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified DeleteContextRequest message, length delimited. Does not implicitly {@link google.cloud.dialogflow.v2beta1.DeleteContextRequest.verify|verify} messages.
    * @param message DeleteContextRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IDeleteContextRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IDeleteContextRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a DeleteContextRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteContextRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): DeleteContextRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[DeleteContextRequest]
  
  /**
    * Creates a plain object from a DeleteContextRequest message. Also converts values to other types if specified.
    * @param message DeleteContextRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: DeleteContextRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: DeleteContextRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a DeleteContextRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
