package typingsJapgolly.awsSdk.clientsDirectconnectMod

import typingsJapgolly.awsSdk.awsSdkStrings.applicationSlashpdf
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ASN = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ipv4__
  - typingsJapgolly.awsSdk.awsSdkStrings.ipv6__
  - java.lang.String
*/
type AddressFamily = _AddressFamily | String

type AgreementList = js.Array[CustomerAgreement]

type AgreementName = String

type AmazonAddress = String

type AssociatedGatewayId = String

type AvailableMacSecPortSpeeds = js.Array[PortSpeed]

type AvailablePortSpeeds = js.Array[PortSpeed]

type AwsDevice = String

type AwsDeviceV2 = String

type AwsLogicalDeviceId = String

type BGPAuthKey = String

type BGPPeerId = String

type BGPPeerIdList = js.Array[BGPPeerId]

type BGPPeerList = js.Array[BGPPeer]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.verifying__
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.available__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type BGPPeerState = _BGPPeerState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.up_
  - typingsJapgolly.awsSdk.awsSdkStrings.down_
  - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
  - java.lang.String
*/
type BGPStatus = _BGPStatus | String

type Bandwidth = String

type BooleanFlag = Boolean

type CIDR = String

type Cak = String

type Ckn = String

type ConnectionId = String

type ConnectionList = js.Array[Connection]

type ConnectionName = String

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
type ConnectionState = _ConnectionState | String

type Count = Double

type CustomerAddress = String

type DirectConnectGatewayAssociationId = String

type DirectConnectGatewayAssociationList = js.Array[DirectConnectGatewayAssociation]

type DirectConnectGatewayAssociationProposalId = String

type DirectConnectGatewayAssociationProposalList = js.Array[DirectConnectGatewayAssociationProposal]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.requested__
  - typingsJapgolly.awsSdk.awsSdkStrings.accepted__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type DirectConnectGatewayAssociationProposalState = _DirectConnectGatewayAssociationProposalState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.associating__
  - typingsJapgolly.awsSdk.awsSdkStrings.associated__
  - typingsJapgolly.awsSdk.awsSdkStrings.disassociating__
  - typingsJapgolly.awsSdk.awsSdkStrings.disassociated__
  - typingsJapgolly.awsSdk.awsSdkStrings.updating__
  - java.lang.String
*/
type DirectConnectGatewayAssociationState = _DirectConnectGatewayAssociationState | String

type DirectConnectGatewayAttachmentList = js.Array[DirectConnectGatewayAttachment]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.attaching_
  - typingsJapgolly.awsSdk.awsSdkStrings.attached_
  - typingsJapgolly.awsSdk.awsSdkStrings.detaching__
  - typingsJapgolly.awsSdk.awsSdkStrings.detached__
  - java.lang.String
*/
type DirectConnectGatewayAttachmentState = _DirectConnectGatewayAttachmentState | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TransitVirtualInterface
  - typingsJapgolly.awsSdk.awsSdkStrings.PrivateVirtualInterface
  - java.lang.String
*/
type DirectConnectGatewayAttachmentType = _DirectConnectGatewayAttachmentType | String

type DirectConnectGatewayId = String

type DirectConnectGatewayList = js.Array[DirectConnectGateway]

type DirectConnectGatewayName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.pending__
  - typingsJapgolly.awsSdk.awsSdkStrings.available__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleting__
  - typingsJapgolly.awsSdk.awsSdkStrings.deleted__
  - java.lang.String
*/
type DirectConnectGatewayState = _DirectConnectGatewayState | String

type EnableSiteLink = Boolean

type EncryptionMode = String

type EndTime = js.Date

type FailureTestHistoryStatus = String

type GatewayIdToAssociate = String

type GatewayIdentifier = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.virtualPrivateGateway
  - typingsJapgolly.awsSdk.awsSdkStrings.transitGateway_
  - java.lang.String
*/
type GatewayType = _GatewayType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.unknown__
  - typingsJapgolly.awsSdk.awsSdkStrings.yes_
  - typingsJapgolly.awsSdk.awsSdkStrings.no_
  - java.lang.String
*/
type HasLogicalRedundancy = _HasLogicalRedundancy | String

type InterconnectId = String

type InterconnectList = js.Array[Interconnect]

type InterconnectName = String

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
type InterconnectState = _InterconnectState | String

type JumboFrameCapable = Boolean

type LagId = String

type LagList = js.Array[Lag]

type LagName = String

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
type LagState = _LagState | String

type LoaContent = Buffer | js.typedarray.Uint8Array | Blob | String

type LoaContentType = applicationSlashpdf | String

type LoaIssueTime = js.Date

type LocationCode = String

type LocationList = js.Array[Location]

type LocationName = String

type LongAsn = Double

type MTU = Double

type MacSecCapable = Boolean

type MacSecKeyList = js.Array[MacSecKey]

type MaxResultSetSize = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.v1_
  - typingsJapgolly.awsSdk.awsSdkStrings.v2_
  - typingsJapgolly.awsSdk.awsSdkStrings.nonPartner
  - java.lang.String
*/
type NniPartnerType = _NniPartnerType | String

type OwnerAccount = String

type PaginationToken = String

type PartnerName = String

type Platform = String

type PortEncryptionStatus = String

type PortSpeed = String

type ProviderList = js.Array[ProviderName]

type ProviderName = String

type Region = String

type RequestMACSec = Boolean

type ResourceArn = String

type ResourceArnList = js.Array[ResourceArn]

type ResourceTagList = js.Array[ResourceTag]

type RouteFilterPrefixList = js.Array[RouteFilterPrefix]

type RouterConfig = String

type RouterTypeIdentifier = String

type SecretARN = String

type SiteLinkEnabled = Boolean

type Software = String

type StartOnDate = String

type StartTime = js.Date

type State = String

type StateChangeError = String

type Status = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TestDuration = Double

type TestId = String

type VLAN = Double

type Vendor = String

type VirtualGatewayId = String

type VirtualGatewayList = js.Array[VirtualGateway]

type VirtualGatewayRegion = String

type VirtualGatewayState = String

type VirtualInterfaceId = String

type VirtualInterfaceList = js.Array[VirtualInterface]

type VirtualInterfaceName = String

type VirtualInterfaceRegion = String

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
type VirtualInterfaceState = _VirtualInterfaceState | String

type VirtualInterfaceTestHistoryList = js.Array[VirtualInterfaceTestHistory]

type VirtualInterfaceType = String

type XsltTemplateName = String

type XsltTemplateNameForMacSec = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2012-10-25`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
