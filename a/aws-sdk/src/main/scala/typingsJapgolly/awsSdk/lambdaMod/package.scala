package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMod {
  type Action = java.lang.String
  type AdditionalVersion = java.lang.String
  type AdditionalVersionWeights = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.lambdaMod.Weight]
  type Alias = java.lang.String
  type AliasList = js.Array[typingsJapgolly.awsSdk.lambdaMod.AliasConfiguration]
  type Arn = java.lang.String
  type BatchSize = scala.Double
  type BisectBatchOnFunctionError = scala.Boolean
  type BlobStream = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.lambdaMod.Blob | java.lang.String | typingsJapgolly.node.streamMod.Readable
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.lambdaMod.ClientApiVersions
  type CompatibleRuntimes = js.Array[typingsJapgolly.awsSdk.lambdaMod.Runtime]
  type Date = js.Date
  type Description = java.lang.String
  type DestinationArn = java.lang.String
  type Enabled = scala.Boolean
  type EnvironmentVariableName = java.lang.String
  type EnvironmentVariableValue = java.lang.String
  type EnvironmentVariables = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.lambdaMod.EnvironmentVariableValue]
  type EventSourceMappingsList = js.Array[typingsJapgolly.awsSdk.lambdaMod.EventSourceMappingConfiguration]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typingsJapgolly.awsSdk.awsSdkStrings.LATEST
    - typingsJapgolly.awsSdk.awsSdkStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type EventSourcePosition = typingsJapgolly.awsSdk.lambdaMod._EventSourcePosition | java.lang.String
  type EventSourceToken = java.lang.String
  type FunctionArn = java.lang.String
  type FunctionEventInvokeConfigList = js.Array[typingsJapgolly.awsSdk.lambdaMod.FunctionEventInvokeConfig]
  type FunctionList = js.Array[typingsJapgolly.awsSdk.lambdaMod.FunctionConfiguration]
  type FunctionName = java.lang.String
  type FunctionVersion = typingsJapgolly.awsSdk.awsSdkStrings.ALL | java.lang.String
  type Handler = java.lang.String
  type HttpStatus = scala.Double
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Event_
    - typingsJapgolly.awsSdk.awsSdkStrings.RequestResponse
    - typingsJapgolly.awsSdk.awsSdkStrings.DryRun
    - java.lang.String
  */
  type InvocationType = typingsJapgolly.awsSdk.lambdaMod._InvocationType | java.lang.String
  type KMSKeyArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - java.lang.String
  */
  type LastUpdateStatus = typingsJapgolly.awsSdk.lambdaMod._LastUpdateStatus | java.lang.String
  type LastUpdateStatusReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EniLimitExceeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.InsufficientRolePermissions
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidConfiguration
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalError
    - typingsJapgolly.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidSubnet
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidSecurityGroup
    - java.lang.String
  */
  type LastUpdateStatusReasonCode = typingsJapgolly.awsSdk.lambdaMod._LastUpdateStatusReasonCode | java.lang.String
  type LayerArn = java.lang.String
  type LayerList = js.Array[typingsJapgolly.awsSdk.lambdaMod.LayerVersionArn]
  type LayerName = java.lang.String
  type LayerPermissionAllowedAction = java.lang.String
  type LayerPermissionAllowedPrincipal = java.lang.String
  type LayerVersionArn = java.lang.String
  type LayerVersionNumber = scala.Double
  type LayerVersionsList = js.Array[typingsJapgolly.awsSdk.lambdaMod.LayerVersionsListItem]
  type LayersList = js.Array[typingsJapgolly.awsSdk.lambdaMod.LayersListItem]
  type LayersReferenceList = js.Array[typingsJapgolly.awsSdk.lambdaMod.Layer]
  type LicenseInfo = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.None_
    - typingsJapgolly.awsSdk.awsSdkStrings.Tail
    - java.lang.String
  */
  type LogType = typingsJapgolly.awsSdk.lambdaMod._LogType | java.lang.String
  type Long = scala.Double
  type MasterRegion = java.lang.String
  type MaxFunctionEventInvokeConfigListItems = scala.Double
  type MaxLayerListItems = scala.Double
  type MaxListItems = scala.Double
  type MaxProvisionedConcurrencyConfigListItems = scala.Double
  type MaximumBatchingWindowInSeconds = scala.Double
  type MaximumEventAgeInSeconds = scala.Double
  type MaximumRecordAgeInSeconds = scala.Double
  type MaximumRetryAttempts = scala.Double
  type MaximumRetryAttemptsEventSourceMapping = scala.Double
  type MemorySize = scala.Double
  type NameSpacedFunctionArn = java.lang.String
  type NamespacedFunctionName = java.lang.String
  type NamespacedStatementId = java.lang.String
  type NonNegativeInteger = scala.Double
  type OrganizationId = java.lang.String
  type ParallelizationFactor = scala.Double
  type PositiveInteger = scala.Double
  type Principal = java.lang.String
  type ProvisionedConcurrencyConfigList = js.Array[typingsJapgolly.awsSdk.lambdaMod.ProvisionedConcurrencyConfigListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.READY
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ProvisionedConcurrencyStatusEnum = typingsJapgolly.awsSdk.lambdaMod._ProvisionedConcurrencyStatusEnum | java.lang.String
  type Qualifier = java.lang.String
  type ReservedConcurrentExecutions = scala.Double
  type ResourceArn = java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.nodejs
    - typingsJapgolly.awsSdk.awsSdkStrings.nodejs4Dot3
    - typingsJapgolly.awsSdk.awsSdkStrings.nodejs6Dot10
    - typingsJapgolly.awsSdk.awsSdkStrings.nodejs8Dot10
    - typingsJapgolly.awsSdk.awsSdkStrings.nodejs10Dotx
    - typingsJapgolly.awsSdk.awsSdkStrings.nodejs12Dotx
    - typingsJapgolly.awsSdk.awsSdkStrings.java8
    - typingsJapgolly.awsSdk.awsSdkStrings.java11
    - typingsJapgolly.awsSdk.awsSdkStrings.python2Dot7
    - typingsJapgolly.awsSdk.awsSdkStrings.python3Dot6
    - typingsJapgolly.awsSdk.awsSdkStrings.python3Dot7
    - typingsJapgolly.awsSdk.awsSdkStrings.python3Dot8
    - typingsJapgolly.awsSdk.awsSdkStrings.dotnetcore1Dot0
    - typingsJapgolly.awsSdk.awsSdkStrings.dotnetcore2Dot0
    - typingsJapgolly.awsSdk.awsSdkStrings.dotnetcore2Dot1
    - typingsJapgolly.awsSdk.awsSdkStrings.`nodejs4Dot3-edge`
    - typingsJapgolly.awsSdk.awsSdkStrings.go1Dotx
    - typingsJapgolly.awsSdk.awsSdkStrings.ruby2Dot5
    - typingsJapgolly.awsSdk.awsSdkStrings.provided
    - java.lang.String
  */
  type Runtime = typingsJapgolly.awsSdk.lambdaMod._Runtime | java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type S3ObjectVersion = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[typingsJapgolly.awsSdk.lambdaMod.SecurityGroupId]
  type SensitiveString = java.lang.String
  type SourceOwner = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type State = typingsJapgolly.awsSdk.lambdaMod._State | java.lang.String
  type StateReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Idle_
    - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Restoring_
    - typingsJapgolly.awsSdk.awsSdkStrings.EniLimitExceeded_
    - typingsJapgolly.awsSdk.awsSdkStrings.InsufficientRolePermissions
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidConfiguration
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalError
    - typingsJapgolly.awsSdk.awsSdkStrings.SubnetOutOfIPAddresses
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidSubnet
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidSecurityGroup
    - java.lang.String
  */
  type StateReasonCode = typingsJapgolly.awsSdk.lambdaMod._StateReasonCode | java.lang.String
  type StatementId = java.lang.String
  type String = java.lang.String
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsJapgolly.awsSdk.lambdaMod.SubnetId]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.lambdaMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.lambdaMod.TagValue]
  type Timeout = scala.Double
  type Timestamp = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.PassThrough_
    - java.lang.String
  */
  type TracingMode = typingsJapgolly.awsSdk.lambdaMod._TracingMode | java.lang.String
  type UnreservedConcurrentExecutions = scala.Double
  type Version = java.lang.String
  type VpcId = java.lang.String
  type Weight = scala.Double
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.lambdaMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-11-11`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-03-31`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.lambdaMod._apiVersion | java.lang.String
}
