package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ec2Mod {
  type AccountAttributeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.AccountAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`supported-platforms`
    - typingsJapgolly.awsSdk.awsSdkStrings.`default-vpc`
    - java.lang.String
  */
  type AccountAttributeName = typingsJapgolly.awsSdk.ec2Mod._AccountAttributeName | java.lang.String
  type AccountAttributeNameStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.AccountAttributeName]
  type AccountAttributeValueList = js.Array[typingsJapgolly.awsSdk.ec2Mod.AccountAttributeValue]
  type ActiveInstanceSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ActiveInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending_fulfillment
    - typingsJapgolly.awsSdk.awsSdkStrings.pending_termination
    - typingsJapgolly.awsSdk.awsSdkStrings.fulfilled__
    - java.lang.String
  */
  type ActivityStatus = typingsJapgolly.awsSdk.ec2Mod._ActivityStatus | java.lang.String
  type AddressList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Address]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.default_
    - typingsJapgolly.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type Affinity = typingsJapgolly.awsSdk.ec2Mod._Affinity | java.lang.String
  type AllocationId = java.lang.String
  type AllocationIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.`under-assessment`
    - typingsJapgolly.awsSdk.awsSdkStrings.`permanent-failure`
    - typingsJapgolly.awsSdk.awsSdkStrings.released
    - typingsJapgolly.awsSdk.awsSdkStrings.`released-permanent-failure`
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type AllocationState = typingsJapgolly.awsSdk.ec2Mod._AllocationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.lowestPrice
    - typingsJapgolly.awsSdk.awsSdkStrings.diversified
    - typingsJapgolly.awsSdk.awsSdkStrings.capacityOptimized
    - java.lang.String
  */
  type AllocationStrategy = typingsJapgolly.awsSdk.ec2Mod._AllocationStrategy | java.lang.String
  type AllowedPrincipalSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.AllowedPrincipal]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.on_
    - typingsJapgolly.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type AllowsMultipleInstanceTypes = typingsJapgolly.awsSdk.ec2Mod._AllowsMultipleInstanceTypes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.i386
    - typingsJapgolly.awsSdk.awsSdkStrings.x86_64_
    - typingsJapgolly.awsSdk.awsSdkStrings.arm64_
    - java.lang.String
  */
  type ArchitectureType = typingsJapgolly.awsSdk.ec2Mod._ArchitectureType | java.lang.String
  type ArchitectureTypeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ArchitectureType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.i386
    - typingsJapgolly.awsSdk.awsSdkStrings.x86_64_
    - typingsJapgolly.awsSdk.awsSdkStrings.arm64_
    - java.lang.String
  */
  type ArchitectureValues = typingsJapgolly.awsSdk.ec2Mod._ArchitectureValues | java.lang.String
  type AssignedPrivateIpAddressList = js.Array[typingsJapgolly.awsSdk.ec2Mod.AssignedPrivateIpAddress]
  type AssociatedNetworkType = typingsJapgolly.awsSdk.awsSdkStrings.vpc_ | java.lang.String
  type AssociatedTargetNetworkSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.AssociatedTargetNetwork]
  type AssociationIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.associating__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.`association-failed`
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type AssociationStatusCode = typingsJapgolly.awsSdk.ec2Mod._AssociationStatusCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.attaching_
    - typingsJapgolly.awsSdk.awsSdkStrings.attached_
    - typingsJapgolly.awsSdk.awsSdkStrings.detaching__
    - typingsJapgolly.awsSdk.awsSdkStrings.detached__
    - java.lang.String
  */
  type AttachmentStatus = typingsJapgolly.awsSdk.ec2Mod._AttachmentStatus | java.lang.String
  type AuthorizationRuleSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.AuthorizationRule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enable_
    - typingsJapgolly.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type AutoAcceptSharedAttachmentsValue = typingsJapgolly.awsSdk.ec2Mod._AutoAcceptSharedAttachmentsValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.on_
    - typingsJapgolly.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type AutoPlacement = typingsJapgolly.awsSdk.ec2Mod._AutoPlacement | java.lang.String
  type AutoRecoveryFlag = scala.Boolean
  type AvailabilityZoneList = js.Array[typingsJapgolly.awsSdk.ec2Mod.AvailabilityZone]
  type AvailabilityZoneMessageList = js.Array[typingsJapgolly.awsSdk.ec2Mod.AvailabilityZoneMessage]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`opt-in-not-required`
    - typingsJapgolly.awsSdk.awsSdkStrings.`opted-in`
    - typingsJapgolly.awsSdk.awsSdkStrings.`not-opted-in`
    - java.lang.String
  */
  type AvailabilityZoneOptInStatus = typingsJapgolly.awsSdk.ec2Mod._AvailabilityZoneOptInStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.information
    - typingsJapgolly.awsSdk.awsSdkStrings.impaired__
    - typingsJapgolly.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type AvailabilityZoneState = typingsJapgolly.awsSdk.ec2Mod._AvailabilityZoneState | java.lang.String
  type AvailabilityZoneStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type AvailableInstanceCapacityList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceCapacity]
  type BareMetalFlag = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.submitted__
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled_running
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled_terminating
    - typingsJapgolly.awsSdk.awsSdkStrings.modifying_
    - java.lang.String
  */
  type BatchState = typingsJapgolly.awsSdk.ec2Mod._BatchState | java.lang.String
  type BillingProductList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type BlockDeviceMappingList = js.Array[typingsJapgolly.awsSdk.ec2Mod.BlockDeviceMapping]
  type BlockDeviceMappingRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.BlockDeviceMapping]
  type Boolean = scala.Boolean
  type BundleId = java.lang.String
  type BundleIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type BundleTaskList = js.Array[typingsJapgolly.awsSdk.ec2Mod.BundleTask]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.`waiting-for-shutdown`
    - typingsJapgolly.awsSdk.awsSdkStrings.bundling
    - typingsJapgolly.awsSdk.awsSdkStrings.storing
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelling__
    - typingsJapgolly.awsSdk.awsSdkStrings.complete__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type BundleTaskState = typingsJapgolly.awsSdk.ec2Mod._BundleTaskState | java.lang.String
  type BurstablePerformanceFlag = scala.Boolean
  type ByoipCidrSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ByoipCidr]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.advertised
    - typingsJapgolly.awsSdk.awsSdkStrings.deprovisioned
    - typingsJapgolly.awsSdk.awsSdkStrings.`failed-deprovision`
    - typingsJapgolly.awsSdk.awsSdkStrings.`failed-provision`
    - typingsJapgolly.awsSdk.awsSdkStrings.`pending-deprovision`
    - typingsJapgolly.awsSdk.awsSdkStrings.`pending-provision`
    - typingsJapgolly.awsSdk.awsSdkStrings.provisioned_
    - typingsJapgolly.awsSdk.awsSdkStrings.`provisioned-not-publicly-advertisable`
    - java.lang.String
  */
  type ByoipCidrState = typingsJapgolly.awsSdk.ec2Mod._ByoipCidrState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.fleetRequestIdDoesNotExist
    - typingsJapgolly.awsSdk.awsSdkStrings.fleetRequestIdMalformed
    - typingsJapgolly.awsSdk.awsSdkStrings.fleetRequestNotInCancellableState
    - typingsJapgolly.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type CancelBatchErrorCode = typingsJapgolly.awsSdk.ec2Mod._CancelBatchErrorCode | java.lang.String
  type CancelSpotFleetRequestsErrorSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.CancelSpotFleetRequestsErrorItem]
  type CancelSpotFleetRequestsSuccessSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.CancelSpotFleetRequestsSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.open__
    - typingsJapgolly.awsSdk.awsSdkStrings.closed_
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type CancelSpotInstanceRequestState = typingsJapgolly.awsSdk.ec2Mod._CancelSpotInstanceRequestState | java.lang.String
  type CancelledSpotInstanceRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.CancelledSpotInstanceRequest]
  type CapacityReservationId = java.lang.String
  type CapacityReservationIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LinuxSlashUNIX
    - typingsJapgolly.awsSdk.awsSdkStrings.`Red Hat Enterprise Linux`
    - typingsJapgolly.awsSdk.awsSdkStrings.`SUSE Linux`
    - typingsJapgolly.awsSdk.awsSdkStrings.Windows_
    - typingsJapgolly.awsSdk.awsSdkStrings.`Windows with SQL Server`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Windows with SQL Server Enterprise`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Windows with SQL Server Standard`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Windows with SQL Server Web`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Linux with SQL Server Standard`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Linux with SQL Server Web`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Linux with SQL Server Enterprise`
    - java.lang.String
  */
  type CapacityReservationInstancePlatform = typingsJapgolly.awsSdk.ec2Mod._CapacityReservationInstancePlatform | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.open__
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type CapacityReservationPreference = typingsJapgolly.awsSdk.ec2Mod._CapacityReservationPreference | java.lang.String
  type CapacityReservationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.CapacityReservation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.expired__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type CapacityReservationState = typingsJapgolly.awsSdk.ec2Mod._CapacityReservationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.default_
    - typingsJapgolly.awsSdk.awsSdkStrings.dedicated_
    - java.lang.String
  */
  type CapacityReservationTenancy = typingsJapgolly.awsSdk.ec2Mod._CapacityReservationTenancy | java.lang.String
  type CidrBlockSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.CidrBlock]
  type ClassicLinkDnsSupportList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ClassicLinkDnsSupport]
  type ClassicLinkInstanceList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ClassicLinkInstance]
  type ClassicLoadBalancers = js.Array[typingsJapgolly.awsSdk.ec2Mod.ClassicLoadBalancer]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - java.lang.String
  */
  type ClientCertificateRevocationListStatusCode = typingsJapgolly.awsSdk.ec2Mod._ClientCertificateRevocationListStatusCode | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.ec2Mod.ClientApiVersions
  type ClientVpnAuthenticationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ClientVpnAuthentication]
  type ClientVpnAuthenticationRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ClientVpnAuthenticationRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`certificate-authentication`
    - typingsJapgolly.awsSdk.awsSdkStrings.`directory-service-authentication`
    - java.lang.String
  */
  type ClientVpnAuthenticationType = typingsJapgolly.awsSdk.ec2Mod._ClientVpnAuthenticationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.authorizing
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.revoking
    - java.lang.String
  */
  type ClientVpnAuthorizationRuleStatusCode = typingsJapgolly.awsSdk.ec2Mod._ClientVpnAuthorizationRuleStatusCode | java.lang.String
  type ClientVpnConnectionSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ClientVpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.`failed-to-terminate`
    - typingsJapgolly.awsSdk.awsSdkStrings.terminating__
    - typingsJapgolly.awsSdk.awsSdkStrings.terminated__
    - java.lang.String
  */
  type ClientVpnConnectionStatusCode = typingsJapgolly.awsSdk.ec2Mod._ClientVpnConnectionStatusCode | java.lang.String
  type ClientVpnEndpointId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`pending-associate`
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type ClientVpnEndpointStatusCode = typingsJapgolly.awsSdk.ec2Mod._ClientVpnEndpointStatusCode | java.lang.String
  type ClientVpnRouteSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ClientVpnRoute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.creating__
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type ClientVpnRouteStatusCode = typingsJapgolly.awsSdk.ec2Mod._ClientVpnRouteStatusCode | java.lang.String
  type ClientVpnSecurityGroupIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type CoipAddressUsageSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.CoipAddressUsage]
  type CoipPoolIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type CoipPoolMaxResults = scala.Double
  type CoipPoolSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.CoipPool]
  type ConnectionNotificationId = java.lang.String
  type ConnectionNotificationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ConnectionNotification]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type ConnectionNotificationState = typingsJapgolly.awsSdk.ec2Mod._ConnectionNotificationState | java.lang.String
  type ConnectionNotificationType = typingsJapgolly.awsSdk.awsSdkStrings.Topic | java.lang.String
  type ContainerFormat = typingsJapgolly.awsSdk.awsSdkStrings.ova | java.lang.String
  type ConversionIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ConversionTaskId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelling__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type ConversionTaskState = typingsJapgolly.awsSdk.ec2Mod._ConversionTaskState | java.lang.String
  type CopyTagsFromSource = typingsJapgolly.awsSdk.awsSdkStrings.volume_ | java.lang.String
  type CoreCount = scala.Double
  type CoreCountList = js.Array[typingsJapgolly.awsSdk.ec2Mod.CoreCount]
  type CreateFleetErrorsSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.CreateFleetError]
  type CreateFleetInstancesSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.CreateFleetInstance]
  type CreateVolumePermissionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.CreateVolumePermission]
  type CurrencyCodeValues = typingsJapgolly.awsSdk.awsSdkStrings.USD | java.lang.String
  type CurrentGenerationFlag = scala.Boolean
  type CustomerGatewayId = java.lang.String
  type CustomerGatewayIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type CustomerGatewayList = js.Array[typingsJapgolly.awsSdk.ec2Mod.CustomerGateway]
  type DITMaxResults = scala.Double
  type DITOMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type DatafeedSubscriptionState = typingsJapgolly.awsSdk.ec2Mod._DatafeedSubscriptionState | java.lang.String
  type DateTime = js.Date
  type DedicatedHostFlag = scala.Boolean
  type DedicatedHostId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enable_
    - typingsJapgolly.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DefaultRouteTableAssociationValue = typingsJapgolly.awsSdk.ec2Mod._DefaultRouteTableAssociationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enable_
    - typingsJapgolly.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DefaultRouteTablePropagationValue = typingsJapgolly.awsSdk.ec2Mod._DefaultRouteTablePropagationValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.spot_
    - typingsJapgolly.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type DefaultTargetCapacityType = typingsJapgolly.awsSdk.ec2Mod._DefaultTargetCapacityType | java.lang.String
  type DefaultingDhcpOptionsId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.fleetIdDoesNotExist
    - typingsJapgolly.awsSdk.awsSdkStrings.fleetIdMalformed
    - typingsJapgolly.awsSdk.awsSdkStrings.fleetNotInDeletableState
    - typingsJapgolly.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type DeleteFleetErrorCode = typingsJapgolly.awsSdk.ec2Mod._DeleteFleetErrorCode | java.lang.String
  type DeleteFleetErrorSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DeleteFleetErrorItem]
  type DeleteFleetSuccessSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DeleteFleetSuccessItem]
  type DeleteLaunchTemplateVersionsResponseErrorSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DeleteLaunchTemplateVersionsResponseErrorItem]
  type DeleteLaunchTemplateVersionsResponseSuccessSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DeleteLaunchTemplateVersionsResponseSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`reserved-instances-id-invalid`
    - typingsJapgolly.awsSdk.awsSdkStrings.`reserved-instances-not-in-queued-state`
    - typingsJapgolly.awsSdk.awsSdkStrings.`unexpected-error`
    - java.lang.String
  */
  type DeleteQueuedReservedInstancesErrorCode = typingsJapgolly.awsSdk.ec2Mod._DeleteQueuedReservedInstancesErrorCode | java.lang.String
  type DeleteQueuedReservedInstancesIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type DescribeByoipCidrsMaxResults = scala.Double
  type DescribeCapacityReservationsMaxResults = scala.Double
  type DescribeClassicLinkInstancesMaxResults = scala.Double
  type DescribeClientVpnAuthorizationRulesMaxResults = scala.Double
  type DescribeClientVpnConnectionsMaxResults = scala.Double
  type DescribeClientVpnEndpointMaxResults = scala.Double
  type DescribeClientVpnRoutesMaxResults = scala.Double
  type DescribeClientVpnTargetNetworksMaxResults = scala.Double
  type DescribeConversionTaskList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ConversionTask]
  type DescribeDhcpOptionsMaxResults = scala.Double
  type DescribeEgressOnlyInternetGatewaysMaxResults = scala.Double
  type DescribeElasticGpusMaxResults = scala.Double
  type DescribeExportImageTasksMaxResults = scala.Double
  type DescribeFastSnapshotRestoreSuccessSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DescribeFastSnapshotRestoreSuccessItem]
  type DescribeFastSnapshotRestoresMaxResults = scala.Double
  type DescribeFleetsErrorSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DescribeFleetError]
  type DescribeFleetsInstancesSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DescribeFleetsInstances]
  type DescribeFpgaImagesMaxResults = scala.Double
  type DescribeHostReservationsMaxResults = scala.Double
  type DescribeIamInstanceProfileAssociationsMaxResults = scala.Double
  type DescribeInstanceCreditSpecificationsMaxResults = scala.Double
  type DescribeInternetGatewaysMaxResults = scala.Double
  type DescribeLaunchTemplatesMaxResults = scala.Double
  type DescribeMovingAddressesMaxResults = scala.Double
  type DescribeNatGatewaysMaxResults = scala.Double
  type DescribeNetworkAclsMaxResults = scala.Double
  type DescribeNetworkInterfacePermissionsMaxResults = scala.Double
  type DescribeNetworkInterfacesMaxResults = scala.Double
  type DescribePrincipalIdFormatMaxResults = scala.Double
  type DescribeRouteTablesMaxResults = scala.Double
  type DescribeScheduledInstanceAvailabilityMaxResults = scala.Double
  type DescribeSecurityGroupsMaxResults = scala.Double
  type DescribeSpotFleetInstancesMaxResults = scala.Double
  type DescribeSpotFleetRequestHistoryMaxResults = scala.Double
  type DescribeStaleSecurityGroupsMaxResults = scala.Double
  type DescribeStaleSecurityGroupsNextToken = java.lang.String
  type DescribeSubnetsMaxResults = scala.Double
  type DescribeVpcClassicLinkDnsSupportMaxResults = scala.Double
  type DescribeVpcClassicLinkDnsSupportNextToken = java.lang.String
  type DescribeVpcPeeringConnectionsMaxResults = scala.Double
  type DescribeVpcsMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ebs_
    - typingsJapgolly.awsSdk.awsSdkStrings.`instance-store`
    - java.lang.String
  */
  type DeviceType = typingsJapgolly.awsSdk.ec2Mod._DeviceType | java.lang.String
  type DhcpConfigurationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.DhcpConfiguration]
  type DhcpConfigurationValueList = js.Array[typingsJapgolly.awsSdk.ec2Mod.AttributeValue]
  type DhcpOptionsId = java.lang.String
  type DhcpOptionsIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type DhcpOptionsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.DhcpOptions]
  type DisableFastSnapshotRestoreErrorSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DisableFastSnapshotRestoreErrorItem]
  type DisableFastSnapshotRestoreStateErrorSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DisableFastSnapshotRestoreStateErrorItem]
  type DisableFastSnapshotRestoreSuccessSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DisableFastSnapshotRestoreSuccessItem]
  type DiskCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VMDK
    - typingsJapgolly.awsSdk.awsSdkStrings.RAW
    - typingsJapgolly.awsSdk.awsSdkStrings.VHD
    - java.lang.String
  */
  type DiskImageFormat = typingsJapgolly.awsSdk.ec2Mod._DiskImageFormat | java.lang.String
  type DiskImageList = js.Array[typingsJapgolly.awsSdk.ec2Mod.DiskImage]
  type DiskInfoList = js.Array[typingsJapgolly.awsSdk.ec2Mod.DiskInfo]
  type DiskSize = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.hdd
    - typingsJapgolly.awsSdk.awsSdkStrings.ssd
    - java.lang.String
  */
  type DiskType = typingsJapgolly.awsSdk.ec2Mod._DiskType | java.lang.String
  type DnsEntrySet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DnsEntry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pendingVerification
    - typingsJapgolly.awsSdk.awsSdkStrings.verified_
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type DnsNameState = typingsJapgolly.awsSdk.ec2Mod._DnsNameState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enable_
    - typingsJapgolly.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type DnsSupportValue = typingsJapgolly.awsSdk.ec2Mod._DnsSupportValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.vpc_
    - typingsJapgolly.awsSdk.awsSdkStrings.standard__
    - java.lang.String
  */
  type DomainType = typingsJapgolly.awsSdk.ec2Mod._DomainType | java.lang.String
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.unsupported
    - typingsJapgolly.awsSdk.awsSdkStrings.supported
    - java.lang.String
  */
  type EbsEncryptionSupport = typingsJapgolly.awsSdk.ec2Mod._EbsEncryptionSupport | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.unsupported
    - typingsJapgolly.awsSdk.awsSdkStrings.supported
    - typingsJapgolly.awsSdk.awsSdkStrings.default_
    - java.lang.String
  */
  type EbsOptimizedSupport = typingsJapgolly.awsSdk.ec2Mod._EbsOptimizedSupport | java.lang.String
  type EgressOnlyInternetGatewayId = java.lang.String
  type EgressOnlyInternetGatewayIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.EgressOnlyInternetGatewayId]
  type EgressOnlyInternetGatewayList = js.Array[typingsJapgolly.awsSdk.ec2Mod.EgressOnlyInternetGateway]
  type ElasticGpuAssociationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ElasticGpuAssociation]
  type ElasticGpuIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ElasticGpuSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ElasticGpus]
  type ElasticGpuSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ElasticGpuSpecification]
  type ElasticGpuSpecificationResponseList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ElasticGpuSpecificationResponse]
  type ElasticGpuSpecifications = js.Array[typingsJapgolly.awsSdk.ec2Mod.ElasticGpuSpecification]
  type ElasticGpuState = typingsJapgolly.awsSdk.awsSdkStrings.ATTACHED | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OK
    - typingsJapgolly.awsSdk.awsSdkStrings.IMPAIRED
    - java.lang.String
  */
  type ElasticGpuStatus = typingsJapgolly.awsSdk.ec2Mod._ElasticGpuStatus | java.lang.String
  type ElasticInferenceAcceleratorAssociationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ElasticInferenceAcceleratorAssociation]
  type ElasticInferenceAcceleratorCount = scala.Double
  type ElasticInferenceAccelerators = js.Array[typingsJapgolly.awsSdk.ec2Mod.ElasticInferenceAccelerator]
  type ElasticIpAssociationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.unsupported
    - typingsJapgolly.awsSdk.awsSdkStrings.supported
    - typingsJapgolly.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type EnaSupport = typingsJapgolly.awsSdk.ec2Mod._EnaSupport | java.lang.String
  type EnableFastSnapshotRestoreErrorSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.EnableFastSnapshotRestoreErrorItem]
  type EnableFastSnapshotRestoreStateErrorSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.EnableFastSnapshotRestoreStateErrorItem]
  type EnableFastSnapshotRestoreSuccessSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.EnableFastSnapshotRestoreSuccessItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.unlimited_
    - typingsJapgolly.awsSdk.awsSdkStrings.limited
    - java.lang.String
  */
  type EndDateType = typingsJapgolly.awsSdk.ec2Mod._EndDateType | java.lang.String
  type EndpointSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ClientVpnEndpoint]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`instance-reboot`
    - typingsJapgolly.awsSdk.awsSdkStrings.`system-reboot`
    - typingsJapgolly.awsSdk.awsSdkStrings.`system-maintenance`
    - typingsJapgolly.awsSdk.awsSdkStrings.`instance-retirement`
    - typingsJapgolly.awsSdk.awsSdkStrings.`instance-stop`
    - java.lang.String
  */
  type EventCode = typingsJapgolly.awsSdk.ec2Mod._EventCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceChange
    - typingsJapgolly.awsSdk.awsSdkStrings.fleetRequestChange
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - typingsJapgolly.awsSdk.awsSdkStrings.information
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.ec2Mod._EventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.noTermination
    - typingsJapgolly.awsSdk.awsSdkStrings.default_
    - java.lang.String
  */
  type ExcessCapacityTerminationPolicy = typingsJapgolly.awsSdk.ec2Mod._ExcessCapacityTerminationPolicy | java.lang.String
  type ExecutableByStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.citrix
    - typingsJapgolly.awsSdk.awsSdkStrings.vmware_
    - typingsJapgolly.awsSdk.awsSdkStrings.microsoft
    - java.lang.String
  */
  type ExportEnvironment = typingsJapgolly.awsSdk.ec2Mod._ExportEnvironment | java.lang.String
  type ExportImageTaskIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ExportImageTaskList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ExportImageTask]
  type ExportTaskId = java.lang.String
  type ExportTaskIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ExportTaskList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ExportTask]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelling__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.completed__
    - java.lang.String
  */
  type ExportTaskState = typingsJapgolly.awsSdk.ec2Mod._ExportTaskState | java.lang.String
  type FailedQueuedPurchaseDeletionSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.FailedQueuedPurchaseDeletion]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enabling__
    - typingsJapgolly.awsSdk.awsSdkStrings.optimizing
    - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.disabling_
    - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type FastSnapshotRestoreStateCode = typingsJapgolly.awsSdk.ec2Mod._FastSnapshotRestoreStateCode | java.lang.String
  type FilterList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Filter]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending_fulfillment
    - typingsJapgolly.awsSdk.awsSdkStrings.pending_termination
    - typingsJapgolly.awsSdk.awsSdkStrings.fulfilled__
    - java.lang.String
  */
  type FleetActivityStatus = typingsJapgolly.awsSdk.ec2Mod._FleetActivityStatus | java.lang.String
  type FleetCapacityReservationUsageStrategy = typingsJapgolly.awsSdk.awsSdkStrings.`use-capacity-reservations-first` | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`instance-change`
    - typingsJapgolly.awsSdk.awsSdkStrings.`fleet-change`
    - typingsJapgolly.awsSdk.awsSdkStrings.`service-error`
    - java.lang.String
  */
  type FleetEventType = typingsJapgolly.awsSdk.ec2Mod._FleetEventType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`no-termination`
    - typingsJapgolly.awsSdk.awsSdkStrings.termination
    - java.lang.String
  */
  type FleetExcessCapacityTerminationPolicy = typingsJapgolly.awsSdk.ec2Mod._FleetExcessCapacityTerminationPolicy | java.lang.String
  type FleetIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.FleetIdentifier]
  type FleetIdentifier = java.lang.String
  type FleetLaunchTemplateConfigList = js.Array[typingsJapgolly.awsSdk.ec2Mod.FleetLaunchTemplateConfig]
  type FleetLaunchTemplateConfigListRequest = js.Array[typingsJapgolly.awsSdk.ec2Mod.FleetLaunchTemplateConfigRequest]
  type FleetLaunchTemplateOverridesList = js.Array[typingsJapgolly.awsSdk.ec2Mod.FleetLaunchTemplateOverrides]
  type FleetLaunchTemplateOverridesListRequest = js.Array[typingsJapgolly.awsSdk.ec2Mod.FleetLaunchTemplateOverridesRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`lowest-price`
    - typingsJapgolly.awsSdk.awsSdkStrings.prioritized
    - java.lang.String
  */
  type FleetOnDemandAllocationStrategy = typingsJapgolly.awsSdk.ec2Mod._FleetOnDemandAllocationStrategy | java.lang.String
  type FleetSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.FleetData]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.submitted__
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted_running
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted_terminating
    - typingsJapgolly.awsSdk.awsSdkStrings.modifying_
    - java.lang.String
  */
  type FleetStateCode = typingsJapgolly.awsSdk.ec2Mod._FleetStateCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.request_
    - typingsJapgolly.awsSdk.awsSdkStrings.maintain
    - typingsJapgolly.awsSdk.awsSdkStrings.instant
    - java.lang.String
  */
  type FleetType = typingsJapgolly.awsSdk.ec2Mod._FleetType | java.lang.String
  type Float = scala.Double
  type FlowLogSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.FlowLog]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VPC
    - typingsJapgolly.awsSdk.awsSdkStrings.Subnet
    - typingsJapgolly.awsSdk.awsSdkStrings.NetworkInterface
    - java.lang.String
  */
  type FlowLogsResourceType = typingsJapgolly.awsSdk.ec2Mod._FlowLogsResourceType | java.lang.String
  type FpgaDeviceCount = scala.Double
  type FpgaDeviceInfoList = js.Array[typingsJapgolly.awsSdk.ec2Mod.FpgaDeviceInfo]
  type FpgaDeviceManufacturerName = java.lang.String
  type FpgaDeviceMemorySize = scala.Double
  type FpgaDeviceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.description
    - typingsJapgolly.awsSdk.awsSdkStrings.name__
    - typingsJapgolly.awsSdk.awsSdkStrings.loadPermission
    - typingsJapgolly.awsSdk.awsSdkStrings.productCodes
    - java.lang.String
  */
  type FpgaImageAttributeName = typingsJapgolly.awsSdk.ec2Mod._FpgaImageAttributeName | java.lang.String
  type FpgaImageId = java.lang.String
  type FpgaImageIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type FpgaImageList = js.Array[typingsJapgolly.awsSdk.ec2Mod.FpgaImage]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.unavailable__
    - java.lang.String
  */
  type FpgaImageStateCode = typingsJapgolly.awsSdk.ec2Mod._FpgaImageStateCode | java.lang.String
  type FreeTierEligibleFlag = scala.Boolean
  type GatewayType = typingsJapgolly.awsSdk.awsSdkStrings.ipsecDot1 | java.lang.String
  type GetCapacityReservationUsageRequestMaxResults = scala.Double
  type GpuDeviceCount = scala.Double
  type GpuDeviceInfoList = js.Array[typingsJapgolly.awsSdk.ec2Mod.GpuDeviceInfo]
  type GpuDeviceManufacturerName = java.lang.String
  type GpuDeviceMemorySize = scala.Double
  type GpuDeviceName = java.lang.String
  type GroupIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type GroupIdentifierList = js.Array[typingsJapgolly.awsSdk.ec2Mod.GroupIdentifier]
  type GroupIdentifierSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.SecurityGroupIdentifier]
  type GroupIds = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type GroupNameStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type HibernationFlag = scala.Boolean
  type HistoryRecordSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.HistoryRecordEntry]
  type HistoryRecords = js.Array[typingsJapgolly.awsSdk.ec2Mod.HistoryRecord]
  type HostInstanceList = js.Array[typingsJapgolly.awsSdk.ec2Mod.HostInstance]
  type HostList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Host]
  type HostOfferingSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.HostOffering]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.on_
    - typingsJapgolly.awsSdk.awsSdkStrings.off__
    - java.lang.String
  */
  type HostRecovery = typingsJapgolly.awsSdk.ec2Mod._HostRecovery | java.lang.String
  type HostReservationIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type HostReservationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.HostReservation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.dedicated_
    - typingsJapgolly.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type HostTenancy = typingsJapgolly.awsSdk.ec2Mod._HostTenancy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.optional__
    - typingsJapgolly.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type HttpTokensState = typingsJapgolly.awsSdk.ec2Mod._HttpTokensState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ovm
    - typingsJapgolly.awsSdk.awsSdkStrings.xen
    - java.lang.String
  */
  type HypervisorType = typingsJapgolly.awsSdk.ec2Mod._HypervisorType | java.lang.String
  type IKEVersionsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.IKEVersionsListValue]
  type IKEVersionsRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.IKEVersionsRequestListValue]
  type IamInstanceProfileAssociationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.IamInstanceProfileAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.associating__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type IamInstanceProfileAssociationState = typingsJapgolly.awsSdk.ec2Mod._IamInstanceProfileAssociationState | java.lang.String
  type IdFormatList = js.Array[typingsJapgolly.awsSdk.ec2Mod.IdFormat]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.description
    - typingsJapgolly.awsSdk.awsSdkStrings.kernel
    - typingsJapgolly.awsSdk.awsSdkStrings.ramdisk
    - typingsJapgolly.awsSdk.awsSdkStrings.launchPermission
    - typingsJapgolly.awsSdk.awsSdkStrings.productCodes
    - typingsJapgolly.awsSdk.awsSdkStrings.blockDeviceMapping
    - typingsJapgolly.awsSdk.awsSdkStrings.sriovNetSupport
    - java.lang.String
  */
  type ImageAttributeName = typingsJapgolly.awsSdk.ec2Mod._ImageAttributeName | java.lang.String
  type ImageDiskContainerList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ImageDiskContainer]
  type ImageId = java.lang.String
  type ImageIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ImageList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Image]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.invalid__
    - typingsJapgolly.awsSdk.awsSdkStrings.deregistered__
    - typingsJapgolly.awsSdk.awsSdkStrings.transient
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type ImageState = typingsJapgolly.awsSdk.ec2Mod._ImageState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.machine
    - typingsJapgolly.awsSdk.awsSdkStrings.kernel
    - typingsJapgolly.awsSdk.awsSdkStrings.ramdisk
    - java.lang.String
  */
  type ImageTypeValues = typingsJapgolly.awsSdk.ec2Mod._ImageTypeValues | java.lang.String
  type ImportImageLicenseSpecificationListRequest = js.Array[typingsJapgolly.awsSdk.ec2Mod.ImportImageLicenseConfigurationRequest]
  type ImportImageLicenseSpecificationListResponse = js.Array[typingsJapgolly.awsSdk.ec2Mod.ImportImageLicenseConfigurationResponse]
  type ImportImageTaskList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ImportImageTask]
  type ImportInstanceVolumeDetailSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ImportInstanceVolumeDetailItem]
  type ImportSnapshotTaskList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ImportSnapshotTask]
  type ImportTaskId = java.lang.String
  type ImportTaskIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type InferenceDeviceCount = scala.Double
  type InferenceDeviceInfoList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InferenceDeviceInfo]
  type InferenceDeviceManufacturerName = java.lang.String
  type InferenceDeviceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceType_
    - typingsJapgolly.awsSdk.awsSdkStrings.kernel
    - typingsJapgolly.awsSdk.awsSdkStrings.ramdisk
    - typingsJapgolly.awsSdk.awsSdkStrings.userData
    - typingsJapgolly.awsSdk.awsSdkStrings.disableApiTermination
    - typingsJapgolly.awsSdk.awsSdkStrings.instanceInitiatedShutdownBehavior
    - typingsJapgolly.awsSdk.awsSdkStrings.rootDeviceName
    - typingsJapgolly.awsSdk.awsSdkStrings.blockDeviceMapping
    - typingsJapgolly.awsSdk.awsSdkStrings.productCodes
    - typingsJapgolly.awsSdk.awsSdkStrings.sourceDestCheck
    - typingsJapgolly.awsSdk.awsSdkStrings.groupSet
    - typingsJapgolly.awsSdk.awsSdkStrings.ebsOptimized
    - typingsJapgolly.awsSdk.awsSdkStrings.sriovNetSupport
    - typingsJapgolly.awsSdk.awsSdkStrings.enaSupport
    - java.lang.String
  */
  type InstanceAttributeName = typingsJapgolly.awsSdk.ec2Mod._InstanceAttributeName | java.lang.String
  type InstanceBlockDeviceMappingList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceBlockDeviceMapping]
  type InstanceBlockDeviceMappingSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceBlockDeviceMappingSpecification]
  type InstanceCountList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceCount]
  type InstanceCreditSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceCreditSpecification]
  type InstanceCreditSpecificationListRequest = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceCreditSpecificationRequest]
  type InstanceEventId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.healthy__
    - typingsJapgolly.awsSdk.awsSdkStrings.unhealthy__
    - java.lang.String
  */
  type InstanceHealthStatus = typingsJapgolly.awsSdk.ec2Mod._InstanceHealthStatus | java.lang.String
  type InstanceId = java.lang.String
  type InstanceIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type InstanceIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type InstanceIdsSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.hibernate
    - typingsJapgolly.awsSdk.awsSdkStrings.stop
    - typingsJapgolly.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type InstanceInterruptionBehavior = typingsJapgolly.awsSdk.ec2Mod._InstanceInterruptionBehavior | java.lang.String
  type InstanceIpv6AddressList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceIpv6Address]
  type InstanceIpv6AddressListRequest = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceIpv6AddressRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.spot_
    - typingsJapgolly.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type InstanceLifecycle = typingsJapgolly.awsSdk.ec2Mod._InstanceLifecycle | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.spot_
    - typingsJapgolly.awsSdk.awsSdkStrings.scheduled__
    - java.lang.String
  */
  type InstanceLifecycleType = typingsJapgolly.awsSdk.ec2Mod._InstanceLifecycleType | java.lang.String
  type InstanceList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Instance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.open__
    - typingsJapgolly.awsSdk.awsSdkStrings.targeted
    - java.lang.String
  */
  type InstanceMatchCriteria = typingsJapgolly.awsSdk.ec2Mod._InstanceMatchCriteria | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
    - java.lang.String
  */
  type InstanceMetadataEndpointState = typingsJapgolly.awsSdk.ec2Mod._InstanceMetadataEndpointState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.applied
    - java.lang.String
  */
  type InstanceMetadataOptionsState = typingsJapgolly.awsSdk.ec2Mod._InstanceMetadataOptionsState | java.lang.String
  type InstanceMonitoringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceMonitoring]
  type InstanceNetworkInterfaceList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceNetworkInterface]
  type InstanceNetworkInterfaceSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceNetworkInterfaceSpecification]
  type InstancePrivateIpAddressList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstancePrivateIpAddress]
  type InstanceStateChangeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceStateChange]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.running__
    - typingsJapgolly.awsSdk.awsSdkStrings.`shutting-down`
    - typingsJapgolly.awsSdk.awsSdkStrings.terminated__
    - typingsJapgolly.awsSdk.awsSdkStrings.stopping__
    - typingsJapgolly.awsSdk.awsSdkStrings.stopped__
    - java.lang.String
  */
  type InstanceStateName = typingsJapgolly.awsSdk.ec2Mod._InstanceStateName | java.lang.String
  type InstanceStatusDetailsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceStatusDetails]
  type InstanceStatusEventList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceStatusEvent]
  type InstanceStatusList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceStatus]
  type InstanceStorageFlag = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.t1Dotmicro
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotnano
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotmicro
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotsmall
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.t2Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.t3Dotnano
    - typingsJapgolly.awsSdk.awsSdkStrings.t3Dotmicro
    - typingsJapgolly.awsSdk.awsSdkStrings.t3Dotsmall
    - typingsJapgolly.awsSdk.awsSdkStrings.t3Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.t3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.t3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.t3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.t3aDotnano
    - typingsJapgolly.awsSdk.awsSdkStrings.t3aDotmicro
    - typingsJapgolly.awsSdk.awsSdkStrings.t3aDotsmall
    - typingsJapgolly.awsSdk.awsSdkStrings.t3aDotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.t3aDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.t3aDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.t3aDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m1Dotsmall
    - typingsJapgolly.awsSdk.awsSdkStrings.m1Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.m1Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m1Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot10xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m4Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m2Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m2Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m2Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.cr1Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r3Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r4Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5Dotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.r5aDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5aDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5aDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dDotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.r5adDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5adDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5adDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5adDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5adDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5adDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5adDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5adDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.x1Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.x1Dot32xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.x1eDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.x1eDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.x1eDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.x1eDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.x1eDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.x1eDot32xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i2Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i2Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i2Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i2Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3Dotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.i3enDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3enDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3enDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3enDot3xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3enDot6xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3enDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3enDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.i3enDotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.hi1Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.hs1Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c1Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.c1Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c3Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c4Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot9xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot18xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5Dotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot9xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot18xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5dDotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.c5nDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5nDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5nDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5nDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5nDot9xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.c5nDot18xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.cc1Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.cc2Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g2Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g2Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g3Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g3Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g3Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g3sDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.cg1Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.p2Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.p2Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.p2Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.p3Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.p3Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.p3Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.p3dnDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.d2Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.d2Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.f1Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.f1Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.f1Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5Dotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.m5aDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5aDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5aDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dDotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.m5adDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5adDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5adDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5adDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5adDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5adDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5adDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5adDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.h1Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.h1Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.h1Dot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.h1Dot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.z1dDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.z1dDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.z1dDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.z1dDot3xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.z1dDot6xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.z1dDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.z1dDotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.`u-6tb1Dotmetal`
    - typingsJapgolly.awsSdk.awsSdkStrings.`u-9tb1Dotmetal`
    - typingsJapgolly.awsSdk.awsSdkStrings.`u-12tb1Dotmetal`
    - typingsJapgolly.awsSdk.awsSdkStrings.`u-18tb1Dotmetal`
    - typingsJapgolly.awsSdk.awsSdkStrings.`u-24tb1Dotmetal`
    - typingsJapgolly.awsSdk.awsSdkStrings.a1Dotmedium
    - typingsJapgolly.awsSdk.awsSdkStrings.a1Dotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.a1Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.a1Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.a1Dot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.a1Dotmetal
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dnDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dnDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dnDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dnDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dnDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dnDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dnDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5dnDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5nDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5nDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5nDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5nDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5nDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5nDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5nDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.m5nDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dnDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dnDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dnDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dnDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dnDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dnDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dnDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5dnDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5nDotlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5nDotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5nDot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5nDot4xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5nDot8xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5nDot12xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5nDot16xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.r5nDot24xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.inf1Dotxlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.inf1Dot2xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.inf1Dot6xlarge
    - typingsJapgolly.awsSdk.awsSdkStrings.inf1Dot24xlarge
    - java.lang.String
  */
  type InstanceType = typingsJapgolly.awsSdk.ec2Mod._InstanceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.nitro
    - typingsJapgolly.awsSdk.awsSdkStrings.xen
    - java.lang.String
  */
  type InstanceTypeHypervisor = typingsJapgolly.awsSdk.ec2Mod._InstanceTypeHypervisor | java.lang.String
  type InstanceTypeInfoList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceTypeInfo]
  type InstanceTypeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceType]
  type InstanceTypeOfferingsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceTypeOffering]
  type InstanceUsageSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceUsage]
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`INSTANCE-ATTACH`
    - typingsJapgolly.awsSdk.awsSdkStrings.`EIP-ASSOCIATE`
    - java.lang.String
  */
  type InterfacePermissionType = typingsJapgolly.awsSdk.ec2Mod._InterfacePermissionType | java.lang.String
  type InternetGatewayAttachmentList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InternetGatewayAttachment]
  type InternetGatewayId = java.lang.String
  type InternetGatewayList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InternetGateway]
  type IpPermissionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.IpPermission]
  type IpRangeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.IpRange]
  type IpRanges = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type Ipv6Address = java.lang.String
  type Ipv6AddressList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type Ipv6CidrAssociationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.Ipv6CidrAssociation]
  type Ipv6CidrBlockSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.Ipv6CidrBlock]
  type Ipv6Flag = scala.Boolean
  type Ipv6PoolMaxResults = scala.Double
  type Ipv6PoolSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.Ipv6Pool]
  type Ipv6RangeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Ipv6Range]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enable_
    - typingsJapgolly.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type Ipv6SupportValue = typingsJapgolly.awsSdk.ec2Mod._Ipv6SupportValue | java.lang.String
  type KernelId = java.lang.String
  type KeyNameStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type KeyPairIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type KeyPairList = js.Array[typingsJapgolly.awsSdk.ec2Mod.KeyPairInfo]
  type KeyPairName = java.lang.String
  type KmsKeyId = java.lang.String
  type LaunchPermissionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchPermission]
  type LaunchSpecsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.SpotFleetLaunchSpecification]
  type LaunchTemplateBlockDeviceMappingList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateBlockDeviceMapping]
  type LaunchTemplateBlockDeviceMappingRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateBlockDeviceMappingRequest]
  type LaunchTemplateConfigList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateConfig]
  type LaunchTemplateElasticInferenceAcceleratorCount = scala.Double
  type LaunchTemplateElasticInferenceAcceleratorList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateElasticInferenceAccelerator]
  type LaunchTemplateElasticInferenceAcceleratorResponseList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateElasticInferenceAcceleratorResponse]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.launchTemplateIdDoesNotExist
    - typingsJapgolly.awsSdk.awsSdkStrings.launchTemplateIdMalformed
    - typingsJapgolly.awsSdk.awsSdkStrings.launchTemplateNameDoesNotExist
    - typingsJapgolly.awsSdk.awsSdkStrings.launchTemplateNameMalformed
    - typingsJapgolly.awsSdk.awsSdkStrings.launchTemplateVersionDoesNotExist
    - typingsJapgolly.awsSdk.awsSdkStrings.unexpectedError
    - java.lang.String
  */
  type LaunchTemplateErrorCode = typingsJapgolly.awsSdk.ec2Mod._LaunchTemplateErrorCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.optional__
    - typingsJapgolly.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type LaunchTemplateHttpTokensState = typingsJapgolly.awsSdk.ec2Mod._LaunchTemplateHttpTokensState | java.lang.String
  type LaunchTemplateId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
    - java.lang.String
  */
  type LaunchTemplateInstanceMetadataEndpointState = typingsJapgolly.awsSdk.ec2Mod._LaunchTemplateInstanceMetadataEndpointState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.applied
    - java.lang.String
  */
  type LaunchTemplateInstanceMetadataOptionsState = typingsJapgolly.awsSdk.ec2Mod._LaunchTemplateInstanceMetadataOptionsState | java.lang.String
  type LaunchTemplateInstanceNetworkInterfaceSpecificationList = js.Array[
    typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateInstanceNetworkInterfaceSpecification
  ]
  type LaunchTemplateInstanceNetworkInterfaceSpecificationRequestList = js.Array[
    typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateInstanceNetworkInterfaceSpecificationRequest
  ]
  type LaunchTemplateLicenseList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateLicenseConfiguration]
  type LaunchTemplateLicenseSpecificationListRequest = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateLicenseConfigurationRequest]
  type LaunchTemplateName = java.lang.String
  type LaunchTemplateNameStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateName]
  type LaunchTemplateOverridesList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateOverrides]
  type LaunchTemplateSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplate]
  type LaunchTemplateTagSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateTagSpecification]
  type LaunchTemplateTagSpecificationRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateTagSpecificationRequest]
  type LaunchTemplateVersionSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.LaunchTemplateVersion]
  type LicenseList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LicenseConfiguration]
  type LicenseSpecificationListRequest = js.Array[typingsJapgolly.awsSdk.ec2Mod.LicenseConfigurationRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.sold
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type ListingState = typingsJapgolly.awsSdk.ec2Mod._ListingState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.closed_
    - java.lang.String
  */
  type ListingStatus = typingsJapgolly.awsSdk.ec2Mod._ListingStatus | java.lang.String
  type LoadPermissionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LoadPermission]
  type LoadPermissionListRequest = js.Array[typingsJapgolly.awsSdk.ec2Mod.LoadPermissionRequest]
  type LocalGatewayIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type LocalGatewayMaxResults = scala.Double
  type LocalGatewayRouteList = js.Array[typingsJapgolly.awsSdk.ec2Mod.LocalGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.blackhole
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type LocalGatewayRouteState = typingsJapgolly.awsSdk.ec2Mod._LocalGatewayRouteState | java.lang.String
  type LocalGatewayRouteTableIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type LocalGatewayRouteTableSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.LocalGatewayRouteTable]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type LocalGatewayRouteTableVirtualInterfaceGroupAssociationSet = js.Array[
    typingsJapgolly.awsSdk.ec2Mod.LocalGatewayRouteTableVirtualInterfaceGroupAssociation
  ]
  type LocalGatewayRouteTableVpcAssociationIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type LocalGatewayRouteTableVpcAssociationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.LocalGatewayRouteTableVpcAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.static__
    - typingsJapgolly.awsSdk.awsSdkStrings.propagated
    - java.lang.String
  */
  type LocalGatewayRouteType = typingsJapgolly.awsSdk.ec2Mod._LocalGatewayRouteType | java.lang.String
  type LocalGatewaySet = js.Array[typingsJapgolly.awsSdk.ec2Mod.LocalGateway]
  type LocalGatewayVirtualInterfaceGroupIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type LocalGatewayVirtualInterfaceGroupSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.LocalGatewayVirtualInterfaceGroup]
  type LocalGatewayVirtualInterfaceIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type LocalGatewayVirtualInterfaceSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.LocalGatewayVirtualInterface]
  type Location = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.region__
    - typingsJapgolly.awsSdk.awsSdkStrings.`availability-zone`
    - typingsJapgolly.awsSdk.awsSdkStrings.`availability-zone-id`
    - java.lang.String
  */
  type LocationType = typingsJapgolly.awsSdk.ec2Mod._LocationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`cloud-watch-logs`
    - typingsJapgolly.awsSdk.awsSdkStrings.s3_
    - java.lang.String
  */
  type LogDestinationType = typingsJapgolly.awsSdk.ec2Mod._LogDestinationType | java.lang.String
  type Long = scala.Double
  type MarketType = typingsJapgolly.awsSdk.awsSdkStrings.spot_ | java.lang.String
  type MaxIpv4AddrPerInterface = scala.Double
  type MaxIpv6AddrPerInterface = scala.Double
  type MaxNetworkInterfaces = scala.Double
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.static__
    - typingsJapgolly.awsSdk.awsSdkStrings.igmp
    - java.lang.String
  */
  type MembershipType = typingsJapgolly.awsSdk.ec2Mod._MembershipType | java.lang.String
  type MemorySize = scala.Double
  type MillisecondDateTime = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.disabling_
    - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - java.lang.String
  */
  type MonitoringState = typingsJapgolly.awsSdk.ec2Mod._MonitoringState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.movingToVpc
    - typingsJapgolly.awsSdk.awsSdkStrings.restoringToClassic
    - java.lang.String
  */
  type MoveStatus = typingsJapgolly.awsSdk.ec2Mod._MoveStatus | java.lang.String
  type MovingAddressStatusSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.MovingAddressStatus]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enable_
    - typingsJapgolly.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type MulticastSupportValue = typingsJapgolly.awsSdk.ec2Mod._MulticastSupportValue | java.lang.String
  type NatGatewayAddressList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NatGatewayAddress]
  type NatGatewayId = java.lang.String
  type NatGatewayList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NatGateway]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type NatGatewayState = typingsJapgolly.awsSdk.ec2Mod._NatGatewayState | java.lang.String
  type NetworkAclAssociationId = java.lang.String
  type NetworkAclAssociationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NetworkAclAssociation]
  type NetworkAclEntryList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NetworkAclEntry]
  type NetworkAclId = java.lang.String
  type NetworkAclList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NetworkAcl]
  type NetworkInterfaceAttachmentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.description
    - typingsJapgolly.awsSdk.awsSdkStrings.groupSet
    - typingsJapgolly.awsSdk.awsSdkStrings.sourceDestCheck
    - typingsJapgolly.awsSdk.awsSdkStrings.attachment
    - java.lang.String
  */
  type NetworkInterfaceAttribute = typingsJapgolly.awsSdk.ec2Mod._NetworkInterfaceAttribute | java.lang.String
  type NetworkInterfaceCreationType = typingsJapgolly.awsSdk.awsSdkStrings.efa | java.lang.String
  type NetworkInterfaceId = java.lang.String
  type NetworkInterfaceIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type NetworkInterfaceIpv6AddressesList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NetworkInterfaceIpv6Address]
  type NetworkInterfaceList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NetworkInterface]
  type NetworkInterfacePermissionIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type NetworkInterfacePermissionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NetworkInterfacePermission]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.granted_
    - typingsJapgolly.awsSdk.awsSdkStrings.revoking
    - typingsJapgolly.awsSdk.awsSdkStrings.revoked__
    - java.lang.String
  */
  type NetworkInterfacePermissionStateCode = typingsJapgolly.awsSdk.ec2Mod._NetworkInterfacePermissionStateCode | java.lang.String
  type NetworkInterfacePrivateIpAddressList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NetworkInterfacePrivateIpAddress]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.attaching_
    - typingsJapgolly.awsSdk.awsSdkStrings.`in-use`
    - typingsJapgolly.awsSdk.awsSdkStrings.detaching__
    - java.lang.String
  */
  type NetworkInterfaceStatus = typingsJapgolly.awsSdk.ec2Mod._NetworkInterfaceStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.interface_
    - typingsJapgolly.awsSdk.awsSdkStrings.natGateway
    - typingsJapgolly.awsSdk.awsSdkStrings.efa
    - java.lang.String
  */
  type NetworkInterfaceType = typingsJapgolly.awsSdk.ec2Mod._NetworkInterfaceType | java.lang.String
  type NetworkPerformance = java.lang.String
  type NewDhcpConfigurationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.NewDhcpConfiguration]
  type NextToken = java.lang.String
  type OccurrenceDayRequestSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.Integer]
  type OccurrenceDaySet = js.Array[typingsJapgolly.awsSdk.ec2Mod.Integer]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.standard__
    - typingsJapgolly.awsSdk.awsSdkStrings.convertible_
    - java.lang.String
  */
  type OfferingClassType = typingsJapgolly.awsSdk.ec2Mod._OfferingClassType | java.lang.String
  type OfferingId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`Heavy Utilization`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Medium Utilization`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Light Utilization`
    - typingsJapgolly.awsSdk.awsSdkStrings.`No Upfront`
    - typingsJapgolly.awsSdk.awsSdkStrings.`Partial Upfront`
    - typingsJapgolly.awsSdk.awsSdkStrings.`All Upfront`
    - java.lang.String
  */
  type OfferingTypeValues = typingsJapgolly.awsSdk.ec2Mod._OfferingTypeValues | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.lowestPrice
    - typingsJapgolly.awsSdk.awsSdkStrings.prioritized
    - java.lang.String
  */
  type OnDemandAllocationStrategy = typingsJapgolly.awsSdk.ec2Mod._OnDemandAllocationStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.add__
    - typingsJapgolly.awsSdk.awsSdkStrings.remove__
    - java.lang.String
  */
  type OperationType = typingsJapgolly.awsSdk.ec2Mod._OperationType | java.lang.String
  type OwnerStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AllUpfront
    - typingsJapgolly.awsSdk.awsSdkStrings.PartialUpfront
    - typingsJapgolly.awsSdk.awsSdkStrings.NoUpfront
    - java.lang.String
  */
  type PaymentOption = typingsJapgolly.awsSdk.ec2Mod._PaymentOption | java.lang.String
  type PermissionGroup = typingsJapgolly.awsSdk.awsSdkStrings.all__ | java.lang.String
  type Phase1DHGroupNumbersList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase1DHGroupNumbersListValue]
  type Phase1DHGroupNumbersRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase1DHGroupNumbersRequestListValue]
  type Phase1EncryptionAlgorithmsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase1EncryptionAlgorithmsListValue]
  type Phase1EncryptionAlgorithmsRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase1EncryptionAlgorithmsRequestListValue]
  type Phase1IntegrityAlgorithmsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase1IntegrityAlgorithmsListValue]
  type Phase1IntegrityAlgorithmsRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase1IntegrityAlgorithmsRequestListValue]
  type Phase2DHGroupNumbersList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase2DHGroupNumbersListValue]
  type Phase2DHGroupNumbersRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase2DHGroupNumbersRequestListValue]
  type Phase2EncryptionAlgorithmsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase2EncryptionAlgorithmsListValue]
  type Phase2EncryptionAlgorithmsRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase2EncryptionAlgorithmsRequestListValue]
  type Phase2IntegrityAlgorithmsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase2IntegrityAlgorithmsListValue]
  type Phase2IntegrityAlgorithmsRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Phase2IntegrityAlgorithmsRequestListValue]
  type PlacementGroupIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type PlacementGroupList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PlacementGroup]
  type PlacementGroupName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type PlacementGroupState = typingsJapgolly.awsSdk.ec2Mod._PlacementGroupState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.cluster_
    - typingsJapgolly.awsSdk.awsSdkStrings.partition
    - typingsJapgolly.awsSdk.awsSdkStrings.spread
    - java.lang.String
  */
  type PlacementGroupStrategy = typingsJapgolly.awsSdk.ec2Mod._PlacementGroupStrategy | java.lang.String
  type PlacementGroupStrategyList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PlacementGroupStrategy]
  type PlacementGroupStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.cluster_
    - typingsJapgolly.awsSdk.awsSdkStrings.spread
    - typingsJapgolly.awsSdk.awsSdkStrings.partition
    - java.lang.String
  */
  type PlacementStrategy = typingsJapgolly.awsSdk.ec2Mod._PlacementStrategy | java.lang.String
  type PlatformValues = typingsJapgolly.awsSdk.awsSdkStrings.Windows_ | java.lang.String
  type PoolCidrBlocksSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.PoolCidrBlock]
  type PoolMaxResults = scala.Double
  type PrefixListIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PrefixListId]
  type PrefixListIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type PrefixListSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.PrefixList]
  type PriceScheduleList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PriceSchedule]
  type PriceScheduleSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PriceScheduleSpecification]
  type PricingDetailsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PricingDetail]
  type PrincipalIdFormatList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PrincipalIdFormat]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.All_
    - typingsJapgolly.awsSdk.awsSdkStrings.Service_
    - typingsJapgolly.awsSdk.awsSdkStrings.OrganizationUnit
    - typingsJapgolly.awsSdk.awsSdkStrings.Account_
    - typingsJapgolly.awsSdk.awsSdkStrings.User_
    - typingsJapgolly.awsSdk.awsSdkStrings.Role_
    - java.lang.String
  */
  type PrincipalType = typingsJapgolly.awsSdk.ec2Mod._PrincipalType | java.lang.String
  type PrivateIpAddressConfigSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ScheduledInstancesPrivateIpAddressConfig]
  type PrivateIpAddressSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PrivateIpAddressSpecification]
  type PrivateIpAddressStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ProcessorSustainedClockSpeed = scala.Double
  type ProductCodeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ProductCode]
  type ProductCodeStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.devpay
    - typingsJapgolly.awsSdk.awsSdkStrings.marketplace_
    - java.lang.String
  */
  type ProductCodeValues = typingsJapgolly.awsSdk.ec2Mod._ProductCodeValues | java.lang.String
  type ProductDescriptionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type PropagatingVgwList = js.Array[typingsJapgolly.awsSdk.ec2Mod.PropagatingVgw]
  type PublicIpStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type PublicIpv4PoolRangeSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.PublicIpv4PoolRange]
  type PublicIpv4PoolSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.PublicIpv4Pool]
  type PurchaseRequestSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.PurchaseRequest]
  type PurchaseSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.Purchase]
  type PurchasedScheduledInstanceSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ScheduledInstance]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LinuxSlashUNIX
    - typingsJapgolly.awsSdk.awsSdkStrings.`LinuxSlashUNIX LeftparenthesisAmazon VPCRightparenthesis`
    - typingsJapgolly.awsSdk.awsSdkStrings.Windows_
    - typingsJapgolly.awsSdk.awsSdkStrings.`Windows LeftparenthesisAmazon VPCRightparenthesis`
    - java.lang.String
  */
  type RIProductDescription = typingsJapgolly.awsSdk.ec2Mod._RIProductDescription | java.lang.String
  type RamdiskId = java.lang.String
  type ReasonCodesList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReportInstanceReasonCodes]
  type RecurringChargeFrequency = typingsJapgolly.awsSdk.awsSdkStrings.Hourly_ | java.lang.String
  type RecurringChargesList = js.Array[typingsJapgolly.awsSdk.ec2Mod.RecurringCharge]
  type RegionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Region]
  type RegionNameStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`instance-stuck-in-state`
    - typingsJapgolly.awsSdk.awsSdkStrings.unresponsive
    - typingsJapgolly.awsSdk.awsSdkStrings.`not-accepting-credentials`
    - typingsJapgolly.awsSdk.awsSdkStrings.`password-not-available`
    - typingsJapgolly.awsSdk.awsSdkStrings.`performance-network`
    - typingsJapgolly.awsSdk.awsSdkStrings.`performance-instance-store`
    - typingsJapgolly.awsSdk.awsSdkStrings.`performance-ebs-volume`
    - typingsJapgolly.awsSdk.awsSdkStrings.`performance-other`
    - typingsJapgolly.awsSdk.awsSdkStrings.other_
    - java.lang.String
  */
  type ReportInstanceReasonCodes = typingsJapgolly.awsSdk.ec2Mod._ReportInstanceReasonCodes | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ok__
    - typingsJapgolly.awsSdk.awsSdkStrings.impaired__
    - java.lang.String
  */
  type ReportStatusType = typingsJapgolly.awsSdk.ec2Mod._ReportStatusType | java.lang.String
  type RequestHostIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type RequestHostIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.DedicatedHostId]
  type RequestInstanceTypeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.InstanceType]
  type ReservationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Reservation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`payment-pending`
    - typingsJapgolly.awsSdk.awsSdkStrings.`payment-failed`
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.retired
    - java.lang.String
  */
  type ReservationState = typingsJapgolly.awsSdk.ec2Mod._ReservationState | java.lang.String
  type ReservedInstanceIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ReservedInstanceReservationValueSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReservedInstanceReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`payment-pending`
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.`payment-failed`
    - typingsJapgolly.awsSdk.awsSdkStrings.retired
    - typingsJapgolly.awsSdk.awsSdkStrings.queued__
    - typingsJapgolly.awsSdk.awsSdkStrings.`queued-deleted`
    - java.lang.String
  */
  type ReservedInstanceState = typingsJapgolly.awsSdk.ec2Mod._ReservedInstanceState | java.lang.String
  type ReservedInstancesConfigurationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReservedInstancesConfiguration]
  type ReservedInstancesIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ReservedInstancesList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReservedInstances]
  type ReservedInstancesListingId = java.lang.String
  type ReservedInstancesListingList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReservedInstancesListing]
  type ReservedInstancesModificationIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ReservedInstancesModificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReservedInstancesModification]
  type ReservedInstancesModificationResultList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReservedInstancesModificationResult]
  type ReservedInstancesOfferingIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ReservedInstancesOfferingList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReservedInstancesOffering]
  type ReservedIntancesIds = js.Array[typingsJapgolly.awsSdk.ec2Mod.ReservedInstancesId]
  type ResetFpgaImageAttributeName = typingsJapgolly.awsSdk.awsSdkStrings.loadPermission | java.lang.String
  type ResetImageAttributeName = typingsJapgolly.awsSdk.awsSdkStrings.launchPermission | java.lang.String
  type ResourceIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ResourceList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`client-vpn-endpoint`
    - typingsJapgolly.awsSdk.awsSdkStrings.`customer-gateway`
    - typingsJapgolly.awsSdk.awsSdkStrings.`dedicated-host`
    - typingsJapgolly.awsSdk.awsSdkStrings.`dhcp-options`
    - typingsJapgolly.awsSdk.awsSdkStrings.`elastic-ip`
    - typingsJapgolly.awsSdk.awsSdkStrings.fleet
    - typingsJapgolly.awsSdk.awsSdkStrings.`fpga-image`
    - typingsJapgolly.awsSdk.awsSdkStrings.`host-reservation`
    - typingsJapgolly.awsSdk.awsSdkStrings.image
    - typingsJapgolly.awsSdk.awsSdkStrings.instance__
    - typingsJapgolly.awsSdk.awsSdkStrings.`internet-gateway`
    - typingsJapgolly.awsSdk.awsSdkStrings.`key-pair`
    - typingsJapgolly.awsSdk.awsSdkStrings.`launch-template`
    - typingsJapgolly.awsSdk.awsSdkStrings.natgateway_
    - typingsJapgolly.awsSdk.awsSdkStrings.`network-acl`
    - typingsJapgolly.awsSdk.awsSdkStrings.`network-interface`
    - typingsJapgolly.awsSdk.awsSdkStrings.`placement-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.`reserved-instances`
    - typingsJapgolly.awsSdk.awsSdkStrings.`route-table`
    - typingsJapgolly.awsSdk.awsSdkStrings.`security-group`
    - typingsJapgolly.awsSdk.awsSdkStrings.snapshot_
    - typingsJapgolly.awsSdk.awsSdkStrings.`spot-fleet-request`
    - typingsJapgolly.awsSdk.awsSdkStrings.`spot-instances-request`
    - typingsJapgolly.awsSdk.awsSdkStrings.subnet_
    - typingsJapgolly.awsSdk.awsSdkStrings.`traffic-mirror-filter`
    - typingsJapgolly.awsSdk.awsSdkStrings.`traffic-mirror-session`
    - typingsJapgolly.awsSdk.awsSdkStrings.`traffic-mirror-target`
    - typingsJapgolly.awsSdk.awsSdkStrings.`transit-gateway`
    - typingsJapgolly.awsSdk.awsSdkStrings.`transit-gateway-attachment`
    - typingsJapgolly.awsSdk.awsSdkStrings.`transit-gateway-multicast-domain`
    - typingsJapgolly.awsSdk.awsSdkStrings.`transit-gateway-route-table`
    - typingsJapgolly.awsSdk.awsSdkStrings.volume_
    - typingsJapgolly.awsSdk.awsSdkStrings.vpc_
    - typingsJapgolly.awsSdk.awsSdkStrings.`vpc-peering-connection`
    - typingsJapgolly.awsSdk.awsSdkStrings.`vpn-connection`
    - typingsJapgolly.awsSdk.awsSdkStrings.`vpn-gateway`
    - java.lang.String
  */
  type ResourceType = typingsJapgolly.awsSdk.ec2Mod._ResourceType | java.lang.String
  type ResponseHostIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ResponseHostIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type RestorableByStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ebs_
    - typingsJapgolly.awsSdk.awsSdkStrings.`instance-store`
    - java.lang.String
  */
  type RootDeviceType = typingsJapgolly.awsSdk.ec2Mod._RootDeviceType | java.lang.String
  type RootDeviceTypeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.RootDeviceType]
  type RouteList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Route]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateRouteTable
    - typingsJapgolly.awsSdk.awsSdkStrings.CreateRoute
    - typingsJapgolly.awsSdk.awsSdkStrings.EnableVgwRoutePropagation
    - java.lang.String
  */
  type RouteOrigin = typingsJapgolly.awsSdk.ec2Mod._RouteOrigin | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.blackhole
    - java.lang.String
  */
  type RouteState = typingsJapgolly.awsSdk.ec2Mod._RouteState | java.lang.String
  type RouteTableAssociationId = java.lang.String
  type RouteTableAssociationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.RouteTableAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.associating__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociated_
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type RouteTableAssociationStateCode = typingsJapgolly.awsSdk.ec2Mod._RouteTableAssociationStateCode | java.lang.String
  type RouteTableGatewayId = java.lang.String
  type RouteTableId = java.lang.String
  type RouteTableList = js.Array[typingsJapgolly.awsSdk.ec2Mod.RouteTable]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.allow__
    - typingsJapgolly.awsSdk.awsSdkStrings.deny__
    - java.lang.String
  */
  type RuleAction = typingsJapgolly.awsSdk.ec2Mod._RuleAction | java.lang.String
  type ScheduledInstanceAvailabilitySet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ScheduledInstanceAvailability]
  type ScheduledInstanceId = java.lang.String
  type ScheduledInstanceIdRequestSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ScheduledInstanceSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ScheduledInstance]
  type ScheduledInstancesBlockDeviceMappingSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ScheduledInstancesBlockDeviceMapping]
  type ScheduledInstancesIpv6AddressList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ScheduledInstancesIpv6Address]
  type ScheduledInstancesNetworkInterfaceSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ScheduledInstancesNetworkInterface]
  type ScheduledInstancesSecurityGroupIdSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type SecurityGroupIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type SecurityGroupList = js.Array[typingsJapgolly.awsSdk.ec2Mod.SecurityGroup]
  type SecurityGroupReferences = js.Array[typingsJapgolly.awsSdk.ec2Mod.SecurityGroupReference]
  type SecurityGroupStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type SensitiveUserData = java.lang.String
  type ServiceConfigurationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ServiceConfiguration]
  type ServiceDetailSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ServiceDetail]
  type ServiceId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Available_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type ServiceState = typingsJapgolly.awsSdk.ec2Mod._ServiceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Interface
    - typingsJapgolly.awsSdk.awsSdkStrings.Gateway
    - java.lang.String
  */
  type ServiceType = typingsJapgolly.awsSdk.ec2Mod._ServiceType | java.lang.String
  type ServiceTypeDetailSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.ServiceTypeDetail]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.stop
    - typingsJapgolly.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type ShutdownBehavior = typingsJapgolly.awsSdk.ec2Mod._ShutdownBehavior | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.productCodes
    - typingsJapgolly.awsSdk.awsSdkStrings.createVolumePermission
    - java.lang.String
  */
  type SnapshotAttributeName = typingsJapgolly.awsSdk.ec2Mod._SnapshotAttributeName | java.lang.String
  type SnapshotDetailList = js.Array[typingsJapgolly.awsSdk.ec2Mod.SnapshotDetail]
  type SnapshotId = java.lang.String
  type SnapshotIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type SnapshotList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Snapshot]
  type SnapshotSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.SnapshotInfo]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.completed__
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type SnapshotState = typingsJapgolly.awsSdk.ec2Mod._SnapshotState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`lowest-price`
    - typingsJapgolly.awsSdk.awsSdkStrings.diversified
    - typingsJapgolly.awsSdk.awsSdkStrings.`capacity-optimized`
    - java.lang.String
  */
  type SpotAllocationStrategy = typingsJapgolly.awsSdk.ec2Mod._SpotAllocationStrategy | java.lang.String
  type SpotFleetRequestConfigSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.SpotFleetRequestConfig]
  type SpotFleetRequestId = java.lang.String
  type SpotFleetTagSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.SpotFleetTagSpecification]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.hibernate
    - typingsJapgolly.awsSdk.awsSdkStrings.stop
    - typingsJapgolly.awsSdk.awsSdkStrings.terminate_
    - java.lang.String
  */
  type SpotInstanceInterruptionBehavior = typingsJapgolly.awsSdk.ec2Mod._SpotInstanceInterruptionBehavior | java.lang.String
  type SpotInstanceRequestIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type SpotInstanceRequestList = js.Array[typingsJapgolly.awsSdk.ec2Mod.SpotInstanceRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.open__
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.closed_
    - typingsJapgolly.awsSdk.awsSdkStrings.cancelled__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type SpotInstanceState = typingsJapgolly.awsSdk.ec2Mod._SpotInstanceState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`one-time`
    - typingsJapgolly.awsSdk.awsSdkStrings.persistent
    - java.lang.String
  */
  type SpotInstanceType = typingsJapgolly.awsSdk.ec2Mod._SpotInstanceType | java.lang.String
  type SpotPriceHistoryList = js.Array[typingsJapgolly.awsSdk.ec2Mod.SpotPrice]
  type StaleIpPermissionSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.StaleIpPermission]
  type StaleSecurityGroupSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.StaleSecurityGroup]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PendingAcceptance
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.Available_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleting_
    - typingsJapgolly.awsSdk.awsSdkStrings.Deleted_
    - typingsJapgolly.awsSdk.awsSdkStrings.Rejected_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Expired_
    - java.lang.String
  */
  type State = typingsJapgolly.awsSdk.ec2Mod._State | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.MoveInProgress
    - typingsJapgolly.awsSdk.awsSdkStrings.InVpc
    - typingsJapgolly.awsSdk.awsSdkStrings.InClassic
    - java.lang.String
  */
  type Status = typingsJapgolly.awsSdk.ec2Mod._Status | java.lang.String
  type StatusName = typingsJapgolly.awsSdk.awsSdkStrings.reachability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.passed_
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.`insufficient-data`
    - typingsJapgolly.awsSdk.awsSdkStrings.initializing__
    - java.lang.String
  */
  type StatusType = typingsJapgolly.awsSdk.ec2Mod._StatusType | java.lang.String
  type String = java.lang.String
  type SubnetAssociationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.SubnetAssociation]
  type SubnetCidrAssociationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.associating__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociated_
    - typingsJapgolly.awsSdk.awsSdkStrings.failing__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type SubnetCidrBlockStateCode = typingsJapgolly.awsSdk.ec2Mod._SubnetCidrBlockStateCode | java.lang.String
  type SubnetId = java.lang.String
  type SubnetIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type SubnetIpv6CidrBlockAssociationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.SubnetIpv6CidrBlockAssociation]
  type SubnetList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Subnet]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type SubnetState = typingsJapgolly.awsSdk.ec2Mod._SubnetState | java.lang.String
  type SuccessfulInstanceCreditSpecificationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.SuccessfulInstanceCreditSpecificationItem]
  type SuccessfulQueuedPurchaseDeletionSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.SuccessfulQueuedPurchaseDeletion]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ok__
    - typingsJapgolly.awsSdk.awsSdkStrings.impaired__
    - typingsJapgolly.awsSdk.awsSdkStrings.`insufficient-data`
    - typingsJapgolly.awsSdk.awsSdkStrings.`not-applicable`
    - typingsJapgolly.awsSdk.awsSdkStrings.initializing__
    - java.lang.String
  */
  type SummaryStatus = typingsJapgolly.awsSdk.ec2Mod._SummaryStatus | java.lang.String
  type TagDescriptionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TagDescription]
  type TagList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Tag]
  type TagSpecificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TagSpecification]
  type TargetConfigurationRequestSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.TargetConfigurationRequest]
  type TargetGroups = js.Array[typingsJapgolly.awsSdk.ec2Mod.TargetGroup]
  type TargetNetworkSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.TargetNetwork]
  type TargetReservationValueSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.TargetReservationValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UP
    - typingsJapgolly.awsSdk.awsSdkStrings.DOWN
    - java.lang.String
  */
  type TelemetryStatus = typingsJapgolly.awsSdk.ec2Mod._TelemetryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.default_
    - typingsJapgolly.awsSdk.awsSdkStrings.dedicated_
    - typingsJapgolly.awsSdk.awsSdkStrings.host_
    - java.lang.String
  */
  type Tenancy = typingsJapgolly.awsSdk.ec2Mod._Tenancy | java.lang.String
  type TerminateConnectionStatusSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.TerminateConnectionStatus]
  type ThreadsPerCore = scala.Double
  type ThreadsPerCoreList = js.Array[typingsJapgolly.awsSdk.ec2Mod.ThreadsPerCore]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ingress
    - typingsJapgolly.awsSdk.awsSdkStrings.egress
    - java.lang.String
  */
  type TrafficDirection = typingsJapgolly.awsSdk.ec2Mod._TrafficDirection | java.lang.String
  type TrafficMirrorFilterId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`destination-port-range`
    - typingsJapgolly.awsSdk.awsSdkStrings.`source-port-range`
    - typingsJapgolly.awsSdk.awsSdkStrings.protocol
    - typingsJapgolly.awsSdk.awsSdkStrings.description
    - java.lang.String
  */
  type TrafficMirrorFilterRuleField = typingsJapgolly.awsSdk.ec2Mod._TrafficMirrorFilterRuleField | java.lang.String
  type TrafficMirrorFilterRuleFieldList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TrafficMirrorFilterRuleField]
  type TrafficMirrorFilterRuleId = java.lang.String
  type TrafficMirrorFilterRuleList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TrafficMirrorFilterRule]
  type TrafficMirrorFilterSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.TrafficMirrorFilter]
  type TrafficMirrorNetworkService = typingsJapgolly.awsSdk.awsSdkStrings.`amazon-dns` | java.lang.String
  type TrafficMirrorNetworkServiceList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TrafficMirrorNetworkService]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.accept__
    - typingsJapgolly.awsSdk.awsSdkStrings.reject__
    - java.lang.String
  */
  type TrafficMirrorRuleAction = typingsJapgolly.awsSdk.ec2Mod._TrafficMirrorRuleAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`packet-length`
    - typingsJapgolly.awsSdk.awsSdkStrings.description
    - typingsJapgolly.awsSdk.awsSdkStrings.`virtual-network-id`
    - java.lang.String
  */
  type TrafficMirrorSessionField = typingsJapgolly.awsSdk.ec2Mod._TrafficMirrorSessionField | java.lang.String
  type TrafficMirrorSessionFieldList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TrafficMirrorSessionField]
  type TrafficMirrorSessionId = java.lang.String
  type TrafficMirrorSessionSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.TrafficMirrorSession]
  type TrafficMirrorTargetId = java.lang.String
  type TrafficMirrorTargetSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.TrafficMirrorTarget]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`network-interface`
    - typingsJapgolly.awsSdk.awsSdkStrings.`network-load-balancer`
    - java.lang.String
  */
  type TrafficMirrorTargetType = typingsJapgolly.awsSdk.ec2Mod._TrafficMirrorTargetType | java.lang.String
  type TrafficMirroringMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPT
    - typingsJapgolly.awsSdk.awsSdkStrings.REJECT
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type TrafficType = typingsJapgolly.awsSdk.ec2Mod._TrafficType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.associating__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type TransitGatewayAssociationState = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayAssociationState | java.lang.String
  type TransitGatewayAttachmentIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type TransitGatewayAttachmentList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayAttachment]
  type TransitGatewayAttachmentPropagationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayAttachmentPropagation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.vpc_
    - typingsJapgolly.awsSdk.awsSdkStrings.vpn
    - typingsJapgolly.awsSdk.awsSdkStrings.`direct-connect-gateway`
    - typingsJapgolly.awsSdk.awsSdkStrings.`tgw-peering`
    - java.lang.String
  */
  type TransitGatewayAttachmentResourceType = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayAttachmentResourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.initiating
    - typingsJapgolly.awsSdk.awsSdkStrings.pendingAcceptance_
    - typingsJapgolly.awsSdk.awsSdkStrings.rollingBack_
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.modifying_
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.rejected__
    - typingsJapgolly.awsSdk.awsSdkStrings.rejecting_
    - typingsJapgolly.awsSdk.awsSdkStrings.failing__
    - java.lang.String
  */
  type TransitGatewayAttachmentState = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayAttachmentState | java.lang.String
  type TransitGatewayId = java.lang.String
  type TransitGatewayIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type TransitGatewayList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGateway]
  type TransitGatewayMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.associating__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociated_
    - java.lang.String
  */
  type TransitGatewayMulitcastDomainAssociationState = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayMulitcastDomainAssociationState | java.lang.String
  type TransitGatewayMulticastDomainAssociationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayMulticastDomainAssociation]
  type TransitGatewayMulticastDomainIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type TransitGatewayMulticastDomainList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayMulticastDomain]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayMulticastDomainState = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayMulticastDomainState | java.lang.String
  type TransitGatewayMulticastGroupList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayMulticastGroup]
  type TransitGatewayPeeringAttachmentList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayPeeringAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enabling__
    - typingsJapgolly.awsSdk.awsSdkStrings.enabled__
    - typingsJapgolly.awsSdk.awsSdkStrings.disabling_
    - typingsJapgolly.awsSdk.awsSdkStrings.disabled__
    - java.lang.String
  */
  type TransitGatewayPropagationState = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayPropagationState | java.lang.String
  type TransitGatewayRouteAttachmentList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayRouteAttachment]
  type TransitGatewayRouteList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayRoute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.blackhole
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayRouteState = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayRouteState | java.lang.String
  type TransitGatewayRouteTableAssociationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayRouteTableAssociation]
  type TransitGatewayRouteTableIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type TransitGatewayRouteTableList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayRouteTable]
  type TransitGatewayRouteTablePropagationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayRouteTablePropagation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayRouteTableState = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayRouteTableState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.static__
    - typingsJapgolly.awsSdk.awsSdkStrings.propagated
    - java.lang.String
  */
  type TransitGatewayRouteType = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayRouteType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.modifying_
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type TransitGatewayState = typingsJapgolly.awsSdk.ec2Mod._TransitGatewayState | java.lang.String
  type TransitGatewayVpcAttachmentList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TransitGatewayVpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.tcp_
    - typingsJapgolly.awsSdk.awsSdkStrings.udp_
    - java.lang.String
  */
  type TransportProtocol = typingsJapgolly.awsSdk.ec2Mod._TransportProtocol | java.lang.String
  type TunnelOptionsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.TunnelOption]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.t2
    - typingsJapgolly.awsSdk.awsSdkStrings.t3
    - typingsJapgolly.awsSdk.awsSdkStrings.t3a
    - java.lang.String
  */
  type UnlimitedSupportedInstanceFamily = typingsJapgolly.awsSdk.ec2Mod._UnlimitedSupportedInstanceFamily | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidInstanceIDDotMalformed
    - typingsJapgolly.awsSdk.awsSdkStrings.InvalidInstanceIDDotNotFound
    - typingsJapgolly.awsSdk.awsSdkStrings.IncorrectInstanceState
    - typingsJapgolly.awsSdk.awsSdkStrings.InstanceCreditSpecificationDotNotSupported
    - java.lang.String
  */
  type UnsuccessfulInstanceCreditSpecificationErrorCode = typingsJapgolly.awsSdk.ec2Mod._UnsuccessfulInstanceCreditSpecificationErrorCode | java.lang.String
  type UnsuccessfulInstanceCreditSpecificationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.UnsuccessfulInstanceCreditSpecificationItem]
  type UnsuccessfulItemList = js.Array[typingsJapgolly.awsSdk.ec2Mod.UnsuccessfulItem]
  type UnsuccessfulItemSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.UnsuccessfulItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.spot_
    - typingsJapgolly.awsSdk.awsSdkStrings.`on-demand`
    - java.lang.String
  */
  type UsageClassType = typingsJapgolly.awsSdk.ec2Mod._UsageClassType | java.lang.String
  type UsageClassTypeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.UsageClassType]
  type UserGroupStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type UserIdGroupPairList = js.Array[typingsJapgolly.awsSdk.ec2Mod.UserIdGroupPair]
  type UserIdGroupPairSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.UserIdGroupPair]
  type UserIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type VCpuCount = scala.Double
  type ValueStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type VersionDescription = java.lang.String
  type VersionStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type VgwTelemetryList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VgwTelemetry]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.hvm
    - typingsJapgolly.awsSdk.awsSdkStrings.paravirtual
    - java.lang.String
  */
  type VirtualizationType = typingsJapgolly.awsSdk.ec2Mod._VirtualizationType | java.lang.String
  type VolumeAttachmentList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VolumeAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.attaching_
    - typingsJapgolly.awsSdk.awsSdkStrings.attached_
    - typingsJapgolly.awsSdk.awsSdkStrings.detaching__
    - typingsJapgolly.awsSdk.awsSdkStrings.detached__
    - typingsJapgolly.awsSdk.awsSdkStrings.busy_
    - java.lang.String
  */
  type VolumeAttachmentState = typingsJapgolly.awsSdk.ec2Mod._VolumeAttachmentState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.autoEnableIO
    - typingsJapgolly.awsSdk.awsSdkStrings.productCodes
    - java.lang.String
  */
  type VolumeAttributeName = typingsJapgolly.awsSdk.ec2Mod._VolumeAttributeName | java.lang.String
  type VolumeId = java.lang.String
  type VolumeIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VolumeId]
  type VolumeList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Volume]
  type VolumeModificationList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VolumeModification]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.modifying_
    - typingsJapgolly.awsSdk.awsSdkStrings.optimizing
    - typingsJapgolly.awsSdk.awsSdkStrings.completed__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type VolumeModificationState = typingsJapgolly.awsSdk.ec2Mod._VolumeModificationState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.creating__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.`in-use`
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.error__
    - java.lang.String
  */
  type VolumeState = typingsJapgolly.awsSdk.ec2Mod._VolumeState | java.lang.String
  type VolumeStatusActionsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VolumeStatusAction]
  type VolumeStatusAttachmentStatusList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VolumeStatusAttachmentStatus]
  type VolumeStatusDetailsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VolumeStatusDetails]
  type VolumeStatusEventsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VolumeStatusEvent]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ok__
    - typingsJapgolly.awsSdk.awsSdkStrings.impaired__
    - typingsJapgolly.awsSdk.awsSdkStrings.`insufficient-data`
    - java.lang.String
  */
  type VolumeStatusInfoStatus = typingsJapgolly.awsSdk.ec2Mod._VolumeStatusInfoStatus | java.lang.String
  type VolumeStatusList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VolumeStatusItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`io-enabled`
    - typingsJapgolly.awsSdk.awsSdkStrings.`io-performance`
    - java.lang.String
  */
  type VolumeStatusName = typingsJapgolly.awsSdk.ec2Mod._VolumeStatusName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.standard__
    - typingsJapgolly.awsSdk.awsSdkStrings.io1
    - typingsJapgolly.awsSdk.awsSdkStrings.gp2
    - typingsJapgolly.awsSdk.awsSdkStrings.sc1
    - typingsJapgolly.awsSdk.awsSdkStrings.st1
    - java.lang.String
  */
  type VolumeType = typingsJapgolly.awsSdk.ec2Mod._VolumeType | java.lang.String
  type VpcAttachmentList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpcAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enableDnsSupport
    - typingsJapgolly.awsSdk.awsSdkStrings.enableDnsHostnames
    - java.lang.String
  */
  type VpcAttributeName = typingsJapgolly.awsSdk.ec2Mod._VpcAttributeName | java.lang.String
  type VpcCidrAssociationId = java.lang.String
  type VpcCidrBlockAssociationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpcCidrBlockAssociation]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.associating__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociated_
    - typingsJapgolly.awsSdk.awsSdkStrings.failing__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type VpcCidrBlockStateCode = typingsJapgolly.awsSdk.ec2Mod._VpcCidrBlockStateCode | java.lang.String
  type VpcClassicLinkIdList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type VpcClassicLinkList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpcClassicLink]
  type VpcEndpointConnectionSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpcEndpointConnection]
  type VpcEndpointId = java.lang.String
  type VpcEndpointSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpcEndpoint]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Interface
    - typingsJapgolly.awsSdk.awsSdkStrings.Gateway
    - java.lang.String
  */
  type VpcEndpointType = typingsJapgolly.awsSdk.ec2Mod._VpcEndpointType | java.lang.String
  type VpcId = java.lang.String
  type VpcIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type VpcIpv6CidrBlockAssociationSet = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpcIpv6CidrBlockAssociation]
  type VpcList = js.Array[typingsJapgolly.awsSdk.ec2Mod.Vpc]
  type VpcPeeringConnectionId = java.lang.String
  type VpcPeeringConnectionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpcPeeringConnection]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`initiating-request`
    - typingsJapgolly.awsSdk.awsSdkStrings.`pending-acceptance`
    - typingsJapgolly.awsSdk.awsSdkStrings.active__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.rejected__
    - typingsJapgolly.awsSdk.awsSdkStrings.failed__
    - typingsJapgolly.awsSdk.awsSdkStrings.expired__
    - typingsJapgolly.awsSdk.awsSdkStrings.provisioning_
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - java.lang.String
  */
  type VpcPeeringConnectionStateReasonCode = typingsJapgolly.awsSdk.ec2Mod._VpcPeeringConnectionStateReasonCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - java.lang.String
  */
  type VpcState = typingsJapgolly.awsSdk.ec2Mod._VpcState | java.lang.String
  type VpcTenancy = typingsJapgolly.awsSdk.awsSdkStrings.default_ | java.lang.String
  type VpnConnectionId = java.lang.String
  type VpnConnectionIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type VpnConnectionList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpnConnection]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.enable_
    - typingsJapgolly.awsSdk.awsSdkStrings.disable_
    - java.lang.String
  */
  type VpnEcmpSupportValue = typingsJapgolly.awsSdk.ec2Mod._VpnEcmpSupportValue | java.lang.String
  type VpnGatewayId = java.lang.String
  type VpnGatewayIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type VpnGatewayList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpnGateway]
  type VpnProtocol = typingsJapgolly.awsSdk.awsSdkStrings.openvpn | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type VpnState = typingsJapgolly.awsSdk.ec2Mod._VpnState | java.lang.String
  type VpnStaticRouteList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpnStaticRoute]
  type VpnStaticRouteSource = typingsJapgolly.awsSdk.awsSdkStrings.Static_ | java.lang.String
  type VpnTunnelOptionsSpecificationsList = js.Array[typingsJapgolly.awsSdk.ec2Mod.VpnTunnelOptionsSpecification]
  type ZoneIdStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type ZoneNameStringList = js.Array[typingsJapgolly.awsSdk.ec2Mod.String]
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.ec2Mod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-06-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2013-10-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-02-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-05-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-06-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-09-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-10-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-03-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-04-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-10-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-04-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-09-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-15`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.ec2Mod._apiVersion | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`Availability Zone`
    - typingsJapgolly.awsSdk.awsSdkStrings.Region_
    - java.lang.String
  */
  type scope = typingsJapgolly.awsSdk.ec2Mod._scope | java.lang.String
  type totalFpgaMemory = scala.Double
  type totalGpuMemory = scala.Double
}
