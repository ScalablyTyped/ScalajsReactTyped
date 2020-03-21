package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object macieMod {
  type AWSAccountId = java.lang.String
  type BucketName = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.macieMod.ClientApiVersions
  type ErrorCode = java.lang.String
  type ExceptionMessage = java.lang.String
  type FailedS3Resources = js.Array[typingsJapgolly.awsSdk.macieMod.FailedS3Resource]
  type MaxResults = scala.Double
  type MemberAccounts = js.Array[typingsJapgolly.awsSdk.macieMod.MemberAccount]
  type NextToken = java.lang.String
  type Prefix = java.lang.String
  type S3ContinuousClassificationType = typingsJapgolly.awsSdk.awsSdkStrings.FULL | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type S3OneTimeClassificationType = typingsJapgolly.awsSdk.macieMod._S3OneTimeClassificationType | java.lang.String
  type S3Resources = js.Array[typingsJapgolly.awsSdk.macieMod.S3Resource]
  type S3ResourcesClassification = js.Array[typingsJapgolly.awsSdk.macieMod.S3ResourceClassification]
  type S3ResourcesClassificationUpdate = js.Array[typingsJapgolly.awsSdk.macieMod.S3ResourceClassificationUpdate]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-12-19`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.macieMod._apiVersion | java.lang.String
}
