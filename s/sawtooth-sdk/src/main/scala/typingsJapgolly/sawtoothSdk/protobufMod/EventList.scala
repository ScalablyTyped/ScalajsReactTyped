package typingsJapgolly.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk/protobuf", "EventList")
@js.native
/**
  * Constructs a new EventList.
  * @param [properties] Properties to set
  */
open class EventList ()
  extends StObject
     with IEventList {
  def this(properties: IEventList) = this()
  
  /** EventList events. */
  @JSName("events")
  var events_EventList: js.Array[IEvent] = js.native
  
  /**
    * Converts this EventList to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
/* static members */
object EventList {
  
  @JSImport("sawtooth-sdk/protobuf", "EventList")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new EventList instance using the specified properties.
    * @param [properties] Properties to set
    * @returns EventList instance
    */
  inline def create(): EventList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[EventList]
  inline def create(properties: IEventList): EventList = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[EventList]
  
  inline def decode(reader: js.typedarray.Uint8Array): EventList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EventList]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): EventList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EventList]
  /**
    * Decodes an EventList message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns EventList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decode(reader: Reader): EventList = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[EventList]
  inline def decode(reader: Reader, length: Double): EventList = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[EventList]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): EventList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EventList]
  /**
    * Decodes an EventList message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns EventList
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  inline def decodeDelimited(reader: Reader): EventList = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[EventList]
  
  /**
    * Encodes the specified EventList message. Does not implicitly {@link EventList.verify|verify} messages.
    * @param message EventList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encode(message: IEventList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEventList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified EventList message, length delimited. Does not implicitly {@link EventList.verify|verify} messages.
    * @param message EventList message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  inline def encodeDelimited(message: IEventList): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEventList, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an EventList message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns EventList
    */
  inline def fromObject(`object`: StringDictionary[Any]): EventList = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[EventList]
  
  /**
    * Creates a plain object from an EventList message. Also converts values to other types if specified.
    * @param message EventList
    * @param [options] Conversion options
    * @returns Plain object
    */
  inline def toObject(message: EventList): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: EventList, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an EventList message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
