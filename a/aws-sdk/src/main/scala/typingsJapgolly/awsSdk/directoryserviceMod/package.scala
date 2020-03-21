package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object directoryserviceMod {
  type AccessUrl = java.lang.String
  type AddedDateTime = js.Date
  type AliasName = java.lang.String
  type AttributeName = java.lang.String
  type AttributeValue = java.lang.String
  type Attributes = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.Attribute]
  type AvailabilityZone = java.lang.String
  type AvailabilityZones = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.AvailabilityZone]
  type CertificateCN = java.lang.String
  type CertificateData = java.lang.String
  type CertificateExpiryDateTime = js.Date
  type CertificateId = java.lang.String
  type CertificateRegisteredDateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Registering_
    - typingsJapgolly.awsSdk.awsSdkStrings.Registered_
    - typingsJapgolly.awsSdk.awsSdkStrings.RegisterFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.Deregistering_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deregistered_
    - typingsJapgolly.awsSdk.awsSdkStrings.DeregisterFailed
    - java.lang.String
  */
  type CertificateState = typingsJapgolly.awsSdk.directoryserviceMod._CertificateState | java.lang.String
  type CertificateStateReason = java.lang.String
  type CertificatesInfo = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.CertificateInfo]
  type CidrIp = java.lang.String
  type CidrIps = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.CidrIp]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.directoryserviceMod.ClientApiVersions
  type CloudOnlyDirectoriesLimitReached = scala.Boolean
  type ComputerName = java.lang.String
  type ComputerPassword = java.lang.String
  type ConditionalForwarders = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.ConditionalForwarder]
  type ConnectPassword = java.lang.String
  type ConnectedDirectoriesLimitReached = scala.Boolean
  type CreateSnapshotBeforeSchemaExtension = scala.Boolean
  type CreatedDateTime = js.Date
  type CustomerId = java.lang.String
  type CustomerUserName = java.lang.String
  type DeleteAssociatedConditionalForwarder = scala.Boolean
  type Description = java.lang.String
  type DesiredNumberOfDomainControllers = scala.Double
  type DirectoryDescriptions = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.DirectoryDescription]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enterprise
    - typingsJapgolly.awsSdk.awsSdkStrings.Standard_
    - java.lang.String
  */
  type DirectoryEdition = typingsJapgolly.awsSdk.directoryserviceMod._DirectoryEdition | java.lang.String
  type DirectoryId = java.lang.String
  type DirectoryIds = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.DirectoryId]
  type DirectoryName = java.lang.String
  type DirectoryShortName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Small_
    - typingsJapgolly.awsSdk.awsSdkStrings.Large_
    - java.lang.String
  */
  type DirectorySize = typingsJapgolly.awsSdk.directoryserviceMod._DirectorySize | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Requested_
    - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Created_
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Inoperable_
    - typingsJapgolly.awsSdk.awsSdkStrings.Impaired_
    - typingsJapgolly.awsSdk.awsSdkStrings.Restoring_
    - typingsJapgolly.awsSdk.awsSdkStrings.RestoreFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DirectoryStage = typingsJapgolly.awsSdk.directoryserviceMod._DirectoryStage | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SimpleAD
    - typingsJapgolly.awsSdk.awsSdkStrings.ADConnector
    - typingsJapgolly.awsSdk.awsSdkStrings.MicrosoftAD
    - typingsJapgolly.awsSdk.awsSdkStrings.SharedMicrosoftAD
    - java.lang.String
  */
  type DirectoryType = typingsJapgolly.awsSdk.directoryserviceMod._DirectoryType | java.lang.String
  type DnsIpAddrs = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.IpAddr]
  type DomainControllerId = java.lang.String
  type DomainControllerIds = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.DomainControllerId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Impaired_
    - typingsJapgolly.awsSdk.awsSdkStrings.Restoring_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type DomainControllerStatus = typingsJapgolly.awsSdk.directoryserviceMod._DomainControllerStatus | java.lang.String
  type DomainControllerStatusReason = java.lang.String
  type DomainControllers = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.DomainController]
  type EndDateTime = js.Date
  type EventTopics = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.EventTopic]
  type IpAddr = java.lang.String
  type IpAddrs = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.IpAddr]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Adding
    - typingsJapgolly.awsSdk.awsSdkStrings.Added
    - typingsJapgolly.awsSdk.awsSdkStrings.Removing
    - typingsJapgolly.awsSdk.awsSdkStrings.Removed_
    - typingsJapgolly.awsSdk.awsSdkStrings.AddFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.RemoveFailed
    - java.lang.String
  */
  type IpRouteStatusMsg = typingsJapgolly.awsSdk.directoryserviceMod._IpRouteStatusMsg | java.lang.String
  type IpRouteStatusReason = java.lang.String
  type IpRoutes = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.IpRoute]
  type IpRoutesInfo = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.IpRouteInfo]
  type LDAPSSettingsInfo = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.LDAPSSettingInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabling_
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.EnableFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type LDAPSStatus = typingsJapgolly.awsSdk.directoryserviceMod._LDAPSStatus | java.lang.String
  type LDAPSStatusReason = java.lang.String
  type LDAPSType = typingsJapgolly.awsSdk.awsSdkStrings.Client | java.lang.String
  type LastUpdatedDateTime = js.Date
  type LaunchTime = js.Date
  type LdifContent = java.lang.String
  type Limit = scala.Double
  type LogGroupName = java.lang.String
  type LogSubscriptions = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.LogSubscription]
  type ManualSnapshotsLimitReached = scala.Boolean
  type NextToken = java.lang.String
  type Notes = java.lang.String
  type OrganizationalUnitDN = java.lang.String
  type PageLimit = scala.Double
  type Password = java.lang.String
  type PortNumber = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PAP
    - typingsJapgolly.awsSdk.awsSdkStrings.CHAP
    - typingsJapgolly.awsSdk.awsSdkStrings.`MS-CHAPv1`
    - typingsJapgolly.awsSdk.awsSdkStrings.`MS-CHAPv2`
    - java.lang.String
  */
  type RadiusAuthenticationProtocol = typingsJapgolly.awsSdk.directoryserviceMod._RadiusAuthenticationProtocol | java.lang.String
  type RadiusDisplayLabel = java.lang.String
  type RadiusRetries = scala.Double
  type RadiusSharedSecret = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type RadiusStatus = typingsJapgolly.awsSdk.directoryserviceMod._RadiusStatus | java.lang.String
  type RadiusTimeout = scala.Double
  type RemoteDomainName = java.lang.String
  type RemoteDomainNames = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.RemoteDomainName]
  type ReplicationScope = typingsJapgolly.awsSdk.awsSdkStrings.Domain_ | java.lang.String
  type RequestId = java.lang.String
  type ResourceId = java.lang.String
  type SID = java.lang.String
  type SchemaExtensionId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Initializing_
    - typingsJapgolly.awsSdk.awsSdkStrings.CreatingSnapshot
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdatingSchema
    - typingsJapgolly.awsSdk.awsSdkStrings.Replicating
    - typingsJapgolly.awsSdk.awsSdkStrings.CancelInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.RollbackInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.Cancelled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - java.lang.String
  */
  type SchemaExtensionStatus = typingsJapgolly.awsSdk.directoryserviceMod._SchemaExtensionStatus | java.lang.String
  type SchemaExtensionStatusReason = java.lang.String
  type SchemaExtensionsInfo = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.SchemaExtensionInfo]
  type SecurityGroupId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type SelectiveAuth = typingsJapgolly.awsSdk.directoryserviceMod._SelectiveAuth | java.lang.String
  type Server = java.lang.String
  type Servers = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.Server]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONS
    - typingsJapgolly.awsSdk.awsSdkStrings.HANDSHAKE
    - java.lang.String
  */
  type ShareMethod = typingsJapgolly.awsSdk.directoryserviceMod._ShareMethod | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Shared_
    - typingsJapgolly.awsSdk.awsSdkStrings.PendingAcceptance
    - typingsJapgolly.awsSdk.awsSdkStrings.Rejected_
    - typingsJapgolly.awsSdk.awsSdkStrings.Rejecting
    - typingsJapgolly.awsSdk.awsSdkStrings.RejectFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.Sharing
    - typingsJapgolly.awsSdk.awsSdkStrings.ShareFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - java.lang.String
  */
  type ShareStatus = typingsJapgolly.awsSdk.directoryserviceMod._ShareStatus | java.lang.String
  type SharedDirectories = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.SharedDirectory]
  type SnapshotId = java.lang.String
  type SnapshotIds = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.SnapshotId]
  type SnapshotName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Completed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type SnapshotStatus = typingsJapgolly.awsSdk.directoryserviceMod._SnapshotStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Auto_
    - typingsJapgolly.awsSdk.awsSdkStrings.Manual_
    - java.lang.String
  */
  type SnapshotType = typingsJapgolly.awsSdk.directoryserviceMod._SnapshotType | java.lang.String
  type Snapshots = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.Snapshot]
  type SsoEnabled = scala.Boolean
  type StageReason = java.lang.String
  type StartDateTime = js.Date
  type StartTime = js.Date
  type StateLastUpdatedDateTime = js.Date
  type SubnetId = java.lang.String
  type SubnetIds = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.SubnetId]
  type SubscriptionCreatedDateTime = js.Date
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.Tag]
  type TargetId = java.lang.String
  type TargetType = typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT | java.lang.String
  type TopicArn = java.lang.String
  type TopicName = java.lang.String
  type TopicNames = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.TopicName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Registered_
    - typingsJapgolly.awsSdk.awsSdkStrings.`Topic not found`
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type TopicStatus = typingsJapgolly.awsSdk.directoryserviceMod._TopicStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`One-WayColon Outgoing`
    - typingsJapgolly.awsSdk.awsSdkStrings.`One-WayColon Incoming`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Two-Way`
    - java.lang.String
  */
  type TrustDirection = typingsJapgolly.awsSdk.directoryserviceMod._TrustDirection | java.lang.String
  type TrustId = java.lang.String
  type TrustIds = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.TrustId]
  type TrustPassword = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Creating_
    - typingsJapgolly.awsSdk.awsSdkStrings.Created_
    - typingsJapgolly.awsSdk.awsSdkStrings.Verifying_
    - typingsJapgolly.awsSdk.awsSdkStrings.VerifyFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.Verified
    - typingsJapgolly.awsSdk.awsSdkStrings.Updating_
    - typingsJapgolly.awsSdk.awsSdkStrings.UpdateFailed
    - typingsJapgolly.awsSdk.awsSdkStrings.Updated_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type TrustState = typingsJapgolly.awsSdk.directoryserviceMod._TrustState | java.lang.String
  type TrustStateReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Forest
    - typingsJapgolly.awsSdk.awsSdkStrings.External_
    - java.lang.String
  */
  type TrustType = typingsJapgolly.awsSdk.directoryserviceMod._TrustType | java.lang.String
  type Trusts = js.Array[typingsJapgolly.awsSdk.directoryserviceMod.Trust]
  type UpdateSecurityGroupForDirectoryControllers = scala.Boolean
  type UseSameUsername = scala.Boolean
  type UserName = java.lang.String
  type UserPassword = java.lang.String
  type VpcId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-04-16`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.directoryserviceMod._apiVersion | java.lang.String
}
