package typingsJapgolly.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.ADMINISTRATOR
import typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_KEY
import typingsJapgolly.awsSdk.awsSdkStrings.UPLOAD
import typingsJapgolly.awsSdk.awsSdkStrings.USER
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ActiveDirectoryComputerAttributeList = js.Array[ActiveDirectoryComputerAttribute]

type ActiveDirectoryComputerAttributeName = java.lang.String

type ActiveDirectoryComputerAttributeValue = java.lang.String

type ActiveDirectoryDnsIpAddress = java.lang.String

type ActiveDirectoryDnsIpAddressList = js.Array[ActiveDirectoryDnsIpAddress]

type ActiveDirectoryOrganizationalUnitDistinguishedName = java.lang.String

type ClientToken = java.lang.String

type DirectoryId = java.lang.String

type EC2ImageId = java.lang.String

type EC2SubnetId = java.lang.String

type EC2SubnetIdList = js.Array[EC2SubnetId]

type EulaAcceptanceId = java.lang.String

type EulaAcceptanceList = js.Array[EulaAcceptance]

type EulaId = java.lang.String

type EulaIdList = js.Array[String]

type EulaList = js.Array[Eula]

type EulaName = java.lang.String

type LaunchProfileDescription = java.lang.String

type LaunchProfileId = java.lang.String

type LaunchProfileInitializationScriptList = js.Array[LaunchProfileInitializationScript]

type LaunchProfileList = js.Array[LaunchProfile]

type LaunchProfileMembershipList = js.Array[LaunchProfileMembership]

type LaunchProfileName = java.lang.String

type LaunchProfilePersona = USER | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LINUX
  - typingsJapgolly.awsSdk.awsSdkStrings.WINDOWS
  - java.lang.String
*/
type LaunchProfilePlatform = _LaunchProfilePlatform | java.lang.String

type LaunchProfileProtocolVersion = java.lang.String

type LaunchProfileProtocolVersionList = js.Array[LaunchProfileProtocolVersion]

type LaunchProfileSecurityGroupIdList = js.Array[SecurityGroupId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type LaunchProfileState = _LaunchProfileState | java.lang.String

type LaunchProfileStateList = js.Array[LaunchProfileState]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PROFILE_CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PROFILE_UPDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PROFILE_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PROFILE_CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PROFILE_UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PROFILE_DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_IMAGE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_IMAGE_NOT_READY
  - typingsJapgolly.awsSdk.awsSdkStrings.LAUNCH_PROFILE_WITH_STREAM_SESSIONS_NOT_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTION_KEY_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTION_KEY_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_SUBNETS_PROVIDED
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_INSTANCE_TYPES_PROVIDED
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_SUBNETS_COMBINATION
  - java.lang.String
*/
type LaunchProfileStatusCode = _LaunchProfileStatusCode | java.lang.String

type LaunchProfileStudioComponentIdList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED_INTERNAL_SERVER_ERROR
  - java.lang.String
*/
type LaunchProfileValidationState = _LaunchProfileValidationState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_NOT_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED_INVALID_SUBNET_ROUTE_TABLE_ASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED_SUBNET_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED_INVALID_SECURITY_GROUP_ASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED_INVALID_ACTIVE_DIRECTORY
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED_UNAUTHORIZED
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_FAILED_INTERNAL_SERVER_ERROR
  - java.lang.String
*/
type LaunchProfileValidationStatusCode = _LaunchProfileValidationStatusCode | java.lang.String

type LaunchProfileValidationStatusMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_ACTIVE_DIRECTORY_STUDIO_COMPONENT
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_SUBNET_ASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_NETWORK_ACL_ASSOCIATION
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATE_SECURITY_GROUP_ASSOCIATION
  - java.lang.String
*/
type LaunchProfileValidationType = _LaunchProfileValidationType | java.lang.String

type LaunchPurpose = java.lang.String

type LinuxMountPoint = java.lang.String

type MaxResults = Double

type NewLaunchProfileMemberList = js.Array[NewLaunchProfileMember]

type NewStudioMemberList = js.Array[NewStudioMember]

type Region = java.lang.String

type RoleArn = java.lang.String

type ScriptParameterKey = java.lang.String

type ScriptParameterValue = java.lang.String

type SecurityGroupId = java.lang.String

type SensitiveString = java.lang.String

type StreamConfigurationMaxSessionLengthInMinutes = Double

type StreamConfigurationMaxStoppedSessionLengthInMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type StreamingClipboardMode = _StreamingClipboardMode | java.lang.String

type StreamingImageDescription = java.lang.String

type StreamingImageEncryptionConfigurationKeyArn = java.lang.String

type StreamingImageEncryptionConfigurationKeyType = CUSTOMER_MANAGED_KEY | java.lang.String

type StreamingImageId = java.lang.String

type StreamingImageIdList = js.Array[StreamingImageId]

type StreamingImageList = js.Array[StreamingImage]

type StreamingImageName = java.lang.String

type StreamingImageOwner = java.lang.String

type StreamingImagePlatform = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type StreamingImageState = _StreamingImageState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_IMAGE_CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_IMAGE_READY
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_IMAGE_DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_IMAGE_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_IMAGE_UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - java.lang.String
*/
type StreamingImageStatusCode = _StreamingImageStatusCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot12xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g4dnDot16xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g3Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g3sDotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g5Dotxlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g5Dot2xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g5Dot4xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g5Dot8xlarge
  - typingsJapgolly.awsSdk.awsSdkStrings.g5Dot16xlarge
  - java.lang.String
*/
type StreamingInstanceType = _StreamingInstanceType | java.lang.String

type StreamingInstanceTypeList = js.Array[StreamingInstanceType]

type StreamingSessionId = java.lang.String

type StreamingSessionList = js.Array[StreamingSession]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.START_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.START_FAILED
  - java.lang.String
*/
type StreamingSessionState = _StreamingSessionState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_SESSION_READY
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_SESSION_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_SESSION_CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_SESSION_DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INSUFFICIENT_CAPACITY
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY_DOMAIN_JOIN_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_CONNECTION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INITIALIZATION_SCRIPT_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.DECRYPT_STREAMING_IMAGE_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_INTERFACE_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_SESSION_STOPPED
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_SESSION_STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_SESSION_STOP_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAMING_SESSION_START_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.AMI_VALIDATION_ERROR
  - java.lang.String
*/
type StreamingSessionStatusCode = _StreamingSessionStatusCode | java.lang.String

type StreamingSessionStorageMode = UPLOAD | java.lang.String

type StreamingSessionStorageModeList = js.Array[StreamingSessionStorageMode]

type StreamingSessionStorageRootPathLinux = java.lang.String

type StreamingSessionStorageRootPathWindows = java.lang.String

type StreamingSessionStreamExpirationInSeconds = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type StreamingSessionStreamState = _StreamingSessionStreamState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAM_CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAM_READY
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAM_DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STREAM_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.NETWORK_CONNECTION_ERROR
  - java.lang.String
*/
type StreamingSessionStreamStatusCode = _StreamingSessionStreamStatusCode | java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type StudioComponentDescription = java.lang.String

type StudioComponentId = java.lang.String

type StudioComponentInitializationScriptContent = java.lang.String

type StudioComponentInitializationScriptList = js.Array[StudioComponentInitializationScript]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM_INITIALIZATION
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_INITIALIZATION
  - java.lang.String
*/
type StudioComponentInitializationScriptRunContext = _StudioComponentInitializationScriptRunContext | java.lang.String

type StudioComponentList = js.Array[StudioComponent]

type StudioComponentName = java.lang.String

type StudioComponentScriptParameterKeyValueList = js.Array[ScriptParameterKeyValue]

type StudioComponentSecurityGroupIdList = js.Array[SecurityGroupId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type StudioComponentState = _StudioComponentState | java.lang.String

type StudioComponentStateList = js.Array[StudioComponentState]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY_ALREADY_EXISTS
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_COMPONENT_CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_COMPONENT_UPDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_COMPONENT_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTION_KEY_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTION_KEY_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_COMPONENT_CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_COMPONENT_UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_COMPONENT_DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - java.lang.String
*/
type StudioComponentStatusCode = _StudioComponentStatusCode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_MANAGED_MICROSOFT_AD
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_FSX_FOR_WINDOWS
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_FSX_FOR_LUSTRE
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type StudioComponentSubtype = _StudioComponentSubtype | java.lang.String

type StudioComponentSummaryList = js.Array[StudioComponentSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE_DIRECTORY
  - typingsJapgolly.awsSdk.awsSdkStrings.SHARED_FILE_SYSTEM
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPUTE_FARM
  - typingsJapgolly.awsSdk.awsSdkStrings.LICENSE_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - java.lang.String
*/
type StudioComponentType = _StudioComponentType | java.lang.String

type StudioComponentTypeList = js.Array[StudioComponentType]

type StudioDisplayName = java.lang.String

type StudioEncryptionConfigurationKeyArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_OWNED_KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_KEY
  - java.lang.String
*/
type StudioEncryptionConfigurationKeyType = _StudioEncryptionConfigurationKeyType | java.lang.String

type StudioList = js.Array[Studio]

type StudioMembershipList = js.Array[StudioMembership]

type StudioName = java.lang.String

type StudioPersona = ADMINISTRATOR | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.READY
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - java.lang.String
*/
type StudioState = _StudioState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_CREATED
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_UPDATED
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_UPDATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_WITH_LAUNCH_PROFILES_NOT_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_WITH_STUDIO_COMPONENTS_NOT_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.STUDIO_WITH_STREAMING_IMAGES_NOT_DELETED
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SSO_NOT_ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SSO_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLE_NOT_OWNED_BY_STUDIO_OWNER
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLE_COULD_NOT_BE_ASSUMED
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTION_KEY_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTION_KEY_ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SSO_CONFIGURATION_REPAIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SSO_CONFIGURATION_REPAIR_IN_PROGRESS
  - java.lang.String
*/
type StudioStatusCode = _StudioStatusCode | java.lang.String

type Tags = StringDictionary[String]

type Timestamp = js.Date

type ValidationResults = js.Array[ValidationResult]

type WindowsMountDrive = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-08-01`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
