package typingsJapgolly.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthesisTask extends StObject {
  
  /**
    * Timestamp for the time the synthesis task was started.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specifies the engine (standard or neural) for Amazon Polly to use when processing input text for speech synthesis. Using a voice that is not supported for the engine selected will result in an error.
    */
  var Engine: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.Engine] = js.undefined
  
  /**
    * Optional language code for a synthesis task. This is only necessary if using a bilingual voice, such as Aditi, which can be used for either Indian English (en-IN) or Hindi (hi-IN).  If a bilingual voice is used and no language code is specified, Amazon Polly uses the default language of the bilingual voice. The default language for any voice is the one returned by the DescribeVoices operation for the LanguageCode parameter. For example, if no language code is specified, Aditi will use Indian English rather than Hindi.
    */
  var LanguageCode: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.LanguageCode] = js.undefined
  
  /**
    * List of one or more pronunciation lexicon names you want the service to apply during synthesis. Lexicons are applied only if the language of the lexicon is the same as the language of the voice. 
    */
  var LexiconNames: js.UndefOr[LexiconNameList] = js.undefined
  
  /**
    * The format in which the returned output will be encoded. For audio stream, this will be mp3, ogg_vorbis, or pcm. For speech marks, this will be json. 
    */
  var OutputFormat: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.OutputFormat] = js.undefined
  
  /**
    * Pathway for the output speech file.
    */
  var OutputUri: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.OutputUri] = js.undefined
  
  /**
    * Number of billable characters synthesized.
    */
  var RequestCharacters: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.RequestCharacters] = js.undefined
  
  /**
    * The audio frequency specified in Hz. The valid values for mp3 and ogg_vorbis are "8000", "16000", "22050", and "24000". The default value for standard voices is "22050". The default value for neural voices is "24000". Valid values for pcm are "8000" and "16000" The default value is "16000". 
    */
  var SampleRate: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.SampleRate] = js.undefined
  
  /**
    * ARN for the SNS topic optionally used for providing status notification for a speech synthesis task.
    */
  var SnsTopicArn: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.SnsTopicArn] = js.undefined
  
  /**
    * The type of speech marks returned for the input text.
    */
  var SpeechMarkTypes: js.UndefOr[SpeechMarkTypeList] = js.undefined
  
  /**
    * The Amazon Polly generated identifier for a speech synthesis task.
    */
  var TaskId: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.TaskId] = js.undefined
  
  /**
    * Current status of the individual speech synthesis task.
    */
  var TaskStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.TaskStatus] = js.undefined
  
  /**
    * Reason for the current status of a specific speech synthesis task, including errors if the task has failed.
    */
  var TaskStatusReason: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.TaskStatusReason] = js.undefined
  
  /**
    * Specifies whether the input text is plain text or SSML. The default value is plain text. 
    */
  var TextType: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.TextType] = js.undefined
  
  /**
    * Voice ID to use for the synthesis. 
    */
  var VoiceId: js.UndefOr[typingsJapgolly.awsSdk.clientsPollyMod.VoiceId] = js.undefined
}
object SynthesisTask {
  
  inline def apply(): SynthesisTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesisTask]
  }
  
  extension [Self <: SynthesisTask](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setEngine(value: Engine): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setLexiconNames(value: LexiconNameList): Self = StObject.set(x, "LexiconNames", value.asInstanceOf[js.Any])
    
    inline def setLexiconNamesUndefined: Self = StObject.set(x, "LexiconNames", js.undefined)
    
    inline def setLexiconNamesVarargs(value: LexiconName*): Self = StObject.set(x, "LexiconNames", js.Array(value*))
    
    inline def setOutputFormat(value: OutputFormat): Self = StObject.set(x, "OutputFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputFormatUndefined: Self = StObject.set(x, "OutputFormat", js.undefined)
    
    inline def setOutputUri(value: OutputUri): Self = StObject.set(x, "OutputUri", value.asInstanceOf[js.Any])
    
    inline def setOutputUriUndefined: Self = StObject.set(x, "OutputUri", js.undefined)
    
    inline def setRequestCharacters(value: RequestCharacters): Self = StObject.set(x, "RequestCharacters", value.asInstanceOf[js.Any])
    
    inline def setRequestCharactersUndefined: Self = StObject.set(x, "RequestCharacters", js.undefined)
    
    inline def setSampleRate(value: SampleRate): Self = StObject.set(x, "SampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "SampleRate", js.undefined)
    
    inline def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
    
    inline def setSpeechMarkTypes(value: SpeechMarkTypeList): Self = StObject.set(x, "SpeechMarkTypes", value.asInstanceOf[js.Any])
    
    inline def setSpeechMarkTypesUndefined: Self = StObject.set(x, "SpeechMarkTypes", js.undefined)
    
    inline def setSpeechMarkTypesVarargs(value: SpeechMarkType*): Self = StObject.set(x, "SpeechMarkTypes", js.Array(value*))
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "TaskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "TaskId", js.undefined)
    
    inline def setTaskStatus(value: TaskStatus): Self = StObject.set(x, "TaskStatus", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusReason(value: TaskStatusReason): Self = StObject.set(x, "TaskStatusReason", value.asInstanceOf[js.Any])
    
    inline def setTaskStatusReasonUndefined: Self = StObject.set(x, "TaskStatusReason", js.undefined)
    
    inline def setTaskStatusUndefined: Self = StObject.set(x, "TaskStatus", js.undefined)
    
    inline def setTextType(value: TextType): Self = StObject.set(x, "TextType", value.asInstanceOf[js.Any])
    
    inline def setTextTypeUndefined: Self = StObject.set(x, "TextType", js.undefined)
    
    inline def setVoiceId(value: VoiceId): Self = StObject.set(x, "VoiceId", value.asInstanceOf[js.Any])
    
    inline def setVoiceIdUndefined: Self = StObject.set(x, "VoiceId", js.undefined)
  }
}
