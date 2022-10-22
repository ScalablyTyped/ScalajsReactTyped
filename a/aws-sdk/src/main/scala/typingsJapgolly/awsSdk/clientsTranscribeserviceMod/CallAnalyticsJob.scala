package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallAnalyticsJob extends StObject {
  
  /**
    * The name of the Call Analytics job. Job names are case sensitive and must be unique within an Amazon Web Services account.
    */
  var CallAnalyticsJobName: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJobName] = js.undefined
  
  /**
    * Provides the status of the specified Call Analytics job. If the status is COMPLETED, the job is finished and you can find the results at the location specified in TranscriptFileUri (or RedactedTranscriptFileUri, if you requested transcript redaction). If the status is FAILED, FailureReason provides details on why your transcription job failed.
    */
  var CallAnalyticsJobStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.CallAnalyticsJobStatus] = js.undefined
  
  /**
    * Allows you to specify which speaker is on which channel in your Call Analytics job request. For example, if your agent is the first participant to speak, you would set ChannelId to 0 (to indicate the first channel) and ParticipantRole to AGENT (to indicate that it's the agent speaking).
    */
  var ChannelDefinitions: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.ChannelDefinitions] = js.undefined
  
  /**
    * The date and time the specified Call Analytics job finished processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:33:13.922000-07:00 represents a transcription job that started processing at 12:33 PM UTC-7 on May 4, 2022.
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time the specified Call Analytics job request was made. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.761000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that has permissions to access the Amazon S3 bucket that contains your input files. If the role you specify doesn’t have the appropriate permissions to access the specified Amazon S3 location, your request fails. IAM role ARNs have the format arn:partition:iam::account:role/role-name-with-path. For example: arn:aws:iam::111122223333:role/Admin. For more information, see IAM ARNs.
    */
  var DataAccessRoleArn: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.DataAccessRoleArn] = js.undefined
  
  /**
    * If CallAnalyticsJobStatus is FAILED, FailureReason contains information about why the Call Analytics job request failed. The FailureReason field contains one of the following values:    Unsupported media format. The media format specified in MediaFormat isn't valid. Refer to MediaFormat for a list of supported formats.    The media format provided does not match the detected media format. The media format specified in MediaFormat doesn't match the format of the input file. Check the media format of your media file and correct the specified value.    Invalid sample rate for audio file. The sample rate specified in MediaSampleRateHertz isn't valid. The sample rate must be between 8,000 and 48,000 Hertz.    The sample rate provided does not match the detected sample rate. The sample rate specified in MediaSampleRateHertz doesn't match the sample rate detected in your input media file. Check the sample rate of your media file and correct the specified value.    Invalid file size: file size too large. The size of your media file is larger than what Amazon Transcribe can process. For more information, refer to Guidelines and quotas.    Invalid number of channels: number of channels too large. Your audio contains more channels than Amazon Transcribe is able to process. For more information, refer to Guidelines and quotas.  
    */
  var FailureReason: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.FailureReason] = js.undefined
  
  /**
    * The confidence score associated with the language identified in your media file. Confidence scores are values between 0 and 1; a larger value indicates a higher probability that the identified language correctly matches the language spoken in your media.
    */
  var IdentifiedLanguageScore: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.IdentifiedLanguageScore] = js.undefined
  
  /**
    * The language code used to create your Call Analytics job. For a list of supported languages and their associated language codes, refer to the Supported languages table. If you don't know the language spoken in your media file, you can omit this field and let Amazon Transcribe automatically identify the language of your media. To improve the accuracy of language identification, you can include several language codes and Amazon Transcribe chooses the closest match for your transcription.
    */
  var LanguageCode: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.LanguageCode] = js.undefined
  
  var Media: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.Media] = js.undefined
  
  /**
    * The format of the input media file.
    */
  var MediaFormat: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.MediaFormat] = js.undefined
  
  /**
    * The sample rate, in Hertz, of the audio track in your input media file.
    */
  var MediaSampleRateHertz: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.MediaSampleRateHertz] = js.undefined
  
  /**
    * Allows additional optional settings in your request, including content redaction; allows you to apply custom language models, vocabulary filters, and custom vocabularies to your Call Analytics job.
    */
  var Settings: js.UndefOr[CallAnalyticsJobSettings] = js.undefined
  
  /**
    * The date and time the specified Call Analytics job began processing. Timestamps are in the format YYYY-MM-DD'T'HH:MM:SS.SSSSSS-UTC. For example, 2022-05-04T12:32:58.789000-07:00 represents a transcription job that started processing at 12:32 PM UTC-7 on May 4, 2022.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  var Transcript: js.UndefOr[typingsJapgolly.awsSdk.clientsTranscribeserviceMod.Transcript] = js.undefined
}
object CallAnalyticsJob {
  
  inline def apply(): CallAnalyticsJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallAnalyticsJob]
  }
  
  extension [Self <: CallAnalyticsJob](x: Self) {
    
    inline def setCallAnalyticsJobName(value: CallAnalyticsJobName): Self = StObject.set(x, "CallAnalyticsJobName", value.asInstanceOf[js.Any])
    
    inline def setCallAnalyticsJobNameUndefined: Self = StObject.set(x, "CallAnalyticsJobName", js.undefined)
    
    inline def setCallAnalyticsJobStatus(value: CallAnalyticsJobStatus): Self = StObject.set(x, "CallAnalyticsJobStatus", value.asInstanceOf[js.Any])
    
    inline def setCallAnalyticsJobStatusUndefined: Self = StObject.set(x, "CallAnalyticsJobStatus", js.undefined)
    
    inline def setChannelDefinitions(value: ChannelDefinitions): Self = StObject.set(x, "ChannelDefinitions", value.asInstanceOf[js.Any])
    
    inline def setChannelDefinitionsUndefined: Self = StObject.set(x, "ChannelDefinitions", js.undefined)
    
    inline def setChannelDefinitionsVarargs(value: ChannelDefinition*): Self = StObject.set(x, "ChannelDefinitions", js.Array(value*))
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataAccessRoleArn(value: DataAccessRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setIdentifiedLanguageScore(value: IdentifiedLanguageScore): Self = StObject.set(x, "IdentifiedLanguageScore", value.asInstanceOf[js.Any])
    
    inline def setIdentifiedLanguageScoreUndefined: Self = StObject.set(x, "IdentifiedLanguageScore", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setMedia(value: Media): Self = StObject.set(x, "Media", value.asInstanceOf[js.Any])
    
    inline def setMediaFormat(value: MediaFormat): Self = StObject.set(x, "MediaFormat", value.asInstanceOf[js.Any])
    
    inline def setMediaFormatUndefined: Self = StObject.set(x, "MediaFormat", js.undefined)
    
    inline def setMediaSampleRateHertz(value: MediaSampleRateHertz): Self = StObject.set(x, "MediaSampleRateHertz", value.asInstanceOf[js.Any])
    
    inline def setMediaSampleRateHertzUndefined: Self = StObject.set(x, "MediaSampleRateHertz", js.undefined)
    
    inline def setMediaUndefined: Self = StObject.set(x, "Media", js.undefined)
    
    inline def setSettings(value: CallAnalyticsJobSettings): Self = StObject.set(x, "Settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "Settings", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setTranscript(value: Transcript): Self = StObject.set(x, "Transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "Transcript", js.undefined)
  }
}
