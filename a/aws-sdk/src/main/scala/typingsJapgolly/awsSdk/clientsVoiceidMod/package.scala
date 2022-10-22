package typingsJapgolly.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type Arn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT
  - typingsJapgolly.awsSdk.awsSdkStrings.REJECT
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_ENOUGH_SPEECH
  - typingsJapgolly.awsSdk.awsSdkStrings.SPEAKER_NOT_ENROLLED
  - typingsJapgolly.awsSdk.awsSdkStrings.SPEAKER_OPTED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.SPEAKER_ID_NOT_PROVIDED
  - typingsJapgolly.awsSdk.awsSdkStrings.SPEAKER_EXPIRED
  - java.lang.String
*/
type AuthenticationDecision = _AuthenticationDecision | java.lang.String

type ClientTokenString = java.lang.String

type CustomerSpeakerId = java.lang.String

type Description = java.lang.String

type DomainId = java.lang.String

type DomainName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
  - java.lang.String
*/
type DomainStatus = _DomainStatus | java.lang.String

type DomainSummaries = js.Array[DomainSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIP
  - typingsJapgolly.awsSdk.awsSdkStrings.REGISTER_AS_NEW
  - java.lang.String
*/
type DuplicateRegistrationAction = _DuplicateRegistrationAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SKIP
  - typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE
  - java.lang.String
*/
type ExistingEnrollmentAction = _ExistingEnrollmentAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IGNORE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAIL
  - java.lang.String
*/
type FraudDetectionAction = _FraudDetectionAction | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HIGH_RISK
  - typingsJapgolly.awsSdk.awsSdkStrings.LOW_RISK
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_ENOUGH_SPEECH
  - java.lang.String
*/
type FraudDetectionDecision = _FraudDetectionDecision | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.KNOWN_FRAUDSTER
  - typingsJapgolly.awsSdk.awsSdkStrings.VOICE_SPOOFING
  - java.lang.String
*/
type FraudDetectionReason = _FraudDetectionReason | java.lang.String

type FraudDetectionReasons = js.Array[FraudDetectionReason]

type FraudsterId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type FraudsterRegistrationJobStatus = _FraudsterRegistrationJobStatus | java.lang.String

type FraudsterRegistrationJobSummaries = js.Array[FraudsterRegistrationJobSummary]

type GeneratedFraudsterId = java.lang.String

type GeneratedSpeakerId = java.lang.String

type IamRoleArn = java.lang.String

type Integer = Double

type JobId = java.lang.String

type JobName = java.lang.String

type KmsKeyId = java.lang.String

type MaxResultsForList = Double

type MaxResultsForListDomainFe = Double

type NextToken = java.lang.String

type S3Uri = java.lang.String

type Score = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ServerSideEncryptionUpdateStatus = _ServerSideEncryptionUpdateStatus | java.lang.String

type SessionId = java.lang.String

type SessionName = java.lang.String

type SessionNameOrId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type SpeakerEnrollmentJobStatus = _SpeakerEnrollmentJobStatus | java.lang.String

type SpeakerEnrollmentJobSummaries = js.Array[SpeakerEnrollmentJobSummary]

type SpeakerId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENROLLED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTED_OUT
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - java.lang.String
*/
type SpeakerStatus = _SpeakerStatus | java.lang.String

type SpeakerSummaries = js.Array[SpeakerSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.ONGOING
  - typingsJapgolly.awsSdk.awsSdkStrings.ENDED
  - java.lang.String
*/
type StreamingStatus = _StreamingStatus | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type UniqueIdLarge = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2021-09-27`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
