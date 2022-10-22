package typingsJapgolly.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.COMPUTE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = String

type AddressLine1 = String

type AddressLine2 = String

type AddressLine3 = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SHIPPING_ADDRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.OPERATING_ADDRESS
  - java.lang.String
*/
type AddressType = _AddressType | String

type Arn = String

type AssetId = String

type AssetListDefinition = js.Array[AssetInfo]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.RETIRING
  - java.lang.String
*/
type AssetState = _AssetState | String

type AssetType = COMPUTE | String

type AvailabilityZone = String

type AvailabilityZoneId = String

type AvailabilityZoneIdList = js.Array[AvailabilityZoneId]

type AvailabilityZoneList = js.Array[AvailabilityZone]

type CIDR = String

type CIDRList = js.Array[CIDR]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RACK
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER
  - java.lang.String
*/
type CatalogItemClass = _CatalogItemClass | String

type CatalogItemClassList = js.Array[CatalogItemClass]

type CatalogItemListDefinition = js.Array[CatalogItem]

type CatalogItemPowerKva = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DISCONTINUED
  - java.lang.String
*/
type CatalogItemStatus = _CatalogItemStatus | String

type CatalogItemWeightLbs = Double

type City = String

type CityList = js.Array[City]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ISOLATED
  - typingsJapgolly.awsSdk.awsSdkStrings.RETIRING
  - java.lang.String
*/
type ComputeAssetState = _ComputeAssetState | String

type ConnectionId = String

type ContactName = String

type ContactPhoneNumber = String

type CountryCode = String

type CountryCodeList = js.Array[CountryCode]

type DeviceSerialNumber = String

type DistrictOrCounty = String

type EC2CapacityListDefinition = js.Array[EC2Capacity]

type EC2FamilyList = js.Array[Family]

type Family = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_MODE
  - typingsJapgolly.awsSdk.awsSdkStrings.MULTI_MODE
  - java.lang.String
*/
type FiberOpticCableType = _FiberOpticCableType | String

type HostId = String

type HostIdList = js.Array[HostId]

type ISO8601Timestamp = js.Date

type InstanceType = String

type InstanceTypeListDefinition = js.Array[InstanceTypeItem]

type LifeCycleStatus = String

type LifeCycleStatusList = js.Array[LifeCycleStatus]

type LineItemAssetInformationList = js.Array[LineItemAssetInformation]

type LineItemId = String

type LineItemListDefinition = js.Array[LineItem]

type LineItemQuantity = Double

type LineItemRequestListDefinition = js.Array[LineItemRequest]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
  - typingsJapgolly.awsSdk.awsSdkStrings.BUILDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SHIPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELIVERED
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLING
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type LineItemStatus = _LineItemStatus | String

type LineItemStatusCounts = StringDictionary[LineItemQuantity]

type MacAddress = String

type MacAddressList = js.Array[MacAddress]

type MaxResults1000 = Double

type MaxSize = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_LIMIT
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_1400_LBS
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_1600_LBS
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_1800_LBS
  - typingsJapgolly.awsSdk.awsSdkStrings.MAX_2000_LBS
  - java.lang.String
*/
type MaximumSupportedWeightLbs = _MaximumSupportedWeightLbs | String

type Municipality = String

type NetworkInterfaceDeviceIndex = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_10GBASE_SR
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_10GBASE_IR
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_10GBASE_LR
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_40GBASE_SR
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_40GBASE_ESR
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_40GBASE_IR4_LR4L
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_40GBASE_LR4
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_100GBASE_SR4
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_100GBASE_CWDM4
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_100GBASE_LR4
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_100G_PSM4_MSA
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_1000BASE_LX
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIC_1000BASE_SX
  - java.lang.String
*/
type OpticalStandard = _OpticalStandard | String

type OrderId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RECEIVED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
  - typingsJapgolly.awsSdk.awsSdkStrings.INSTALLING
  - typingsJapgolly.awsSdk.awsSdkStrings.FULFILLED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type OrderStatus = _OrderStatus | String

type OrderSummaryListDefinition = js.Array[OrderSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OUTPOST
  - typingsJapgolly.awsSdk.awsSdkStrings.REPLACEMENT
  - java.lang.String
*/
type OrderType = _OrderType | String

type OutpostArn = String

type OutpostDescription = String

type OutpostId = String

type OutpostIdOnly = String

type OutpostIdentifier = String

type OutpostName = String

type OwnerId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL_UPFRONT
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_UPFRONT
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTIAL_UPFRONT
  - java.lang.String
*/
type PaymentOption = _PaymentOption | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.THREE_YEARS
  - typingsJapgolly.awsSdk.awsSdkStrings.ONE_YEAR
  - java.lang.String
*/
type PaymentTerm = _PaymentTerm | String

type PostalCode = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.L6_30P
  - typingsJapgolly.awsSdk.awsSdkStrings.IEC309
  - typingsJapgolly.awsSdk.awsSdkStrings.AH530P7W
  - typingsJapgolly.awsSdk.awsSdkStrings.AH532P6W
  - java.lang.String
*/
type PowerConnector = _PowerConnector | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.POWER_5_KVA
  - typingsJapgolly.awsSdk.awsSdkStrings.POWER_10_KVA
  - typingsJapgolly.awsSdk.awsSdkStrings.POWER_15_KVA
  - java.lang.String
*/
type PowerDrawKva = _PowerDrawKva | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ABOVE_RACK
  - typingsJapgolly.awsSdk.awsSdkStrings.BELOW_RACK
  - java.lang.String
*/
type PowerFeedDrop = _PowerFeedDrop | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SINGLE_PHASE
  - typingsJapgolly.awsSdk.awsSdkStrings.THREE_PHASE
  - java.lang.String
*/
type PowerPhase = _PowerPhase | String

type Quantity = String

type RackElevation = Double

type RackId = String

type ServerEndpoint = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DHL
  - typingsJapgolly.awsSdk.awsSdkStrings.DBS
  - typingsJapgolly.awsSdk.awsSdkStrings.FEDEX
  - typingsJapgolly.awsSdk.awsSdkStrings.UPS
  - java.lang.String
*/
type ShipmentCarrier = _ShipmentCarrier | String

type SiteArn = String

type SiteDescription = String

type SiteId = String

type SiteName = String

type SiteNotes = String

type SkuCode = String

type StateOrRegion = String

type StateOrRegionList = js.Array[StateOrRegion]

type StatusList = js.Array[AssetState]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RACK
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER
  - java.lang.String
*/
type SupportedHardwareType = _SupportedHardwareType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EBS
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - java.lang.String
*/
type SupportedStorageEnum = _SupportedStorageEnum | String

type SupportedStorageList = js.Array[SupportedStorageEnum]

type SupportedUplinkGbps = Double

type SupportedUplinkGbpsListDefinition = js.Array[SupportedUplinkGbps]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type Token = String

type TrackingId = String

type UnderlayIpAddress = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_1
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_2
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_3
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_4
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_5
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_6
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_7
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_8
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_12
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_COUNT_16
  - java.lang.String
*/
type UplinkCount = _UplinkCount | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_1G
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_10G
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_40G
  - typingsJapgolly.awsSdk.awsSdkStrings.UPLINK_100G
  - java.lang.String
*/
type UplinkGbps = _UplinkGbps | String

type WireGuardPublicKey = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2019-12-03`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type outpostListDefinition = js.Array[Outpost]

type siteListDefinition = js.Array[Site]
