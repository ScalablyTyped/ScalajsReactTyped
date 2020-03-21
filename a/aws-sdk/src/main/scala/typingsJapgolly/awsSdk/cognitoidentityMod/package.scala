package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cognitoidentityMod {
  type ARNString = java.lang.String
  type AccessKeyString = java.lang.String
  type AccountId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AuthenticatedRole
    - typingsJapgolly.awsSdk.awsSdkStrings.Deny_
    - java.lang.String
  */
  type AmbiguousRoleResolutionType = typingsJapgolly.awsSdk.cognitoidentityMod._AmbiguousRoleResolutionType | java.lang.String
  type ClaimName = java.lang.String
  type ClaimValue = java.lang.String
  type ClassicFlow = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cognitoidentityMod.ClientApiVersions
  type CognitoIdentityProviderClientId = java.lang.String
  type CognitoIdentityProviderList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.CognitoIdentityProvider]
  type CognitoIdentityProviderName = java.lang.String
  type CognitoIdentityProviderTokenCheck = scala.Boolean
  type DateType = js.Date
  type DeveloperProviderName = java.lang.String
  type DeveloperUserIdentifier = java.lang.String
  type DeveloperUserIdentifierList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.DeveloperUserIdentifier]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AccessDenied
    - typingsJapgolly.awsSdk.awsSdkStrings.InternalServerError
    - java.lang.String
  */
  type ErrorCode = typingsJapgolly.awsSdk.cognitoidentityMod._ErrorCode | java.lang.String
  type HideDisabled = scala.Boolean
  type IdentitiesList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.IdentityDescription]
  type IdentityId = java.lang.String
  type IdentityIdList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.IdentityId]
  type IdentityPoolId = java.lang.String
  type IdentityPoolName = java.lang.String
  type IdentityPoolTagsListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.TagKeysType]
  type IdentityPoolTagsType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityMod.TagValueType]
  type IdentityPoolUnauthenticated = scala.Boolean
  type IdentityPoolsList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.IdentityPoolShortDescription]
  type IdentityProviderId = java.lang.String
  type IdentityProviderName = java.lang.String
  type IdentityProviderToken = java.lang.String
  type IdentityProviders = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityMod.IdentityProviderId]
  type LoginsList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.IdentityProviderName]
  type LoginsMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityMod.IdentityProviderToken]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Equals_
    - typingsJapgolly.awsSdk.awsSdkStrings.Contains_
    - typingsJapgolly.awsSdk.awsSdkStrings.StartsWith
    - typingsJapgolly.awsSdk.awsSdkStrings.NotEqual
    - java.lang.String
  */
  type MappingRuleMatchType = typingsJapgolly.awsSdk.cognitoidentityMod._MappingRuleMatchType | java.lang.String
  type MappingRulesList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.MappingRule]
  type OIDCProviderList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.ARNString]
  type OIDCToken = java.lang.String
  type PaginationKey = java.lang.String
  type QueryLimit = scala.Double
  type RoleMappingMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityMod.RoleMapping]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Token_
    - typingsJapgolly.awsSdk.awsSdkStrings.Rules
    - java.lang.String
  */
  type RoleMappingType = typingsJapgolly.awsSdk.cognitoidentityMod._RoleMappingType | java.lang.String
  type RoleType = java.lang.String
  type RolesMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityMod.ARNString]
  type SAMLProviderList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.ARNString]
  type SecretKeyString = java.lang.String
  type SessionTokenString = java.lang.String
  type TagKeysType = java.lang.String
  type TagValueType = java.lang.String
  type TokenDuration = scala.Double
  type UnprocessedIdentityIdList = js.Array[typingsJapgolly.awsSdk.cognitoidentityMod.UnprocessedIdentityId]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2014-06-30`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cognitoidentityMod._apiVersion | java.lang.String
}
