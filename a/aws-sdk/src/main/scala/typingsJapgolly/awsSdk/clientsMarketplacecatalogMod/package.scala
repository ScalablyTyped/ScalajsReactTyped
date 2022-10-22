package typingsJapgolly.awsSdk.clientsMarketplacecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type Catalog = String

type ChangeName = String

type ChangeSetDescription = js.Array[ChangeSummary]

type ChangeSetName = String

type ChangeSetSummaryList = js.Array[ChangeSetSummaryListItem]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.PREPARING
  - typingsJapgolly.awsSdk.awsSdkStrings.APPLYING
  - typingsJapgolly.awsSdk.awsSdkStrings.SUCCEEDED
  - typingsJapgolly.awsSdk.awsSdkStrings.CANCELLED
  - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ChangeStatus = _ChangeStatus | String

type ChangeType = String

type ClientRequestToken = String

type DateTimeISO8601 = String

type EntityNameString = String

type EntitySummaryList = js.Array[EntitySummary]

type EntityType = String

type ErrorCodeString = String

type ErrorDetailList = js.Array[ErrorDetail]

type ExceptionMessageContent = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CLIENT_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.SERVER_FAULT
  - java.lang.String
*/
type FailureCode = _FailureCode | String

type FilterList = js.Array[Filter]

type FilterName = String

type FilterValueContent = String

type Identifier = String

type Json = String

type MaxResultInteger = Double

type NextToken = String

type RequestedChangeList = js.Array[Change]

type ResourceId = String

type ResourceIdList = js.Array[ResourceId]

type SortBy = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type SortOrder = _SortOrder | String

type ValueList = js.Array[FilterValueContent]

type VisibilityValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2018-09-17`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
