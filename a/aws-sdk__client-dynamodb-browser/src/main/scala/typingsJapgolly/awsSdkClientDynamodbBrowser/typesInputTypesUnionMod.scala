package typingsJapgolly.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesKeysAndAttributesMod.KeysAndAttributes
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesReplicaMod.Replica
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod.ReplicaUpdate
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesTagMod.Tag
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesWriteRequestMod.WriteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput
    - typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    inline def BatchGetItemInput(
      RequestItems: StringDictionary[KeysAndAttributes] | (js.Iterable[js.Tuple2[String, KeysAndAttributes]])
    ): typingsJapgolly.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput]
    }
    
    inline def BatchWriteItemInput(
      RequestItems: (StringDictionary[js.Array[WriteRequest] | js.Iterable[WriteRequest]]) | (js.Iterable[js.Tuple2[String, js.Array[WriteRequest] | js.Iterable[WriteRequest]]])
    ): typingsJapgolly.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput]
    }
    
    inline def CreateBackupInput(BackupName: String, TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput = {
      val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput]
    }
    
    inline def CreateGlobalTableInput(GlobalTableName: String, ReplicationGroup: js.Array[Replica] | js.Iterable[Replica]): typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput]
    }
    
    inline def CreateTableInput(
      AttributeDefinitions: js.Array[AttributeDefinition] | js.Iterable[AttributeDefinition],
      KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput]
    }
    
    inline def DeleteBackupInput(BackupArn: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput]
    }
    
    inline def DeleteItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput]
    }
    
    inline def DeleteTableInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput]
    }
    
    inline def DescribeBackupInput(BackupArn: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput]
    }
    
    inline def DescribeContinuousBackupsInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput]
    }
    
    inline def DescribeEndpointsInput(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput]
    }
    
    inline def DescribeGlobalTableInput(GlobalTableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput]
    }
    
    inline def DescribeGlobalTableSettingsInput(GlobalTableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput]
    }
    
    inline def DescribeLimitsInput(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    inline def DescribeTableInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput]
    }
    
    inline def DescribeTimeToLiveInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput]
    }
    
    inline def GetItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput]
    }
    
    inline def ListBackupsInput(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput]
    }
    
    inline def ListGlobalTablesInput(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput]
    }
    
    inline def ListTablesInput(): typingsJapgolly.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput]
    }
    
    inline def ListTagsOfResourceInput(ResourceArn: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput]
    }
    
    inline def PutItemInput(
      Item: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput]
    }
    
    inline def QueryInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput]
    }
    
    inline def RestoreTableFromBackupInput(BackupArn: String, TargetTableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput]
    }
    
    inline def RestoreTableToPointInTimeInput(SourceTableName: String, TargetTableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(SourceTableName = SourceTableName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput]
    }
    
    inline def ScanInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput]
    }
    
    inline def TagResourceInput(ResourceArn: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typingsJapgolly.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput]
    }
    
    inline def UntagResourceInput(ResourceArn: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsJapgolly.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    inline def UpdateContinuousBackupsInput(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput]
    }
    
    inline def UpdateGlobalTableInput(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate]): typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput]
    }
    
    inline def UpdateGlobalTableSettingsInput(GlobalTableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput]
    }
    
    inline def UpdateItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput]
    }
    
    inline def UpdateTableInput(TableName: String): typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput]
    }
    
    inline def UpdateTimeToLiveInput(TableName: String, TimeToLiveSpecification: TimeToLiveSpecification): typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput]
    }
  }
}
