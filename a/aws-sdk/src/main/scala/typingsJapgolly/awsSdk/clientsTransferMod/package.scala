package typingsJapgolly.awsSdk.clientsTransferMod

import typingsJapgolly.awsSdk.awsSdkStrings.HTTP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AddressAllocationId = String

type AddressAllocationIds = js.Array[AddressAllocationId]

type AgreementId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type AgreementStatusType = _AgreementStatusType | String

type Arn = String

type As2Id = String

type As2Transport = HTTP | String

type As2Transports = js.Array[As2Transport]

type CallbackToken = String

type CertDate = js.Date

type CertSerial = String

type Certificate = String

type CertificateBodyType = String

type CertificateChainType = String

type CertificateId = String

type CertificateIds = js.Array[CertificateId]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ROTATION
  - typingsJapgolly.awsSdk.awsSdkStrings.INACTIVE
  - java.lang.String
*/
type CertificateStatusType = _CertificateStatusType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE
  - typingsJapgolly.awsSdk.awsSdkStrings.CERTIFICATE_WITH_PRIVATE_KEY
  - java.lang.String
*/
type CertificateType = _CertificateType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGNING
  - typingsJapgolly.awsSdk.awsSdkStrings.ENCRYPTION
  - java.lang.String
*/
type CertificateUsageType = _CertificateUsageType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ZLIB
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type CompressionEnum = _CompressionEnum | String

type ConnectorId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILURE
  - java.lang.String
*/
type CustomStepStatus = _CustomStepStatus | String

type CustomStepTarget = String

type CustomStepTimeoutSeconds = Double

type DateImported = js.Date

type Description = String

type DirectoryId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.S3
  - typingsJapgolly.awsSdk.awsSdkStrings.EFS
  - java.lang.String
*/
type Domain = _Domain | String

type EfsFileSystemId = String

type EfsPath = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AES128_CBC
  - typingsJapgolly.awsSdk.awsSdkStrings.AES192_CBC
  - typingsJapgolly.awsSdk.awsSdkStrings.AES256_CBC
  - java.lang.String
*/
type EncryptionAlg = _EncryptionAlg | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PUBLIC
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC_ENDPOINT
  - java.lang.String
*/
type EndpointType = _EndpointType | String

type ExecutionErrorMessage = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PERMISSION_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_STEP_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.THROTTLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ALREADY_EXISTS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.BAD_REQUEST
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMEOUT
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_SERVER_ERROR
  - java.lang.String
*/
type ExecutionErrorType = _ExecutionErrorType | String

type ExecutionId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXCEPTION
  - typingsJapgolly.awsSdk.awsSdkStrings.HANDLING_EXCEPTION
  - java.lang.String
*/
type ExecutionStatus = _ExecutionStatus | String

type ExecutionStepResults = js.Array[ExecutionStepResult]

type ExternalId = String

type FilePath = String

type FilePaths = js.Array[FilePath]

type Fips = Boolean

type Function = String

type HomeDirectory = String

type HomeDirectoryMappings = js.Array[HomeDirectoryMapEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PATH
  - typingsJapgolly.awsSdk.awsSdkStrings.LOGICAL
  - java.lang.String
*/
type HomeDirectoryType = _HomeDirectoryType | String

type HostKey = String

type HostKeyDescription = String

type HostKeyFingerprint = String

type HostKeyId = String

type HostKeyType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_MANAGED
  - typingsJapgolly.awsSdk.awsSdkStrings.API_GATEWAY
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_DIRECTORY_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_LAMBDA
  - java.lang.String
*/
type IdentityProviderType = _IdentityProviderType | String

type ListedAccesses = js.Array[ListedAccess]

type ListedAgreements = js.Array[ListedAgreement]

type ListedCertificates = js.Array[ListedCertificate]

type ListedConnectors = js.Array[ListedConnector]

type ListedExecutions = js.Array[ListedExecution]

type ListedHostKeys = js.Array[ListedHostKey]

type ListedProfiles = js.Array[ListedProfile]

type ListedServers = js.Array[ListedServer]

type ListedUsers = js.Array[ListedUser]

type ListedWorkflows = js.Array[ListedWorkflow]

type LogGroupName = String

type MapEntry = String

type MapTarget = String

type MaxResults = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SYNC
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type MdnResponse = _MdnResponse | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA256
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA384
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA512
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA1
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - java.lang.String
*/
type MdnSigningAlg = _MdnSigningAlg | String

type Message = String

type MessageSubject = String

type NextToken = String

type NullableRole = String

type OnPartialUploadWorkflowDetails = js.Array[WorkflowDetail]

type OnUploadWorkflowDetails = js.Array[WorkflowDetail]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TRUE
  - typingsJapgolly.awsSdk.awsSdkStrings.FALSE
  - java.lang.String
*/
type OverwriteExisting = _OverwriteExisting | String

type PassiveIp = String

type Policy = String

type PosixId = Double

type PostAuthenticationLoginBanner = String

type PreAuthenticationLoginBanner = String

type PrivateKeyType = String

type ProfileId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCAL
  - typingsJapgolly.awsSdk.awsSdkStrings.PARTNER
  - java.lang.String
*/
type ProfileType = _ProfileType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SFTP
  - typingsJapgolly.awsSdk.awsSdkStrings.FTP
  - typingsJapgolly.awsSdk.awsSdkStrings.FTPS
  - typingsJapgolly.awsSdk.awsSdkStrings.AS2
  - java.lang.String
*/
type Protocol = _Protocol | String

type Protocols = js.Array[Protocol]

type Response = String

type Role = String

type S3Bucket = String

type S3Etag = String

type S3Key = String

type S3TagKey = String

type S3TagValue = String

type S3Tags = js.Array[S3Tag]

type S3VersionId = String

type SecondaryGids = js.Array[PosixId]

type SecurityGroupId = String

type SecurityGroupIds = js.Array[SecurityGroupId]

type SecurityPolicyName = String

type SecurityPolicyNames = js.Array[SecurityPolicyName]

type SecurityPolicyOption = String

type SecurityPolicyOptions = js.Array[SecurityPolicyOption]

type ServerId = String

type SessionId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_NO_OP
  - java.lang.String
*/
type SetStatOption = _SetStatOption | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA256
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA384
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA512
  - typingsJapgolly.awsSdk.awsSdkStrings.SHA1
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type SigningAlg = _SigningAlg | String

type SourceFileLocation = String

type SourceIp = String

type SshPublicKeyBody = String

type SshPublicKeyCount = Double

type SshPublicKeyId = String

type SshPublicKeys = js.Array[SshPublicKey]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OFFLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.ONLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTING
  - typingsJapgolly.awsSdk.awsSdkStrings.STOPPING
  - typingsJapgolly.awsSdk.awsSdkStrings.START_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.STOP_FAILED
  - java.lang.String
*/
type State = _State | String

type StatusCode = Double

type StepResultOutputsJson = String

type SubnetId = String

type SubnetIds = js.Array[SubnetId]

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type Tags = js.Array[Tag]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.ENFORCED
  - java.lang.String
*/
type TlsSessionResumptionMode = _TlsSessionResumptionMode | String

type TransferId = String

type Url = String

type UserCount = Double

type UserName = String

type UserPassword = String

type VpcEndpointId = String

type VpcId = String

type WorkflowDescription = String

type WorkflowId = String

type WorkflowStepName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COPY
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM
  - typingsJapgolly.awsSdk.awsSdkStrings.TAG
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type WorkflowStepType = _WorkflowStepType | String

type WorkflowSteps = js.Array[WorkflowStep]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-11-05`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
