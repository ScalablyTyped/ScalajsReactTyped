package typingsJapgolly.winrtUwp.Windows.Media.SpeechRecognition

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrtUwp.Windows.Foundation.EventHandler
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.TypedEventHandler
import typingsJapgolly.winrtUwp.Windows.Globalization.Language
import typingsJapgolly.winrtUwp.Windows.WinRTEvent
import typingsJapgolly.winrtUwp.winrtUwpStrings.hypothesisgenerated
import typingsJapgolly.winrtUwp.winrtUwpStrings.recognitionqualitydegrading
import typingsJapgolly.winrtUwp.winrtUwpStrings.statechanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Enables speech recognition with either a default or a custom graphical user interface (GUI). */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer")
@js.native
/** Creates a new instance of the SpeechRecognizer class. */
class SpeechRecognizer () extends js.Object {
  /**
    * Creates a new instance of the SpeechRecognizer class with a language specifier.
    * @param language The spoken language to use for recognition.
    */
  def this(language: Language) = this()
  /** Gets the collection of constraint objects that are associated with the SpeechRecognizer object. */
  var constraints: IVector[ISpeechRecognitionConstraint] = js.native
  /** Gets the continuous recognition session object ( SpeechContinuousRecognitionSession ) associated with this SpeechRecognizer . */
  var continuousRecognitionSession: SpeechContinuousRecognitionSession = js.native
  /** Gets the language used for speech recognition. */
  var currentLanguage: Language = js.native
  /** Occurs during an ongoing dictation session when a recognition result fragment is returned by the speech recognizer. */
  @JSName("onhypothesisgenerated")
  var onhypothesisgenerated_Original: TypedEventHandler[SpeechRecognizer, SpeechRecognitionHypothesisGeneratedEventArgs] = js.native
  /** This event is raised when an audio problem is detected that might affect recognition accuracy. */
  @JSName("onrecognitionqualitydegrading")
  var onrecognitionqualitydegrading_Original: TypedEventHandler[SpeechRecognizer, SpeechRecognitionQualityDegradingEventArgs] = js.native
  /** This event is raised when a change occurs to the State property during audio capture. */
  @JSName("onstatechanged")
  var onstatechanged_Original: TypedEventHandler[SpeechRecognizer, SpeechRecognizerStateChangedEventArgs] = js.native
  /** Gets the state of the speech recognizer. */
  var state: SpeechRecognizerState = js.native
  /** Gets how long a speech recognizer ignores silence or unrecognizable sounds (babble) and continues listening for speech input. */
  var timeouts: SpeechRecognizerTimeouts = js.native
  /** Gets the UI settings for the RecognizeWithUIAsync method. */
  var uiOptions: SpeechRecognizerUIOptions = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hypothesisgenerated(
    `type`: hypothesisgenerated,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognitionHypothesisGeneratedEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_recognitionqualitydegrading(
    `type`: recognitionqualitydegrading,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognitionQualityDegradingEventArgs]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statechanged(
    `type`: statechanged,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognizerStateChangedEventArgs]
  ): Unit = js.native
  /** Disposes the speech recognizer by freeing, releasing, or resetting allocated resources. */
  def close(): Unit = js.native
  /**
    * Asynchronously compile all constraints specified by the Constraints property.
    * @return The result of the constraints compilation as a SpeechRecognitionCompilationResult object.
    */
  def compileConstraintsAsync(): IPromiseWithIAsyncOperation[SpeechRecognitionCompilationResult] = js.native
  /** Occurs during an ongoing dictation session when a recognition result fragment is returned by the speech recognizer. */
  def onhypothesisgenerated(ev: SpeechRecognitionHypothesisGeneratedEventArgs with WinRTEvent[SpeechRecognizer]): Unit = js.native
  /** This event is raised when an audio problem is detected that might affect recognition accuracy. */
  def onrecognitionqualitydegrading(ev: SpeechRecognitionQualityDegradingEventArgs with WinRTEvent[SpeechRecognizer]): Unit = js.native
  /** This event is raised when a change occurs to the State property during audio capture. */
  def onstatechanged(ev: SpeechRecognizerStateChangedEventArgs with WinRTEvent[SpeechRecognizer]): Unit = js.native
  /**
    * Begins a speech recognition session for a SpeechRecognizer object.
    * @return The result of the speech recognition session that was initiated by the SpeechRecognizer object.
    */
  def recognizeAsync(): IPromiseWithIAsyncOperation[SpeechRecognitionResult] = js.native
  /**
    * Asynchronously starts a speech recognition session that includes additional UI mechanisms, including prompts, examples, text-to-speech (TTS), and confirmations.
    * @return The result of the speech recognition session as a SpeechRecognitionResult object.
    */
  def recognizeWithUIAsync(): IPromiseWithIAsyncOperation[SpeechRecognitionResult] = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hypothesisgenerated(
    `type`: hypothesisgenerated,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognitionHypothesisGeneratedEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_recognitionqualitydegrading(
    `type`: recognitionqualitydegrading,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognitionQualityDegradingEventArgs]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statechanged(
    `type`: statechanged,
    listener: TypedEventHandler[SpeechRecognizer, SpeechRecognizerStateChangedEventArgs]
  ): Unit = js.native
  /**
    * Asynchronously ends the speech recognition session.
    * @return No object or value is returned when this method completes.
    */
  def stopRecognitionAsync(): IPromiseWithIAsyncAction = js.native
}

/* static members */
@JSGlobal("Windows.Media.SpeechRecognition.SpeechRecognizer")
@js.native
object SpeechRecognizer extends js.Object {
  /** Gets the collection of languages supported by the custom grammars of the SpeechRecognitionGrammarFileConstraint and SpeechRecognitionListConstraint objects specified in the Constraints property. */
  var supportedGrammarLanguages: IVectorView[Language] = js.native
  /** Gets the collection of languages supported by the pre-defined, web-service grammars of the SpeechRecognitionTopicConstraint objects specified in the Constraints property. */
  var supportedTopicLanguages: IVectorView[Language] = js.native
  /** Gets the language of the device specified in Settings > Time & Language > Speech. */
  var systemSpeechLanguage: Language = js.native
}

