package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object greengrassMod {
  type BulkDeploymentResults = js.Array[typingsJapgolly.awsSdk.greengrassMod.BulkDeploymentResult]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
    - typingsJapgolly.awsSdk.awsSdkStrings.Running_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type BulkDeploymentStatus = typingsJapgolly.awsSdk.greengrassMod._BulkDeploymentStatus | java.lang.String
  type BulkDeployments = js.Array[typingsJapgolly.awsSdk.greengrassMod.BulkDeployment]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.greengrassMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NewDeployment
    - typingsJapgolly.awsSdk.awsSdkStrings.Redeployment
    - typingsJapgolly.awsSdk.awsSdkStrings.ResetDeployment
    - typingsJapgolly.awsSdk.awsSdkStrings.ForceResetDeployment
    - java.lang.String
  */
  type DeploymentType = typingsJapgolly.awsSdk.greengrassMod._DeploymentType | java.lang.String
  type Deployments = js.Array[typingsJapgolly.awsSdk.greengrassMod.Deployment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.binary__
    - typingsJapgolly.awsSdk.awsSdkStrings.json_
    - java.lang.String
  */
  type EncodingType = typingsJapgolly.awsSdk.greengrassMod._EncodingType | java.lang.String
  type ErrorDetails = js.Array[typingsJapgolly.awsSdk.greengrassMod.ErrorDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassContainer
    - typingsJapgolly.awsSdk.awsSdkStrings.NoContainer
    - java.lang.String
  */
  type FunctionIsolationMode = typingsJapgolly.awsSdk.greengrassMod._FunctionIsolationMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.GreengrassSystem
    - typingsJapgolly.awsSdk.awsSdkStrings.Lambda_
    - java.lang.String
  */
  type LoggerComponent = typingsJapgolly.awsSdk.greengrassMod._LoggerComponent | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DEBUG
    - typingsJapgolly.awsSdk.awsSdkStrings.INFO
    - typingsJapgolly.awsSdk.awsSdkStrings.WARN
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.FATAL
    - java.lang.String
  */
  type LoggerLevel = typingsJapgolly.awsSdk.greengrassMod._LoggerLevel | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FileSystem
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSCloudWatch
    - java.lang.String
  */
  type LoggerType = typingsJapgolly.awsSdk.greengrassMod._LoggerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ro_
    - typingsJapgolly.awsSdk.awsSdkStrings.rw_
    - java.lang.String
  */
  type Permission = typingsJapgolly.awsSdk.greengrassMod._Permission | java.lang.String
  type S3UrlSignerRole = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.core__
    - typingsJapgolly.awsSdk.awsSdkStrings.ota_agent
    - java.lang.String
  */
  type SoftwareToUpdate = typingsJapgolly.awsSdk.greengrassMod._SoftwareToUpdate | java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.greengrassMod.string]
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
  type UpdateAgentLogLevel = typingsJapgolly.awsSdk.greengrassMod._UpdateAgentLogLevel | java.lang.String
  type UpdateTargets = js.Array[typingsJapgolly.awsSdk.greengrassMod.string]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.armv6l
    - typingsJapgolly.awsSdk.awsSdkStrings.armv7l
    - typingsJapgolly.awsSdk.awsSdkStrings.x86_64_
    - typingsJapgolly.awsSdk.awsSdkStrings.aarch64
    - java.lang.String
  */
  type UpdateTargetsArchitecture = typingsJapgolly.awsSdk.greengrassMod._UpdateTargetsArchitecture | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ubuntu_
    - typingsJapgolly.awsSdk.awsSdkStrings.raspbian
    - typingsJapgolly.awsSdk.awsSdkStrings.amazon_linux_
    - typingsJapgolly.awsSdk.awsSdkStrings.openwrt
    - java.lang.String
  */
  type UpdateTargetsOperatingSystem = typingsJapgolly.awsSdk.greengrassMod._UpdateTargetsOperatingSystem | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-06-07`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.greengrassMod._apiVersion | java.lang.String
  type boolean = scala.Boolean
  type integer = scala.Double
  type listOfConnectivityInfo = js.Array[typingsJapgolly.awsSdk.greengrassMod.ConnectivityInfo]
  type listOfConnector = js.Array[typingsJapgolly.awsSdk.greengrassMod.Connector]
  type listOfCore = js.Array[typingsJapgolly.awsSdk.greengrassMod.Core]
  type listOfDefinitionInformation = js.Array[typingsJapgolly.awsSdk.greengrassMod.DefinitionInformation]
  type listOfDevice = js.Array[typingsJapgolly.awsSdk.greengrassMod.Device]
  type listOfFunction = js.Array[typingsJapgolly.awsSdk.greengrassMod.Function]
  type listOfGroupCertificateAuthorityProperties = js.Array[typingsJapgolly.awsSdk.greengrassMod.GroupCertificateAuthorityProperties]
  type listOfGroupInformation = js.Array[typingsJapgolly.awsSdk.greengrassMod.GroupInformation]
  type listOfLogger = js.Array[typingsJapgolly.awsSdk.greengrassMod.Logger]
  type listOfResource = js.Array[typingsJapgolly.awsSdk.greengrassMod.Resource]
  type listOfResourceAccessPolicy = js.Array[typingsJapgolly.awsSdk.greengrassMod.ResourceAccessPolicy]
  type listOfString = js.Array[typingsJapgolly.awsSdk.greengrassMod.string]
  type listOfSubscription = js.Array[typingsJapgolly.awsSdk.greengrassMod.Subscription]
  type listOfVersionInformation = js.Array[typingsJapgolly.awsSdk.greengrassMod.VersionInformation]
  type mapOfString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.greengrassMod.string]
  type string = java.lang.String
}
