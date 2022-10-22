package typingsJapgolly.awsSdk.clientsTranslateMod

import typingsJapgolly.awsSdk.awsSdkStrings.KMS
import typingsJapgolly.awsSdk.awsSdkStrings.MASK
import typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppliedTerminologyList = js.Array[AppliedTerminology]

type BoundedLengthString = java.lang.String

type ClientTokenString = java.lang.String

type ContentType = java.lang.String

type Description = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UNI
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTI
  - java.lang.String
*/
type Directionality = _Directionality | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.de_
  - typingsJapgolly.awsSdk.awsSdkStrings.en_
  - typingsJapgolly.awsSdk.awsSdkStrings.es_
  - typingsJapgolly.awsSdk.awsSdkStrings.fr_
  - typingsJapgolly.awsSdk.awsSdkStrings.it_
  - typingsJapgolly.awsSdk.awsSdkStrings.ja_
  - typingsJapgolly.awsSdk.awsSdkStrings.ko_
  - typingsJapgolly.awsSdk.awsSdkStrings.pt_
  - typingsJapgolly.awsSdk.awsSdkStrings.zh
  - typingsJapgolly.awsSdk.awsSdkStrings.`zh-TW`
  - java.lang.String
*/
type DisplayLanguageCode = _DisplayLanguageCode | java.lang.String

type EncryptionKeyID = java.lang.String

type EncryptionKeyType = KMS | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FORMAL
  - typingsJapgolly.awsSdk.awsSdkStrings.INFORMAL
  - java.lang.String
*/
type Formality = _Formality | java.lang.String

type IamRoleArn = java.lang.String

type Integer = Double

type JobId = java.lang.String

type JobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED_WITH_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type LanguageCodeString = java.lang.String

type LanguageCodeStringList = js.Array[LanguageCodeString]

type LanguagesList = js.Array[Language]

type LocalizedNameString = java.lang.String

type Long = Double

type MaxResultsInteger = Double

type MergeStrategy = OVERWRITE | java.lang.String

type NextToken = java.lang.String

type ParallelDataArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TSV
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.TMX
  - java.lang.String
*/
type ParallelDataFormat = _ParallelDataFormat | java.lang.String

type ParallelDataPropertiesList = js.Array[ParallelDataProperties]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ParallelDataStatus = _ParallelDataStatus | java.lang.String

type Profanity = MASK | java.lang.String

type ResourceArn = java.lang.String

type ResourceName = java.lang.String

type ResourceNameList = js.Array[ResourceName]

type S3Uri = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetLanguageCodeStringList = js.Array[LanguageCodeString]

type TermList = js.Array[Term]

type TerminologyArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CSV
  - typingsJapgolly.awsSdk.awsSdkStrings.TMX
  - typingsJapgolly.awsSdk.awsSdkStrings.TSV
  - java.lang.String
*/
type TerminologyDataFormat = _TerminologyDataFormat | java.lang.String

type TerminologyFile = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type TerminologyPropertiesList = js.Array[TerminologyProperties]

type TextTranslationJobPropertiesList = js.Array[TextTranslationJobProperties]

type Timestamp = js.Date

type UnboundedLengthString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
