package typingsJapgolly.awsSdk.clientsClouddirectoryMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = String

type Arns = js.Array[Arn]

type AttributeKeyAndValueList = js.Array[AttributeKeyAndValue]

type AttributeKeyList = js.Array[AttributeKey]

type AttributeName = String

type AttributeNameAndValueList = js.Array[AttributeNameAndValue]

type AttributeNameList = js.Array[AttributeName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ValidationException
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidArnException
  - typingsJapgolly.awsSdk.awsSdkStrings.ResourceNotFoundException
  - typingsJapgolly.awsSdk.awsSdkStrings.InvalidNextTokenException
  - typingsJapgolly.awsSdk.awsSdkStrings.AccessDeniedException
  - typingsJapgolly.awsSdk.awsSdkStrings.NotNodeException
  - typingsJapgolly.awsSdk.awsSdkStrings.FacetValidationException
  - typingsJapgolly.awsSdk.awsSdkStrings.CannotListParentOfRootException
  - typingsJapgolly.awsSdk.awsSdkStrings.NotIndexException
  - typingsJapgolly.awsSdk.awsSdkStrings.NotPolicyException
  - typingsJapgolly.awsSdk.awsSdkStrings.DirectoryNotEnabledException
  - typingsJapgolly.awsSdk.awsSdkStrings.LimitExceededException
  - typingsJapgolly.awsSdk.awsSdkStrings.InternalServiceException
  - java.lang.String
*/
type BatchReadExceptionType = _BatchReadExceptionType | String

type BatchReadOperationList = js.Array[BatchReadOperation]

type BatchReadOperationResponseList = js.Array[BatchReadOperationResponse]

type BatchReferenceName = String

type BatchWriteOperationList = js.Array[BatchWriteOperation]

type BatchWriteOperationResponseList = js.Array[BatchWriteOperationResponse]

type BinaryAttributeValue = Buffer | js.typedarray.Uint8Array | Blob | String

type Bool = Boolean

type BooleanAttributeValue = Boolean

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.SERIALIZABLE
  - typingsJapgolly.awsSdk.awsSdkStrings.EVENTUAL
  - java.lang.String
*/
type ConsistencyLevel = _ConsistencyLevel | String

type Date = js.Date

type DatetimeAttributeValue = js.Date

type DirectoryArn = String

type DirectoryList = js.Array[Directory]

type DirectoryName = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type DirectoryState = _DirectoryState | String

type ExceptionMessage = String

type FacetAttributeList = js.Array[FacetAttribute]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING
  - typingsJapgolly.awsSdk.awsSdkStrings.BINARY
  - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER
  - typingsJapgolly.awsSdk.awsSdkStrings.DATETIME
  - typingsJapgolly.awsSdk.awsSdkStrings.VARIANT
  - java.lang.String
*/
type FacetAttributeType = _FacetAttributeType | String

type FacetAttributeUpdateList = js.Array[FacetAttributeUpdate]

type FacetName = String

type FacetNameList = js.Array[FacetName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.STATIC
  - typingsJapgolly.awsSdk.awsSdkStrings.DYNAMIC
  - java.lang.String
*/
type FacetStyle = _FacetStyle | String

type IndexAttachmentList = js.Array[IndexAttachment]

type LinkAttributeUpdateList = js.Array[LinkAttributeUpdate]

type LinkName = String

type LinkNameToObjectIdentifierMap = StringDictionary[ObjectIdentifier]

type NextToken = String

type NumberAttributeValue = String

type NumberResults = Double

type ObjectAttributeRangeList = js.Array[ObjectAttributeRange]

type ObjectAttributeUpdateList = js.Array[ObjectAttributeUpdate]

type ObjectIdentifier = String

type ObjectIdentifierAndLinkNameList = js.Array[ObjectIdentifierAndLinkNameTuple]

type ObjectIdentifierList = js.Array[ObjectIdentifier]

type ObjectIdentifierToLinkNameMap = StringDictionary[LinkName]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.NODE
  - typingsJapgolly.awsSdk.awsSdkStrings.LEAF_NODE
  - typingsJapgolly.awsSdk.awsSdkStrings.POLICY
  - typingsJapgolly.awsSdk.awsSdkStrings.INDEX
  - java.lang.String
*/
type ObjectType = _ObjectType | String

type PathString = String

type PathToObjectIdentifiersList = js.Array[PathToObjectIdentifiers]

type PolicyAttachmentList = js.Array[PolicyAttachment]

type PolicyToPathList = js.Array[PolicyToPath]

type PolicyType = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.FIRST
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST
  - typingsJapgolly.awsSdk.awsSdkStrings.LAST_BEFORE_MISSING_VALUES
  - typingsJapgolly.awsSdk.awsSdkStrings.INCLUSIVE
  - typingsJapgolly.awsSdk.awsSdkStrings.EXCLUSIVE
  - java.lang.String
*/
type RangeMode = _RangeMode | String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRED_ALWAYS
  - typingsJapgolly.awsSdk.awsSdkStrings.NOT_REQUIRED
  - java.lang.String
*/
type RequiredAttributeBehavior = _RequiredAttributeBehavior | String

type RuleKey = String

type RuleMap = StringDictionary[Rule]

type RuleParameterKey = String

type RuleParameterMap = StringDictionary[RuleParameterValue]

type RuleParameterValue = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.BINARY_LENGTH
  - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER_COMPARISON
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING_FROM_SET
  - typingsJapgolly.awsSdk.awsSdkStrings.STRING_LENGTH
  - java.lang.String
*/
type RuleType = _RuleType | String

type SchemaFacetList = js.Array[SchemaFacet]

type SchemaJsonDocument = String

type SchemaName = String

type SelectorObjectReference = String

type StringAttributeValue = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TagsNumberResults = Double

type TypedLinkAttributeDefinitionList = js.Array[TypedLinkAttributeDefinition]

type TypedLinkAttributeRangeList = js.Array[TypedLinkAttributeRange]

type TypedLinkFacetAttributeUpdateList = js.Array[TypedLinkFacetAttributeUpdate]

type TypedLinkName = String

type TypedLinkNameList = js.Array[TypedLinkName]

type TypedLinkSpecifierList = js.Array[TypedLinkSpecifier]

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_OR_UPDATE
  - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
  - java.lang.String
*/
type UpdateActionType = _UpdateActionType | String

type Version = String

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdk.awsSdkStrings.`2016-05-10`
  - typingsJapgolly.awsSdk.awsSdkStrings.`2017-01-11`
  - typingsJapgolly.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
