package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apigatewayMod {
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HEADER
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTHORIZER
    - java.lang.String
  */
  type ApiKeySourceType = typingsJapgolly.awsSdk.apigatewayMod._ApiKeySourceType | java.lang.String
  type ApiKeysFormat = typingsJapgolly.awsSdk.awsSdkStrings.csv_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TOKEN
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUEST
    - typingsJapgolly.awsSdk.awsSdkStrings.COGNITO_USER_POOLS
    - java.lang.String
  */
  type AuthorizerType = typingsJapgolly.awsSdk.apigatewayMod._AuthorizerType | java.lang.String
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
  type CacheClusterSize = typingsJapgolly.awsSdk.apigatewayMod._CacheClusterSize | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.FLUSH_IN_PROGRESS
    - java.lang.String
  */
  type CacheClusterStatus = typingsJapgolly.awsSdk.apigatewayMod._CacheClusterStatus | java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.apigatewayMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INTERNET
    - typingsJapgolly.awsSdk.awsSdkStrings.VPC_LINK
    - java.lang.String
  */
  type ConnectionType = typingsJapgolly.awsSdk.apigatewayMod._ConnectionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CONVERT_TO_BINARY
    - typingsJapgolly.awsSdk.awsSdkStrings.CONVERT_TO_TEXT
    - java.lang.String
  */
  type ContentHandlingStrategy = typingsJapgolly.awsSdk.apigatewayMod._ContentHandlingStrategy | java.lang.String
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
  type DocumentationPartType = typingsJapgolly.awsSdk.apigatewayMod._DocumentationPartType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - java.lang.String
  */
  type DomainNameStatus = typingsJapgolly.awsSdk.apigatewayMod._DomainNameStatus | java.lang.String
  type Double = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REGIONAL
    - typingsJapgolly.awsSdk.awsSdkStrings.EDGE
    - typingsJapgolly.awsSdk.awsSdkStrings.PRIVATE
    - java.lang.String
  */
  type EndpointType = typingsJapgolly.awsSdk.apigatewayMod._EndpointType | java.lang.String
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
    - java.lang.String
  */
  type GatewayResponseType = typingsJapgolly.awsSdk.apigatewayMod._GatewayResponseType | java.lang.String
  type Integer = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS
    - typingsJapgolly.awsSdk.awsSdkStrings.MOCK
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP_PROXY
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_PROXY
    - java.lang.String
  */
  type IntegrationType = typingsJapgolly.awsSdk.apigatewayMod._IntegrationType | java.lang.String
  type ListOfARNs = js.Array[typingsJapgolly.awsSdk.apigatewayMod.ProviderARN]
  type ListOfApiKey = js.Array[typingsJapgolly.awsSdk.apigatewayMod.ApiKey]
  type ListOfApiStage = js.Array[typingsJapgolly.awsSdk.apigatewayMod.ApiStage]
  type ListOfAuthorizer = js.Array[typingsJapgolly.awsSdk.apigatewayMod.Authorizer]
  type ListOfBasePathMapping = js.Array[typingsJapgolly.awsSdk.apigatewayMod.BasePathMapping]
  type ListOfClientCertificate = js.Array[typingsJapgolly.awsSdk.apigatewayMod.ClientCertificate]
  type ListOfDeployment = js.Array[typingsJapgolly.awsSdk.apigatewayMod.Deployment]
  type ListOfDocumentationPart = js.Array[typingsJapgolly.awsSdk.apigatewayMod.DocumentationPart]
  type ListOfDocumentationVersion = js.Array[typingsJapgolly.awsSdk.apigatewayMod.DocumentationVersion]
  type ListOfDomainName = js.Array[typingsJapgolly.awsSdk.apigatewayMod.DomainName]
  type ListOfEndpointType = js.Array[typingsJapgolly.awsSdk.apigatewayMod.EndpointType]
  type ListOfGatewayResponse = js.Array[typingsJapgolly.awsSdk.apigatewayMod.GatewayResponse]
  type ListOfLong = js.Array[typingsJapgolly.awsSdk.apigatewayMod.Long]
  type ListOfModel = js.Array[typingsJapgolly.awsSdk.apigatewayMod.Model]
  type ListOfPatchOperation = js.Array[typingsJapgolly.awsSdk.apigatewayMod.PatchOperation]
  type ListOfRequestValidator = js.Array[typingsJapgolly.awsSdk.apigatewayMod.RequestValidator]
  type ListOfResource = js.Array[typingsJapgolly.awsSdk.apigatewayMod.Resource]
  type ListOfRestApi = js.Array[typingsJapgolly.awsSdk.apigatewayMod.RestApi]
  type ListOfSdkConfigurationProperty = js.Array[typingsJapgolly.awsSdk.apigatewayMod.SdkConfigurationProperty]
  type ListOfSdkType = js.Array[typingsJapgolly.awsSdk.apigatewayMod.SdkType]
  type ListOfStage = js.Array[typingsJapgolly.awsSdk.apigatewayMod.Stage]
  type ListOfStageKeys = js.Array[typingsJapgolly.awsSdk.apigatewayMod.StageKey]
  type ListOfString = js.Array[typingsJapgolly.awsSdk.apigatewayMod.String]
  type ListOfUsage = js.Array[typingsJapgolly.awsSdk.apigatewayMod.ListOfLong]
  type ListOfUsagePlan = js.Array[typingsJapgolly.awsSdk.apigatewayMod.UsagePlan]
  type ListOfUsagePlanKey = js.Array[typingsJapgolly.awsSdk.apigatewayMod.UsagePlanKey]
  type ListOfVpcLink = js.Array[typingsJapgolly.awsSdk.apigatewayMod.VpcLink]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DOCUMENTED
    - typingsJapgolly.awsSdk.awsSdkStrings.UNDOCUMENTED
    - java.lang.String
  */
  type LocationStatusType = typingsJapgolly.awsSdk.apigatewayMod._LocationStatusType | java.lang.String
  type Long = scala.Double
  type MapOfApiStageThrottleSettings = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.ThrottleSettings]
  type MapOfIntegrationResponse = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.IntegrationResponse]
  type MapOfKeyUsages = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.ListOfUsage]
  type MapOfMethod = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.Method]
  type MapOfMethodResponse = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.MethodResponse]
  type MapOfMethodSettings = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.MethodSetting]
  type MapOfMethodSnapshot = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.MethodSnapshot]
  type MapOfStringToBoolean = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.NullableBoolean]
  type MapOfStringToList = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.ListOfString]
  type MapOfStringToString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.String]
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
  type Op = typingsJapgolly.awsSdk.apigatewayMod._Op | java.lang.String
  type PathToMapOfMethodSnapshot = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.apigatewayMod.MapOfMethodSnapshot]
  type ProviderARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.merge
    - typingsJapgolly.awsSdk.awsSdkStrings.overwrite_
    - java.lang.String
  */
  type PutMode = typingsJapgolly.awsSdk.apigatewayMod._PutMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.DAY
    - typingsJapgolly.awsSdk.awsSdkStrings.WEEK
    - typingsJapgolly.awsSdk.awsSdkStrings.MONTH
    - java.lang.String
  */
  type QuotaPeriodType = typingsJapgolly.awsSdk.apigatewayMod._QuotaPeriodType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TLS_1_0
    - typingsJapgolly.awsSdk.awsSdkStrings.TLS_1_2
    - java.lang.String
  */
  type SecurityPolicy = typingsJapgolly.awsSdk.apigatewayMod._SecurityPolicy | java.lang.String
  type StatusCode = java.lang.String
  type String = java.lang.String
  type Timestamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FAIL_WITH_403
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEED_WITH_RESPONSE_HEADER
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEED_WITHOUT_RESPONSE_HEADER
    - java.lang.String
  */
  type UnauthorizedCacheControlHeaderStrategy = typingsJapgolly.awsSdk.apigatewayMod._UnauthorizedCacheControlHeaderStrategy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.PENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type VpcLinkStatus = typingsJapgolly.awsSdk.apigatewayMod._VpcLinkStatus | java.lang.String
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.apigatewayMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2015-07-09`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.apigatewayMod._apiVersion | java.lang.String
}
