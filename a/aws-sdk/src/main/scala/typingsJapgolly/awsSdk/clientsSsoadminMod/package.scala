package typingsJapgolly.awsSdk.clientsSsoadminMod

import typingsJapgolly.awsSdk.awsSdkStrings.AWS_ACCOUNT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccessControlAttributeKey = String

type AccessControlAttributeList = js.Array[AccessControlAttribute]

type AccessControlAttributeValueSource = String

type AccessControlAttributeValueSourceList = js.Array[AccessControlAttributeValueSource]

type AccountAssignmentList = js.Array[AccountAssignment]

type AccountAssignmentOperationStatusList = js.Array[AccountAssignmentOperationStatusMetadata]

type AccountId = String

type AccountList = js.Array[AccountId]

type AttachedManagedPolicyList = js.Array[AttachedManagedPolicy]

type CustomerManagedPolicyReferenceList = js.Array[CustomerManagedPolicyReference]

type Date = js.Date

type Duration = String

type Id = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
  - java.lang.String
*/
type InstanceAccessControlAttributeConfigurationStatus = _InstanceAccessControlAttributeConfigurationStatus | String

type InstanceAccessControlAttributeConfigurationStatusReason = String

type InstanceArn = String

type InstanceList = js.Array[InstanceMetadata]

type ManagedPolicyArn = String

type ManagedPolicyName = String

type ManagedPolicyPath = String

type MaxResults = Double

type Name = String

type PermissionSetArn = String

type PermissionSetDescription = String

type PermissionSetList = js.Array[PermissionSetArn]

type PermissionSetName = String

type PermissionSetPolicyDocument = String

type PermissionSetProvisioningStatusList = js.Array[PermissionSetProvisioningStatusMetadata]

type PrincipalId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER
  - typingsJapgolly.awsSdk.awsSdkStrings.GROUP
  - java.lang.String
*/
type PrincipalType = _PrincipalType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ALL_PROVISIONED_ACCOUNTS
  - java.lang.String
*/
type ProvisionTargetType = _ProvisionTargetType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LATEST_PERMISSION_SET_PROVISIONED
  - typingsJapgolly.awsSdk.awsSdkStrings.LATEST_PERMISSION_SET_NOT_PROVISIONED
  - java.lang.String
*/
type ProvisioningStatus = _ProvisioningStatus | String

type Reason = String

type RelayState = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - java.lang.String
*/
type StatusValues = _StatusValues | String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TaggableResourceArn = String

type TargetId = String

type TargetType = AWS_ACCOUNT | String

type Token = String

type UUId = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-07-20`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
