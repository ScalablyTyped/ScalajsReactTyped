package typingsJapgolly.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.SNS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CURRENT_ACCOUNT
  - typingsJapgolly.awsSdk.awsSdkStrings.ORGANIZATION
  - java.lang.String
*/
type AccountAccessType = _AccountAccessType | java.lang.String

type AllowedOrganization = java.lang.String

type AllowedOrganizations = js.Array[AllowedOrganization]

type ApiKeyName = java.lang.String

type ApiKeyToken = java.lang.String

type AssertionAttribute = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_SSO
  - typingsJapgolly.awsSdk.awsSdkStrings.SAML
  - java.lang.String
*/
type AuthenticationProviderTypes = _AuthenticationProviderTypes | java.lang.String

type AuthenticationProviders = js.Array[AuthenticationProviderTypes]

type Boolean = scala.Boolean

type ClientToken = java.lang.String

type CreateWorkspaceApiKeyRequestSecondsToLiveInteger = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_OPENSEARCH_SERVICE
  - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDWATCH
  - typingsJapgolly.awsSdk.awsSdkStrings.PROMETHEUS
  - typingsJapgolly.awsSdk.awsSdkStrings.XRAY
  - typingsJapgolly.awsSdk.awsSdkStrings.TIMESTREAM
  - typingsJapgolly.awsSdk.awsSdkStrings.SITEWISE
  - typingsJapgolly.awsSdk.awsSdkStrings.ATHENA
  - typingsJapgolly.awsSdk.awsSdkStrings.REDSHIFT
  - java.lang.String
*/
type DataSourceType = _DataSourceType | java.lang.String

type DataSourceTypesList = js.Array[DataSourceType]

type Description = java.lang.String

type Endpoint = java.lang.String

type GrafanaVersion = java.lang.String

type IamRoleArn = java.lang.String

type IdpMetadataUrl = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENTERPRISE
  - typingsJapgolly.awsSdk.awsSdkStrings.ENTERPRISE_FREE_TRIAL
  - java.lang.String
*/
type LicenseType = _LicenseType | java.lang.String

type ListPermissionsRequestMaxResultsInteger = Double

type ListWorkspacesRequestMaxResultsInteger = Double

type LoginValidityDuration = Double

type NotificationDestinationType = SNS | java.lang.String

type NotificationDestinationsList = js.Array[NotificationDestinationType]

type OrganizationRoleName = java.lang.String

type OrganizationalUnit = java.lang.String

type OrganizationalUnitList = js.Array[OrganizationalUnit]

type PaginationToken = java.lang.String

type PermissionEntryList = js.Array[PermissionEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOMER_MANAGED
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVICE_MANAGED
  - java.lang.String
*/
type PermissionType = _PermissionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN
  - typingsJapgolly.awsSdk.awsSdkStrings.EDITOR
  - typingsJapgolly.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
type Role = _Role | java.lang.String

type RoleValue = java.lang.String

type RoleValueList = js.Array[RoleValue]

type SSOClientId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIGURED
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONFIGURED
  - java.lang.String
*/
type SamlConfigurationStatus = _SamlConfigurationStatus | java.lang.String

type SsoId = java.lang.String

type StackSetName = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeys = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADD
  - typingsJapgolly.awsSdk.awsSdkStrings.REVOKE
  - java.lang.String
*/
type UpdateAction = _UpdateAction | java.lang.String

type UpdateErrorCodeInteger = Double

type UpdateErrorList = js.Array[UpdateError]

type UpdateInstructionBatch = js.Array[UpdateInstruction]

type UserList = js.Array[User]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SSO_USER
  - typingsJapgolly.awsSdk.awsSdkStrings.SSO_GROUP
  - java.lang.String
*/
type UserType = _UserType | java.lang.String

type WorkspaceId = java.lang.String

type WorkspaceList = js.Array[WorkspaceSummary]

type WorkspaceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPGRADING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.UPGRADE_FAILED
  - typingsJapgolly.awsSdk.awsSdkStrings.LICENSE_REMOVAL_FAILED
  - java.lang.String
*/
type WorkspaceStatus = _WorkspaceStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-08-18`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
