package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object snowballMod {
  type AddressId = java.lang.String
  type AddressList = js.Array[typingsJapgolly.awsSdk.snowballMod.Address]
  type AmiId = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.snowballMod.ClientApiVersions
  type ClusterId = java.lang.String
  type ClusterListEntryList = js.Array[typingsJapgolly.awsSdk.snowballMod.ClusterListEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AwaitingQuorum
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.InUse
    - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type ClusterState = typingsJapgolly.awsSdk.snowballMod._ClusterState | java.lang.String
  type CompatibleImageList = js.Array[typingsJapgolly.awsSdk.snowballMod.CompatibleImage]
  type Ec2AmiResourceList = js.Array[typingsJapgolly.awsSdk.snowballMod.Ec2AmiResource]
  type EventTriggerDefinitionList = js.Array[typingsJapgolly.awsSdk.snowballMod.EventTriggerDefinition]
  type Integer = scala.Double
  type JobId = java.lang.String
  type JobListEntryList = js.Array[typingsJapgolly.awsSdk.snowballMod.JobListEntry]
  type JobMetadataList = js.Array[typingsJapgolly.awsSdk.snowballMod.JobMetadata]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.New_
    - typingsJapgolly.awsSdk.awsSdkStrings.PreparingAppliance
    - typingsJapgolly.awsSdk.awsSdkStrings.PreparingShipment
    - typingsJapgolly.awsSdk.awsSdkStrings.InTransitToCustomer
    - typingsJapgolly.awsSdk.awsSdkStrings.WithCustomer
    - typingsJapgolly.awsSdk.awsSdkStrings.InTransitToAWS
    - typingsJapgolly.awsSdk.awsSdkStrings.WithAWSSortingFacility
    - typingsJapgolly.awsSdk.awsSdkStrings.WithAWS
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Complete_
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Listing
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - java.lang.String
  */
  type JobState = typingsJapgolly.awsSdk.snowballMod._JobState | java.lang.String
  type JobStateList = js.Array[typingsJapgolly.awsSdk.snowballMod.JobState]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPORT
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPORT
    - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL_USE
    - java.lang.String
  */
  type JobType = typingsJapgolly.awsSdk.snowballMod._JobType | java.lang.String
  type KmsKeyARN = java.lang.String
  type LambdaResourceList = js.Array[typingsJapgolly.awsSdk.snowballMod.LambdaResource]
  type ListLimit = scala.Double
  type Long = scala.Double
  type ResourceARN = java.lang.String
  type RoleARN = java.lang.String
  type S3ResourceList = js.Array[typingsJapgolly.awsSdk.snowballMod.S3Resource]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SECOND_DAY
    - typingsJapgolly.awsSdk.awsSdkStrings.NEXT_DAY
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - java.lang.String
  */
  type ShippingOption = typingsJapgolly.awsSdk.snowballMod._ShippingOption | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.T50
    - typingsJapgolly.awsSdk.awsSdkStrings.T80
    - typingsJapgolly.awsSdk.awsSdkStrings.T100
    - typingsJapgolly.awsSdk.awsSdkStrings.T42
    - typingsJapgolly.awsSdk.awsSdkStrings.NoPreference
    - java.lang.String
  */
  type SnowballCapacity = typingsJapgolly.awsSdk.snowballMod._SnowballCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STANDARD
    - typingsJapgolly.awsSdk.awsSdkStrings.EDGE
    - typingsJapgolly.awsSdk.awsSdkStrings.EDGE_C
    - typingsJapgolly.awsSdk.awsSdkStrings.EDGE_CG
    - java.lang.String
  */
  type SnowballType = typingsJapgolly.awsSdk.snowballMod._SnowballType | java.lang.String
  type SnsTopicARN = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-06-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.snowballMod._apiVersion | java.lang.String
}
