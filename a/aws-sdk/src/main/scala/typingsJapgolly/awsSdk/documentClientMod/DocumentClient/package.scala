package typingsJapgolly.awsSdk.documentClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DocumentClient {
  type ArchivalReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ADD
    - typingsJapgolly.awsSdk.awsSdkStrings.PUT
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETE
    - java.lang.String
  */
  type AttributeAction = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._AttributeAction | java.lang.String
  type AttributeDefinitions = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeDefinition]
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type AttributeName = java.lang.String
  type AttributeNameList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeName]
  type AttributeUpdates = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValueUpdate]
  type AttributeValue = js.Any
  type AttributeValueList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type AutoScalingPolicyDescriptionList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AutoScalingPolicyDescription
  ]
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
  type BackupStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._BackupStatus | java.lang.String
  type BackupSummaries = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.BackupSummary]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_BACKUP
    - java.lang.String
  */
  type BackupType = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._BackupType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.USER
    - typingsJapgolly.awsSdk.awsSdkStrings.SYSTEM
    - typingsJapgolly.awsSdk.awsSdkStrings.AWS_BACKUP
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type BackupTypeFilter = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._BackupTypeFilter | java.lang.String
  type BackupsInputLimit = scala.Double
  type BatchGetRequestMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.KeysAndAttributes]
  type BatchGetResponseMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ItemList]
  type BatchWriteItemRequestMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.WriteRequests]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.PROVISIONED
    - typingsJapgolly.awsSdk.awsSdkStrings.PAY_PER_REQUEST
    - java.lang.String
  */
  type BillingMode = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._BillingMode | java.lang.String
  type BinaryAttributeValue = typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.Uint8Array | typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Blob | java.lang.String
  type BinarySetAttributeValue = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.BinaryAttributeValue]
  type BooleanAttributeValue = scala.Boolean
  type BooleanObject = scala.Boolean
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
  type ComparisonOperator = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ComparisonOperator | java.lang.String
  type ConditionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AND
    - typingsJapgolly.awsSdk.awsSdkStrings.OR
    - java.lang.String
  */
  type ConditionalOperator = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ConditionalOperator | java.lang.String
  type ConsistentRead = scala.Boolean
  type ConsumedCapacityMultiple = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ConsumedCapacity]
  type ConsumedCapacityUnits = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type ContinuousBackupsStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ContinuousBackupsStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLE
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLE
    - java.lang.String
  */
  type ContributorInsightsAction = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ContributorInsightsAction | java.lang.String
  type ContributorInsightsRule = java.lang.String
  type ContributorInsightsRuleList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ContributorInsightsRule]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ContributorInsightsStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ContributorInsightsStatus | java.lang.String
  type ContributorInsightsSummaries = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ContributorInsightsSummary
  ]
  type Date = js.Date
  type Double = scala.Double
  type Endpoints = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Endpoint]
  type ExceptionDescription = java.lang.String
  type ExceptionName = java.lang.String
  type ExpectedAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ExpectedAttributeValue]
  type ExpressionAttributeNameMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeName]
  type ExpressionAttributeNameVariable = java.lang.String
  type ExpressionAttributeValueMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ExpressionAttributeValueVariable = java.lang.String
  type FilterConditionMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Condition]
  type GlobalSecondaryIndexAutoScalingUpdateList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexAutoScalingUpdate
  ]
  type GlobalSecondaryIndexDescriptionList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexDescription
  ]
  type GlobalSecondaryIndexList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndex]
  type GlobalSecondaryIndexUpdateList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexUpdate
  ]
  type GlobalSecondaryIndexes = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.GlobalSecondaryIndexInfo]
  type GlobalTableArnString = java.lang.String
  type GlobalTableGlobalSecondaryIndexSettingsUpdateList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.GlobalTableGlobalSecondaryIndexSettingsUpdate
  ]
  type GlobalTableList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.GlobalTable]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type GlobalTableStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._GlobalTableStatus | java.lang.String
  type IndexName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type IndexStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._IndexStatus | java.lang.String
  type Integer = scala.Double
  type IntegerObject = scala.Double
  type ItemCollectionKeyAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ItemCollectionMetricsMultiple = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetrics]
  type ItemCollectionMetricsPerTable = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ItemCollectionMetricsMultiple
  ]
  type ItemCollectionSizeEstimateBound = scala.Double
  type ItemCollectionSizeEstimateRange = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ItemCollectionSizeEstimateBound
  ]
  type ItemCount = scala.Double
  type ItemList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeMap]
  type ItemResponseList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ItemResponse]
  type KMSMasterKeyArn = java.lang.String
  type KMSMasterKeyId = java.lang.String
  type Key = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type KeyConditions = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Condition]
  type KeyExpression = java.lang.String
  type KeyList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Key]
  type KeySchema = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.KeySchemaElement]
  type KeySchemaAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.HASH
    - typingsJapgolly.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._KeyType | java.lang.String
  type LastUpdateDateTime = js.Date
  type ListAttributeValue = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type ListContributorInsightsLimit = scala.Double
  type ListTablesInputLimit = scala.Double
  type LocalSecondaryIndexDescriptionList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndexDescription
  ]
  type LocalSecondaryIndexList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndex]
  type LocalSecondaryIndexes = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.LocalSecondaryIndexInfo]
  type Long = scala.Double
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type NextTokenString = java.lang.String
  type NonKeyAttributeName = java.lang.String
  type NonKeyAttributeNameList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.NonKeyAttributeName]
  type NonNegativeLongObject = scala.Double
  type NullAttributeValue = scala.Boolean
  type NumberAttributeValue = java.lang.String
  type NumberSetAttributeValue = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.NumberAttributeValue]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type PointInTimeRecoveryStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._PointInTimeRecoveryStatus | java.lang.String
  type PositiveIntegerObject = scala.Double
  type PositiveLongObject = scala.Double
  type ProjectionExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL
    - typingsJapgolly.awsSdk.awsSdkStrings.KEYS_ONLY
    - typingsJapgolly.awsSdk.awsSdkStrings.INCLUDE
    - java.lang.String
  */
  type ProjectionType = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ProjectionType | java.lang.String
  type PutItemInputAttributeMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.AttributeValue]
  type RegionName = java.lang.String
  type ReplicaAutoScalingDescriptionList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaAutoScalingDescription
  ]
  type ReplicaAutoScalingUpdateList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaAutoScalingUpdate]
  type ReplicaDescriptionList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaDescription]
  type ReplicaGlobalSecondaryIndexAutoScalingDescriptionList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexAutoScalingDescription
  ]
  type ReplicaGlobalSecondaryIndexAutoScalingUpdateList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexAutoScalingUpdate
  ]
  type ReplicaGlobalSecondaryIndexDescriptionList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexDescription
  ]
  type ReplicaGlobalSecondaryIndexList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndex
  ]
  type ReplicaGlobalSecondaryIndexSettingsDescriptionList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexSettingsDescription
  ]
  type ReplicaGlobalSecondaryIndexSettingsUpdateList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaGlobalSecondaryIndexSettingsUpdate
  ]
  type ReplicaList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Replica]
  type ReplicaSettingsDescriptionList = js.Array[
    typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaSettingsDescription
  ]
  type ReplicaSettingsUpdateList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaSettingsUpdate]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATING
    - typingsJapgolly.awsSdk.awsSdkStrings.CREATION_FAILED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - typingsJapgolly.awsSdk.awsSdkStrings.DELETING
    - typingsJapgolly.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type ReplicaStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ReplicaStatus | java.lang.String
  type ReplicaStatusDescription = java.lang.String
  type ReplicaStatusPercentProgress = java.lang.String
  type ReplicaUpdateList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicaUpdate]
  type ReplicationGroupUpdateList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.ReplicationGroupUpdate]
  type ResourceArnString = java.lang.String
  type RestoreInProgress = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.INDEXES
    - typingsJapgolly.awsSdk.awsSdkStrings.TOTAL
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnConsumedCapacity = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ReturnConsumedCapacity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.SIZE
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnItemCollectionMetrics = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ReturnItemCollectionMetrics | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_OLD
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED_OLD
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_NEW
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATED_NEW
    - java.lang.String
  */
  type ReturnValue = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ReturnValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_OLD
    - typingsJapgolly.awsSdk.awsSdkStrings.NONE
    - java.lang.String
  */
  type ReturnValuesOnConditionCheckFailure = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ReturnValuesOnConditionCheckFailure | java.lang.String
  type SSEEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.ENABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLING
    - typingsJapgolly.awsSdk.awsSdkStrings.DISABLED
    - typingsJapgolly.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type SSEStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._SSEStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.AES256
    - typingsJapgolly.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type SSEType = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._SSEType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.S
    - typingsJapgolly.awsSdk.awsSdkStrings.N
    - typingsJapgolly.awsSdk.awsSdkStrings.B
    - java.lang.String
  */
  type ScalarAttributeType = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._ScalarAttributeType | java.lang.String
  type ScanSegment = scala.Double
  type ScanTotalSegments = scala.Double
  type SecondaryIndexesCapacityMap = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Capacity]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_ATTRIBUTES
    - typingsJapgolly.awsSdk.awsSdkStrings.ALL_PROJECTED_ATTRIBUTES
    - typingsJapgolly.awsSdk.awsSdkStrings.SPECIFIC_ATTRIBUTES
    - typingsJapgolly.awsSdk.awsSdkStrings.COUNT
    - java.lang.String
  */
  type Select = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._Select | java.lang.String
  type StreamArn = java.lang.String
  type StreamEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW_IMAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.OLD_IMAGE
    - typingsJapgolly.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typingsJapgolly.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._StreamViewType | java.lang.String
  type String = java.lang.String
  type StringAttributeValue = java.lang.String
  type StringSetAttributeValue = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.StringAttributeValue]
  type TableArn = java.lang.String
  type TableCreationDateTime = js.Date
  type TableId = java.lang.String
  type TableName = java.lang.String
  type TableNameList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TableName]
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
  type TableStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._TableStatus | java.lang.String
  type TagKeyList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TagKeyString]
  type TagKeyString = java.lang.String
  type TagList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.Tag]
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
  type TimeToLiveStatus = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._TimeToLiveStatus | java.lang.String
  type TransactGetItemList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TransactGetItem]
  type TransactWriteItemList = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.TransactWriteItem]
  type UpdateExpression = java.lang.String
  type WriteRequests = js.Array[typingsJapgolly.awsSdk.documentClientMod.DocumentClient.WriteRequest]
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.node.Buffer
    - typingsJapgolly.awsSdk.documentClientMod.File
    - typingsJapgolly.awsSdk.documentClientMod.Blob
    - typingsJapgolly.std.ArrayBuffer
    - typingsJapgolly.std.DataView
    - typingsJapgolly.std.Int8Array
    - typingsJapgolly.std.Uint8Array
    - typingsJapgolly.std.Uint8ClampedArray
    - typingsJapgolly.std.Int16Array
    - typingsJapgolly.std.Uint16Array
    - typingsJapgolly.std.Int32Array
    - typingsJapgolly.std.Uint32Array
    - typingsJapgolly.std.Float32Array
    - typingsJapgolly.std.Float64Array
    - typingsJapgolly.node.streamMod.Stream
  */
  type binaryType = typingsJapgolly.awsSdk.documentClientMod.DocumentClient._binaryType | typingsJapgolly.node.Buffer | scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.DataView | scala.scalajs.js.typedarray.Int8Array | scala.scalajs.js.typedarray.Uint8Array | scala.scalajs.js.typedarray.Uint8ClampedArray | scala.scalajs.js.typedarray.Int16Array | scala.scalajs.js.typedarray.Uint16Array | scala.scalajs.js.typedarray.Int32Array | scala.scalajs.js.typedarray.Uint32Array | scala.scalajs.js.typedarray.Float32Array | scala.scalajs.js.typedarray.Float64Array | typingsJapgolly.node.streamMod.Stream
}
