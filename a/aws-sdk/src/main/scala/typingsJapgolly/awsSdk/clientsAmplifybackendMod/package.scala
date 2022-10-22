package typingsJapgolly.awsSdk.clientsAmplifybackendMod

import typingsJapgolly.awsSdk.awsSdkStrings.COGNITO
import typingsJapgolly.awsSdk.awsSdkStrings.S3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRE_DIGIT
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRE_LOWERCASE
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRE_SYMBOL
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRE_UPPERCASE
  - java.lang.String
*/
type AdditionalConstraintsElement = _AdditionalConstraintsElement | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.USER_POOL_ONLY
  - typingsJapgolly.awsSdk.awsSdkStrings.IDENTITY_POOL_AND_USER_POOL
  - java.lang.String
*/
type AuthResources = _AuthResources | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READ
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_AND_UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type AuthenticatedElement = _AuthenticatedElement | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.SMS
  - java.lang.String
*/
type DeliveryMethod = _DeliveryMethod | String

type ListOfAdditionalConstraintsElement = js.Array[AdditionalConstraintsElement]

type ListOfAuthenticatedElement = js.Array[AuthenticatedElement]

type ListOfBackendAPIAuthType = js.Array[BackendAPIAuthType]

type ListOfBackendJobRespObj = js.Array[BackendJobRespObj]

type ListOfMfaTypesElement = js.Array[MfaTypesElement]

type ListOfOAuthScopesElement = js.Array[OAuthScopesElement]

type ListOfRequiredSignUpAttributesElement = js.Array[RequiredSignUpAttributesElement]

type ListOfS3BucketInfo = js.Array[S3BucketInfo]

type ListOfString = js.Array[string]

type ListOfUnAuthenticatedElement = js.Array[UnAuthenticatedElement]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ON
  - typingsJapgolly.awsSdk.awsSdkStrings.OFF
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIONAL
  - java.lang.String
*/
type MFAMode = _MFAMode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SMS
  - typingsJapgolly.awsSdk.awsSdkStrings.TOTP
  - java.lang.String
*/
type MfaTypesElement = _MfaTypesElement | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.API_KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_IAM
  - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_COGNITO_USER_POOLS
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENID_CONNECT
  - java.lang.String
*/
type Mode = _Mode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CODE
  - typingsJapgolly.awsSdk.awsSdkStrings.IMPLICIT
  - java.lang.String
*/
type OAuthGrantType = _OAuthGrantType | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.OPENID
  - typingsJapgolly.awsSdk.awsSdkStrings.PROFILE
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_COGNITO_SIGNIN_USER_ADMIN
  - java.lang.String
*/
type OAuthScopesElement = _OAuthScopesElement | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ADDRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.BIRTHDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.FAMILY_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.GENDER
  - typingsJapgolly.awsSdk.awsSdkStrings.GIVEN_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.LOCALE
  - typingsJapgolly.awsSdk.awsSdkStrings.MIDDLE_NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.NAME
  - typingsJapgolly.awsSdk.awsSdkStrings.NICKNAME
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.PICTURE
  - typingsJapgolly.awsSdk.awsSdkStrings.PREFERRED_USERNAME
  - typingsJapgolly.awsSdk.awsSdkStrings.PROFILE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED_AT
  - typingsJapgolly.awsSdk.awsSdkStrings.WEBSITE
  - typingsJapgolly.awsSdk.awsSdkStrings.ZONE_INFO
  - java.lang.String
*/
type RequiredSignUpAttributesElement = _RequiredSignUpAttributesElement | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.OPTIMISTIC_CONCURRENCY
  - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMERGE
  - typingsJapgolly.awsSdk.awsSdkStrings.NONE
  - java.lang.String
*/
type ResolutionStrategy = _ResolutionStrategy | String

type Service = COGNITO | String

type ServiceName = S3 | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL
  - typingsJapgolly.awsSdk.awsSdkStrings.EMAIL_AND_PHONE_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.PHONE_NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.USERNAME
  - java.lang.String
*/
type SignInMethod = _SignInMethod | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.LATEST
  - typingsJapgolly.awsSdk.awsSdkStrings.STALE
  - java.lang.String
*/
type Status = _Status | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.READ
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_AND_UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type UnAuthenticatedElement = _UnAuthenticatedElement | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2020-08-11`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type double = Double

type integerMin1Max25 = Double

type string = String
