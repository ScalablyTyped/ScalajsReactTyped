package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object organizationsMod {
  type AccountArn = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INVITED
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
    - java.lang.String
  */
  type AccountJoinedMethod = typingsJapgolly.awsSdk.organizationsMod._AccountJoinedMethod | java.lang.String
  type AccountName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
    - java.lang.String
  */
  type AccountStatus = typingsJapgolly.awsSdk.organizationsMod._AccountStatus | java.lang.String
  type Accounts = js.Array[typingsJapgolly.awsSdk.organizationsMod.Account]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INVITE
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_ALL_FEATURES
    - typingsJapgolly.awsSdk.awsSdkStrings.APPROVE_ALL_FEATURES
    - typingsJapgolly.awsSdk.awsSdkStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
    - java.lang.String
  */
  type ActionType = typingsJapgolly.awsSdk.organizationsMod._ActionType | java.lang.String
  type AwsManagedPolicy = scala.Boolean
  type ChildId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ChildType = typingsJapgolly.awsSdk.organizationsMod._ChildType | java.lang.String
  type Children = js.Array[typingsJapgolly.awsSdk.organizationsMod.Child]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.organizationsMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_LIMIT_EXCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_ALREADY_EXISTS
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_ADDRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_EMAIL
    - typingsJapgolly.awsSdk.awsSdkStrings.CONCURRENT_ACCOUNT_MODIFICATION
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
    - typingsJapgolly.awsSdk.awsSdkStrings.GOVCLOUD_ACCOUNT_ALREADY_EXISTS
    - java.lang.String
  */
  type CreateAccountFailureReason = typingsJapgolly.awsSdk.organizationsMod._CreateAccountFailureReason | java.lang.String
  type CreateAccountRequestId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CreateAccountState = typingsJapgolly.awsSdk.organizationsMod._CreateAccountState | java.lang.String
  type CreateAccountStates = js.Array[typingsJapgolly.awsSdk.organizationsMod.CreateAccountState]
  type CreateAccountStatuses = js.Array[typingsJapgolly.awsSdk.organizationsMod.CreateAccountStatus]
  type EffectivePolicyType = typingsJapgolly.awsSdk.awsSdkStrings.TAG_POLICY | java.lang.String
  type Email = java.lang.String
  type EnabledServicePrincipals = js.Array[typingsJapgolly.awsSdk.organizationsMod.EnabledServicePrincipal]
  type GenericArn = java.lang.String
  type HandshakeArn = java.lang.String
  type HandshakeId = java.lang.String
  type HandshakeNotes = java.lang.String
  type HandshakeParties = js.Array[typingsJapgolly.awsSdk.organizationsMod.HandshakeParty]
  type HandshakePartyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type HandshakePartyType = typingsJapgolly.awsSdk.organizationsMod._HandshakePartyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION_FEATURE_SET
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
    - typingsJapgolly.awsSdk.awsSdkStrings.MASTER_EMAIL
    - typingsJapgolly.awsSdk.awsSdkStrings.MASTER_NAME
    - typingsJapgolly.awsSdk.awsSdkStrings.NOTES
    - typingsJapgolly.awsSdk.awsSdkStrings.PARENT_HANDSHAKE
    - java.lang.String
  */
  type HandshakeResourceType = typingsJapgolly.awsSdk.organizationsMod._HandshakeResourceType | java.lang.String
  type HandshakeResourceValue = java.lang.String
  type HandshakeResources = js.Array[typingsJapgolly.awsSdk.organizationsMod.HandshakeResource]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUESTED
    - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPTED
    - typingsJapgolly.awsSdk.awsSdkStrings.DECLINED
    - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type HandshakeState = typingsJapgolly.awsSdk.organizationsMod._HandshakeState | java.lang.String
  type Handshakes = js.Array[typingsJapgolly.awsSdk.organizationsMod.Handshake]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type IAMUserAccessToBilling = typingsJapgolly.awsSdk.organizationsMod._IAMUserAccessToBilling | java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type OrganizationArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.CONSOLIDATED_BILLING
    - java.lang.String
  */
  type OrganizationFeatureSet = typingsJapgolly.awsSdk.organizationsMod._OrganizationFeatureSet | java.lang.String
  type OrganizationId = java.lang.String
  type OrganizationalUnitArn = java.lang.String
  type OrganizationalUnitId = java.lang.String
  type OrganizationalUnitName = java.lang.String
  type OrganizationalUnits = js.Array[typingsJapgolly.awsSdk.organizationsMod.OrganizationalUnit]
  type ParentId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ROOT
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - java.lang.String
  */
  type ParentType = typingsJapgolly.awsSdk.organizationsMod._ParentType | java.lang.String
  type Parents = js.Array[typingsJapgolly.awsSdk.organizationsMod.Parent]
  type Policies = js.Array[typingsJapgolly.awsSdk.organizationsMod.PolicySummary]
  type PolicyArn = java.lang.String
  type PolicyContent = java.lang.String
  type PolicyDescription = java.lang.String
  type PolicyId = java.lang.String
  type PolicyName = java.lang.String
  type PolicyTargetId = java.lang.String
  type PolicyTargets = js.Array[typingsJapgolly.awsSdk.organizationsMod.PolicyTargetSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_CONTROL_POLICY
    - typingsJapgolly.awsSdk.awsSdkStrings.TAG_POLICY
    - java.lang.String
  */
  type PolicyType = typingsJapgolly.awsSdk.organizationsMod._PolicyType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ENABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DISABLE
    - java.lang.String
  */
  type PolicyTypeStatus = typingsJapgolly.awsSdk.organizationsMod._PolicyTypeStatus | java.lang.String
  type PolicyTypes = js.Array[typingsJapgolly.awsSdk.organizationsMod.PolicyTypeSummary]
  type RoleName = java.lang.String
  type RootArn = java.lang.String
  type RootId = java.lang.String
  type RootName = java.lang.String
  type Roots = js.Array[typingsJapgolly.awsSdk.organizationsMod.Root]
  type ServicePrincipal = java.lang.String
  type TagKey = java.lang.String
  type TagKeys = js.Array[typingsJapgolly.awsSdk.organizationsMod.TagKey]
  type TagValue = java.lang.String
  type TaggableResourceId = java.lang.String
  type Tags = js.Array[typingsJapgolly.awsSdk.organizationsMod.Tag]
  type TargetName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
    - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
    - typingsJapgolly.awsSdk.awsSdkStrings.ROOT
    - java.lang.String
  */
  type TargetType = typingsJapgolly.awsSdk.organizationsMod._TargetType | java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-28`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.organizationsMod._apiVersion | java.lang.String
}
