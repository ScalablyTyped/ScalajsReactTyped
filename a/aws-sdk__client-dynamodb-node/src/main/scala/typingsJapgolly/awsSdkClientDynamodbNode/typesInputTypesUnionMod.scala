package typingsJapgolly.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientDynamodbNode.typesAttributeDefinitionMod.AttributeDefinition
import typingsJapgolly.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typingsJapgolly.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typingsJapgolly.awsSdkClientDynamodbNode.typesKeysAndAttributesMod.KeysAndAttributes
import typingsJapgolly.awsSdkClientDynamodbNode.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
import typingsJapgolly.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typingsJapgolly.awsSdkClientDynamodbNode.typesReplicaMod.Replica
import typingsJapgolly.awsSdkClientDynamodbNode.typesReplicaUpdateMod.ReplicaUpdate
import typingsJapgolly.awsSdkClientDynamodbNode.typesTagMod.Tag
import typingsJapgolly.awsSdkClientDynamodbNode.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
import typingsJapgolly.awsSdkClientDynamodbNode.typesWriteRequestMod.WriteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput
    - typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def BatchGetItemInput(
      RequestItems: StringDictionary[KeysAndAttributes] | (js.Iterable[js.Tuple2[String, KeysAndAttributes]])
    ): typingsJapgolly.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput]
    }
    
    inline def BatchWriteItemInput(
      RequestItems: (StringDictionary[js.Array[WriteRequest] | js.Iterable[WriteRequest]]) | (js.Iterable[js.Tuple2[String, js.Array[WriteRequest] | js.Iterable[WriteRequest]]])
    ): typingsJapgolly.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput]
    }
    
    inline def CreateBackupInput(BackupName: String, TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput = {
      val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput]
    }
    
    inline def CreateGlobalTableInput(GlobalTableName: String, ReplicationGroup: js.Array[Replica] | js.Iterable[Replica]): typingsJapgolly.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput]
    }
    
    inline def CreateTableInput(
      AttributeDefinitions: js.Array[AttributeDefinition] | js.Iterable[AttributeDefinition],
      KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput]
    }
    
    inline def DeleteBackupInput(BackupArn: String): typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput]
    }
    
    inline def DeleteItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput]
    }
    
    inline def DeleteTableInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput]
    }
    
    inline def DescribeBackupInput(BackupArn: String): typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput]
    }
    
    inline def DescribeContinuousBackupsInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput]
    }
    
    inline def DescribeEndpointsInput(): typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput]
    }
    
    inline def DescribeGlobalTableInput(GlobalTableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput]
    }
    
    inline def DescribeGlobalTableSettingsInput(GlobalTableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput]
    }
    
    inline def DescribeLimitsInput(): typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    inline def DescribeTableInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput]
    }
    
    inline def DescribeTimeToLiveInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput]
    }
    
    inline def GetItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput]
    }
    
    inline def ListBackupsInput(): typingsJapgolly.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput]
    }
    
    inline def ListGlobalTablesInput(): typingsJapgolly.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput]
    }
    
    inline def ListTablesInput(): typingsJapgolly.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput]
    }
    
    inline def ListTagsOfResourceInput(ResourceArn: String): typingsJapgolly.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput]
    }
    
    inline def PutItemInput(
      Item: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput]
    }
    
    inline def QueryInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput]
    }
    
    inline def RestoreTableFromBackupInput(BackupArn: String, TargetTableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput]
    }
    
    inline def RestoreTableToPointInTimeInput(SourceTableName: String, TargetTableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(SourceTableName = SourceTableName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput]
    }
    
    inline def ScanInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput]
    }
    
    inline def TagResourceInput(ResourceArn: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typingsJapgolly.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    inline def UntagResourceInput(ResourceArn: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    inline def UpdateContinuousBackupsInput(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput]
    }
    
    inline def UpdateGlobalTableInput(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate]): typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput]
    }
    
    inline def UpdateGlobalTableSettingsInput(GlobalTableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput]
    }
    
    inline def UpdateItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput]
    }
    
    inline def UpdateTableInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput]
    }
    
    inline def UpdateTimeToLiveInput(TableName: String, TimeToLiveSpecification: TimeToLiveSpecification): typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput]
    }
  }
}
