package typingsJapgolly.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamodbMod {
  type ArchivalReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ADD
    - typingsJapgolly.awsSdk.awsSdkStrings.PUT
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = typingsJapgolly.awsSdk.dynamodbMod._AttributeAction | java.lang.String
  type AttributeDefinitions = js.Array[typingsJapgolly.awsSdk.dynamodbMod.AttributeDefinition]
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.AttributeValue]
  type AttributeName = java.lang.String
  type AttributeNameList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.AttributeName]
  type AttributeUpdates = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.AttributeValueUpdate]
  type AttributeValueList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.AutoScalingPolicyDescription]
  type AutoScalingPolicyName = java.lang.String
  type AutoScalingRoleArn = java.lang.String
  type Backfilling = scala.Boolean
  type BackupArn = java.lang.String
  type BackupCreationDateTime = js.Date
  type BackupName = java.lang.String
  type BackupSizeBytes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETED
    - typingsJapgolly.awsSdk.awsSdkStrings.AVAILABLE
    - java.lang.String
  */
  type BackupStatus = typingsJapgolly.awsSdk.dynamodbMod._BackupStatus | java.lang.String
  type BackupSummaries = js.Array[typingsJapgolly.awsSdk.dynamodbMod.BackupSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = typingsJapgolly.awsSdk.dynamodbMod._BackupType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_BACKUP
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type BackupTypeFilter = typingsJapgolly.awsSdk.dynamodbMod._BackupTypeFilter | java.lang.String
  type BackupsInputLimit = scala.Double
  type BatchGetRequestMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.KeysAndAttributes]
  type BatchGetResponseMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.ItemList]
  type BatchWriteItemRequestMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.WriteRequests]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONED
    - typingsJapgolly.awsSdk.awsSdkStrings.PAY_PER_REQUEST
    - java.lang.String
  */
  type BillingMode = typingsJapgolly.awsSdk.dynamodbMod._BillingMode | java.lang.String
  type BinaryAttributeValue = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.dynamodbMod.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[typingsJapgolly.awsSdk.dynamodbMod.BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type BooleanObject = scala.Boolean
  type ClientConfiguration = typingsJapgolly.awsSdk.serviceMod.ServiceConfigurationOptions with typingsJapgolly.awsSdk.dynamodbMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.EQ
    - typingsJapgolly.awsSdk.awsSdkStrings.NE
    - typingsJapgolly.awsSdk.awsSdkStrings.IN
    - typingsJapgolly.awsSdk.awsSdkStrings.LE
    - typingsJapgolly.awsSdk.awsSdkStrings.LT
    - typingsJapgolly.awsSdk.awsSdkStrings.GE
    - typingsJapgolly.awsSdk.awsSdkStrings.GT
    - typingsJapgolly.awsSdk.awsSdkStrings.BETWEEN
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_NULL
    - typingsJapgolly.awsSdk.awsSdkStrings.NULL
    - typingsJapgolly.awsSdk.awsSdkStrings.CONTAINS
    - typingsJapgolly.awsSdk.awsSdkStrings.NOT_CONTAINS
    - typingsJapgolly.awsSdk.awsSdkStrings.BEGINS_WITH
    - java.lang.String
  */
  type ComparisonOperator = typingsJapgolly.awsSdk.dynamodbMod._ComparisonOperator | java.lang.String
  type ConditionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AND
    - typingsJapgolly.awsSdk.awsSdkStrings.OR
    - java.lang.String
  */
  type ConditionalOperator = typingsJapgolly.awsSdk.dynamodbMod._ConditionalOperator | java.lang.String
  type ConsistentRead = scala.Boolean
  type ConsumedCapacityMultiple = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ContinuousBackupsStatus = typingsJapgolly.awsSdk.dynamodbMod._ContinuousBackupsStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type ContributorInsightsAction = typingsJapgolly.awsSdk.dynamodbMod._ContributorInsightsAction | java.lang.String
  type ContributorInsightsRule = java.lang.String
  type ContributorInsightsRuleList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ContributorInsightsRule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ContributorInsightsStatus = typingsJapgolly.awsSdk.dynamodbMod._ContributorInsightsStatus | java.lang.String
  type ContributorInsightsSummaries = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ContributorInsightsSummary]
  type Date = js.Date
  type Double = scala.Double
  type Endpoints = js.Array[typingsJapgolly.awsSdk.dynamodbMod.Endpoint]
  type ExceptionDescription = java.lang.String
  type ExceptionName = java.lang.String
  type ExpectedAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.ExpectedAttributeValue]
  type ExpressionAttributeNameMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.AttributeName]
  type ExpressionAttributeNameVariable = java.lang.String
  type ExpressionAttributeValueMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.AttributeValue]
  type ExpressionAttributeValueVariable = java.lang.String
  type FilterConditionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.Condition]
  type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.GlobalSecondaryIndexAutoScalingUpdate]
  type GlobalSecondaryIndexDescriptionList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.GlobalSecondaryIndexDescription]
  type GlobalSecondaryIndexList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.GlobalSecondaryIndexUpdate]
  type GlobalSecondaryIndexes = js.Array[typingsJapgolly.awsSdk.dynamodbMod.GlobalSecondaryIndexInfo]
  type GlobalTableArnString = java.lang.String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.GlobalTableGlobalSecondaryIndexSettingsUpdate]
  type GlobalTableList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.GlobalTable]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalTableStatus = typingsJapgolly.awsSdk.dynamodbMod._GlobalTableStatus | java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = typingsJapgolly.awsSdk.dynamodbMod._IndexStatus | java.lang.String
  type Integer = scala.Double
  type IntegerObject = scala.Double
  type ItemCollectionKeyAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.ItemCollectionMetricsMultiple]
  type ItemCollectionSizeEstimateBound = scala.Double
  type ItemCollectionSizeEstimateRange = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ItemCollectionSizeEstimateBound]
  type ItemCount = scala.Double
  type ItemList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.AttributeMap]
  type ItemResponseList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ItemResponse]
  type KMSMasterKeyArn = java.lang.String
  type KMSMasterKeyId = java.lang.String
  type Key = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.AttributeValue]
  type KeyConditions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.Condition]
  type KeyExpression = java.lang.String
  type KeyList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.Key]
  type KeySchema = js.Array[typingsJapgolly.awsSdk.dynamodbMod.KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HASH
    - typingsJapgolly.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = typingsJapgolly.awsSdk.dynamodbMod._KeyType | java.lang.String
  type LastUpdateDateTime = js.Date
  type ListAttributeValue = js.Array[typingsJapgolly.awsSdk.dynamodbMod.AttributeValue]
  type ListContributorInsightsLimit = scala.Double
  type ListTablesInputLimit = scala.Double
  type LocalSecondaryIndexDescriptionList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.LocalSecondaryIndexDescription]
  type LocalSecondaryIndexList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[typingsJapgolly.awsSdk.dynamodbMod.LocalSecondaryIndexInfo]
  type Long = scala.Double
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.AttributeValue]
  type NextTokenString = java.lang.String
  type NonKeyAttributeName = java.lang.String
  type NonKeyAttributeNameList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.NonKeyAttributeName]
  type NonNegativeLongObject = scala.Double
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[typingsJapgolly.awsSdk.dynamodbMod.NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type PointInTimeRecoveryStatus = typingsJapgolly.awsSdk.dynamodbMod._PointInTimeRecoveryStatus | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.KEYS_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.INCLUDE
    - java.lang.String
  */
  type ProjectionType = typingsJapgolly.awsSdk.dynamodbMod._ProjectionType | java.lang.String
  type PutItemInputAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.AttributeValue]
  type RegionName = java.lang.String
  type ReplicaAutoScalingDescriptionList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaAutoScalingDescription]
  type ReplicaAutoScalingUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaAutoScalingUpdate]
  type ReplicaDescriptionList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[
    typingsJapgolly.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexAutoScalingDescription
  ]
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexAutoScalingUpdate]
  type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexDescription]
  type ReplicaGlobalSecondaryIndexList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndex]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[
    typingsJapgolly.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexSettingsDescription
  ]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaGlobalSecondaryIndexSettingsUpdate]
  type ReplicaList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.Replica]
  type ReplicaSettingsDescriptionList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaSettingsDescription]
  type ReplicaSettingsUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaSettingsUpdate]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type ReplicaStatus = typingsJapgolly.awsSdk.dynamodbMod._ReplicaStatus | java.lang.String
  type ReplicaStatusDescription = java.lang.String
  type ReplicaStatusPercentProgress = java.lang.String
  type ReplicaUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicaUpdate]
  type ReplicationGroupUpdateList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.ReplicationGroupUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INDEXES
    - typingsJapgolly.awsSdk.awsSdkStrings.TOTAL
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnConsumedCapacity = typingsJapgolly.awsSdk.dynamodbMod._ReturnConsumedCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SIZE
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnItemCollectionMetrics = typingsJapgolly.awsSdk.dynamodbMod._ReturnItemCollectionMetrics | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_OLD
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED_OLD
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_NEW
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED_NEW
    - java.lang.String
  */
  type ReturnValue = typingsJapgolly.awsSdk.dynamodbMod._ReturnValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_OLD
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnValuesOnConditionCheckFailure = typingsJapgolly.awsSdk.dynamodbMod._ReturnValuesOnConditionCheckFailure | java.lang.String
  type SSEEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SSEStatus = typingsJapgolly.awsSdk.dynamodbMod._SSEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AES256
    - typingsJapgolly.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type SSEType = typingsJapgolly.awsSdk.dynamodbMod._SSEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.S
    - typingsJapgolly.awsSdk.awsSdkStrings.N
    - typingsJapgolly.awsSdk.awsSdkStrings.B
    - java.lang.String
  */
  type ScalarAttributeType = typingsJapgolly.awsSdk.dynamodbMod._ScalarAttributeType | java.lang.String
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type SecondaryIndexesCapacityMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.dynamodbMod.Capacity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_ATTRIBUTES
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_PROJECTED_ATTRIBUTES
    - typingsJapgolly.awsSdk.awsSdkStrings.SPECIFIC_ATTRIBUTES
    - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type Select = typingsJapgolly.awsSdk.dynamodbMod._Select | java.lang.String
  type StreamArn = java.lang.String
  type StreamEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW_IMAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.OLD_IMAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typingsJapgolly.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = typingsJapgolly.awsSdk.dynamodbMod._StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[typingsJapgolly.awsSdk.dynamodbMod.StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = js.Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.TableName]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
    - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVING
    - typingsJapgolly.awsSdk.awsSdkStrings.ARCHIVED
    - java.lang.String
  */
  type TableStatus = typingsJapgolly.awsSdk.dynamodbMod._TableStatus | java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.Tag]
  type TagValueString = java.lang.String
  type TimeRangeLowerBound = js.Date
  type TimeRangeUpperBound = js.Date
  type TimeToLiveAttributeName = java.lang.String
  type TimeToLiveEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type TimeToLiveStatus = typingsJapgolly.awsSdk.dynamodbMod._TimeToLiveStatus | java.lang.String
  type TransactGetItemList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.TransactGetItem]
  type TransactWriteItemList = js.Array[typingsJapgolly.awsSdk.dynamodbMod.TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[typingsJapgolly.awsSdk.dynamodbMod.WriteRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.`2011-12-05`
    - typingsJapgolly.awsSdk.awsSdkStrings.`2012-08-10`
    - typingsJapgolly.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typingsJapgolly.awsSdk.dynamodbMod._apiVersion | java.lang.String
}
