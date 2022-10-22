package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.DAILY
import typingsJapgolly.awsSdk.awsSdkStrings.STREAMING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessEndpointList = js.Array[AccessEndpoint]

type AccessEndpointType = STREAMING | java.lang.String

type AccountName = java.lang.String

type AccountPassword = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLIPBOARD_COPY_FROM_LOCAL_DEVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.CLIPBOARD_COPY_TO_LOCAL_DEVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_UPLOAD
  - typingsJapgolly.awsSdk.awsSdkStrings.FILE_DOWNLOAD
  - typingsJapgolly.awsSdk.awsSdkStrings.PRINTING_TO_LOCAL_DEVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_PASSWORD_SIGNIN
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_SMART_CARD_SIGNIN
  - java.lang.String
*/
type Action = _Action | java.lang.String

type AppBlocks = js.Array[AppBlock]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.ASSOCIATED
  - java.lang.String
*/
type AppVisibility = _AppVisibility | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PARAMETERS
  - typingsJapgolly.awsSdk.awsSdkStrings.WORKING_DIRECTORY
  - java.lang.String
*/
type ApplicationAttribute = _ApplicationAttribute | java.lang.String

type ApplicationAttributes = js.Array[ApplicationAttribute]

type ApplicationFleetAssociationList = js.Array[ApplicationFleetAssociation]

type Applications = js.Array[Application]

type AppstreamAgentVersion = java.lang.String

type Arn = java.lang.String

type ArnList = js.Array[Arn]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.API
  - typingsJapgolly.awsSdk.awsSdkStrings.SAML
  - typingsJapgolly.awsSdk.awsSdkStrings.USERPOOL
  - java.lang.String
*/
type AuthenticationType = _AuthenticationType | java.lang.String

type AwsAccountId = java.lang.String

type AwsAccountIdList = js.Array[AwsAccountId]

type Boolean = scala.Boolean

type BooleanObject = scala.Boolean

type DescribeImagesMaxResults = Double

type Description = java.lang.String

type DirectoryConfigList = js.Array[DirectoryConfig]

type DirectoryName = java.lang.String

type DirectoryNameList = js.Array[DirectoryName]

type DisplayName = java.lang.String

type Domain = java.lang.String

type DomainList = js.Array[Domain]

type EmbedHostDomain = java.lang.String

type EmbedHostDomains = js.Array[EmbedHostDomain]

type EntitledApplicationList = js.Array[EntitledApplication]

type EntitlementAttributeList = js.Array[EntitlementAttribute]

type EntitlementList = js.Array[Entitlement]

type FeedbackURL = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC_CONFIGURATION_SECURITY_GROUP_IDS
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_INFO
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_ROLE_ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.USB_DEVICE_FILTER_STRINGS
  - typingsJapgolly.awsSdk.awsSdkStrings.SESSION_SCRIPT_S3_LOCATION
  - java.lang.String
*/
type FleetAttribute = _FleetAttribute | java.lang.String

type FleetAttributes = js.Array[FleetAttribute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_DESCRIBE_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_CREATE_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_ENI_DELETE_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_INTERFACE_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_IS_MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.MACHINE_ROLE_IS_MISSING
  - typingsJapgolly.awsSdk.awsSdkStrings.STS_DISABLED_IN_REGION
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBNET_HAS_INSUFFICIENT_IP_ADDRESSES
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SUBNET_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.SUBNET_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.IMAGE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_SUBNET_CONFIGURATION
  - typingsJapgolly.awsSdk.awsSdkStrings.SECURITY_GROUPS_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.IGW_NOT_ATTACHED
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_SERVICE_ROLE_MISSING_DESCRIBE_SECURITY_GROUPS_ACTION
  - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.FLEET_INSTANCE_PROVISIONING_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_FILE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_LOGON_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_INVALID_PARAMETER
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_MORE_DATA
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_NO_SUCH_DOMAIN
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_NOT_SUPPORTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_INVALID_WORKGROUP_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_WORKSTATION_NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_ERROR_DS_MACHINE_ACCOUNT_QUOTA_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_NERR_PASSWORD_EXPIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.DOMAIN_JOIN_INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type FleetErrorCode = _FleetErrorCode | java.lang.String

type FleetErrors = js.Array[FleetError]

type FleetList = js.Array[Fleet]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type FleetState = _FleetState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALWAYS_ON
  - typingsJapgolly.awsSdk.awsSdkStrings.ON_DEMAND
  - typingsJapgolly.awsSdk.awsSdkStrings.ELASTIC
  - java.lang.String
*/
type FleetType = _FleetType | java.lang.String

type ImageBuilderList = js.Array[ImageBuilder]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING_AGENT
  - typingsJapgolly.awsSdk.awsSdkStrings.RUNNING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.REBOOTING
  - typingsJapgolly.awsSdk.awsSdkStrings.SNAPSHOTTING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_QUALIFICATION
  - java.lang.String
*/
type ImageBuilderState = _ImageBuilderState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.IMAGE_UNAVAILABLE
  - java.lang.String
*/
type ImageBuilderStateChangeReasonCode = _ImageBuilderStateChangeReasonCode | java.lang.String

type ImageList = js.Array[Image]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.COPYING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPORTING
  - java.lang.String
*/
type ImageState = _ImageState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.IMAGE_BUILDER_NOT_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.IMAGE_COPY_FAILURE
  - java.lang.String
*/
type ImageStateChangeReasonCode = _ImageStateChangeReasonCode | java.lang.String

type Integer = Double

type LastReportGenerationExecutionErrors = js.Array[LastReportGenerationExecutionError]

type Long = Double

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUPPRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.RESEND
  - java.lang.String
*/
type MessageAction = _MessageAction | java.lang.String

type Metadata = StringDictionary[String]

type Name = java.lang.String

type OrganizationalUnitDistinguishedName = java.lang.String

type OrganizationalUnitDistinguishedNamesList = js.Array[OrganizationalUnitDistinguishedName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type Permission = _Permission | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2016
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS_SERVER_2019
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_LINUX2
  - java.lang.String
*/
type PlatformType = _PlatformType | java.lang.String

type Platforms = js.Array[PlatformType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TCP
  - typingsJapgolly.awsSdk.awsSdkStrings.UDP
  - java.lang.String
*/
type PreferredProtocol = _PreferredProtocol | java.lang.String

type RedirectURL = java.lang.String

type RegionName = java.lang.String

type ResourceErrors = js.Array[ResourceError]

type ResourceIdentifier = java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type SecurityGroupIdList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONNECTED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONNECTED
  - java.lang.String
*/
type SessionConnectionState = _SessionConnectionState | java.lang.String

type SessionList = js.Array[Session]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type SessionState = _SessionState | java.lang.String

type SettingsGroup = java.lang.String

type SharedImagePermissionsList = js.Array[SharedImagePermissions]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_CONNECTORS
  - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_HOMEFOLDERS
  - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_GOOGLE_DRIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_ONE_DRIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.REDIRECT_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.FEEDBACK_URL
  - typingsJapgolly.awsSdk.awsSdkStrings.THEME_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_SETTINGS
  - typingsJapgolly.awsSdk.awsSdkStrings.EMBED_HOST_DOMAINS
  - typingsJapgolly.awsSdk.awsSdkStrings.IAM_ROLE_ARN
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_ENDPOINTS
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_EXPERIENCE_SETTINGS
  - java.lang.String
*/
type StackAttribute = _StackAttribute | java.lang.String

type StackAttributes = js.Array[StackAttribute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STORAGE_CONNECTOR_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type StackErrorCode = _StackErrorCode | java.lang.String

type StackErrors = js.Array[StackError]

type StackList = js.Array[Stack]

type StorageConnectorList = js.Array[StorageConnector]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HOMEFOLDERS
  - typingsJapgolly.awsSdk.awsSdkStrings.GOOGLE_DRIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ONE_DRIVE
  - java.lang.String
*/
type StorageConnectorType = _StorageConnectorType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.APP
  - typingsJapgolly.awsSdk.awsSdkStrings.DESKTOP
  - java.lang.String
*/
type StreamView = _StreamView | java.lang.String

type StreamingUrlUserId = java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type SubnetIdList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVICE_ERROR
  - java.lang.String
*/
type UsageReportExecutionErrorCode = _UsageReportExecutionErrorCode | java.lang.String

type UsageReportSchedule = DAILY | java.lang.String

type UsageReportSubscriptionList = js.Array[UsageReportSubscription]

type UsbDeviceFilterString = java.lang.String

type UsbDeviceFilterStrings = js.Array[UsbDeviceFilterString]

type UserAttributeValue = java.lang.String

type UserId = java.lang.String

type UserList = js.Array[User]

type UserSettingList = js.Array[UserSetting]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STACK_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_NAME_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.DIRECTORY_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type UserStackAssociationErrorCode = _UserStackAssociationErrorCode | java.lang.String

type UserStackAssociationErrorList = js.Array[UserStackAssociationError]

type UserStackAssociationList = js.Array[UserStackAssociation]

type Username = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - typingsJapgolly.awsSdk.awsSdkStrings.SHARED
  - java.lang.String
*/
type VisibilityType = _VisibilityType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-12-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
