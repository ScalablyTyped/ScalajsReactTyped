package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mediastoreMod {
  type AllowedHeaders = js.Array[typingsJapgolly.awsSdk.mediastoreMod.Header]
  type AllowedMethods = js.Array[typingsJapgolly.awsSdk.mediastoreMod.MethodName]
  type AllowedOrigins = js.Array[typingsJapgolly.awsSdk.mediastoreMod.Origin]
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.mediastoreMod.ClientApiVersions
  type ContainerARN = java.lang.String
  type ContainerAccessLoggingEnabled = scala.Boolean
  type ContainerList = js.Array[typingsJapgolly.awsSdk.mediastoreMod.Container]
  type ContainerListLimit = scala.Double
  type ContainerName = java.lang.String
  type ContainerPolicy = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type ContainerStatus = typingsJapgolly.awsSdk.mediastoreMod._ContainerStatus | java.lang.String
  type CorsPolicy = js.Array[typingsJapgolly.awsSdk.mediastoreMod.CorsRule]
  type Endpoint = java.lang.String
  type ExposeHeaders = js.Array[typingsJapgolly.awsSdk.mediastoreMod.Header]
  type Header = java.lang.String
  type LifecyclePolicy = java.lang.String
  type MaxAgeSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PUT
    - typingsJapgolly.awsSdk.awsSdkStrings.GET
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - typingsJapgolly.awsSdk.awsSdkStrings.HEAD
    - java.lang.String
  */
  type MethodName = typingsJapgolly.awsSdk.mediastoreMod._MethodName | java.lang.String
  type Origin = java.lang.String
  type PaginationToken = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.mediastoreMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.mediastoreMod.Tag]
  type TagValue = java.lang.String
  type TimeStamp = js.Date
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-09-01`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.mediastoreMod._apiVersion | java.lang.String
}
