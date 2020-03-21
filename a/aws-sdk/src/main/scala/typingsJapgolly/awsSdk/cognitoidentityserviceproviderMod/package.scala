package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cognitoidentityserviceproviderMod {
  type AWSAccountIdType = java.lang.String
  type AccountTakeoverActionNotifyType = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
    - typingsJapgolly.awsSdk.awsSdkStrings.MFA_IF_CONFIGURED
    - typingsJapgolly.awsSdk.awsSdkStrings.MFA_REQUIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_ACTION
    - java.lang.String
  */
  type AccountTakeoverEventActionType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._AccountTakeoverEventActionType | java.lang.String
  type AdminCreateUserUnusedAccountValidityDaysType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - typingsJapgolly.awsSdk.awsSdkStrings.AUDIT
    - typingsJapgolly.awsSdk.awsSdkStrings.ENFORCED
    - java.lang.String
  */
  type AdvancedSecurityModeType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._AdvancedSecurityModeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.phone_number
    - typingsJapgolly.awsSdk.awsSdkStrings.email__
    - typingsJapgolly.awsSdk.awsSdkStrings.preferred_username
    - java.lang.String
  */
  type AliasAttributeType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._AliasAttributeType | java.lang.String
  type AliasAttributesListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.AliasAttributeType]
  type ArnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.String_
    - typingsJapgolly.awsSdk.awsSdkStrings.Number_
    - typingsJapgolly.awsSdk.awsSdkStrings.DateTime_
    - typingsJapgolly.awsSdk.awsSdkStrings.Boolean_
    - java.lang.String
  */
  type AttributeDataType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._AttributeDataType | java.lang.String
  type AttributeListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.AttributeType]
  type AttributeMappingKeyType = java.lang.String
  type AttributeMappingType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type AttributeNameListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.AttributeNameType]
  type AttributeNameType = java.lang.String
  type AttributeValueType = java.lang.String
  type AuthEventsType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.AuthEventType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_SRP_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.REFRESH_TOKEN_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.REFRESH_TOKEN
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_PASSWORD_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN_USER_PASSWORD_AUTH
    - java.lang.String
  */
  type AuthFlowType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._AuthFlowType | java.lang.String
  type AuthParametersType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.AuthParametersValueType]
  type AuthParametersValueType = java.lang.String
  type BlockedIPRangeListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type BooleanType = scala.Boolean
  type CSSType = java.lang.String
  type CSSVersionType = java.lang.String
  type CallbackURLsListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.RedirectUrlType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Password_
    - typingsJapgolly.awsSdk.awsSdkStrings.Mfa
    - java.lang.String
  */
  type ChallengeName = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._ChallengeName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SMS_MFA
    - typingsJapgolly.awsSdk.awsSdkStrings.SOFTWARE_TOKEN_MFA
    - typingsJapgolly.awsSdk.awsSdkStrings.SELECT_MFA_TYPE
    - typingsJapgolly.awsSdk.awsSdkStrings.MFA_SETUP
    - typingsJapgolly.awsSdk.awsSdkStrings.PASSWORD_VERIFIER
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_CHALLENGE
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_SRP_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVICE_PASSWORD_VERIFIER
    - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW_PASSWORD_REQUIRED
    - java.lang.String
  */
  type ChallengeNameType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._ChallengeNameType | java.lang.String
  type ChallengeParametersType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failure_
    - java.lang.String
  */
  type ChallengeResponse = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._ChallengeResponse | java.lang.String
  type ChallengeResponseListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ChallengeResponseType]
  type ChallengeResponsesType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ClientApiVersions
  type ClientIdType = java.lang.String
  type ClientMetadataType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type ClientNameType = java.lang.String
  type ClientPermissionListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ClientPermissionType]
  type ClientPermissionType = java.lang.String
  type ClientSecretType = java.lang.String
  type CodeDeliveryDetailsListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.CodeDeliveryDetailsType]
  type CompletionMessageType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
    - typingsJapgolly.awsSdk.awsSdkStrings.NO_ACTION
    - java.lang.String
  */
  type CompromisedCredentialsEventActionType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._CompromisedCredentialsEventActionType | java.lang.String
  type ConfirmationCodeType = java.lang.String
  type CustomAttributeNameType = java.lang.String
  type CustomAttributesListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.SchemaAttributeType]
  type DateType = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFIRM_WITH_LINK
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFIRM_WITH_CODE
    - java.lang.String
  */
  type DefaultEmailOptionType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._DefaultEmailOptionType | java.lang.String
  type DeliveryMediumListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.DeliveryMediumType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SMS
    - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
    - java.lang.String
  */
  type DeliveryMediumType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._DeliveryMediumType | java.lang.String
  type DescriptionType = java.lang.String
  type DeviceKeyType = java.lang.String
  type DeviceListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.DeviceType]
  type DeviceNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.remembered
    - typingsJapgolly.awsSdk.awsSdkStrings.not_remembered
    - java.lang.String
  */
  type DeviceRememberedStatusType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._DeviceRememberedStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DomainStatusType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._DomainStatusType | java.lang.String
  type DomainType = java.lang.String
  type DomainVersionType = java.lang.String
  type EmailAddressType = java.lang.String
  type EmailNotificationBodyType = java.lang.String
  type EmailNotificationSubjectType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.COGNITO_DEFAULT
    - typingsJapgolly.awsSdk.awsSdkStrings.DEVELOPER
    - java.lang.String
  */
  type EmailSendingAccountType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._EmailSendingAccountType | java.lang.String
  type EmailVerificationMessageByLinkType = java.lang.String
  type EmailVerificationMessageType = java.lang.String
  type EmailVerificationSubjectByLinkType = java.lang.String
  type EmailVerificationSubjectType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SIGN_IN
    - typingsJapgolly.awsSdk.awsSdkStrings.PASSWORD_CHANGE
    - typingsJapgolly.awsSdk.awsSdkStrings.SIGN_UP
    - java.lang.String
  */
  type EventFilterType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._EventFilterType | java.lang.String
  type EventFiltersType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.EventFilterType]
  type EventIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Success_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failure_
    - java.lang.String
  */
  type EventResponseType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._EventResponseType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SignIn
    - typingsJapgolly.awsSdk.awsSdkStrings.SignUp
    - typingsJapgolly.awsSdk.awsSdkStrings.ForgotPassword
    - java.lang.String
  */
  type EventType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._EventType | java.lang.String
  type ExplicitAuthFlowsListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ExplicitAuthFlowsType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ADMIN_NO_SRP_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.CUSTOM_AUTH_FLOW_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.USER_PASSWORD_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_ADMIN_USER_PASSWORD_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_CUSTOM_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_USER_PASSWORD_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_USER_SRP_AUTH
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW_REFRESH_TOKEN_AUTH
    - java.lang.String
  */
  type ExplicitAuthFlowsType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._ExplicitAuthFlowsType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Valid_
    - typingsJapgolly.awsSdk.awsSdkStrings.Invalid_
    - java.lang.String
  */
  type FeedbackValueType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._FeedbackValueType | java.lang.String
  type ForceAliasCreation = scala.Boolean
  type GenerateSecret = scala.Boolean
  type GroupListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.GroupType]
  type GroupNameType = java.lang.String
  type HexStringType = java.lang.String
  type HttpHeaderList = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.HttpHeader]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SAML
    - typingsJapgolly.awsSdk.awsSdkStrings.Facebook
    - typingsJapgolly.awsSdk.awsSdkStrings.Google
    - typingsJapgolly.awsSdk.awsSdkStrings.LoginWithAmazon
    - typingsJapgolly.awsSdk.awsSdkStrings.SignInWithApple
    - typingsJapgolly.awsSdk.awsSdkStrings.OIDC
    - java.lang.String
  */
  type IdentityProviderTypeType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._IdentityProviderTypeType | java.lang.String
  type IdpIdentifierType = java.lang.String
  type IdpIdentifiersListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.IdpIdentifierType]
  type ImageFileType = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.Blob | java.lang.String
  type ImageUrlType = java.lang.String
  type IntegerType = scala.Double
  type ListOfStringTypes = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type ListProvidersLimitType = scala.Double
  type ListResourceServersLimitType = scala.Double
  type LogoutURLsListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.RedirectUrlType]
  type LongType = scala.Double
  type MFAOptionListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.MFAOptionType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.RESEND
    - typingsJapgolly.awsSdk.awsSdkStrings.SUPPRESS
    - java.lang.String
  */
  type MessageActionType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._MessageActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.code
    - typingsJapgolly.awsSdk.awsSdkStrings.`implicit`
    - typingsJapgolly.awsSdk.awsSdkStrings.client_credentials
    - java.lang.String
  */
  type OAuthFlowType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._OAuthFlowType | java.lang.String
  type OAuthFlowsType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.OAuthFlowType]
  type PaginationKey = java.lang.String
  type PaginationKeyType = java.lang.String
  type PasswordPolicyMinLengthType = scala.Double
  type PasswordType = java.lang.String
  type PoolQueryLimitType = scala.Double
  type PreSignedUrlType = java.lang.String
  type PrecedenceType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.LEGACY
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - java.lang.String
  */
  type PreventUserExistenceErrorTypes = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._PreventUserExistenceErrorTypes | java.lang.String
  type PriorityType = scala.Double
  type ProviderDetailsType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type ProviderNameType = java.lang.String
  type ProviderNameTypeV1 = java.lang.String
  type ProvidersListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ProviderDescription]
  type QueryLimit = scala.Double
  type QueryLimitType = scala.Double
  type RecoveryMechanismsType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.RecoveryOptionType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.verified_email
    - typingsJapgolly.awsSdk.awsSdkStrings.verified_phone_number
    - typingsJapgolly.awsSdk.awsSdkStrings.admin_only
    - java.lang.String
  */
  type RecoveryOptionNameType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._RecoveryOptionNameType | java.lang.String
  type RedirectUrlType = java.lang.String
  type RefreshTokenValidityType = scala.Double
  type ResourceServerIdentifierType = java.lang.String
  type ResourceServerNameType = java.lang.String
  type ResourceServerScopeDescriptionType = java.lang.String
  type ResourceServerScopeListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ResourceServerScopeType]
  type ResourceServerScopeNameType = java.lang.String
  type ResourceServersListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ResourceServerType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NoRisk
    - typingsJapgolly.awsSdk.awsSdkStrings.AccountTakeover
    - typingsJapgolly.awsSdk.awsSdkStrings.Block_
    - java.lang.String
  */
  type RiskDecisionType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._RiskDecisionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Low_
    - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
    - typingsJapgolly.awsSdk.awsSdkStrings.High_
    - java.lang.String
  */
  type RiskLevelType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._RiskLevelType | java.lang.String
  type S3BucketType = java.lang.String
  type SESConfigurationSet = java.lang.String
  type SchemaAttributesListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.SchemaAttributeType]
  type ScopeListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ScopeType]
  type ScopeType = java.lang.String
  type SearchPaginationTokenType = java.lang.String
  type SearchedAttributeNamesListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.AttributeNameType]
  type SecretCodeType = java.lang.String
  type SecretHashType = java.lang.String
  type SessionType = java.lang.String
  type SkippedIPRangeListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type SmsVerificationMessageType = java.lang.String
  type SoftwareTokenMFAUserCodeType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
    - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
    - java.lang.String
  */
  type StatusType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._StatusType | java.lang.String
  type StringType = java.lang.String
  type SupportedIdentityProvidersListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.ProviderNameType]
  type TagKeysType = java.lang.String
  type TagValueType = java.lang.String
  type TemporaryPasswordValidityDaysType = scala.Double
  type TokenModelType = java.lang.String
  type UserFilterType = java.lang.String
  type UserImportJobIdType = java.lang.String
  type UserImportJobNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.Created_
    - typingsJapgolly.awsSdk.awsSdkStrings.Pending_
    - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopping_
    - typingsJapgolly.awsSdk.awsSdkStrings.Expired_
    - typingsJapgolly.awsSdk.awsSdkStrings.Stopped_
    - typingsJapgolly.awsSdk.awsSdkStrings.Failed_
    - typingsJapgolly.awsSdk.awsSdkStrings.Succeeded_
    - java.lang.String
  */
  type UserImportJobStatusType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._UserImportJobStatusType | java.lang.String
  type UserImportJobsListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.UserImportJobType]
  type UserMFASettingListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.StringType]
  type UserPoolClientListType = js.Array[
    typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.UserPoolClientDescription
  ]
  type UserPoolIdType = java.lang.String
  type UserPoolListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.UserPoolDescriptionType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OFF
    - typingsJapgolly.awsSdk.awsSdkStrings.ON
    - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONAL
    - java.lang.String
  */
  type UserPoolMfaType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._UserPoolMfaType | java.lang.String
  type UserPoolNameType = java.lang.String
  type UserPoolTagsListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.TagKeysType]
  type UserPoolTagsType = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.TagValueType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNCONFIRMED
    - typingsJapgolly.awsSdk.awsSdkStrings.CONFIRMED
    - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
    - typingsJapgolly.awsSdk.awsSdkStrings.COMPROMISED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNKNOWN
    - typingsJapgolly.awsSdk.awsSdkStrings.RESET_REQUIRED
    - typingsJapgolly.awsSdk.awsSdkStrings.FORCE_CHANGE_PASSWORD
    - java.lang.String
  */
  type UserStatusType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._UserStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.phone_number
    - typingsJapgolly.awsSdk.awsSdkStrings.email__
    - java.lang.String
  */
  type UsernameAttributeType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._UsernameAttributeType | java.lang.String
  type UsernameAttributesListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.UsernameAttributeType]
  type UsernameType = java.lang.String
  type UsersListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.UserType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.phone_number
    - typingsJapgolly.awsSdk.awsSdkStrings.email__
    - java.lang.String
  */
  type VerifiedAttributeType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._VerifiedAttributeType | java.lang.String
  type VerifiedAttributesListType = js.Array[typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod.VerifiedAttributeType]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - java.lang.String
  */
  type VerifySoftwareTokenResponseType = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._VerifySoftwareTokenResponseType | java.lang.String
  type WrappedBooleanType = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-04-18`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.cognitoidentityserviceproviderMod._apiVersion | java.lang.String
}
