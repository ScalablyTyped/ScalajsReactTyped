package typingsJapgolly.awsSdk.clientsIotwirelessMod

import typingsJapgolly.awsSdk.awsSdkStrings.GNSS
import typingsJapgolly.awsSdk.awsSdkStrings.LoRaWAN
import typingsJapgolly.awsSdk.awsSdkStrings.Semtech
import typingsJapgolly.awsSdk.awsSdkStrings.Sidewalk
import typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountLinked = Boolean

type AckModeRetryDurationSecs = scala.Double

type AddGwMetadata = Boolean

type AmazonId = String

type AmazonResourceName = String

type AppEui = String

type AppKey = String

type AppSKey = String

type AppServerPrivateKey = String

type AutoCreateTasks = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.normal_
  - typingsJapgolly.awsSdk.awsSdkStrings.low__
  - typingsJapgolly.awsSdk.awsSdkStrings.critical__
  - java.lang.String
*/
type BatteryLevel = _BatteryLevel | String

type BeaconingDataRate = scala.Double

type BeaconingFrequencies = js.Array[BeaconingFrequency]

type BeaconingFrequency = scala.Double

type CertificatePEM = String

type CertificateValue = String

type ChannelMask = String

type ClassBTimeout = scala.Double

type ClassCTimeout = scala.Double

type ClientRequestToken = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Connected_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disconnected_
  - java.lang.String
*/
type ConnectionStatus = _ConnectionStatus | String

type Crc = scala.Double

type CreatedAt = js.Date

type Description = String

type DestinationArn = String

type DestinationList = js.Array[Destinations]

type DestinationName = String

type DevAddr = String

type DevEui = String

type DevStatusReqFreq = scala.Double

type DeviceCertificateList = js.Array[CertificateList]

type DeviceProfileArn = String

type DeviceProfileId = String

type DeviceProfileList = js.Array[DeviceProfile]

type DeviceProfileName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Provisioned_
  - typingsJapgolly.awsSdk.awsSdkStrings.RegisteredNotSeen
  - typingsJapgolly.awsSdk.awsSdkStrings.RegisteredReachable
  - typingsJapgolly.awsSdk.awsSdkStrings.RegisteredUnreachable
  - java.lang.String
*/
type DeviceState = _DeviceState | String

type DlBucketSize = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ClassB
  - typingsJapgolly.awsSdk.awsSdkStrings.ClassC
  - java.lang.String
*/
type DlClass = _DlClass | String

type DlDr = scala.Double

type DlFreq = scala.Double

type DlRate = scala.Double

type DlRatePolicy = String

type Double = scala.Double

type DownlinkFrequency = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SEQUENTIAL
  - typingsJapgolly.awsSdk.awsSdkStrings.CONCURRENT
  - typingsJapgolly.awsSdk.awsSdkStrings.USING_UPLINK_GATEWAY
  - java.lang.String
*/
type DownlinkMode = _DownlinkMode | String

type DownlinkQueueMessagesList = js.Array[DownlinkQueueMessage]

type DrMax = scala.Double

type DrMaxBox = scala.Double

type DrMin = scala.Double

type DrMinBox = scala.Double

type EndPoint = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.discovered_
  - typingsJapgolly.awsSdk.awsSdkStrings.lost
  - typingsJapgolly.awsSdk.awsSdkStrings.ack_
  - typingsJapgolly.awsSdk.awsSdkStrings.nack
  - typingsJapgolly.awsSdk.awsSdkStrings.passthrough___
  - java.lang.String
*/
type Event = _Event | String

type EventConfigurationsList = js.Array[EventConfigurationItem]

type EventNotificationPartnerType = Sidewalk | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SidewalkAccount
  - typingsJapgolly.awsSdk.awsSdkStrings.WirelessDevice
  - typingsJapgolly.awsSdk.awsSdkStrings.WirelessGateway
  - java.lang.String
*/
type EventNotificationResourceType = _EventNotificationResourceType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type EventNotificationTopicStatus = _EventNotificationTopicStatus | String

type Expression = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RuleName
  - typingsJapgolly.awsSdk.awsSdkStrings.MqttTopic
  - java.lang.String
*/
type ExpressionType = _ExpressionType | String

type FCntStart = scala.Double

type FNwkSIntKey = String

type FPort = scala.Double

type FactoryPresetFreqsList = js.Array[PresetFreq]

type Fingerprint = String

type FirmwareUpdateImage = String

type FirmwareUpdateRole = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Initial_
  - typingsJapgolly.awsSdk.awsSdkStrings.Package_Not_Supported
  - typingsJapgolly.awsSdk.awsSdkStrings.FragAlgo_unsupported
  - typingsJapgolly.awsSdk.awsSdkStrings.Not_enough_memory
  - typingsJapgolly.awsSdk.awsSdkStrings.FragIndex_unsupported
  - typingsJapgolly.awsSdk.awsSdkStrings.Wrong_descriptor
  - typingsJapgolly.awsSdk.awsSdkStrings.SessionCnt_replay
  - typingsJapgolly.awsSdk.awsSdkStrings.MissingFrag
  - typingsJapgolly.awsSdk.awsSdkStrings.MemoryError
  - typingsJapgolly.awsSdk.awsSdkStrings.MICError
  - typingsJapgolly.awsSdk.awsSdkStrings.Successful_
  - java.lang.String
*/
type FuotaDeviceStatus = _FuotaDeviceStatus | String

type FuotaTaskArn = String

type FuotaTaskId = String

type FuotaTaskList = js.Array[FuotaTask]

type FuotaTaskName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
  - typingsJapgolly.awsSdk.awsSdkStrings.FuotaSession_Waiting
  - typingsJapgolly.awsSdk.awsSdkStrings.In_FuotaSession
  - typingsJapgolly.awsSdk.awsSdkStrings.FuotaDone
  - typingsJapgolly.awsSdk.awsSdkStrings.Delete_Waiting
  - java.lang.String
*/
type FuotaTaskStatus = _FuotaTaskStatus | String

type GatewayEui = String

type GatewayList = js.Array[GatewayListItem]

type GenAppKey = String

type HorizontalAccuracy = scala.Double

type HrAllowed = Boolean

type ISODateTimeString = String

type Identifier = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PartnerAccountId
  - typingsJapgolly.awsSdk.awsSdkStrings.DevEui
  - typingsJapgolly.awsSdk.awsSdkStrings.GatewayEui
  - typingsJapgolly.awsSdk.awsSdkStrings.WirelessDeviceId
  - typingsJapgolly.awsSdk.awsSdkStrings.WirelessGatewayId
  - java.lang.String
*/
type IdentifierType = _IdentifierType | String

type Integer = scala.Double

type IotCertificateId = String

type JoinEui = String

type JoinEuiFilters = js.Array[JoinEuiRange]

type JoinEuiRange = js.Array[JoinEui]

type LoRaWANGatewayMetadataList = js.Array[LoRaWANGatewayMetadata]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INFO
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type LogLevel = _LogLevel | String

type MacVersion = String

type MaxDutyCycle = scala.Double

type MaxEirp = scala.Double

type MaxResults = scala.Double

type McGroupId = scala.Double

type MessageId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_NOTIFY
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_GET
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_SET
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_COMMAND_ID_RESP
  - java.lang.String
*/
type MessageType = _MessageType | String

type MinGwDiversity = scala.Double

type Model = String

type MulticastDeviceStatus = String

type MulticastGroupArn = String

type MulticastGroupId = String

type MulticastGroupList = js.Array[MulticastGroup]

type MulticastGroupListByFuotaTask = js.Array[MulticastGroupByFuotaTask]

type MulticastGroupMessageId = String

type MulticastGroupName = String

type MulticastGroupStatus = String

type NetId = String

type NetIdFilters = js.Array[NetId]

type NetworkAnalyzerConfigurationArn = String

type NetworkAnalyzerConfigurationList = js.Array[NetworkAnalyzerConfigurations]

type NetworkAnalyzerConfigurationName = String

type NextToken = String

type NumberOfDevicesInGroup = scala.Double

type NumberOfDevicesRequested = scala.Double

type NwkGeoLoc = Boolean

type NwkKey = String

type NwkSEncKey = String

type NwkSKey = String

type PackageVersion = String

type PartnerAccountArn = String

type PartnerAccountId = String

type PartnerType = Sidewalk | String

type PayloadData = String

type PingSlotDr = scala.Double

type PingSlotFreq = scala.Double

type PingSlotPeriod = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ROSE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type PositionConfigurationFec = _PositionConfigurationFec | String

type PositionConfigurationList = js.Array[PositionConfigurationItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type PositionConfigurationStatus = _PositionConfigurationStatus | String

type PositionCoordinate = js.Array[PositionCoordinateValue]

type PositionCoordinateValue = scala.Double

type PositionResourceIdentifier = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WirelessDevice
  - typingsJapgolly.awsSdk.awsSdkStrings.WirelessGateway
  - java.lang.String
*/
type PositionResourceType = _PositionResourceType | String

type PositionSolverProvider = Semtech | String

type PositionSolverType = GNSS | String

type PositionSolverVersion = String

type PrAllowed = Boolean

type PresetFreq = scala.Double

type QueryString = String

type RaAllowed = Boolean

type RegParamsRevision = String

type ReportDevStatusBattery = Boolean

type ReportDevStatusMargin = Boolean

type ResourceIdentifier = String

type ResourceType = String

type Result = String

type RfRegion = String

type RoleArn = String

type RxDataRate2 = scala.Double

type RxDelay1 = scala.Double

type RxDrOffset1 = scala.Double

type RxFreq2 = scala.Double

type SNwkSIntKey = String

type Seq = scala.Double

type ServiceProfileArn = String

type ServiceProfileId = String

type ServiceProfileList = js.Array[ServiceProfile]

type ServiceProfileName = String

type SessionStartTimeTimestamp = js.Date

type SessionTimeout = scala.Double

type SidewalkAccountList = js.Array[SidewalkAccountInfoWithFingerprint]

type SidewalkId = String

type SidewalkManufacturingSn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Ed25519
  - typingsJapgolly.awsSdk.awsSdkStrings.P256r1
  - java.lang.String
*/
type SigningAlg = _SigningAlg | String

type StartTime = js.Date

type Station = String

type SubBand = scala.Double

type SubBands = js.Array[SubBand]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EU868
  - typingsJapgolly.awsSdk.awsSdkStrings.US915
  - typingsJapgolly.awsSdk.awsSdkStrings.AU915
  - typingsJapgolly.awsSdk.awsSdkStrings.`AS923-1`
  - java.lang.String
*/
type SupportedRfRegion = _SupportedRfRegion | String

type Supports32BitFCnt = Boolean

type SupportsClassB = Boolean

type SupportsClassC = Boolean

type SupportsJoin = Boolean

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TargetPer = scala.Double

type ThingArn = String

type ThingName = String

type TransmissionInterval = scala.Double

type TransmitMode = scala.Double

type UlBucketSize = scala.Double

type UlRate = scala.Double

type UlRatePolicy = String

type UpdateDataSource = String

type UpdateSignature = String

type VerticalAccuracy = scala.Double

type WirelessDeviceArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Join
  - typingsJapgolly.awsSdk.awsSdkStrings.Rejoin
  - typingsJapgolly.awsSdk.awsSdkStrings.Uplink_Data
  - typingsJapgolly.awsSdk.awsSdkStrings.Downlink_Data
  - typingsJapgolly.awsSdk.awsSdkStrings.Registration
  - java.lang.String
*/
type WirelessDeviceEvent = _WirelessDeviceEvent | String

type WirelessDeviceEventLogOptionList = js.Array[WirelessDeviceEventLogOption]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type WirelessDeviceFrameInfo = _WirelessDeviceFrameInfo | String

type WirelessDeviceId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WirelessDeviceId
  - typingsJapgolly.awsSdk.awsSdkStrings.DevEui
  - typingsJapgolly.awsSdk.awsSdkStrings.ThingName
  - typingsJapgolly.awsSdk.awsSdkStrings.SidewalkManufacturingSn
  - java.lang.String
*/
type WirelessDeviceIdType = _WirelessDeviceIdType | String

type WirelessDeviceList = js.Array[WirelessDeviceId]

type WirelessDeviceLogOptionList = js.Array[WirelessDeviceLogOption]

type WirelessDeviceName = String

type WirelessDeviceStatisticsList = js.Array[WirelessDeviceStatistics]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Sidewalk
  - typingsJapgolly.awsSdk.awsSdkStrings.LoRaWAN
  - java.lang.String
*/
type WirelessDeviceType = _WirelessDeviceType | String

type WirelessGatewayArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CUPS_Request
  - typingsJapgolly.awsSdk.awsSdkStrings.Certificate_
  - java.lang.String
*/
type WirelessGatewayEvent = _WirelessGatewayEvent | String

type WirelessGatewayEventLogOptionList = js.Array[WirelessGatewayEventLogOption]

type WirelessGatewayId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.GatewayEui
  - typingsJapgolly.awsSdk.awsSdkStrings.WirelessGatewayId
  - typingsJapgolly.awsSdk.awsSdkStrings.ThingName
  - java.lang.String
*/
type WirelessGatewayIdType = _WirelessGatewayIdType | String

type WirelessGatewayList = js.Array[WirelessGatewayId]

type WirelessGatewayLogOptionList = js.Array[WirelessGatewayLogOption]

type WirelessGatewayName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CUPS
  - typingsJapgolly.awsSdk.awsSdkStrings.LNS
  - java.lang.String
*/
type WirelessGatewayServiceType = _WirelessGatewayServiceType | String

type WirelessGatewayStatisticsList = js.Array[WirelessGatewayStatistics]

type WirelessGatewayTaskDefinitionArn = String

type WirelessGatewayTaskDefinitionId = String

type WirelessGatewayTaskDefinitionList = js.Array[UpdateWirelessGatewayTaskEntry]

type WirelessGatewayTaskDefinitionType = UPDATE | String

type WirelessGatewayTaskName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FIRST_RETRY
  - typingsJapgolly.awsSdk.awsSdkStrings.SECOND_RETRY
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type WirelessGatewayTaskStatus = _WirelessGatewayTaskStatus | String

type WirelessGatewayType = LoRaWAN | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-11-22`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
