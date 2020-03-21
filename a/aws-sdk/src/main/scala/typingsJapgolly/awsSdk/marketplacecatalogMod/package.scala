package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object marketplacecatalogMod {
  type ARN = java.lang.String
  type Catalog = java.lang.String
  type ChangeSetDescription = js.Array[typingsJapgolly.awsSdk.marketplacecatalogMod.ChangeSummary]
  type ChangeSetName = java.lang.String
  type ChangeSetSummaryList = js.Array[typingsJapgolly.awsSdk.marketplacecatalogMod.ChangeSetSummaryListItem]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
    - typingsJapgolly.awsSdk.awsSdkStrings.APPLYING
    - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
    - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ChangeStatus = typingsJapgolly.awsSdk.marketplacecatalogMod._ChangeStatus | java.lang.String
  type ChangeType = java.lang.String
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.marketplacecatalogMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type DateTimeISO8601 = java.lang.String
  type EntitySummaryList = js.Array[typingsJapgolly.awsSdk.marketplacecatalogMod.EntitySummary]
  type EntityType = java.lang.String
  type ErrorDetailList = js.Array[typingsJapgolly.awsSdk.marketplacecatalogMod.ErrorDetail]
  type FilterList = js.Array[typingsJapgolly.awsSdk.marketplacecatalogMod.Filter]
  type FilterName = java.lang.String
  type Identifier = java.lang.String
  type Json = java.lang.String
  type MaxResultInteger = scala.Double
  type NextToken = java.lang.String
  type RequestedChangeList = js.Array[typingsJapgolly.awsSdk.marketplacecatalogMod.Change]
  type ResourceId = java.lang.String
  type ResourceIdList = js.Array[typingsJapgolly.awsSdk.marketplacecatalogMod.ResourceId]
  type SortBy = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
    - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
    - java.lang.String
  */
  type SortOrder = typingsJapgolly.awsSdk.marketplacecatalogMod._SortOrder | java.lang.String
  type StringValue = java.lang.String
  type ValueList = js.Array[typingsJapgolly.awsSdk.marketplacecatalogMod.StringValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-17`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.marketplacecatalogMod._apiVersion | java.lang.String
}
