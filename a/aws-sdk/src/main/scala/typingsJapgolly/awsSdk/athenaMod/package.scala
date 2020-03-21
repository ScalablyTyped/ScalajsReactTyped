package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object athenaMod {
  type AmazonResourceName = java.lang.String
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type BytesScannedCutoffValue = scala.Double
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.athenaMod.ClientApiVersions
  type ColumnInfoList = js.Array[typingsJapgolly.awsSdk.athenaMod.ColumnInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_NULL
    - typingsJapgolly.awsSdk.awsSdkStrings.NULLABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - java.lang.String
  */
  type ColumnNullable = typingsJapgolly.awsSdk.athenaMod._ColumnNullable | java.lang.String
  type DatabaseString = java.lang.String
  type Date = js.Date
  type DescriptionString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SSE_S3
    - typingsJapgolly.awsSdk.awsSdkStrings.SSE_KMS
    - typingsJapgolly.awsSdk.awsSdkStrings.CSE_KMS
    - java.lang.String
  */
  type EncryptionOption = typingsJapgolly.awsSdk.athenaMod._EncryptionOption | java.lang.String
  type ErrorCode = java.lang.String
  type ErrorMessage = java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = scala.Double
  type Long = scala.Double
  type MaxNamedQueriesCount = scala.Double
  type MaxQueryExecutionsCount = scala.Double
  type MaxQueryResults = scala.Double
  type MaxTagsCount = scala.Double
  type MaxWorkGroupsCount = scala.Double
  type NameString = java.lang.String
  type NamedQueryId = java.lang.String
  type NamedQueryIdList = js.Array[typingsJapgolly.awsSdk.athenaMod.NamedQueryId]
  type NamedQueryList = js.Array[typingsJapgolly.awsSdk.athenaMod.NamedQuery]
  type QueryExecutionId = java.lang.String
  type QueryExecutionIdList = js.Array[typingsJapgolly.awsSdk.athenaMod.QueryExecutionId]
  type QueryExecutionList = js.Array[typingsJapgolly.awsSdk.athenaMod.QueryExecution]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.QUEUED
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - java.lang.String
  */
  type QueryExecutionState = typingsJapgolly.awsSdk.athenaMod._QueryExecutionState | java.lang.String
  type QueryString = java.lang.String
  type RowList = js.Array[typingsJapgolly.awsSdk.athenaMod.Row]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DDL
    - typingsJapgolly.awsSdk.awsSdkStrings.DML
    - typingsJapgolly.awsSdk.awsSdkStrings.UTILITY
    - java.lang.String
  */
  type StatementType = typingsJapgolly.awsSdk.athenaMod._StatementType | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.athenaMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.athenaMod.Tag]
  type TagValue = java.lang.String
  type Token = java.lang.String
  type UnprocessedNamedQueryIdList = js.Array[typingsJapgolly.awsSdk.athenaMod.UnprocessedNamedQueryId]
  type UnprocessedQueryExecutionIdList = js.Array[typingsJapgolly.awsSdk.athenaMod.UnprocessedQueryExecutionId]
  type WorkGroupDescriptionString = java.lang.String
  type WorkGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type WorkGroupState = typingsJapgolly.awsSdk.athenaMod._WorkGroupState | java.lang.String
  type WorkGroupsList = js.Array[typingsJapgolly.awsSdk.athenaMod.WorkGroupSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-05-18`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.athenaMod._apiVersion | java.lang.String
  type datumList = js.Array[typingsJapgolly.awsSdk.athenaMod.Datum]
  type datumString = java.lang.String
}
