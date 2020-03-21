package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object appsyncMod {
  type AdditionalAuthenticationProviders = js.Array[typingsJapgolly.awsSdk.appsyncMod.AdditionalAuthenticationProvider]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.MODIFYING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ApiCacheStatus = typingsJapgolly.awsSdk.appsyncMod._ApiCacheStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.T2_SMALL
    - typingsJapgolly.awsSdk.awsSdkStrings.T2_MEDIUM
    - typingsJapgolly.awsSdk.awsSdkStrings.R4_LARGE
    - typingsJapgolly.awsSdk.awsSdkStrings.R4_XLARGE
    - typingsJapgolly.awsSdk.awsSdkStrings.R4_2XLARGE
    - typingsJapgolly.awsSdk.awsSdkStrings.R4_4XLARGE
    - typingsJapgolly.awsSdk.awsSdkStrings.R4_8XLARGE
    - java.lang.String
  */
  type ApiCacheType = typingsJapgolly.awsSdk.appsyncMod._ApiCacheType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FULL_REQUEST_CACHING
    - typingsJapgolly.awsSdk.awsSdkStrings.PER_RESOLVER_CACHING
    - java.lang.String
  */
  type ApiCachingBehavior = typingsJapgolly.awsSdk.appsyncMod._ApiCachingBehavior | java.lang.String
  type ApiKeys = js.Array[typingsJapgolly.awsSdk.appsyncMod.ApiKey]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.API_KEY
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_IAM
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_COGNITO_USER_POOLS
    - typingsJapgolly.awsSdk.awsSdkStrings.OPENID_CONNECT
    - java.lang.String
  */
  type AuthenticationType = typingsJapgolly.awsSdk.appsyncMod._AuthenticationType | java.lang.String
  type AuthorizationType = typingsJapgolly.awsSdk.awsSdkStrings.AWS_IAM | java.lang.String
  type Boolean = scala.Boolean
  type BooleanValue = scala.Boolean
  type CachingKeys = js.Array[typingsJapgolly.awsSdk.appsyncMod.String]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.appsyncMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.VERSION
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ConflictDetectionType = typingsJapgolly.awsSdk.appsyncMod._ConflictDetectionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.OPTIMISTIC_CONCURRENCY
    - typingsJapgolly.awsSdk.awsSdkStrings.LAMBDA
    - typingsJapgolly.awsSdk.awsSdkStrings.AUTOMERGE
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ConflictHandlerType = typingsJapgolly.awsSdk.appsyncMod._ConflictHandlerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_LAMBDA
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_DYNAMODB
    - typingsJapgolly.awsSdk.awsSdkStrings.AMAZON_ELASTICSEARCH
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.HTTP
    - typingsJapgolly.awsSdk.awsSdkStrings.RELATIONAL_DATABASE
    - java.lang.String
  */
  type DataSourceType = typingsJapgolly.awsSdk.appsyncMod._DataSourceType | java.lang.String
  type DataSources = js.Array[typingsJapgolly.awsSdk.appsyncMod.DataSource]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALLOW
    - typingsJapgolly.awsSdk.awsSdkStrings.DENY
    - java.lang.String
  */
  type DefaultAction = typingsJapgolly.awsSdk.appsyncMod._DefaultAction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type FieldLogLevel = typingsJapgolly.awsSdk.appsyncMod._FieldLogLevel | java.lang.String
  type Functions = js.Array[typingsJapgolly.awsSdk.appsyncMod.FunctionConfiguration]
  type FunctionsIds = js.Array[typingsJapgolly.awsSdk.appsyncMod.String]
  type GraphqlApis = js.Array[typingsJapgolly.awsSdk.appsyncMod.GraphqlApi]
  type Long = scala.Double
  type MapOfStringToString = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.appsyncMod.String]
  type MappingTemplate = java.lang.String
  type MaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SDL
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type OutputType = typingsJapgolly.awsSdk.appsyncMod._OutputType | java.lang.String
  type PaginationToken = java.lang.String
  type RelationalDatabaseSourceType = typingsJapgolly.awsSdk.awsSdkStrings.RDS_HTTP_ENDPOINT | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.UNIT
    - typingsJapgolly.awsSdk.awsSdkStrings.PIPELINE
    - java.lang.String
  */
  type ResolverKind = typingsJapgolly.awsSdk.appsyncMod._ResolverKind | java.lang.String
  type Resolvers = js.Array[typingsJapgolly.awsSdk.appsyncMod.Resolver]
  type ResourceArn = java.lang.String
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PROCESSING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCESS
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_APPLICABLE
    - java.lang.String
  */
  type SchemaStatus = typingsJapgolly.awsSdk.appsyncMod._SchemaStatus | java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.appsyncMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.appsyncMod.TagValue]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SDL
    - typingsJapgolly.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type TypeDefinitionFormat = typingsJapgolly.awsSdk.appsyncMod._TypeDefinitionFormat | java.lang.String
  type TypeList = js.Array[typingsJapgolly.awsSdk.appsyncMod.Type]
  type _Blob = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.appsyncMod.Blob | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-07-25`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.appsyncMod._apiVersion | java.lang.String
}
