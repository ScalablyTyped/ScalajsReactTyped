package typingsJapgolly.dialogflow.protosProtosMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a ListOperationsRequest. */
@JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest")
@js.native
/**
  * Constructs a new ListOperationsRequest.
  * @param [properties] Properties to set
  */
open class ListOperationsRequest ()
  extends StObject
     with IListOperationsRequest {
  def this(properties: IListOperationsRequest) = this()
  
  /** ListOperationsRequest filter. */
  @JSName("filter")
  var filter_ListOperationsRequest: String = js.native
  
  /** ListOperationsRequest name. */
  @JSName("name")
  var name_ListOperationsRequest: String = js.native
  
  /** ListOperationsRequest pageSize. */
  @JSName("pageSize")
  var pageSize_ListOperationsRequest: Double = js.native
  
  /** ListOperationsRequest pageToken. */
  @JSName("pageToken")
  var pageToken_ListOperationsRequest: String = js.native
  
  /**
    * Converts this ListOperationsRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object ListOperationsRequest {
  
  @JSImport("dialogflow/protos/protos", "google.longrunning.ListOperationsRequest")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new ListOperationsRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ListOperationsRequest instance
    */
  /* static member */
  inline def create(): ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ListOperationsRequest]
  inline def create(properties: IListOperationsRequest): ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[ListOperationsRequest]
  
  inline def decode(reader: js.typedarray.Uint8Array): ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListOperationsRequest]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): ListOperationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListOperationsRequest]
  /**
    * Decodes a ListOperationsRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ListOperationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[ListOperationsRequest]
  inline def decode(reader: Reader, length: Double): ListOperationsRequest = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[ListOperationsRequest]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListOperationsRequest]
  /**
    * Decodes a ListOperationsRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ListOperationsRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[ListOperationsRequest]
  
  /**
    * Encodes the specified ListOperationsRequest message. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
    * @param message ListOperationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IListOperationsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IListOperationsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified ListOperationsRequest message, length delimited. Does not implicitly {@link google.longrunning.ListOperationsRequest.verify|verify} messages.
    * @param message ListOperationsRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IListOperationsRequest): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IListOperationsRequest, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a ListOperationsRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ListOperationsRequest
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): ListOperationsRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[ListOperationsRequest]
  
  /**
    * Creates a plain object from a ListOperationsRequest message. Also converts values to other types if specified.
    * @param message ListOperationsRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: ListOperationsRequest): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: ListOperationsRequest, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a ListOperationsRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
