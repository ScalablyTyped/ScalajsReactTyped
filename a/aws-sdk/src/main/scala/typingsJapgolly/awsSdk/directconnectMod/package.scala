package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object directconnectMod {
  type ASN = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ipv4_
    - typingsJapgolly.awsSdk.awsSdkStrings.ipv6_
    - java.lang.String
  */
  type AddressFamily = typingsJapgolly.awsSdk.directconnectMod._AddressFamily | java.lang.String
  type AmazonAddress = java.lang.String
  type AssociatedGatewayId = java.lang.String
  type AvailablePortSpeeds = js.Array[typingsJapgolly.awsSdk.directconnectMod.PortSpeed]
  type AwsDevice = java.lang.String
  type AwsDeviceV2 = java.lang.String
  type BGPAuthKey = java.lang.String
  type BGPPeerId = java.lang.String
  type BGPPeerList = js.Array[typingsJapgolly.awsSdk.directconnectMod.BGPPeer]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.verifying__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type BGPPeerState = typingsJapgolly.awsSdk.directconnectMod._BGPPeerState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.up_
    - typingsJapgolly.awsSdk.awsSdkStrings.down_
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type BGPStatus = typingsJapgolly.awsSdk.directconnectMod._BGPStatus | java.lang.String
  type Bandwidth = java.lang.String
  type BooleanFlag = scala.Boolean
  type CIDR = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.directconnectMod.ClientApiVersions
  type ConnectionId = java.lang.String
  type ConnectionList = js.Array[typingsJapgolly.awsSdk.directconnectMod.Connection]
  type ConnectionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ordering
    - typingsJapgolly.awsSdk.awsSdkStrings.requested__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.down_
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.rejected__
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type ConnectionState = typingsJapgolly.awsSdk.directconnectMod._ConnectionState | java.lang.String
  type Count = scala.Double
  type CustomerAddress = java.lang.String
  type DirectConnectGatewayAssociationId = java.lang.String
  type DirectConnectGatewayAssociationList = js.Array[typingsJapgolly.awsSdk.directconnectMod.DirectConnectGatewayAssociation]
  type DirectConnectGatewayAssociationProposalId = java.lang.String
  type DirectConnectGatewayAssociationProposalList = js.Array[typingsJapgolly.awsSdk.directconnectMod.DirectConnectGatewayAssociationProposal]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.requested__
    - typingsJapgolly.awsSdk.awsSdkStrings.accepted__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type DirectConnectGatewayAssociationProposalState = typingsJapgolly.awsSdk.directconnectMod._DirectConnectGatewayAssociationProposalState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.associating__
    - typingsJapgolly.awsSdk.awsSdkStrings.associated__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
    - typingsJapgolly.awsSdk.awsSdkStrings.disassociated_
    - typingsJapgolly.awsSdk.awsSdkStrings.updating__
    - java.lang.String
  */
  type DirectConnectGatewayAssociationState = typingsJapgolly.awsSdk.directconnectMod._DirectConnectGatewayAssociationState | java.lang.String
  type DirectConnectGatewayAttachmentList = js.Array[typingsJapgolly.awsSdk.directconnectMod.DirectConnectGatewayAttachment]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.attaching_
    - typingsJapgolly.awsSdk.awsSdkStrings.attached_
    - typingsJapgolly.awsSdk.awsSdkStrings.detaching__
    - typingsJapgolly.awsSdk.awsSdkStrings.detached__
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentState = typingsJapgolly.awsSdk.directconnectMod._DirectConnectGatewayAttachmentState | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TransitVirtualInterface
    - typingsJapgolly.awsSdk.awsSdkStrings.PrivateVirtualInterface
    - java.lang.String
  */
  type DirectConnectGatewayAttachmentType = typingsJapgolly.awsSdk.directconnectMod._DirectConnectGatewayAttachmentType | java.lang.String
  type DirectConnectGatewayId = java.lang.String
  type DirectConnectGatewayList = js.Array[typingsJapgolly.awsSdk.directconnectMod.DirectConnectGateway]
  type DirectConnectGatewayName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - java.lang.String
  */
  type DirectConnectGatewayState = typingsJapgolly.awsSdk.directconnectMod._DirectConnectGatewayState | java.lang.String
  type GatewayIdToAssociate = java.lang.String
  type GatewayIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.virtualPrivateGateway
    - typingsJapgolly.awsSdk.awsSdkStrings.transitGateway
    - java.lang.String
  */
  type GatewayType = typingsJapgolly.awsSdk.directconnectMod._GatewayType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - typingsJapgolly.awsSdk.awsSdkStrings.yes_
    - typingsJapgolly.awsSdk.awsSdkStrings.no_
    - java.lang.String
  */
  type HasLogicalRedundancy = typingsJapgolly.awsSdk.directconnectMod._HasLogicalRedundancy | java.lang.String
  type InterconnectId = java.lang.String
  type InterconnectList = js.Array[typingsJapgolly.awsSdk.directconnectMod.Interconnect]
  type InterconnectName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.requested__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.down_
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type InterconnectState = typingsJapgolly.awsSdk.directconnectMod._InterconnectState | java.lang.String
  type JumboFrameCapable = scala.Boolean
  type LagId = java.lang.String
  type LagList = js.Array[typingsJapgolly.awsSdk.directconnectMod.Lag]
  type LagName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.requested__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.down_
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type LagState = typingsJapgolly.awsSdk.directconnectMod._LagState | java.lang.String
  type LoaContent = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.directconnectMod.Blob | java.lang.String
  type LoaContentType = typingsJapgolly.awsSdk.awsSdkStrings.applicationSlashpdf | java.lang.String
  type LoaIssueTime = js.Date
  type LocationCode = java.lang.String
  type LocationList = js.Array[typingsJapgolly.awsSdk.directconnectMod.Location]
  type LocationName = java.lang.String
  type LongAsn = scala.Double
  type MTU = scala.Double
  type MaxResultSetSize = scala.Double
  type OwnerAccount = java.lang.String
  type PaginationToken = java.lang.String
  type PartnerName = java.lang.String
  type PortSpeed = java.lang.String
  type ProviderList = js.Array[typingsJapgolly.awsSdk.directconnectMod.ProviderName]
  type ProviderName = java.lang.String
  type Region = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceArnList = js.Array[typingsJapgolly.awsSdk.directconnectMod.ResourceArn]
  type ResourceTagList = js.Array[typingsJapgolly.awsSdk.directconnectMod.ResourceTag]
  type RouteFilterPrefixList = js.Array[typingsJapgolly.awsSdk.directconnectMod.RouteFilterPrefix]
  type RouterConfig = java.lang.String
  type StateChangeError = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.directconnectMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.directconnectMod.Tag]
  type TagValue = java.lang.String
  type VLAN = scala.Double
  type VirtualGatewayId = java.lang.String
  type VirtualGatewayList = js.Array[typingsJapgolly.awsSdk.directconnectMod.VirtualGateway]
  type VirtualGatewayRegion = java.lang.String
  type VirtualGatewayState = java.lang.String
  type VirtualInterfaceId = java.lang.String
  type VirtualInterfaceList = js.Array[typingsJapgolly.awsSdk.directconnectMod.VirtualInterface]
  type VirtualInterfaceName = java.lang.String
  type VirtualInterfaceRegion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.confirming
    - typingsJapgolly.awsSdk.awsSdkStrings.verifying__
    - typingsJapgolly.awsSdk.awsSdkStrings.pending__
    - typingsJapgolly.awsSdk.awsSdkStrings.available__
    - typingsJapgolly.awsSdk.awsSdkStrings.down_
    - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
    - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
    - typingsJapgolly.awsSdk.awsSdkStrings.rejected__
    - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
    - java.lang.String
  */
  type VirtualInterfaceState = typingsJapgolly.awsSdk.directconnectMod._VirtualInterfaceState | java.lang.String
  type VirtualInterfaceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-10-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.directconnectMod._apiVersion | java.lang.String
}
