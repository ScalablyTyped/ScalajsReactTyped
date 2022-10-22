package typingsJapgolly.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BaseScreenshotConfigIgnoreCoordinate = java.lang.String

type BaseScreenshotIgnoreCoordinates = js.Array[BaseScreenshotConfigIgnoreCoordinate]

type BaseScreenshots = js.Array[BaseScreenshot]

type Canaries = js.Array[Canary]

type CanariesLastRun = js.Array[CanaryLastRun]

type CanaryArn = java.lang.String

type CanaryName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.PASSED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CanaryRunState = _CanaryRunState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CANARY_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXECUTION_FAILURE
  - java.lang.String
*/
type CanaryRunStateReasonCode = _CanaryRunStateReasonCode | java.lang.String

type CanaryRuns = js.Array[CanaryRun]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type CanaryState = _CanaryState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PERMISSIONS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_COMPLETE
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLLBACK_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SYNC_DELETE_IN_PROGRESS
  - java.lang.String
*/
type CanaryStateReasonCode = _CanaryStateReasonCode | java.lang.String

type CodeHandler = java.lang.String

type DescribeCanariesLastRunNameFilter = js.Array[CanaryName]

type DescribeCanariesNameFilter = js.Array[CanaryName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSE_S3
  - typingsJapgolly.awsSdk.awsSdkStrings.SSE_KMS
  - java.lang.String
*/
type EncryptionMode = _EncryptionMode | java.lang.String

type EnvironmentVariableName = java.lang.String

type EnvironmentVariableValue = java.lang.String

type EnvironmentVariablesMap = StringDictionary[EnvironmentVariableValue]

type FunctionArn = java.lang.String

type GroupArn = java.lang.String

type GroupIdentifier = java.lang.String

type GroupName = java.lang.String

type GroupSummaryList = js.Array[GroupSummary]

type KmsKeyArn = java.lang.String

type MaxCanaryResults = Double

type MaxFifteenMinutesInSeconds = Double

type MaxGroupResults = Double

type MaxOneYearInSeconds = Double

type MaxSize100 = Double

type MaxSize1024 = Double

type MaxSize3008 = Double

type NullableBoolean = Boolean

type PaginationToken = java.lang.String

type ResourceArn = java.lang.String

type RoleArn = java.lang.String

type RuntimeVersionList = js.Array[RuntimeVersion]

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[SecurityGroupId]

type String = java.lang.String

type StringList = js.Array[String]

type SubnetId = java.lang.String

type SubnetIds = js.Array[SubnetId]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

type Token = java.lang.String

type UUID = java.lang.String

type VpcId = java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-10-11`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
