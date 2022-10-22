package typingsJapgolly.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio extends StObject {
  
  /**
    * Required. URI to a Google Cloud Storage object containing the audio to play, e.g., "gs://bucket/object". The object must contain a single channel (mono) of linear PCM audio (2 bytes
    * / sample) at 8kHz. This object must be readable by the `service-@gcp-sa-dialogflow.iam.gserviceaccount.com` service account where is the number of the Telephony Gateway project
    * (usually the same as the Dialogflow agent project). If the Google Cloud Storage bucket is in the Telephony Gateway project, this permission is added by default when enabling the
    * Dialogflow V2 API. For audio from other sources, consider using the `TelephonySynthesizeSpeech` message with SSML.
    */
  var audioUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageTelephonyPlayAudio](x: Self) {
    
    inline def setAudioUri(value: String): Self = StObject.set(x, "audioUri", value.asInstanceOf[js.Any])
    
    inline def setAudioUriUndefined: Self = StObject.set(x, "audioUri", js.undefined)
  }
}
