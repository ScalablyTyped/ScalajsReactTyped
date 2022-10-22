package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupSummary extends StObject {
  
  /**
    * ARN associated with the backup.
    */
  var BackupArn: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.BackupArn] = js.undefined
  
  /**
    * Time at which the backup was created.
    */
  var BackupCreationDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Time at which the automatic on-demand backup created by DynamoDB will expire. This SYSTEM on-demand backup expires automatically 35 days after its creation.
    */
  var BackupExpiryDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Name of the specified backup.
    */
  var BackupName: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.BackupName] = js.undefined
  
  /**
    * Size of the backup in bytes.
    */
  var BackupSizeBytes: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.BackupSizeBytes] = js.undefined
  
  /**
    * Backup can be in one of the following states: CREATING, ACTIVE, DELETED.
    */
  var BackupStatus: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.BackupStatus] = js.undefined
  
  /**
    * BackupType:    USER - You create and manage these using the on-demand backup feature.    SYSTEM - If you delete a table with point-in-time recovery enabled, a SYSTEM backup is automatically created and is retained for 35 days (at no additional cost). System backups allow you to restore the deleted table to the state it was in just before the point of deletion.     AWS_BACKUP - On-demand backup created by you from Backup service.  
    */
  var BackupType: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.BackupType] = js.undefined
  
  /**
    * ARN associated with the table.
    */
  var TableArn: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.TableArn] = js.undefined
  
  /**
    * Unique identifier for the table.
    */
  var TableId: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.TableId] = js.undefined
  
  /**
    * Name of the table.
    */
  var TableName: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.TableName] = js.undefined
}
object BackupSummary {
  
  inline def apply(): BackupSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupSummary]
  }
  
  extension [Self <: BackupSummary](x: Self) {
    
    inline def setBackupArn(value: BackupArn): Self = StObject.set(x, "BackupArn", value.asInstanceOf[js.Any])
    
    inline def setBackupArnUndefined: Self = StObject.set(x, "BackupArn", js.undefined)
    
    inline def setBackupCreationDateTime(value: js.Date): Self = StObject.set(x, "BackupCreationDateTime", value.asInstanceOf[js.Any])
    
    inline def setBackupCreationDateTimeUndefined: Self = StObject.set(x, "BackupCreationDateTime", js.undefined)
    
    inline def setBackupExpiryDateTime(value: js.Date): Self = StObject.set(x, "BackupExpiryDateTime", value.asInstanceOf[js.Any])
    
    inline def setBackupExpiryDateTimeUndefined: Self = StObject.set(x, "BackupExpiryDateTime", js.undefined)
    
    inline def setBackupName(value: BackupName): Self = StObject.set(x, "BackupName", value.asInstanceOf[js.Any])
    
    inline def setBackupNameUndefined: Self = StObject.set(x, "BackupName", js.undefined)
    
    inline def setBackupSizeBytes(value: BackupSizeBytes): Self = StObject.set(x, "BackupSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setBackupSizeBytesUndefined: Self = StObject.set(x, "BackupSizeBytes", js.undefined)
    
    inline def setBackupStatus(value: BackupStatus): Self = StObject.set(x, "BackupStatus", value.asInstanceOf[js.Any])
    
    inline def setBackupStatusUndefined: Self = StObject.set(x, "BackupStatus", js.undefined)
    
    inline def setBackupType(value: BackupType): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    inline def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
    
    inline def setTableArn(value: TableArn): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    inline def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    inline def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    inline def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
