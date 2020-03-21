package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object curMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-east-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`us-west-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-central-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-west-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-southeast-2`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`eu-north-1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-northeast-3`
    - typingsJapgolly.awsSdk.awsSdkStrings.`ap-east-1`
    - java.lang.String
  */
  type AWSRegion = typingsJapgolly.awsSdk.curMod._AWSRegion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REDSHIFT
    - typingsJapgolly.awsSdk.awsSdkStrings.QUICKSIGHT
    - typingsJapgolly.awsSdk.awsSdkStrings.ATHENA
    - java.lang.String
  */
  type AdditionalArtifact = typingsJapgolly.awsSdk.curMod._AdditionalArtifact | java.lang.String
  type AdditionalArtifactList = js.Array[typingsJapgolly.awsSdk.curMod.AdditionalArtifact]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.curMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ZIP
    - typingsJapgolly.awsSdk.awsSdkStrings.GZIP
    - typingsJapgolly.awsSdk.awsSdkStrings.Parquet
    - java.lang.String
  */
  type CompressionFormat = typingsJapgolly.awsSdk.curMod._CompressionFormat | java.lang.String
  type DeleteResponseMessage = java.lang.String
  type GenericString = java.lang.String
  type MaxResults = scala.Double
  type RefreshClosedReports = scala.Boolean
  type ReportDefinitionList = js.Array[typingsJapgolly.awsSdk.curMod.ReportDefinition]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.textORcsv
    - typingsJapgolly.awsSdk.awsSdkStrings.Parquet
    - java.lang.String
  */
  type ReportFormat = typingsJapgolly.awsSdk.curMod._ReportFormat | java.lang.String
  type ReportName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_NEW_REPORT
    - typingsJapgolly.awsSdk.awsSdkStrings.OVERWRITE_REPORT
    - java.lang.String
  */
  type ReportVersioning = typingsJapgolly.awsSdk.curMod._ReportVersioning | java.lang.String
  type S3Bucket = java.lang.String
  type S3Prefix = java.lang.String
  type SchemaElement = typingsJapgolly.awsSdk.awsSdkStrings.RESOURCES | java.lang.String
  type SchemaElementList = js.Array[typingsJapgolly.awsSdk.curMod.SchemaElement]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HOURLY
    - typingsJapgolly.awsSdk.awsSdkStrings.DAILY
    - java.lang.String
  */
  type TimeUnit = typingsJapgolly.awsSdk.curMod._TimeUnit | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-01-06`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.curMod._apiVersion | java.lang.String
}
