package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3InputAudioConfig extends StObject {
  
  /** Required. Audio encoding of the audio content to process. */
  var audioEncoding: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. If `true`, Dialogflow returns SpeechWordInfo in StreamingRecognitionResult with information about the recognized speech words, e.g. start and end time offsets. If false or
    * unspecified, Speech doesn't return any word-level information.
    */
  var enableWordInfo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Optional. Which Speech model to select for the given request. Select the model best suited to your domain to get best results. If a model is not explicitly specified, then we
    * auto-select a model based on the parameters in the InputAudioConfig. If enhanced speech model is enabled for the agent and an enhanced version of the specified model for the
    * language does not exist, then the speech is recognized using the standard version of the specified model. Refer to [Cloud Speech API
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#select-model) for more details.
    */
  var model: js.UndefOr[String] = js.undefined
  
  /** Optional. Which variant of the Speech model to use. */
  var modelVariant: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. A list of strings containing words and phrases that the speech recognizer should recognize with higher likelihood. See [the Cloud Speech
    * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints) for more details.
    */
  var phraseHints: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Sample rate (in Hertz) of the audio content sent in the query. Refer to [Cloud Speech API documentation](https://cloud.google.com/speech-to-text/docs/basics) for more details. */
  var sampleRateHertz: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. If `false` (default), recognition does not cease until the client closes the stream. If `true`, the recognizer will detect a single spoken utterance in input audio.
    * Recognition ceases when it detects the audio's voice has stopped or paused. In this case, once a detected intent is received, the client should close the stream and start a new
    * request with a new stream as needed. Note: This setting is relevant only for streaming methods.
    */
  var singleUtterance: js.UndefOr[Boolean] = js.undefined
}
object GoogleCloudDialogflowCxV3InputAudioConfig {
  
  inline def apply(): GoogleCloudDialogflowCxV3InputAudioConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3InputAudioConfig]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3InputAudioConfig](x: Self) {
    
    inline def setAudioEncoding(value: String): Self = StObject.set(x, "audioEncoding", value.asInstanceOf[js.Any])
    
    inline def setAudioEncodingUndefined: Self = StObject.set(x, "audioEncoding", js.undefined)
    
    inline def setEnableWordInfo(value: Boolean): Self = StObject.set(x, "enableWordInfo", value.asInstanceOf[js.Any])
    
    inline def setEnableWordInfoUndefined: Self = StObject.set(x, "enableWordInfo", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setModelVariant(value: String): Self = StObject.set(x, "modelVariant", value.asInstanceOf[js.Any])
    
    inline def setModelVariantUndefined: Self = StObject.set(x, "modelVariant", js.undefined)
    
    inline def setPhraseHints(value: js.Array[String]): Self = StObject.set(x, "phraseHints", value.asInstanceOf[js.Any])
    
    inline def setPhraseHintsUndefined: Self = StObject.set(x, "phraseHints", js.undefined)
    
    inline def setPhraseHintsVarargs(value: String*): Self = StObject.set(x, "phraseHints", js.Array(value*))
    
    inline def setSampleRateHertz(value: Double): Self = StObject.set(x, "sampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setSampleRateHertzUndefined: Self = StObject.set(x, "sampleRateHertz", js.undefined)
    
    inline def setSingleUtterance(value: Boolean): Self = StObject.set(x, "singleUtterance", value.asInstanceOf[js.Any])
    
    inline def setSingleUtteranceUndefined: Self = StObject.set(x, "singleUtterance", js.undefined)
  }
}
