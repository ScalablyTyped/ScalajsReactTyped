package typingsJapgolly.cucumberMessages.distSrcCucumberMessagesMod.io.cucumber.messages

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.attachment
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandActionComplete
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandError
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandGenerateSnippet
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandInitializeTestCase
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandRunAfterTestCaseHook
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandRunAfterTestRunHooks
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandRunBeforeTestCaseHook
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandRunBeforeTestRunHooks
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandRunTestStep
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.commandStart
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.gherkinDocument
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.hook
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.pickle
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.pickleAccepted
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.pickleRejected
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.source
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.stepDefinition
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.testCase
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.testCaseFinished
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.testCasePrepared
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.testCaseStarted
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.testRunFinished
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.testRunStarted
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.testStepFinished
import typingsJapgolly.cucumberMessages.cucumberMessagesStrings.testStepStarted
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Reader
import typingsJapgolly.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * All the messages that are passed between different components/processes are Envelope
  * messages.
  */
@JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope")
@js.native
/**
  * Constructs a new Envelope.
  * @param [properties] Properties to set
  */
open class Envelope ()
  extends StObject
     with IEnvelope {
  def this(properties: IEnvelope) = this()
  
  /** Envelope commandError. */
  @JSName("commandError")
  var commandError_Envelope: String = js.native
  
  /** Envelope message. */
  var message: js.UndefOr[
    source | gherkinDocument | pickle | attachment | testCaseStarted | testStepStarted | testStepFinished | testCaseFinished | pickleAccepted | pickleRejected | testCasePrepared | testRunStarted | testRunFinished | commandStart | commandActionComplete | commandRunBeforeTestRunHooks | commandInitializeTestCase | commandRunBeforeTestCaseHook | commandRunTestStep | commandRunAfterTestCaseHook | commandRunAfterTestRunHooks | commandGenerateSnippet | commandError | testCase | stepDefinition | hook
  ] = js.native
  
  /**
    * Converts this Envelope to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[Any] = js.native
}
object Envelope {
  
  @JSImport("cucumber-messages/dist/src/cucumber-messages", "io.cucumber.messages.Envelope")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new Envelope instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Envelope instance
    */
  /* static member */
  inline def create(): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Envelope]
  inline def create(properties: IEnvelope): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(properties.asInstanceOf[js.Any]).asInstanceOf[Envelope]
  
  inline def decode(reader: js.typedarray.Uint8Array): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Envelope]
  inline def decode(reader: js.typedarray.Uint8Array, length: Double): Envelope = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Envelope]
  /**
    * Decodes an Envelope message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decode(reader: Reader): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any]).asInstanceOf[Envelope]
  inline def decode(reader: Reader, length: Double): Envelope = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(reader.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Envelope]
  
  inline def decodeDelimited(reader: js.typedarray.Uint8Array): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Envelope]
  /**
    * Decodes an Envelope message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Envelope
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  inline def decodeDelimited(reader: Reader): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeDelimited")(reader.asInstanceOf[js.Any]).asInstanceOf[Envelope]
  
  /**
    * Encodes the specified Envelope message. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encode(message: IEnvelope): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encode(message: IEnvelope, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encode")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Encodes the specified Envelope message, length delimited. Does not implicitly {@link io.cucumber.messages.Envelope.verify|verify} messages.
    * @param message Envelope message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  inline def encodeDelimited(message: IEnvelope): Writer = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any]).asInstanceOf[Writer]
  inline def encodeDelimited(message: IEnvelope, writer: Writer): Writer = (^.asInstanceOf[js.Dynamic].applyDynamic("encodeDelimited")(message.asInstanceOf[js.Any], writer.asInstanceOf[js.Any])).asInstanceOf[Writer]
  
  /**
    * Creates an Envelope message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Envelope
    */
  /* static member */
  inline def fromObject(`object`: StringDictionary[Any]): Envelope = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(`object`.asInstanceOf[js.Any]).asInstanceOf[Envelope]
  
  /**
    * Creates a plain object from an Envelope message. Also converts values to other types if specified.
    * @param message Envelope
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  inline def toObject(message: Envelope): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def toObject(message: Envelope, options: IConversionOptions): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("toObject")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  /**
    * Verifies an Envelope message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  inline def verify(message: StringDictionary[Any]): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("verify")(message.asInstanceOf[js.Any]).asInstanceOf[String | Null]
}
