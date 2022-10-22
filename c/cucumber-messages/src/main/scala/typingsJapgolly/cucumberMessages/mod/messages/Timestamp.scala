package typingsJapgolly.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ITimestamp
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a Timestamp. */
@JSImport("cucumber-messages", "messages.Timestamp")
@js.native
/**
  * Constructs a new Timestamp.
  * @param [properties] Properties to set
  */
open class Timestamp ()
  extends typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp {
  def this(properties: ITimestamp) = this()
}
object Timestamp {
  
  @JSImport("cucumber-messages", "messages.Timestamp")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Timestamp instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Timestamp instance
    */
  /* static member */
  inline def create(): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  inline def create(properties: ITimestamp): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  /**
    * Decodes a Timestamp message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Timestamp
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  /**
    * Decodes a Timestamp message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Timestamp
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  
  /**
    * Encodes the specified Timestamp message. Does not implicitly {@link io.cucumber.messages.Timestamp.verify|verify} messages.
    * @param message Timestamp message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITimestamp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITimestamp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Timestamp message, length delimited. Does not implicitly {@link io.cucumber.messages.Timestamp.verify|verify} messages.
    * @param message Timestamp message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITimestamp): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITimestamp, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a Timestamp message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Timestamp
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp]
  
  /**
    * Creates a plain object from a Timestamp message. Also converts values to other types if specified.
    * @param message Timestamp
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(
    message: typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp
  ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.Timestamp,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a Timestamp message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
