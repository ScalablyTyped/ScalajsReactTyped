package typingsJapgolly.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountArn = String

type AccountId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INVITED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATED
  - java.lang.String
*/
type AccountJoinedMethod = _AccountJoinedMethod | String

type AccountName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.SUSPENDED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_CLOSURE
  - java.lang.String
*/
type AccountStatus = _AccountStatus | String

type Accounts = js.Array[Account]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INVITE
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE_ALL_FEATURES
  - typingsJapgolly.awsSdk.awsSdkStrings.APPROVE_ALL_FEATURES
  - typingsJapgolly.awsSdk.awsSdkStrings.ADD_ORGANIZATIONS_SERVICE_LINKED_ROLE
  - java.lang.String
*/
type ActionType = _ActionType | String

type AwsManagedPolicy = Boolean

type ChildId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
  - java.lang.String
*/
type ChildType = _ChildType | String

type Children = js.Array[Child]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT_LIMIT_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_ALREADY_EXISTS
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_ADDRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_EMAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.CONCURRENT_ACCOUNT_MODIFICATION
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.GOVCLOUD_ACCOUNT_ALREADY_EXISTS
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_BUSINESS_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED_BUSINESS_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_BUSINESS_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_IDENTITY_FOR_BUSINESS_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN_BUSINESS_VALIDATION
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_PAYMENT_INSTRUMENT
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_PAYMENT_INSTRUMENT
  - java.lang.String
*/
type CreateAccountFailureReason = _CreateAccountFailureReason | String

type CreateAccountName = String

type CreateAccountRequestId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CreateAccountState = _CreateAccountState | String

type CreateAccountStates = js.Array[CreateAccountState]

type CreateAccountStatuses = js.Array[CreateAccountStatus]

type DelegatedAdministrators = js.Array[DelegatedAdministrator]

type DelegatedServices = js.Array[DelegatedService]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TAG_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.AISERVICES_OPT_OUT_POLICY
  - java.lang.String
*/
type EffectivePolicyType = _EffectivePolicyType | String

type Email = String

type EnabledServicePrincipals = js.Array[EnabledServicePrincipal]

type GenericArn = String

type HandshakeArn = String

type HandshakeId = String

type HandshakeNotes = String

type HandshakeParties = js.Array[HandshakeParty]

type HandshakePartyId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type HandshakePartyType = _HandshakePartyType | String

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
type HandshakeResourceType = _HandshakeResourceType | String

type HandshakeResourceValue = String

type HandshakeResources = js.Array[HandshakeResource]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUESTED
  - typingsJapgolly.awsSdk.awsSdkStrings.OPEN
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELED
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCEPTED
  - typingsJapgolly.awsSdk.awsSdkStrings.DECLINED
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type HandshakeState = _HandshakeState | String

type Handshakes = js.Array[Handshake]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
  - typingsJapgolly.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type IAMUserAccessToBilling = _IAMUserAccessToBilling | String

type MaxResults = Double

type NextToken = String

type OrganizationArn = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL
  - typingsJapgolly.awsSdk.awsSdkStrings.CONSOLIDATED_BILLING
  - java.lang.String
*/
type OrganizationFeatureSet = _OrganizationFeatureSet | String

type OrganizationId = String

type OrganizationalUnitArn = String

type OrganizationalUnitId = String

type OrganizationalUnitName = String

type OrganizationalUnits = js.Array[OrganizationalUnit]

type ParentId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ROOT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
  - java.lang.String
*/
type ParentType = _ParentType | String

type Parents = js.Array[Parent]

type Policies = js.Array[PolicySummary]

type PolicyArn = String

type PolicyContent = String

type PolicyDescription = String

type PolicyId = String

type PolicyName = String

type PolicyTargetId = String

type PolicyTargets = js.Array[PolicyTargetSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_CONTROL_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.TAG_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.BACKUP_POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.AISERVICES_OPT_OUT_POLICY
  - java.lang.String
*/
type PolicyType = _PolicyType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_ENABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_DISABLE
  - java.lang.String
*/
type PolicyTypeStatus = _PolicyTypeStatus | String

type PolicyTypes = js.Array[PolicyTypeSummary]

type RoleName = String

type RootArn = String

type RootId = String

type RootName = String

type Roots = js.Array[Root]

type ServicePrincipal = String

type TagKey = String

type TagKeys = js.Array[TagKey]

type TagValue = String

type TaggableResourceId = String

type Tags = js.Array[Tag]

type TargetName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATIONAL_UNIT
  - typingsJapgolly.awsSdk.awsSdkStrings.ROOT
  - java.lang.String
*/
type TargetType = _TargetType | String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-11-28`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
