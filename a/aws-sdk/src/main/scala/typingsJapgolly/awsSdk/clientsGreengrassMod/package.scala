package typingsJapgolly.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BulkDeploymentResults = js.Array[BulkDeploymentResult]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
  - typingsJapgolly.awsSdk.awsSdkStrings.Running_
  - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
  - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type BulkDeploymentStatus = _BulkDeploymentStatus | String

type BulkDeployments = js.Array[BulkDeployment]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.InSync_
  - typingsJapgolly.awsSdk.awsSdkStrings.OutOfSync
  - java.lang.String
*/
type ConfigurationSyncStatus = _ConfigurationSyncStatus | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NewDeployment
  - typingsJapgolly.awsSdk.awsSdkStrings.Redeployment
  - typingsJapgolly.awsSdk.awsSdkStrings.ResetDeployment
  - typingsJapgolly.awsSdk.awsSdkStrings.ForceResetDeployment
  - java.lang.String
*/
type DeploymentType = _DeploymentType | String

type Deployments = js.Array[Deployment]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.binary__
  - typingsJapgolly.awsSdk.awsSdkStrings.json__
  - java.lang.String
*/
type EncodingType = _EncodingType | String

type ErrorDetails = js.Array[ErrorDetail]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassContainer
  - typingsJapgolly.awsSdk.awsSdkStrings.NoContainer
  - java.lang.String
*/
type FunctionIsolationMode = _FunctionIsolationMode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassSystem
  - typingsJapgolly.awsSdk.awsSdkStrings.Lambda_
  - java.lang.String
*/
type LoggerComponent = _LoggerComponent | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
  - typingsJapgolly.awsSdk.awsSdkStrings.INFO
  - typingsJapgolly.awsSdk.awsSdkStrings.WARN
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FATAL
  - java.lang.String
*/
type LoggerLevel = _LoggerLevel | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FileSystem
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSCloudWatch
  - java.lang.String
*/
type LoggerType = _LoggerType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ro_
  - typingsJapgolly.awsSdk.awsSdkStrings.rw_
  - java.lang.String
*/
type Permission = _Permission | String

type S3UrlSignerRole = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.core__
  - typingsJapgolly.awsSdk.awsSdkStrings.ota_agent
  - java.lang.String
*/
type SoftwareToUpdate = _SoftwareToUpdate | String

type Tags = StringDictionary[string]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.On_
  - typingsJapgolly.awsSdk.awsSdkStrings.Off_
  - java.lang.String
*/
type Telemetry = _Telemetry | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.TRACE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
  - typingsJapgolly.awsSdk.awsSdkStrings.VERBOSE
  - typingsJapgolly.awsSdk.awsSdkStrings.INFO
  - typingsJapgolly.awsSdk.awsSdkStrings.WARN
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.FATAL
  - java.lang.String
*/
type UpdateAgentLogLevel = _UpdateAgentLogLevel | String

type UpdateTargets = js.Array[string]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.armv6l
  - typingsJapgolly.awsSdk.awsSdkStrings.armv7l
  - typingsJapgolly.awsSdk.awsSdkStrings.x86_64_
  - typingsJapgolly.awsSdk.awsSdkStrings.aarch64
  - java.lang.String
*/
type UpdateTargetsArchitecture = _UpdateTargetsArchitecture | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ubuntu_
  - typingsJapgolly.awsSdk.awsSdkStrings.raspbian_
  - typingsJapgolly.awsSdk.awsSdkStrings.amazon_linux_
  - typingsJapgolly.awsSdk.awsSdkStrings.openwrt
  - java.lang.String
*/
type UpdateTargetsOperatingSystem = _UpdateTargetsOperatingSystem | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-06-07`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type integer = Double

type listOfConnectivityInfo = js.Array[ConnectivityInfo]

type listOfConnector = js.Array[Connector]

type listOfCore = js.Array[Core]

type listOfDefinitionInformation = js.Array[DefinitionInformation]

type listOfDevice = js.Array[Device]

type listOfFunction = js.Array[Function]

type listOfGroupCertificateAuthorityProperties = js.Array[GroupCertificateAuthorityProperties]

type listOfGroupInformation = js.Array[GroupInformation]

type listOfLogger = js.Array[Logger]

type listOfResource = js.Array[Resource]

type listOfResourceAccessPolicy = js.Array[ResourceAccessPolicy]

type listOfString = js.Array[string]

type listOfSubscription = js.Array[Subscription]

type listOfVersionInformation = js.Array[VersionInformation]

type mapOfString = StringDictionary[string]

type string = String
