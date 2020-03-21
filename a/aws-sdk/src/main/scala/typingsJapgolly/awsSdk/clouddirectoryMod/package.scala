package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clouddirectoryMod {
  type Arn = java.lang.String
  type Arns = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.Arn]
  type AttributeKeyAndValueList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.AttributeKeyAndValue]
  type AttributeKeyList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.AttributeKey]
  type AttributeName = java.lang.String
  type AttributeNameAndValueList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.AttributeNameAndValue]
  type AttributeNameList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.AttributeName]
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
  type BatchReadExceptionType = typingsJapgolly.awsSdk.clouddirectoryMod._BatchReadExceptionType | java.lang.String
  type BatchReadOperationList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.BatchReadOperation]
  type BatchReadOperationResponseList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.BatchReadOperationResponse]
  type BatchReferenceName = java.lang.String
  type BatchWriteOperationList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.BatchWriteOperation]
  type BatchWriteOperationResponseList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.BatchWriteOperationResponse]
  type BinaryAttributeValue = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.clouddirectoryMod.Blob | java.lang.String
  type Bool = scala.Boolean
  type BooleanAttributeValue = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.clouddirectoryMod.ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SERIALIZABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.EVENTUAL
    - java.lang.String
  */
  type ConsistencyLevel = typingsJapgolly.awsSdk.clouddirectoryMod._ConsistencyLevel | java.lang.String
  type Date = js.Date
  type DatetimeAttributeValue = js.Date
  type DirectoryArn = java.lang.String
  type DirectoryList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.Directory]
  type DirectoryName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type DirectoryState = typingsJapgolly.awsSdk.clouddirectoryMod._DirectoryState | java.lang.String
  type ExceptionMessage = java.lang.String
  type FacetAttributeList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.FacetAttribute]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING
    - typingsJapgolly.awsSdk.awsSdkStrings.BINARY
    - typingsJapgolly.awsSdk.awsSdkStrings.BOOLEAN
    - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER
    - typingsJapgolly.awsSdk.awsSdkStrings.DATETIME
    - typingsJapgolly.awsSdk.awsSdkStrings.VARIANT
    - java.lang.String
  */
  type FacetAttributeType = typingsJapgolly.awsSdk.clouddirectoryMod._FacetAttributeType | java.lang.String
  type FacetAttributeUpdateList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.FacetAttributeUpdate]
  type FacetName = java.lang.String
  type FacetNameList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.FacetName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.STATIC
    - typingsJapgolly.awsSdk.awsSdkStrings.DYNAMIC
    - java.lang.String
  */
  type FacetStyle = typingsJapgolly.awsSdk.clouddirectoryMod._FacetStyle | java.lang.String
  type IndexAttachmentList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.IndexAttachment]
  type LinkAttributeUpdateList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.LinkAttributeUpdate]
  type LinkName = java.lang.String
  type LinkNameToObjectIdentifierMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.clouddirectoryMod.ObjectIdentifier]
  type NextToken = java.lang.String
  type NumberAttributeValue = java.lang.String
  type NumberResults = scala.Double
  type ObjectAttributeRangeList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.ObjectAttributeRange]
  type ObjectAttributeUpdateList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.ObjectAttributeUpdate]
  type ObjectIdentifier = java.lang.String
  type ObjectIdentifierAndLinkNameList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.ObjectIdentifierAndLinkNameTuple]
  type ObjectIdentifierList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.ObjectIdentifier]
  type ObjectIdentifierToLinkNameMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.clouddirectoryMod.LinkName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NODE
    - typingsJapgolly.awsSdk.awsSdkStrings.LEAF_NODE
    - typingsJapgolly.awsSdk.awsSdkStrings.POLICY
    - typingsJapgolly.awsSdk.awsSdkStrings.INDEX
    - java.lang.String
  */
  type ObjectType = typingsJapgolly.awsSdk.clouddirectoryMod._ObjectType | java.lang.String
  type PathString = java.lang.String
  type PathToObjectIdentifiersList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.PathToObjectIdentifiers]
  type PolicyAttachmentList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.PolicyAttachment]
  type PolicyToPathList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.PolicyToPath]
  type PolicyType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.FIRST
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST
    - typingsJapgolly.awsSdk.awsSdkStrings.LAST_BEFORE_MISSING_VALUES
    - typingsJapgolly.awsSdk.awsSdkStrings.INCLUSIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.EXCLUSIVE
    - java.lang.String
  */
  type RangeMode = typingsJapgolly.awsSdk.clouddirectoryMod._RangeMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.REQUIRED_ALWAYS
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_REQUIRED
    - java.lang.String
  */
  type RequiredAttributeBehavior = typingsJapgolly.awsSdk.clouddirectoryMod._RequiredAttributeBehavior | java.lang.String
  type RuleKey = java.lang.String
  type RuleMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.clouddirectoryMod.Rule]
  type RuleParameterKey = java.lang.String
  type RuleParameterMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.clouddirectoryMod.RuleParameterValue]
  type RuleParameterValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.BINARY_LENGTH
    - typingsJapgolly.awsSdk.awsSdkStrings.NUMBER_COMPARISON
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING_FROM_SET
    - typingsJapgolly.awsSdk.awsSdkStrings.STRING_LENGTH
    - java.lang.String
  */
  type RuleType = typingsJapgolly.awsSdk.clouddirectoryMod._RuleType | java.lang.String
  type SchemaFacetList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.SchemaFacet]
  type SchemaJsonDocument = java.lang.String
  type SchemaName = java.lang.String
  type SelectorObjectReference = java.lang.String
  type StringAttributeValue = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.TagKey]
  type TagList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.Tag]
  type TagValue = java.lang.String
  type TagsNumberResults = scala.Double
  type TypedLinkAttributeDefinitionList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.TypedLinkAttributeDefinition]
  type TypedLinkAttributeRangeList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.TypedLinkAttributeRange]
  type TypedLinkFacetAttributeUpdateList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.TypedLinkFacetAttributeUpdate]
  type TypedLinkName = java.lang.String
  type TypedLinkNameList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.TypedLinkName]
  type TypedLinkSpecifierList = js.Array[typingsJapgolly.awsSdk.clouddirectoryMod.TypedLinkSpecifier]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATE_OR_UPDATE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type UpdateActionType = typingsJapgolly.awsSdk.clouddirectoryMod._UpdateActionType | java.lang.String
  type Version = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2016-05-10`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2017-01-11`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.clouddirectoryMod._apiVersion | java.lang.String
}
