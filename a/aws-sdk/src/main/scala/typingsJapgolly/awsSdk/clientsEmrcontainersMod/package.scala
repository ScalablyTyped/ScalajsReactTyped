package typingsJapgolly.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.EKS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ACMCertArn = String

type Base64Encoded = String

type ClientToken = String

type ClusterId = String

type ConfigurationList = js.Array[Configuration]

type ContainerProviderType = EKS | String

type Date = js.Date

type EndpointArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED_WITH_ERRORS
  - java.lang.String
*/
type EndpointState = _EndpointState | String

type EndpointStates = js.Array[EndpointState]

type EndpointType = String

type EndpointTypes = js.Array[EndpointType]

type Endpoints = js.Array[Endpoint]

type EntryPointArgument = String

type EntryPointArguments = js.Array[EntryPointArgument]

type EntryPointPath = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.CLUSTER_UNAVAILABLE
  - java.lang.String
*/
type FailureReason = _FailureReason | String

type IAMRoleArn = String

type JavaInteger = Double

type JobArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCEL_PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type JobRunState = _JobRunState | String

type JobRunStates = js.Array[JobRunState]

type JobRuns = js.Array[JobRun]

type KubernetesNamespace = String

type LogGroupName = String

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type PersistentAppUI = _PersistentAppUI | String

type ReleaseLabel = String

type RequestIdentityUserArn = String

type ResourceIdString = String

type ResourceNameString = String

type RsiArn = String

type SensitivePropertiesMap = StringDictionary[String1024]

type SparkSqlParameters = String

type SparkSubmitParameters = String

type String1024 = String

type String128 = String

type String256 = String

type StringEmpty256 = String

type SubnetIds = js.Array[String256]

type TagKeyList = js.Array[String128]

type TagMap = StringDictionary[StringEmpty256]

type UriString = String

type VirtualClusterArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATING
  - typingsJapgolly.awsSdk.awsSdkStrings.TERMINATED
  - typingsJapgolly.awsSdk.awsSdkStrings.ARRESTED
  - java.lang.String
*/
type VirtualClusterState = _VirtualClusterState | String

type VirtualClusterStates = js.Array[VirtualClusterState]

type VirtualClusters = js.Array[VirtualCluster]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-10-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
