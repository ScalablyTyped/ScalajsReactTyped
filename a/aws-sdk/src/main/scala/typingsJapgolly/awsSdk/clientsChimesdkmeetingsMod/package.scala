package typingsJapgolly.awsSdk.clientsChimesdkmeetingsMod

import typingsJapgolly.awsSdk.awsSdkStrings.PHI
import typingsJapgolly.awsSdk.awsSdkStrings.PII
import typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type Arn = java.lang.String

type AttendeeIdsList = js.Array[AttendeeIdItem]

type AttendeeList = js.Array[Attendee]

type BatchCreateAttendeeErrorList = js.Array[CreateAttendeeError]

type Boolean = scala.Boolean

type ClientRequestToken = java.lang.String

type CreateAttendeeRequestItemList = js.Array[CreateAttendeeRequestItem]

type CreateMeetingWithAttendeesRequestItemList = js.Array[CreateAttendeeRequestItem]

type ExternalMeetingId = java.lang.String

type ExternalUserId = java.lang.String

type GuidString = java.lang.String

type JoinTokenString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SendReceive
  - typingsJapgolly.awsSdk.awsSdkStrings.Send_
  - typingsJapgolly.awsSdk.awsSdkStrings.Receive_
  - typingsJapgolly.awsSdk.awsSdkStrings.None_
  - java.lang.String
*/
type MediaCapabilities = _MediaCapabilities | java.lang.String

type MediaRegion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAVAILABLE
  - java.lang.String
*/
type MeetingFeatureStatus = _MeetingFeatureStatus | java.lang.String

type PrimaryMeetingId = java.lang.String

type ResultMax = Double

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TenantId = java.lang.String

type TenantIdList = js.Array[TenantId]

type TranscribeContentIdentificationType = PII | java.lang.String

type TranscribeContentRedactionType = PII | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-GB`
  - typingsJapgolly.awsSdk.awsSdkStrings.`es-US`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-CA`
  - typingsJapgolly.awsSdk.awsSdkStrings.`fr-FR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`en-AU`
  - typingsJapgolly.awsSdk.awsSdkStrings.`it-IT`
  - typingsJapgolly.awsSdk.awsSdkStrings.`de-DE`
  - typingsJapgolly.awsSdk.awsSdkStrings.`pt-BR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ja-JP`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ko-KR`
  - typingsJapgolly.awsSdk.awsSdkStrings.`zh-CN`
  - java.lang.String
*/
type TranscribeLanguageCode = _TranscribeLanguageCode | java.lang.String

type TranscribeLanguageModelName = java.lang.String

type TranscribeLanguageOptions = java.lang.String

type TranscribeMedicalContentIdentificationType = PHI | java.lang.String

type TranscribeMedicalLanguageCode = `en-US` | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.auto__
  - java.lang.String
*/
type TranscribeMedicalRegion = _TranscribeMedicalRegion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIMARYCARE
  - typingsJapgolly.awsSdk.awsSdkStrings.CARDIOLOGY
  - typingsJapgolly.awsSdk.awsSdkStrings.NEUROLOGY
  - typingsJapgolly.awsSdk.awsSdkStrings.ONCOLOGY
  - typingsJapgolly.awsSdk.awsSdkStrings.RADIOLOGY
  - typingsJapgolly.awsSdk.awsSdkStrings.UROLOGY
  - java.lang.String
*/
type TranscribeMedicalSpecialty = _TranscribeMedicalSpecialty | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONVERSATION
  - typingsJapgolly.awsSdk.awsSdkStrings.DICTATION
  - java.lang.String
*/
type TranscribeMedicalType = _TranscribeMedicalType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.low__
  - typingsJapgolly.awsSdk.awsSdkStrings.medium__
  - typingsJapgolly.awsSdk.awsSdkStrings.high__
  - java.lang.String
*/
type TranscribePartialResultsStability = _TranscribePartialResultsStability | java.lang.String

type TranscribePiiEntityTypes = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`ca-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`sa-east-1`
  - typingsJapgolly.awsSdk.awsSdkStrings.auto__
  - typingsJapgolly.awsSdk.awsSdkStrings.`us-gov-west-1`
  - java.lang.String
*/
type TranscribeRegion = _TranscribeRegion | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.remove__
  - typingsJapgolly.awsSdk.awsSdkStrings.mask__
  - typingsJapgolly.awsSdk.awsSdkStrings.tag_
  - java.lang.String
*/
type TranscribeVocabularyFilterMethod = _TranscribeVocabularyFilterMethod | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2021-07-15`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
