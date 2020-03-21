package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object resourcegroupsMod {
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.resourcegroupsMod.ClientApiVersions
  type GroupArn = java.lang.String
  type GroupDescription = java.lang.String
  type GroupFilterList = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.GroupFilter]
  type GroupFilterName = typingsJapgolly.awsSdk.awsSdkStrings.`resource-type` | java.lang.String
  type GroupFilterValue = java.lang.String
  type GroupFilterValues = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.GroupFilterValue]
  type GroupIdentifierList = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.GroupIdentifier]
  type GroupList = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.Group]
  type GroupName = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  type Query = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_INACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_NOT_EXISTING
    - java.lang.String
  */
  type QueryErrorCode = typingsJapgolly.awsSdk.resourcegroupsMod._QueryErrorCode | java.lang.String
  type QueryErrorList = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.QueryError]
  type QueryErrorMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.TAG_FILTERS_1_0
    - typingsJapgolly.awsSdk.awsSdkStrings.CLOUDFORMATION_STACK_1_0
    - java.lang.String
  */
  type QueryType = typingsJapgolly.awsSdk.resourcegroupsMod._QueryType | java.lang.String
  type ResourceArn = java.lang.String
  type ResourceFilterList = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.ResourceFilter]
  type ResourceFilterName = typingsJapgolly.awsSdk.awsSdkStrings.`resource-type` | java.lang.String
  type ResourceFilterValue = java.lang.String
  type ResourceFilterValues = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.ResourceFilterValue]
  type ResourceIdentifierList = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.ResourceIdentifier]
  type ResourceType = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.resourcegroupsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.resourcegroupsMod.TagValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-11-27`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.resourcegroupsMod._apiVersion | java.lang.String
}
