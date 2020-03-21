package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transcribeserviceMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.transcribeserviceMod.ClientApiVersions
  type DataAccessRoleArn = java.lang.String
  type DateTime = js.Date
  type FailureReason = java.lang.String
  type KMSKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
    - typingsJapgolly.awsSdk.awsSdkStrings.`es-US`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-AU`
    - typingsJapgolly.awsSdk.awsSdkStrings.`fr-CA`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
    - typingsJapgolly.awsSdk.awsSdkStrings.`de-DE`
    - typingsJapgolly.awsSdk.awsSdkStrings.`pt-BR`
    - typingsJapgolly.awsSdk.awsSdkStrings.`fr-FR`
    - typingsJapgolly.awsSdk.awsSdkStrings.`it-IT`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ko-KR`
    - typingsJapgolly.awsSdk.awsSdkStrings.`es-ES`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-IN`
    - typingsJapgolly.awsSdk.awsSdkStrings.`hi-IN`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ar-SA`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ru-RU`
    - typingsJapgolly.awsSdk.awsSdkStrings.`zh-CN`
    - typingsJapgolly.awsSdk.awsSdkStrings.`nl-NL`
    - typingsJapgolly.awsSdk.awsSdkStrings.`id-ID`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ta-IN`
    - typingsJapgolly.awsSdk.awsSdkStrings.`fa-IR`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-IE`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-AB`
    - typingsJapgolly.awsSdk.awsSdkStrings.`en-WL`
    - typingsJapgolly.awsSdk.awsSdkStrings.`pt-PT`
    - typingsJapgolly.awsSdk.awsSdkStrings.`te-IN`
    - typingsJapgolly.awsSdk.awsSdkStrings.`tr-TR`
    - typingsJapgolly.awsSdk.awsSdkStrings.`de-CH`
    - typingsJapgolly.awsSdk.awsSdkStrings.`he-IL`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ms-MY`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ja-JP`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ar-AE`
    - java.lang.String
  */
  type LanguageCode = typingsJapgolly.awsSdk.transcribeserviceMod._LanguageCode | java.lang.String
  type MaxAlternatives = scala.Double
  type MaxResults = scala.Double
  type MaxSpeakers = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.mp3_
    - typingsJapgolly.awsSdk.awsSdkStrings.mp4_
    - typingsJapgolly.awsSdk.awsSdkStrings.wav_
    - typingsJapgolly.awsSdk.awsSdkStrings.flac
    - java.lang.String
  */
  type MediaFormat = typingsJapgolly.awsSdk.transcribeserviceMod._MediaFormat | java.lang.String
  type MediaSampleRateHertz = scala.Double
  type NextToken = java.lang.String
  type OutputBucketName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_BUCKET
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_BUCKET
    - java.lang.String
  */
  type OutputLocationType = typingsJapgolly.awsSdk.transcribeserviceMod._OutputLocationType | java.lang.String
  type Phrase = java.lang.String
  type Phrases = js.Array[typingsJapgolly.awsSdk.transcribeserviceMod.Phrase]
  type TranscriptionJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type TranscriptionJobStatus = typingsJapgolly.awsSdk.transcribeserviceMod._TranscriptionJobStatus | java.lang.String
  type TranscriptionJobSummaries = js.Array[typingsJapgolly.awsSdk.transcribeserviceMod.TranscriptionJobSummary]
  type Uri = java.lang.String
  type Vocabularies = js.Array[typingsJapgolly.awsSdk.transcribeserviceMod.VocabularyInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.remove__
    - typingsJapgolly.awsSdk.awsSdkStrings.mask
    - java.lang.String
  */
  type VocabularyFilterMethod = typingsJapgolly.awsSdk.transcribeserviceMod._VocabularyFilterMethod | java.lang.String
  type VocabularyFilterName = java.lang.String
  type VocabularyFilters = js.Array[typingsJapgolly.awsSdk.transcribeserviceMod.VocabularyFilterInfo]
  type VocabularyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type VocabularyState = typingsJapgolly.awsSdk.transcribeserviceMod._VocabularyState | java.lang.String
  type Word = java.lang.String
  type Words = js.Array[typingsJapgolly.awsSdk.transcribeserviceMod.Word]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-10-26`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.transcribeserviceMod._apiVersion | java.lang.String
}
