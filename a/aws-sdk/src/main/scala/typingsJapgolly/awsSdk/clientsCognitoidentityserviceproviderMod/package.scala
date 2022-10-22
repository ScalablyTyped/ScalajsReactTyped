package typingsJapgolly.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.V1_0
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountIdType = String

type AccessTokenValidityType = Double

type AccountTakeoverActionNotifyType = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
  - typingsJapgolly.awsSdk.awsSdkStrings.MFA_IF_CONFIGURED
  - typingsJapgolly.awsSdk.awsSdkStrings.MFA_REQUIRED
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_ACTION
  - java.lang.String
*/
type AccountTakeoverEventActionType = _AccountTakeoverEventActionType | String

type AdminCreateUserUnusedAccountValidityDaysType = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OFF
  - typingsJapgolly.awsSdk.awsSdkStrings.AUDIT
  - typingsJapgolly.awsSdk.awsSdkStrings.ENFORCED
  - java.lang.String
*/
type AdvancedSecurityModeType = _AdvancedSecurityModeType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.phone_number_
  - typingsJapgolly.awsSdk.awsSdkStrings.email__
  - typingsJapgolly.awsSdk.awsSdkStrings.preferred_username_
  - java.lang.String
*/
type AliasAttributeType = _AliasAttributeType | String

type AliasAttributesListType = js.Array[AliasAttributeType]

type ArnType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.String_
  - typingsJapgolly.awsSdk.awsSdkStrings.Number_
  - typingsJapgolly.awsSdk.awsSdkStrings.DateTime_
  - typingsJapgolly.awsSdk.awsSdkStrings.Boolean_
  - java.lang.String
*/
type AttributeDataType = _AttributeDataType | String

type AttributeListType = js.Array[AttributeType]

type AttributeMappingKeyType = String

type AttributeMappingType = StringDictionary[StringType]

type AttributeNameListType = js.Array[AttributeNameType]

type AttributeNameType = String

type AttributeValueType = String

type AttributesRequireVerificationBeforeUpdateType = js.Array[VerifiedAttributeType]

type AuthEventsType = js.Array[AuthEventType]

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
type AuthFlowType = _AuthFlowType | String

type AuthParametersType = StringDictionary[StringType]

type AuthSessionValidityType = Double

type BlockedIPRangeListType = js.Array[StringType]

type BooleanType = Boolean

type CSSType = String

type CSSVersionType = String

type CallbackURLsListType = js.Array[RedirectUrlType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Password_
  - typingsJapgolly.awsSdk.awsSdkStrings.Mfa
  - java.lang.String
*/
type ChallengeName = _ChallengeName | String

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
type ChallengeNameType = _ChallengeNameType | String

type ChallengeParametersType = StringDictionary[StringType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Success_
  - typingsJapgolly.awsSdk.awsSdkStrings.Failure_
  - java.lang.String
*/
type ChallengeResponse = _ChallengeResponse | String

type ChallengeResponseListType = js.Array[ChallengeResponseType]

type ChallengeResponsesType = StringDictionary[StringType]

type ClientIdType = String

type ClientMetadataType = StringDictionary[StringType]

type ClientNameType = String

type ClientPermissionListType = js.Array[ClientPermissionType]

type ClientPermissionType = String

type ClientSecretType = String

type CodeDeliveryDetailsListType = js.Array[CodeDeliveryDetailsType]

type CompletionMessageType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BLOCK
  - typingsJapgolly.awsSdk.awsSdkStrings.NO_ACTION
  - java.lang.String
*/
type CompromisedCredentialsEventActionType = _CompromisedCredentialsEventActionType | String

type ConfirmationCodeType = String

type CustomAttributeNameType = String

type CustomAttributesListType = js.Array[SchemaAttributeType]

type CustomEmailSenderLambdaVersionType = V1_0 | String

type CustomSMSSenderLambdaVersionType = V1_0 | String

type DateType = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIRM_WITH_LINK
  - typingsJapgolly.awsSdk.awsSdkStrings.CONFIRM_WITH_CODE
  - java.lang.String
*/
type DefaultEmailOptionType = _DefaultEmailOptionType | String

type DeliveryMediumListType = js.Array[DeliveryMediumType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SMS
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type DeliveryMediumType = _DeliveryMediumType | String

type DescriptionType = String

type DeviceKeyType = String

type DeviceListType = js.Array[DeviceType]

type DeviceNameType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.remembered
  - typingsJapgolly.awsSdk.awsSdkStrings.not_remembered
  - java.lang.String
*/
type DeviceRememberedStatusType = _DeviceRememberedStatusType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type DomainStatusType = _DomainStatusType | String

type DomainType = String

type DomainVersionType = String

type EmailAddressType = String

type EmailNotificationBodyType = String

type EmailNotificationSubjectType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.COGNITO_DEFAULT
  - typingsJapgolly.awsSdk.awsSdkStrings.DEVELOPER
  - java.lang.String
*/
type EmailSendingAccountType = _EmailSendingAccountType | String

type EmailVerificationMessageByLinkType = String

type EmailVerificationMessageType = String

type EmailVerificationSubjectByLinkType = String

type EmailVerificationSubjectType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGN_IN
  - typingsJapgolly.awsSdk.awsSdkStrings.PASSWORD_CHANGE
  - typingsJapgolly.awsSdk.awsSdkStrings.SIGN_UP
  - java.lang.String
*/
type EventFilterType = _EventFilterType | String

type EventFiltersType = js.Array[EventFilterType]

type EventIdType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Pass_
  - typingsJapgolly.awsSdk.awsSdkStrings.Fail_
  - typingsJapgolly.awsSdk.awsSdkStrings.InProgress_
  - java.lang.String
*/
type EventResponseType = _EventResponseType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SignIn
  - typingsJapgolly.awsSdk.awsSdkStrings.SignUp
  - typingsJapgolly.awsSdk.awsSdkStrings.ForgotPassword
  - typingsJapgolly.awsSdk.awsSdkStrings.PasswordChange
  - typingsJapgolly.awsSdk.awsSdkStrings.ResendCode
  - java.lang.String
*/
type EventType = _EventType | String

type ExplicitAuthFlowsListType = js.Array[ExplicitAuthFlowsType]

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
type ExplicitAuthFlowsType = _ExplicitAuthFlowsType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Valid_
  - typingsJapgolly.awsSdk.awsSdkStrings.Invalid_
  - java.lang.String
*/
type FeedbackValueType = _FeedbackValueType | String

type ForceAliasCreation = Boolean

type GenerateSecret = Boolean

type GroupListType = js.Array[GroupType]

type GroupNameType = String

type HexStringType = String

type HttpHeaderList = js.Array[HttpHeader]

type IdTokenValidityType = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SAML
  - typingsJapgolly.awsSdk.awsSdkStrings.Facebook
  - typingsJapgolly.awsSdk.awsSdkStrings.Google
  - typingsJapgolly.awsSdk.awsSdkStrings.LoginWithAmazon
  - typingsJapgolly.awsSdk.awsSdkStrings.SignInWithApple
  - typingsJapgolly.awsSdk.awsSdkStrings.OIDC
  - java.lang.String
*/
type IdentityProviderTypeType = _IdentityProviderTypeType | String

type IdpIdentifierType = String

type IdpIdentifiersListType = js.Array[IdpIdentifierType]

type ImageFileType = Buffer | js.typedarray.Uint8Array | Blob | String

type ImageUrlType = String

type IntegerType = Double

type ListOfStringTypes = js.Array[StringType]

type ListProvidersLimitType = Double

type ListResourceServersLimitType = Double

type LogoutURLsListType = js.Array[RedirectUrlType]

type LongType = Double

type MFAOptionListType = js.Array[MFAOptionType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RESEND
  - typingsJapgolly.awsSdk.awsSdkStrings.SUPPRESS
  - java.lang.String
*/
type MessageActionType = _MessageActionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.code_
  - typingsJapgolly.awsSdk.awsSdkStrings.implicit_
  - typingsJapgolly.awsSdk.awsSdkStrings.client_credentials_
  - java.lang.String
*/
type OAuthFlowType = _OAuthFlowType | String

type OAuthFlowsType = js.Array[OAuthFlowType]

type PaginationKey = String

type PaginationKeyType = String

type PasswordPolicyMinLengthType = Double

type PasswordType = String

type PoolQueryLimitType = Double

type PreSignedUrlType = String

type PrecedenceType = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LEGACY
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - java.lang.String
*/
type PreventUserExistenceErrorTypes = _PreventUserExistenceErrorTypes | String

type PriorityType = Double

type ProviderDetailsType = StringDictionary[StringType]

type ProviderNameType = String

type ProviderNameTypeV1 = String

type ProvidersListType = js.Array[ProviderDescription]

type QueryLimit = Double

type QueryLimitType = Double

type RecoveryMechanismsType = js.Array[RecoveryOptionType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.verified_email
  - typingsJapgolly.awsSdk.awsSdkStrings.verified_phone_number
  - typingsJapgolly.awsSdk.awsSdkStrings.admin_only
  - java.lang.String
*/
type RecoveryOptionNameType = _RecoveryOptionNameType | String

type RedirectUrlType = String

type RefreshTokenValidityType = Double

type RegionCodeType = String

type ResourceServerIdentifierType = String

type ResourceServerNameType = String

type ResourceServerScopeDescriptionType = String

type ResourceServerScopeListType = js.Array[ResourceServerScopeType]

type ResourceServerScopeNameType = String

type ResourceServersListType = js.Array[ResourceServerType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NoRisk
  - typingsJapgolly.awsSdk.awsSdkStrings.AccountTakeover
  - typingsJapgolly.awsSdk.awsSdkStrings.Block_
  - java.lang.String
*/
type RiskDecisionType = _RiskDecisionType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Low_
  - typingsJapgolly.awsSdk.awsSdkStrings.Medium_
  - typingsJapgolly.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type RiskLevelType = _RiskLevelType | String

type S3BucketType = String

type SESConfigurationSet = String

type SchemaAttributesListType = js.Array[SchemaAttributeType]

type ScopeListType = js.Array[ScopeType]

type ScopeType = String

type SearchPaginationTokenType = String

type SearchedAttributeNamesListType = js.Array[AttributeNameType]

type SecretCodeType = String

type SecretHashType = String

type SessionType = String

type SkippedIPRangeListType = js.Array[StringType]

type SmsVerificationMessageType = String

type SoftwareTokenMFAUserCodeType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.Enabled_
  - typingsJapgolly.awsSdk.awsSdkStrings.Disabled_
  - java.lang.String
*/
type StatusType = _StatusType | String

type StringType = String

type SupportedIdentityProvidersListType = js.Array[ProviderNameType]

type TagKeysType = String

type TagValueType = String

type TemporaryPasswordValidityDaysType = Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.seconds__
  - typingsJapgolly.awsSdk.awsSdkStrings.minutes
  - typingsJapgolly.awsSdk.awsSdkStrings.hours__
  - typingsJapgolly.awsSdk.awsSdkStrings.days__
  - java.lang.String
*/
type TimeUnitsType = _TimeUnitsType | String

type TokenModelType = String

type UserFilterType = String

type UserImportJobIdType = String

type UserImportJobNameType = String

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
type UserImportJobStatusType = _UserImportJobStatusType | String

type UserImportJobsListType = js.Array[UserImportJobType]

type UserMFASettingListType = js.Array[StringType]

type UserPoolClientListType = js.Array[UserPoolClientDescription]

type UserPoolIdType = String

type UserPoolListType = js.Array[UserPoolDescriptionType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OFF
  - typingsJapgolly.awsSdk.awsSdkStrings.ON
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONAL
  - java.lang.String
*/
type UserPoolMfaType = _UserPoolMfaType | String

type UserPoolNameType = String

type UserPoolTagsListType = js.Array[TagKeysType]

type UserPoolTagsType = StringDictionary[TagValueType]

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
type UserStatusType = _UserStatusType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.phone_number_
  - typingsJapgolly.awsSdk.awsSdkStrings.email__
  - java.lang.String
*/
type UsernameAttributeType = _UsernameAttributeType | String

type UsernameAttributesListType = js.Array[UsernameAttributeType]

type UsernameType = String

type UsersListType = js.Array[UserType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.phone_number_
  - typingsJapgolly.awsSdk.awsSdkStrings.email__
  - java.lang.String
*/
type VerifiedAttributeType = _VerifiedAttributeType | String

type VerifiedAttributesListType = js.Array[VerifiedAttributeType]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type VerifySoftwareTokenResponseType = _VerifySoftwareTokenResponseType | String

type WrappedBooleanType = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-04-18`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
