package typingsJapgolly.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.PermissionsBoundaryPolicy
import typingsJapgolly.awsSdk.awsSdkStrings.textSlashcsv
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_LEVEL
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTION_LEVEL
  - java.lang.String
*/
type AccessAdvisorUsageGranularityType = _AccessAdvisorUsageGranularityType | String

type AccessDetails = js.Array[AccessDetail]

type ActionNameListType = js.Array[ActionNameType]

type ActionNameType = String

type ArnListType = js.Array[arnType]

type BootstrapDatum = Buffer | js.typedarray.Uint8Array | Blob | String

type ColumnNumber = Double

type ContextEntryListType = js.Array[ContextEntry]

type ContextKeyNameType = String

type ContextKeyNamesResultListType = js.Array[ContextKeyNameType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.string__
  - typingsJapgolly.awsSdk.awsSdkStrings.stringList__
  - typingsJapgolly.awsSdk.awsSdkStrings.numeric_
  - typingsJapgolly.awsSdk.awsSdkStrings.numericList
  - typingsJapgolly.awsSdk.awsSdkStrings.boolean__
  - typingsJapgolly.awsSdk.awsSdkStrings.booleanList
  - typingsJapgolly.awsSdk.awsSdkStrings.ip_
  - typingsJapgolly.awsSdk.awsSdkStrings.ipList
  - typingsJapgolly.awsSdk.awsSdkStrings.binary__
  - typingsJapgolly.awsSdk.awsSdkStrings.binaryList
  - typingsJapgolly.awsSdk.awsSdkStrings.date_
  - typingsJapgolly.awsSdk.awsSdkStrings.dateList
  - java.lang.String
*/
type ContextKeyTypeEnum = _ContextKeyTypeEnum | String

type ContextKeyValueListType = js.Array[ContextKeyValueType]

type ContextKeyValueType = String

type DeletionTaskIdType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
  - java.lang.String
*/
type DeletionTaskStatusType = _DeletionTaskStatusType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.User_
  - typingsJapgolly.awsSdk.awsSdkStrings.Role_
  - typingsJapgolly.awsSdk.awsSdkStrings.Group_
  - typingsJapgolly.awsSdk.awsSdkStrings.LocalManagedPolicy
  - typingsJapgolly.awsSdk.awsSdkStrings.AWSManagedPolicy
  - java.lang.String
*/
type EntityType = _EntityType | String

type EvalDecisionDetailsType = StringDictionary[PolicyEvaluationDecisionType]

type EvalDecisionSourceType = String

type EvaluationResultsListType = js.Array[EvaluationResult]

type LineNumber = Double

type ManagedPolicyDetailListType = js.Array[ManagedPolicyDetail]

type OpenIDConnectProviderListType = js.Array[OpenIDConnectProviderListEntry]

type OpenIDConnectProviderUrlType = String

type PermissionsBoundaryAttachmentType = PermissionsBoundaryPolicy | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.allowed__
  - typingsJapgolly.awsSdk.awsSdkStrings.explicitDeny
  - typingsJapgolly.awsSdk.awsSdkStrings.implicitDeny
  - java.lang.String
*/
type PolicyEvaluationDecisionType = _PolicyEvaluationDecisionType | String

type PolicyGroupListType = js.Array[PolicyGroup]

type PolicyIdentifierType = String

type PolicyRoleListType = js.Array[PolicyRole]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.user__
  - typingsJapgolly.awsSdk.awsSdkStrings.group__
  - typingsJapgolly.awsSdk.awsSdkStrings.role__
  - typingsJapgolly.awsSdk.awsSdkStrings.`aws-managed_`
  - typingsJapgolly.awsSdk.awsSdkStrings.`user-managed`
  - typingsJapgolly.awsSdk.awsSdkStrings.resource__
  - typingsJapgolly.awsSdk.awsSdkStrings.none__
  - java.lang.String
*/
type PolicySourceType = _PolicySourceType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PermissionsPolicy
  - typingsJapgolly.awsSdk.awsSdkStrings.PermissionsBoundary
  - java.lang.String
*/
type PolicyUsageType = _PolicyUsageType | String

type PolicyUserListType = js.Array[PolicyUser]

type ReasonType = String

type RegionNameType = String

type ReportContentType = Buffer | js.typedarray.Uint8Array | Blob | String

type ReportFormatType = textSlashcsv | String

type ReportStateDescriptionType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STARTED
  - typingsJapgolly.awsSdk.awsSdkStrings.INPROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
  - java.lang.String
*/
type ReportStateType = _ReportStateType | String

type ResourceHandlingOptionType = String

type ResourceNameListType = js.Array[ResourceNameType]

type ResourceNameType = String

type ResourceSpecificResultListType = js.Array[ResourceSpecificResult]

type RoleUsageListType = js.Array[RoleUsageType]

type SAMLMetadataDocumentType = String

type SAMLProviderListType = js.Array[SAMLProviderListEntry]

type SAMLProviderNameType = String

type SSHPublicKeyListType = js.Array[SSHPublicKeyMetadata]

type ServiceSpecificCredentialsListType = js.Array[ServiceSpecificCredentialMetadata]

type ServicesLastAccessed = js.Array[ServiceLastAccessed]

type SimulationPolicyListType = js.Array[policyDocumentType]

type StatementListType = js.Array[Statement]

type TrackedActionsLastAccessed = js.Array[TrackedActionLastAccessed]

type accessKeyIdType = String

type accessKeyMetadataListType = js.Array[AccessKeyMetadata]

type accessKeySecretType = String

type accountAliasListType = js.Array[accountAliasType]

type accountAliasType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2010-05-08`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type arnType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Assigned_
  - typingsJapgolly.awsSdk.awsSdkStrings.Unassigned
  - typingsJapgolly.awsSdk.awsSdkStrings.Any_
  - java.lang.String
*/
type assignmentStatusType = _assignmentStatusType | String

type attachedPoliciesListType = js.Array[AttachedPolicy]

type attachmentCountType = Double

type authenticationCodeType = String

type booleanObjectType = Boolean

type booleanType = Boolean

type certificateBodyType = String

type certificateChainType = String

type certificateIdType = String

type certificateListType = js.Array[SigningCertificate]

type clientIDListType = js.Array[clientIDType]

type clientIDType = String

type customSuffixType = String

type dateType = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSH
  - typingsJapgolly.awsSdk.awsSdkStrings.PEM
  - java.lang.String
*/
type encodingType = _encodingType | String

type entityDetailsListType = js.Array[EntityDetails]

type entityListType = js.Array[EntityType]

type entityNameType = String

type existingUserNameType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.v1Token
  - typingsJapgolly.awsSdk.awsSdkStrings.v2Token
  - java.lang.String
*/
type globalEndpointTokenVersion = _globalEndpointTokenVersion | String

type groupDetailListType = js.Array[GroupDetail]

type groupListType = js.Array[Group]

type groupNameListType = js.Array[groupNameType]

type groupNameType = String

type idType = String

type instanceProfileListType = js.Array[InstanceProfile]

type instanceProfileNameType = String

type integerType = Double

type jobIDType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type jobStatusType = _jobStatusType | String

type listPolicyGrantingServiceAccessResponseListType = js.Array[ListPoliciesGrantingServiceAccessEntry]

type markerType = String

type maxItemsType = Double

type maxPasswordAgeType = Double

type mfaDeviceListType = js.Array[MFADevice]

type minimumPasswordLengthType = Double

type organizationsEntityPathType = String

type organizationsPolicyIdType = String

type passwordReusePreventionType = Double

type passwordType = String

type pathPrefixType = String

type pathType = String

type policyDescriptionType = String

type policyDetailListType = js.Array[PolicyDetail]

type policyDocumentType = String

type policyDocumentVersionListType = js.Array[PolicyVersion]

type policyGrantingServiceAccessListType = js.Array[PolicyGrantingServiceAccess]

type policyListType = js.Array[Policy]

type policyNameListType = js.Array[policyNameType]

type policyNameType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.ROLE
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type policyOwnerEntityType = _policyOwnerEntityType | String

type policyPathType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.All_
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS
  - typingsJapgolly.awsSdk.awsSdkStrings.Local_
  - java.lang.String
*/
type policyScopeType = _policyScopeType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INLINE
  - typingsJapgolly.awsSdk.awsSdkStrings.MANAGED
  - java.lang.String
*/
type policyType = _policyType | String

type policyVersionIdType = String

type privateKeyType = String

type publicKeyFingerprintType = String

type publicKeyIdType = String

type publicKeyMaterialType = String

type responseMarkerType = String

type roleDescriptionType = String

type roleDetailListType = js.Array[RoleDetail]

type roleListType = js.Array[Role]

type roleMaxSessionDurationType = Double

type roleNameType = String

type serialNumberType = String

type serverCertificateMetadataListType = js.Array[ServerCertificateMetadata]

type serverCertificateNameType = String

type serviceName = String

type serviceNameType = String

type serviceNamespaceListType = js.Array[serviceNamespaceType]

type serviceNamespaceType = String

type servicePassword = String

type serviceSpecificCredentialId = String

type serviceUserName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_DESCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_DESCENDING
  - java.lang.String
*/
type sortKeyType = _sortKeyType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Active_
  - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type statusType = _statusType | String

type stringType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Users
  - typingsJapgolly.awsSdk.awsSdkStrings.UsersQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.Groups
  - typingsJapgolly.awsSdk.awsSdkStrings.GroupsQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.ServerCertificates
  - typingsJapgolly.awsSdk.awsSdkStrings.ServerCertificatesQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.UserPolicySizeQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.GroupPolicySizeQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.GroupsPerUserQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.SigningCertificatesPerUserQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessKeysPerUserQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.MFADevices
  - typingsJapgolly.awsSdk.awsSdkStrings.MFADevicesInUse
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountMFAEnabled
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountAccessKeysPresent
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountSigningCertificatesPresent
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachedPoliciesPerGroupQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachedPoliciesPerRoleQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.AttachedPoliciesPerUserQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.Policies
  - typingsJapgolly.awsSdk.awsSdkStrings.PoliciesQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicySizeQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyVersionsInUse
  - typingsJapgolly.awsSdk.awsSdkStrings.PolicyVersionsInUseQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.VersionsPerPolicyQuota
  - typingsJapgolly.awsSdk.awsSdkStrings.GlobalEndpointTokenVersion
  - java.lang.String
*/
type summaryKeyType = _summaryKeyType | String

type summaryMapType = StringDictionary[summaryValueType]

type summaryValueType = Double

type tagKeyListType = js.Array[tagKeyType]

type tagKeyType = String

type tagListType = js.Array[Tag]

type tagValueType = String

type thumbprintListType = js.Array[thumbprintType]

type thumbprintType = String

type userDetailListType = js.Array[UserDetail]

type userListType = js.Array[User]

type userNameType = String

type virtualMFADeviceListType = js.Array[VirtualMFADevice]

type virtualMFADeviceName = String
