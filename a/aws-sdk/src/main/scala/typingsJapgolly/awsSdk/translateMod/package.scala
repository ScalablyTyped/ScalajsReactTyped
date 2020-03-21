package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object translateMod {
  type AppliedTerminologyList = js.Array[typingsJapgolly.awsSdk.translateMod.AppliedTerminology]
  type BoundedLengthString = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.translateMod.ClientApiVersions
  type ClientTokenString = java.lang.String
  type ContentType = java.lang.String
  type Description = java.lang.String
  type EncryptionKeyID = java.lang.String
  type EncryptionKeyType = typingsJapgolly.awsSdk.awsSdkStrings.KMS | java.lang.String
  type IamRoleArn = java.lang.String
  type Integer = scala.Double
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
  type JobStatus = typingsJapgolly.awsSdk.translateMod._JobStatus | java.lang.String
  type LanguageCodeString = java.lang.String
  type LanguageCodeStringList = js.Array[typingsJapgolly.awsSdk.translateMod.LanguageCodeString]
  type MaxResultsInteger = scala.Double
  type MergeStrategy = typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE | java.lang.String
  type NextToken = java.lang.String
  type ResourceName = java.lang.String
  type ResourceNameList = js.Array[typingsJapgolly.awsSdk.translateMod.ResourceName]
  type S3Uri = java.lang.String
  type String = java.lang.String
  type TargetLanguageCodeStringList = js.Array[typingsJapgolly.awsSdk.translateMod.LanguageCodeString]
  type TermList = js.Array[typingsJapgolly.awsSdk.translateMod.Term]
  type TerminologyArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CSV
    - typingsJapgolly.awsSdk.awsSdkStrings.TMX
    - java.lang.String
  */
  type TerminologyDataFormat = typingsJapgolly.awsSdk.translateMod._TerminologyDataFormat | java.lang.String
  type TerminologyFile = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.translateMod.Blob | java.lang.String
  type TerminologyPropertiesList = js.Array[typingsJapgolly.awsSdk.translateMod.TerminologyProperties]
  type TextTranslationJobPropertiesList = js.Array[typingsJapgolly.awsSdk.translateMod.TextTranslationJobProperties]
  type Timestamp = js.Date
  type UnboundedLengthString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.translateMod._apiVersion | java.lang.String
}
