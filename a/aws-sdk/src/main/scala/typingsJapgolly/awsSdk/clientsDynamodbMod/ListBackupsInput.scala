package typingsJapgolly.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackupsInput extends StObject {
  
  /**
    * The backups from the table specified by BackupType are listed. Where BackupType can be:    USER - On-demand backup created by you. (The default setting if no other backup types are specified.)    SYSTEM - On-demand backup automatically created by DynamoDB.    ALL - All types of on-demand backups (USER and SYSTEM).  
    */
  var BackupType: js.UndefOr[BackupTypeFilter] = js.undefined
  
  /**
    *  LastEvaluatedBackupArn is the Amazon Resource Name (ARN) of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the ExclusiveStartBackupArn of a new ListBackups operation in order to fetch the next page of results. 
    */
  var ExclusiveStartBackupArn: js.UndefOr[BackupArn] = js.undefined
  
  /**
    * Maximum number of backups to return at once.
    */
  var Limit: js.UndefOr[BackupsInputLimit] = js.undefined
  
  /**
    * The backups from the table specified by TableName are listed. 
    */
  var TableName: js.UndefOr[typingsJapgolly.awsSdk.clientsDynamodbMod.TableName] = js.undefined
  
  /**
    * Only backups created after this time are listed. TimeRangeLowerBound is inclusive.
    */
  var TimeRangeLowerBound: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Only backups created before this time are listed. TimeRangeUpperBound is exclusive. 
    */
  var TimeRangeUpperBound: js.UndefOr[js.Date] = js.undefined
}
object ListBackupsInput {
  
  inline def apply(): ListBackupsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackupsInput]
  }
  
  extension [Self <: ListBackupsInput](x: Self) {
    
    inline def setBackupType(value: BackupTypeFilter): Self = StObject.set(x, "BackupType", value.asInstanceOf[js.Any])
    
    inline def setBackupTypeUndefined: Self = StObject.set(x, "BackupType", js.undefined)
    
    inline def setExclusiveStartBackupArn(value: BackupArn): Self = StObject.set(x, "ExclusiveStartBackupArn", value.asInstanceOf[js.Any])
    
    inline def setExclusiveStartBackupArnUndefined: Self = StObject.set(x, "ExclusiveStartBackupArn", js.undefined)
    
    inline def setLimit(value: BackupsInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    inline def setTimeRangeLowerBound(value: js.Date): Self = StObject.set(x, "TimeRangeLowerBound", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeLowerBoundUndefined: Self = StObject.set(x, "TimeRangeLowerBound", js.undefined)
    
    inline def setTimeRangeUpperBound(value: js.Date): Self = StObject.set(x, "TimeRangeUpperBound", value.asInstanceOf[js.Any])
    
    inline def setTimeRangeUpperBoundUndefined: Self = StObject.set(x, "TimeRangeUpperBound", js.undefined)
  }
}
