package typingsJapgolly.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.csv__
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HEADER
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHORIZER
  - java.lang.String
*/
type ApiKeySourceType = _ApiKeySourceType | java.lang.String

type ApiKeysFormat = csv__ | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TOKEN
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST
  - typingsJapgolly.awsSdk.awsSdkStrings.COGNITO_USER_POOLS
  - java.lang.String
*/
type AuthorizerType = _AuthorizerType | java.lang.String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`0Dot5`
  - typingsJapgolly.awsSdk.awsSdkStrings.`1Dot6`
  - typingsJapgolly.awsSdk.awsSdkStrings.`6Dot1`
  - typingsJapgolly.awsSdk.awsSdkStrings.`13Dot5`
  - typingsJapgolly.awsSdk.awsSdkStrings.`28Dot4`
  - typingsJapgolly.awsSdk.awsSdkStrings.`58Dot2`
  - typingsJapgolly.awsSdk.awsSdkStrings.`118`
  - typingsJapgolly.awsSdk.awsSdkStrings.`237`
  - java.lang.String
*/
type CacheClusterSize = _CacheClusterSize | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.FLUSH_IN_PROGRESS
  - java.lang.String
*/
type CacheClusterStatus = _CacheClusterStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNET
  - typingsJapgolly.awsSdk.awsSdkStrings.VPC_LINK
  - java.lang.String
*/
type ConnectionType = _ConnectionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CONVERT_TO_BINARY
  - typingsJapgolly.awsSdk.awsSdkStrings.CONVERT_TO_TEXT
  - java.lang.String
*/
type ContentHandlingStrategy = _ContentHandlingStrategy | java.lang.String

type DocumentationPartLocationStatusCode = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.API
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHORIZER
  - typingsJapgolly.awsSdk.awsSdkStrings.MODEL
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE
  - typingsJapgolly.awsSdk.awsSdkStrings.METHOD
  - typingsJapgolly.awsSdk.awsSdkStrings.PATH_PARAMETER
  - typingsJapgolly.awsSdk.awsSdkStrings.QUERY_PARAMETER
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST_HEADER
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST_BODY
  - typingsJapgolly.awsSdk.awsSdkStrings.RESPONSE
  - typingsJapgolly.awsSdk.awsSdkStrings.RESPONSE_HEADER
  - typingsJapgolly.awsSdk.awsSdkStrings.RESPONSE_BODY
  - java.lang.String
*/
type DocumentationPartType = _DocumentationPartType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_CERTIFICATE_REIMPORT
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING_OWNERSHIP_VERIFICATION
  - java.lang.String
*/
type DomainNameStatus = _DomainNameStatus | java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REGIONAL
  - typingsJapgolly.awsSdk.awsSdkStrings.EDGE
  - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
  - java.lang.String
*/
type EndpointType = _EndpointType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_4XX
  - typingsJapgolly.awsSdk.awsSdkStrings.DEFAULT_5XX
  - typingsJapgolly.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND
  - typingsJapgolly.awsSdk.awsSdkStrings.UNAUTHORIZED
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_API_KEY
  - typingsJapgolly.awsSdk.awsSdkStrings.ACCESS_DENIED
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHORIZER_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.AUTHORIZER_CONFIGURATION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INVALID_SIGNATURE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXPIRED_TOKEN
  - typingsJapgolly.awsSdk.awsSdkStrings.MISSING_AUTHENTICATION_TOKEN
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGRATION_FAILURE
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGRATION_TIMEOUT
  - typingsJapgolly.awsSdk.awsSdkStrings.API_CONFIGURATION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.UNSUPPORTED_MEDIA_TYPE
  - typingsJapgolly.awsSdk.awsSdkStrings.BAD_REQUEST_PARAMETERS
  - typingsJapgolly.awsSdk.awsSdkStrings.BAD_REQUEST_BODY
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST_TOO_LARGE
  - typingsJapgolly.awsSdk.awsSdkStrings.THROTTLED
  - typingsJapgolly.awsSdk.awsSdkStrings.QUOTA_EXCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.WAF_FILTERED
  - java.lang.String
*/
type GatewayResponseType = _GatewayResponseType | java.lang.String

type Integer = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS
  - typingsJapgolly.awsSdk.awsSdkStrings.MOCK
  - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_PROXY
  - typingsJapgolly.awsSdk.awsSdkStrings.AWS_PROXY
  - java.lang.String
*/
type IntegrationType = _IntegrationType | java.lang.String

type ListOfARNs = js.Array[ProviderARN]

type ListOfApiKey = js.Array[ApiKey]

type ListOfApiStage = js.Array[ApiStage]

type ListOfAuthorizer = js.Array[Authorizer]

type ListOfBasePathMapping = js.Array[BasePathMapping]

type ListOfClientCertificate = js.Array[ClientCertificate]

type ListOfDeployment = js.Array[Deployment]

type ListOfDocumentationPart = js.Array[DocumentationPart]

type ListOfDocumentationVersion = js.Array[DocumentationVersion]

type ListOfDomainName = js.Array[DomainName]

type ListOfEndpointType = js.Array[EndpointType]

type ListOfGatewayResponse = js.Array[GatewayResponse]

type ListOfLong = js.Array[Long]

type ListOfModel = js.Array[Model]

type ListOfPatchOperation = js.Array[PatchOperation]

type ListOfRequestValidator = js.Array[RequestValidator]

type ListOfResource = js.Array[Resource]

type ListOfRestApi = js.Array[RestApi]

type ListOfSdkConfigurationProperty = js.Array[SdkConfigurationProperty]

type ListOfSdkType = js.Array[SdkType]

type ListOfStage = js.Array[Stage]

type ListOfStageKeys = js.Array[StageKey]

type ListOfString = js.Array[String]

type ListOfUsage = js.Array[ListOfLong]

type ListOfUsagePlan = js.Array[UsagePlan]

type ListOfUsagePlanKey = js.Array[UsagePlanKey]

type ListOfVpcLink = js.Array[VpcLink]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENTED
  - typingsJapgolly.awsSdk.awsSdkStrings.UNDOCUMENTED
  - java.lang.String
*/
type LocationStatusType = _LocationStatusType | java.lang.String

type Long = scala.Double

type MapOfApiStageThrottleSettings = StringDictionary[ThrottleSettings]

type MapOfIntegrationResponse = StringDictionary[IntegrationResponse]

type MapOfKeyUsages = StringDictionary[ListOfUsage]

type MapOfMethod = StringDictionary[Method]

type MapOfMethodResponse = StringDictionary[MethodResponse]

type MapOfMethodSettings = StringDictionary[MethodSetting]

type MapOfMethodSnapshot = StringDictionary[MethodSnapshot]

type MapOfStringToBoolean = StringDictionary[NullableBoolean]

type MapOfStringToList = StringDictionary[ListOfString]

type MapOfStringToString = StringDictionary[String]

type NullableBoolean = scala.Boolean

type NullableInteger = scala.Double

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.add__
  - typingsJapgolly.awsSdk.awsSdkStrings.remove__
  - typingsJapgolly.awsSdk.awsSdkStrings.replace_
  - typingsJapgolly.awsSdk.awsSdkStrings.move
  - typingsJapgolly.awsSdk.awsSdkStrings.copy_
  - typingsJapgolly.awsSdk.awsSdkStrings.test__
  - java.lang.String
*/
type Op = _Op | java.lang.String

type PathToMapOfMethodSnapshot = StringDictionary[MapOfMethodSnapshot]

type ProviderARN = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.merge__
  - typingsJapgolly.awsSdk.awsSdkStrings.overwrite__
  - java.lang.String
*/
type PutMode = _PutMode | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.DAY
  - typingsJapgolly.awsSdk.awsSdkStrings.WEEK
  - typingsJapgolly.awsSdk.awsSdkStrings.MONTH
  - java.lang.String
*/
type QuotaPeriodType = _QuotaPeriodType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.TLS_1_0
  - typingsJapgolly.awsSdk.awsSdkStrings.TLS_1_2
  - java.lang.String
*/
type SecurityPolicy = _SecurityPolicy | java.lang.String

type StatusCode = java.lang.String

type String = java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FAIL_WITH_403
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEED_WITH_RESPONSE_HEADER
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEED_WITHOUT_RESPONSE_HEADER
  - java.lang.String
*/
type UnauthorizedCacheControlHeaderStrategy = _UnauthorizedCacheControlHeaderStrategy | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type VpcLinkStatus = _VpcLinkStatus | java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2015-07-09`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
