package typingsJapgolly.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.awsSdkStrings.LINEAR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Boolean = scala.Boolean

type ComponentTypeId = java.lang.String

type ComponentTypeSummaries = js.Array[ComponentTypeSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type ComponentUpdateType = _ComponentUpdateType | java.lang.String

type ComponentUpdatesMapRequest = StringDictionary[ComponentUpdateRequest]

type ComponentsMap = StringDictionary[ComponentResponse]

type ComponentsMapRequest = StringDictionary[ComponentRequest]

type Configuration = StringDictionary[Value]

type DataValueList = js.Array[DataValue]

type DataValueMap = StringDictionary[DataValue]

type Description = java.lang.String

type Double = scala.Double

type EntityId = java.lang.String

type EntityName = java.lang.String

type EntitySummaries = js.Array[EntitySummary]

type Entries = js.Array[PropertyValueEntry]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.VALIDATION_ERROR
  - typingsJapgolly.awsSdk.awsSdkStrings.INTERNAL_FAILURE
  - java.lang.String
*/
type ErrorCode = _ErrorCode | java.lang.String

type ErrorEntries = js.Array[BatchPutPropertyErrorEntry]

type ErrorMessage = java.lang.String

type Errors = js.Array[BatchPutPropertyError]

type Expression = java.lang.String

type ExtendsFrom = js.Array[ComponentTypeId]

type ExternalIdProperty = StringDictionary[String]

type FunctionsRequest = StringDictionary[FunctionRequest]

type FunctionsResponse = StringDictionary[FunctionResponse]

type Id = java.lang.String

type IdOrArn = java.lang.String

type Integer = scala.Double

type InterpolationType = LINEAR | java.lang.String

type IntervalInSeconds = scala.Double

type LambdaArn = java.lang.String

type ListComponentTypesFilters = js.Array[ListComponentTypesFilter]

type ListEntitiesFilters = js.Array[ListEntitiesFilter]

type Long = scala.Double

type MaxResults = scala.Double

type Name = java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ASCENDING
  - typingsJapgolly.awsSdk.awsSdkStrings.DESCENDING
  - java.lang.String
*/
type OrderByTime = _OrderByTime | java.lang.String

type ParentEntityId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type ParentEntityUpdateType = _ParentEntityUpdateType | java.lang.String

type PropertyDefinitionsRequest = StringDictionary[PropertyDefinitionRequest]

type PropertyDefinitionsResponse = StringDictionary[PropertyDefinitionResponse]

type PropertyFilters = js.Array[PropertyFilter]

type PropertyLatestValueMap = StringDictionary[PropertyLatestValue]

type PropertyRequests = StringDictionary[PropertyRequest]

type PropertyResponses = StringDictionary[PropertyResponse]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE
  - java.lang.String
*/
type PropertyUpdateType = _PropertyUpdateType | java.lang.String

type PropertyValueList = js.Array[PropertyValueHistory]

type PropertyValues = js.Array[PropertyValue]

type RequiredProperties = js.Array[Name]

type RoleArn = java.lang.String

type S3Location = java.lang.String

type S3Url = java.lang.String

type SceneCapabilities = js.Array[SceneCapability]

type SceneCapability = java.lang.String

type SceneSummaries = js.Array[SceneSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENTITY
  - typingsJapgolly.awsSdk.awsSdkStrings.WORKSPACE
  - java.lang.String
*/
type Scope = _Scope | java.lang.String

type SelectedPropertyList = js.Array[String]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
  - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
  - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.ERROR
  - java.lang.String
*/
type State = _State | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Time = java.lang.String

type Timestamp = js.Date

type TwinMakerArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.RELATIONSHIP
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.LONG
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - typingsJapgolly.awsSdk.awsSdkStrings.INTEGER
  - typingsJapgolly.awsSdk.awsSdkStrings.DOUBLE
  - typingsJapgolly.awsSdk.awsSdkStrings.LIST
  - typingsJapgolly.awsSdk.awsSdkStrings.MAP
  - java.lang.String
*/
type Type = _Type | java.lang.String

type Value = java.lang.String

type Values = js.Array[PropertyValue]

type WorkspaceSummaries = js.Array[WorkspaceSummary]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2021-11-29`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
