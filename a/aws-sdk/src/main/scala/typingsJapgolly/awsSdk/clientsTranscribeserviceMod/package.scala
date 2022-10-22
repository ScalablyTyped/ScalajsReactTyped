package typingsJapgolly.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.EXACT
import typingsJapgolly.awsSdk.awsSdkStrings.PHI
import typingsJapgolly.awsSdk.awsSdkStrings.PII
import typingsJapgolly.awsSdk.awsSdkStrings.PRIMARYCARE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NarrowBand
  - typingsJapgolly.awsSdk.awsSdkStrings.WideBand
  - java.lang.String
*/
type BaseModelName = _BaseModelName | String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`hi-IN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-AU`
  - java.lang.String
*/
type CLMLanguageCode = _CLMLanguageCode | String

type CallAnalyticsJobName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type CallAnalyticsJobStatus = _CallAnalyticsJobStatus | String

type CallAnalyticsJobSummaries = js.Array[CallAnalyticsJobSummary]

type CategoryName = String

type CategoryPropertiesList = js.Array[CategoryProperties]

type ChannelDefinitions = js.Array[ChannelDefinition]

type ChannelId = Double

type DataAccessRoleArn = String

type DateTime = js.Date

type DurationInSeconds = Double

type FailureReason = String

type IdentifiedLanguageScore = Double

type KMSEncryptionContextMap = StringDictionary[NonEmptyString]

type KMSKeyId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`af-ZA`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ar-AE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ar-SA`
  - typingsJapgolly.awsSdk.awsSdkStrings.`da-DK`
  - typingsJapgolly.awsSdk.awsSdkStrings.`de-CH`
  - typingsJapgolly.awsSdk.awsSdkStrings.`de-DE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-AB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-AU`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-IE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-IN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-WL`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-ES`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fa-IR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-CA`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-FR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`he-IL`
  - typingsJapgolly.awsSdk.awsSdkStrings.`hi-IN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`id-ID`
  - typingsJapgolly.awsSdk.awsSdkStrings.`it-IT`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ja-JP`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ko-KR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ms-MY`
  - typingsJapgolly.awsSdk.awsSdkStrings.`nl-NL`
  - typingsJapgolly.awsSdk.awsSdkStrings.`pt-BR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`pt-PT`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ru-RU`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ta-IN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`te-IN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`tr-TR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`zh-CN`
  - typingsJapgolly.awsSdk.awsSdkStrings.`zh-TW`
  - typingsJapgolly.awsSdk.awsSdkStrings.`th-TH`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-ZA`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-NZ`
  - java.lang.String
*/
type LanguageCode = _LanguageCode | String

type LanguageCodeList = js.Array[LanguageCodeItem]

type LanguageIdSettingsMap = StringDictionary[LanguageIdSettings]

type LanguageOptions = js.Array[LanguageCode]

type MaxAlternatives = Double

type MaxResults = Double

type MaxSpeakers = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.mp3_
  - typingsJapgolly.awsSdk.awsSdkStrings.mp4_
  - typingsJapgolly.awsSdk.awsSdkStrings.wav_
  - typingsJapgolly.awsSdk.awsSdkStrings.flac
  - typingsJapgolly.awsSdk.awsSdkStrings.ogg
  - typingsJapgolly.awsSdk.awsSdkStrings.amr
  - typingsJapgolly.awsSdk.awsSdkStrings.webm_
  - java.lang.String
*/
type MediaFormat = _MediaFormat | String

type MediaSampleRateHertz = Double

type MedicalContentIdentificationType = PHI | String

type MedicalMediaSampleRateHertz = Double

type MedicalTranscriptionJobSummaries = js.Array[MedicalTranscriptionJobSummary]

type ModelName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ModelStatus = _ModelStatus | String

type Models = js.Array[LanguageModel]

type NextToken = String

type NonEmptyString = String

type OutputBucketName = String

type OutputKey = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_BUCKET
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_BUCKET
  - java.lang.String
*/
type OutputLocationType = _OutputLocationType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AGENT
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER
  - java.lang.String
*/
type ParticipantRole = _ParticipantRole | String

type Percentage = Double

type Phrase = String

type Phrases = js.Array[Phrase]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BANK_ACCOUNT_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.BANK_ROUTING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREDIT_DEBIT_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.CREDIT_DEBIT_CVV
  - typingsJapgolly.awsSdk.awsSdkStrings.CREDIT_DEBIT_EXPIRY
  - typingsJapgolly.awsSdk.awsSdkStrings.PIN
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE
  - typingsJapgolly.awsSdk.awsSdkStrings.SSN
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type PiiEntityType = _PiiEntityType | String

type PiiEntityTypes = js.Array[PiiEntityType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.redacted
  - typingsJapgolly.awsSdk.awsSdkStrings.redacted_and_unredacted
  - java.lang.String
*/
type RedactionOutput = _RedactionOutput | String

type RedactionType = PII | String

type RuleList = js.Array[Rule]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.POSITIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.NEGATIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.NEUTRAL
  - typingsJapgolly.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
type SentimentValue = _SentimentValue | String

type SentimentValueList = js.Array[SentimentValue]

type Specialty = PRIMARYCARE | String

type StringTargetList = js.Array[NonEmptyString]

type SubtitleFileUris = js.Array[Uri]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.vtt
  - typingsJapgolly.awsSdk.awsSdkStrings.srt_
  - java.lang.String
*/
type SubtitleFormat = _SubtitleFormat | String

type SubtitleFormats = js.Array[SubtitleFormat]

type SubtitleOutputStartIndex = Double

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TimestampMilliseconds = Double

type TranscribeArn = String

type TranscriptFilterType = EXACT | String

type TranscriptionJobName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type TranscriptionJobStatus = _TranscriptionJobStatus | String

type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONVERSATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DICTATION
  - java.lang.String
*/
type Type = _Type | String

type Uri = String

type Vocabularies = js.Array[VocabularyInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.remove__
  - typingsJapgolly.awsSdk.awsSdkStrings.mask__
  - typingsJapgolly.awsSdk.awsSdkStrings.tag_
  - java.lang.String
*/
type VocabularyFilterMethod = _VocabularyFilterMethod | String

type VocabularyFilterName = String

type VocabularyFilters = js.Array[VocabularyFilterInfo]

type VocabularyName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type VocabularyState = _VocabularyState | String

type Word = String

type Words = js.Array[Word]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-10-26`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
