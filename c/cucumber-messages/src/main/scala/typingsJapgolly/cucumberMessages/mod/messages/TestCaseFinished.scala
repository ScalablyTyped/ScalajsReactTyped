package typingsJapgolly.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.ITestCaseFinished
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TestCaseFinished. */
@JSImport("cucumber-messages", "messages.TestCaseFinished")
@js.native
/**
  * Constructs a new TestCaseFinished.
  * @param [properties] Properties to set
  */
open class TestCaseFinished ()
  extends typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished {
  def this(properties: ITestCaseFinished) = this()
}
object TestCaseFinished {
  
  @JSImport("cucumber-messages", "messages.TestCaseFinished")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new TestCaseFinished instance using the specified properties.
    * @param [properties] Properties to set
    * @returns TestCaseFinished instance
    */
  /* static member */
  inline def create(): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  inline def create(properties: ITestCaseFinished): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  
  inline def decode(reader: js.typedarray.Uint8Array): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  /**
    * Decodes a TestCaseFinished message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns TestCaseFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  inline def decode(reader: Reader, length: Double): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  /**
    * Decodes a TestCaseFinished message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns TestCaseFinished
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  
  /**
    * Encodes the specified TestCaseFinished message. Does not implicitly {@link io.cucumber.messages.TestCaseFinished.verify|verify} messages.
    * @param message TestCaseFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: ITestCaseFinished): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: ITestCaseFinished, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified TestCaseFinished message, length delimited. Does not implicitly {@link io.cucumber.messages.TestCaseFinished.verify|verify} messages.
    * @param message TestCaseFinished message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: ITestCaseFinished): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: ITestCaseFinished, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates a TestCaseFinished message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns TestCaseFinished
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished]
  
  /**
    * Creates a plain object from a TestCaseFinished message. Also converts values to other types if specified.
    * @param message TestCaseFinished
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(
    message: typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished
  ): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(
    message: typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages.TestCaseFinished,
    options: IConversionOptions
  ): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies a TestCaseFinished message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
