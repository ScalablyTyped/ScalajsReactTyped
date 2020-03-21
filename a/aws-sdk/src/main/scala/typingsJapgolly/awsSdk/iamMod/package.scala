package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object iamMod {
  type AccessDetails = js.Array[typingsJapgolly.awsSdk.iamMod.AccessDetail]
  type ActionNameListType = js.Array[typingsJapgolly.awsSdk.iamMod.ActionNameType]
  type ActionNameType = java.lang.String
  type ArnListType = js.Array[typingsJapgolly.awsSdk.iamMod.arnType]
  type BootstrapDatum = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.iamMod.Blob | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.iamMod.ClientApiVersions
  type ColumnNumber = scala.Double
  type ContextEntryListType = js.Array[typingsJapgolly.awsSdk.iamMod.ContextEntry]
  type ContextKeyNameType = java.lang.String
  type ContextKeyNamesResultListType = js.Array[typingsJapgolly.awsSdk.iamMod.ContextKeyNameType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.string__
    - typingsJapgolly.awsSdk.awsSdkStrings.stringList_
    - typingsJapgolly.awsSdk.awsSdkStrings.numeric
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
  type ContextKeyTypeEnum = typingsJapgolly.awsSdk.iamMod._ContextKeyTypeEnum | java.lang.String
  type ContextKeyValueListType = js.Array[typingsJapgolly.awsSdk.iamMod.ContextKeyValueType]
  type ContextKeyValueType = java.lang.String
  type DeletionTaskIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_STARTED
    - java.lang.String
  */
  type DeletionTaskStatusType = typingsJapgolly.awsSdk.iamMod._DeletionTaskStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.User_
    - typingsJapgolly.awsSdk.awsSdkStrings.Role_
    - typingsJapgolly.awsSdk.awsSdkStrings.Group_
    - typingsJapgolly.awsSdk.awsSdkStrings.LocalManagedPolicy
    - typingsJapgolly.awsSdk.awsSdkStrings.AWSManagedPolicy
    - java.lang.String
  */
  type EntityType = typingsJapgolly.awsSdk.iamMod._EntityType | java.lang.String
  type EvalDecisionDetailsType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iamMod.PolicyEvaluationDecisionType]
  type EvalDecisionSourceType = java.lang.String
  type EvaluationResultsListType = js.Array[typingsJapgolly.awsSdk.iamMod.EvaluationResult]
  type LineNumber = scala.Double
  type ManagedPolicyDetailListType = js.Array[typingsJapgolly.awsSdk.iamMod.ManagedPolicyDetail]
  type OpenIDConnectProviderListType = js.Array[typingsJapgolly.awsSdk.iamMod.OpenIDConnectProviderListEntry]
  type OpenIDConnectProviderUrlType = java.lang.String
  type PermissionsBoundaryAttachmentType = typingsJapgolly.awsSdk.awsSdkStrings.PermissionsBoundaryPolicy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.allowed__
    - typingsJapgolly.awsSdk.awsSdkStrings.explicitDeny
    - typingsJapgolly.awsSdk.awsSdkStrings.implicitDeny
    - java.lang.String
  */
  type PolicyEvaluationDecisionType = typingsJapgolly.awsSdk.iamMod._PolicyEvaluationDecisionType | java.lang.String
  type PolicyGroupListType = js.Array[typingsJapgolly.awsSdk.iamMod.PolicyGroup]
  type PolicyIdentifierType = java.lang.String
  type PolicyRoleListType = js.Array[typingsJapgolly.awsSdk.iamMod.PolicyRole]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.user__
    - typingsJapgolly.awsSdk.awsSdkStrings.group__
    - typingsJapgolly.awsSdk.awsSdkStrings.role__
    - typingsJapgolly.awsSdk.awsSdkStrings.`aws-managed`
    - typingsJapgolly.awsSdk.awsSdkStrings.`user-managed`
    - typingsJapgolly.awsSdk.awsSdkStrings.resource__
    - typingsJapgolly.awsSdk.awsSdkStrings.none__
    - java.lang.String
  */
  type PolicySourceType = typingsJapgolly.awsSdk.iamMod._PolicySourceType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PermissionsPolicy
    - typingsJapgolly.awsSdk.awsSdkStrings.PermissionsBoundary
    - java.lang.String
  */
  type PolicyUsageType = typingsJapgolly.awsSdk.iamMod._PolicyUsageType | java.lang.String
  type PolicyUserListType = js.Array[typingsJapgolly.awsSdk.iamMod.PolicyUser]
  type ReasonType = java.lang.String
  type RegionNameType = java.lang.String
  type ReportContentType = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.iamMod.Blob | java.lang.String
  type ReportFormatType = typingsJapgolly.awsSdk.awsSdkStrings.textSlashcsv | java.lang.String
  type ReportStateDescriptionType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STARTED
    - typingsJapgolly.awsSdk.awsSdkStrings.INPROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETE
    - java.lang.String
  */
  type ReportStateType = typingsJapgolly.awsSdk.iamMod._ReportStateType | java.lang.String
  type ResourceHandlingOptionType = java.lang.String
  type ResourceNameListType = js.Array[typingsJapgolly.awsSdk.iamMod.ResourceNameType]
  type ResourceNameType = java.lang.String
  type ResourceSpecificResultListType = js.Array[typingsJapgolly.awsSdk.iamMod.ResourceSpecificResult]
  type RoleUsageListType = js.Array[typingsJapgolly.awsSdk.iamMod.RoleUsageType]
  type SAMLMetadataDocumentType = java.lang.String
  type SAMLProviderListType = js.Array[typingsJapgolly.awsSdk.iamMod.SAMLProviderListEntry]
  type SAMLProviderNameType = java.lang.String
  type SSHPublicKeyListType = js.Array[typingsJapgolly.awsSdk.iamMod.SSHPublicKeyMetadata]
  type ServiceSpecificCredentialsListType = js.Array[typingsJapgolly.awsSdk.iamMod.ServiceSpecificCredentialMetadata]
  type ServicesLastAccessed = js.Array[typingsJapgolly.awsSdk.iamMod.ServiceLastAccessed]
  type SimulationPolicyListType = js.Array[typingsJapgolly.awsSdk.iamMod.policyDocumentType]
  type StatementListType = js.Array[typingsJapgolly.awsSdk.iamMod.Statement]
  type accessKeyIdType = java.lang.String
  type accessKeyMetadataListType = js.Array[typingsJapgolly.awsSdk.iamMod.AccessKeyMetadata]
  type accessKeySecretType = java.lang.String
  type accountAliasListType = js.Array[typingsJapgolly.awsSdk.iamMod.accountAliasType]
  type accountAliasType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2010-05-08`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.iamMod._apiVersion | java.lang.String
  type arnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Assigned_
    - typingsJapgolly.awsSdk.awsSdkStrings.Unassigned
    - typingsJapgolly.awsSdk.awsSdkStrings.Any_
    - java.lang.String
  */
  type assignmentStatusType = typingsJapgolly.awsSdk.iamMod._assignmentStatusType | java.lang.String
  type attachedPoliciesListType = js.Array[typingsJapgolly.awsSdk.iamMod.AttachedPolicy]
  type attachmentCountType = scala.Double
  type authenticationCodeType = java.lang.String
  type booleanObjectType = scala.Boolean
  type booleanType = scala.Boolean
  type certificateBodyType = java.lang.String
  type certificateChainType = java.lang.String
  type certificateIdType = java.lang.String
  type certificateListType = js.Array[typingsJapgolly.awsSdk.iamMod.SigningCertificate]
  type clientIDListType = js.Array[typingsJapgolly.awsSdk.iamMod.clientIDType]
  type clientIDType = java.lang.String
  type customSuffixType = java.lang.String
  type dateType = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SSH
    - typingsJapgolly.awsSdk.awsSdkStrings.PEM
    - java.lang.String
  */
  type encodingType = typingsJapgolly.awsSdk.iamMod._encodingType | java.lang.String
  type entityDetailsListType = js.Array[typingsJapgolly.awsSdk.iamMod.EntityDetails]
  type entityListType = js.Array[typingsJapgolly.awsSdk.iamMod.EntityType]
  type entityNameType = java.lang.String
  type existingUserNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.v1Token
    - typingsJapgolly.awsSdk.awsSdkStrings.v2Token
    - java.lang.String
  */
  type globalEndpointTokenVersion = typingsJapgolly.awsSdk.iamMod._globalEndpointTokenVersion | java.lang.String
  type groupDetailListType = js.Array[typingsJapgolly.awsSdk.iamMod.GroupDetail]
  type groupListType = js.Array[typingsJapgolly.awsSdk.iamMod.Group]
  type groupNameListType = js.Array[typingsJapgolly.awsSdk.iamMod.groupNameType]
  type groupNameType = java.lang.String
  type idType = java.lang.String
  type instanceProfileListType = js.Array[typingsJapgolly.awsSdk.iamMod.InstanceProfile]
  type instanceProfileNameType = java.lang.String
  type integerType = scala.Double
  type jobIDType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPLETED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type jobStatusType = typingsJapgolly.awsSdk.iamMod._jobStatusType | java.lang.String
  type listPolicyGrantingServiceAccessResponseListType = js.Array[typingsJapgolly.awsSdk.iamMod.ListPoliciesGrantingServiceAccessEntry]
  type markerType = java.lang.String
  type maxItemsType = scala.Double
  type maxPasswordAgeType = scala.Double
  type mfaDeviceListType = js.Array[typingsJapgolly.awsSdk.iamMod.MFADevice]
  type minimumPasswordLengthType = scala.Double
  type organizationsEntityPathType = java.lang.String
  type organizationsPolicyIdType = java.lang.String
  type passwordReusePreventionType = scala.Double
  type passwordType = java.lang.String
  type pathPrefixType = java.lang.String
  type pathType = java.lang.String
  type policyDescriptionType = java.lang.String
  type policyDetailListType = js.Array[typingsJapgolly.awsSdk.iamMod.PolicyDetail]
  type policyDocumentType = java.lang.String
  type policyDocumentVersionListType = js.Array[typingsJapgolly.awsSdk.iamMod.PolicyVersion]
  type policyGrantingServiceAccessListType = js.Array[typingsJapgolly.awsSdk.iamMod.PolicyGrantingServiceAccess]
  type policyListType = js.Array[typingsJapgolly.awsSdk.iamMod.Policy]
  type policyNameListType = js.Array[typingsJapgolly.awsSdk.iamMod.policyNameType]
  type policyNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.ROLE
    - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
    - java.lang.String
  */
  type policyOwnerEntityType = typingsJapgolly.awsSdk.iamMod._policyOwnerEntityType | java.lang.String
  type policyPathType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.All_
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS
    - typingsJapgolly.awsSdk.awsSdkStrings.Local_
    - java.lang.String
  */
  type policyScopeType = typingsJapgolly.awsSdk.iamMod._policyScopeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INLINE
    - typingsJapgolly.awsSdk.awsSdkStrings.MANAGED
    - java.lang.String
  */
  type policyType = typingsJapgolly.awsSdk.iamMod._policyType | java.lang.String
  type policyVersionIdType = java.lang.String
  type privateKeyType = java.lang.String
  type publicKeyFingerprintType = java.lang.String
  type publicKeyIdType = java.lang.String
  type publicKeyMaterialType = java.lang.String
  type responseMarkerType = java.lang.String
  type roleDescriptionType = java.lang.String
  type roleDetailListType = js.Array[typingsJapgolly.awsSdk.iamMod.RoleDetail]
  type roleListType = js.Array[typingsJapgolly.awsSdk.iamMod.Role]
  type roleMaxSessionDurationType = scala.Double
  type roleNameType = java.lang.String
  type serialNumberType = java.lang.String
  type serverCertificateMetadataListType = js.Array[typingsJapgolly.awsSdk.iamMod.ServerCertificateMetadata]
  type serverCertificateNameType = java.lang.String
  type serviceName = java.lang.String
  type serviceNameType = java.lang.String
  type serviceNamespaceListType = js.Array[typingsJapgolly.awsSdk.iamMod.serviceNamespaceType]
  type serviceNamespaceType = java.lang.String
  type servicePassword = java.lang.String
  type serviceSpecificCredentialId = java.lang.String
  type serviceUserName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_ASCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_NAMESPACE_DESCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_ASCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_AUTHENTICATED_TIME_DESCENDING
    - java.lang.String
  */
  type sortKeyType = typingsJapgolly.awsSdk.iamMod._sortKeyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Active_
    - typingsJapgolly.awsSdk.awsSdkStrings.Inactive_
    - java.lang.String
  */
  type statusType = typingsJapgolly.awsSdk.iamMod._statusType | java.lang.String
  type stringType = java.lang.String
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
  type summaryKeyType = typingsJapgolly.awsSdk.iamMod._summaryKeyType | java.lang.String
  type summaryMapType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.iamMod.summaryValueType]
  type summaryValueType = scala.Double
  type tagKeyListType = js.Array[typingsJapgolly.awsSdk.iamMod.tagKeyType]
  type tagKeyType = java.lang.String
  type tagListType = js.Array[typingsJapgolly.awsSdk.iamMod.Tag]
  type tagValueType = java.lang.String
  type thumbprintListType = js.Array[typingsJapgolly.awsSdk.iamMod.thumbprintType]
  type thumbprintType = java.lang.String
  type userDetailListType = js.Array[typingsJapgolly.awsSdk.iamMod.UserDetail]
  type userListType = js.Array[typingsJapgolly.awsSdk.iamMod.User]
  type userNameType = java.lang.String
  type virtualMFADeviceListType = js.Array[typingsJapgolly.awsSdk.iamMod.VirtualMFADevice]
  type virtualMFADeviceName = java.lang.String
}
