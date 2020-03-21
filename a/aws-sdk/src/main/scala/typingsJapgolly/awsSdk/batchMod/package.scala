package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object batchMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.N_TO_N
    - typingsJapgolly.awsSdk.awsSdkStrings.SEQUENTIAL
    - java.lang.String
  */
  type ArrayJobDependency = typingsJapgolly.awsSdk.batchMod._ArrayJobDependency | java.lang.String
  type ArrayJobStatusSummary = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.batchMod.Integer]
  type AttemptDetails = js.Array[typingsJapgolly.awsSdk.batchMod.AttemptDetail]
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type CEState = typingsJapgolly.awsSdk.batchMod._CEState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.VALID
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID
    - java.lang.String
  */
  type CEStatus = typingsJapgolly.awsSdk.batchMod._CEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MANAGED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNMANAGED
    - java.lang.String
  */
  type CEType = typingsJapgolly.awsSdk.batchMod._CEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BEST_FIT
    - typingsJapgolly.awsSdk.awsSdkStrings.BEST_FIT_PROGRESSIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.SPOT_CAPACITY_OPTIMIZED
    - java.lang.String
  */
  type CRAllocationStrategy = typingsJapgolly.awsSdk.batchMod._CRAllocationStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EC2
    - typingsJapgolly.awsSdk.awsSdkStrings.SPOT
    - java.lang.String
  */
  type CRType = typingsJapgolly.awsSdk.batchMod._CRType | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.batchMod.ClientApiVersions
  type ComputeEnvironmentDetailList = js.Array[typingsJapgolly.awsSdk.batchMod.ComputeEnvironmentDetail]
  type ComputeEnvironmentOrders = js.Array[typingsJapgolly.awsSdk.batchMod.ComputeEnvironmentOrder]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.READ
    - typingsJapgolly.awsSdk.awsSdkStrings.WRITE
    - typingsJapgolly.awsSdk.awsSdkStrings.MKNOD
    - java.lang.String
  */
  type DeviceCgroupPermission = typingsJapgolly.awsSdk.batchMod._DeviceCgroupPermission | java.lang.String
  type DeviceCgroupPermissions = js.Array[typingsJapgolly.awsSdk.batchMod.DeviceCgroupPermission]
  type DevicesList = js.Array[typingsJapgolly.awsSdk.batchMod.Device]
  type EnvironmentVariables = js.Array[typingsJapgolly.awsSdk.batchMod.KeyValuePair]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type JQState = typingsJapgolly.awsSdk.batchMod._JQState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.VALID
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID
    - java.lang.String
  */
  type JQStatus = typingsJapgolly.awsSdk.batchMod._JQStatus | java.lang.String
  type JobDefinitionList = js.Array[typingsJapgolly.awsSdk.batchMod.JobDefinition]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.container_
    - typingsJapgolly.awsSdk.awsSdkStrings.multinode
    - java.lang.String
  */
  type JobDefinitionType = typingsJapgolly.awsSdk.batchMod._JobDefinitionType | java.lang.String
  type JobDependencyList = js.Array[typingsJapgolly.awsSdk.batchMod.JobDependency]
  type JobDetailList = js.Array[typingsJapgolly.awsSdk.batchMod.JobDetail]
  type JobQueueDetailList = js.Array[typingsJapgolly.awsSdk.batchMod.JobQueueDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUBMITTED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
    - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type JobStatus = typingsJapgolly.awsSdk.batchMod._JobStatus | java.lang.String
  type JobSummaryList = js.Array[typingsJapgolly.awsSdk.batchMod.JobSummary]
  type Long = scala.Double
  type MountPoints = js.Array[typingsJapgolly.awsSdk.batchMod.MountPoint]
  type NetworkInterfaceList = js.Array[typingsJapgolly.awsSdk.batchMod.NetworkInterface]
  type NodePropertyOverrides = js.Array[typingsJapgolly.awsSdk.batchMod.NodePropertyOverride]
  type NodeRangeProperties = js.Array[typingsJapgolly.awsSdk.batchMod.NodeRangeProperty]
  type ParametersMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.batchMod.String]
  type ResourceRequirements = js.Array[typingsJapgolly.awsSdk.batchMod.ResourceRequirement]
  type ResourceType = typingsJapgolly.awsSdk.awsSdkStrings.GPU | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[typingsJapgolly.awsSdk.batchMod.String]
  type TagsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.batchMod.String]
  type Ulimits = js.Array[typingsJapgolly.awsSdk.batchMod.Ulimit]
  type Volumes = js.Array[typingsJapgolly.awsSdk.batchMod.Volume]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-08-10`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.batchMod._apiVersion | java.lang.String
}
