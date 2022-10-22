package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupPlansListMember extends StObject {
  
  /**
    * Contains a list of BackupOptions for a resource type.
    */
  var AdvancedBackupSettings: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupMod.AdvancedBackupSettings] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a backup plan; for example, arn:aws:backup:us-east-1:123456789012:plan:8F81F553-3A74-4A3F-B93D-B3360DC80C50.
    */
  var BackupPlanArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * The display name of a saved backup plan.
    */
  var BackupPlanName: js.UndefOr[typingsJapgolly.awsSdk.clientsBackupMod.BackupPlanName] = js.undefined
  
  /**
    * The date and time a resource backup plan is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice. This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
    */
  var CreatorRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time a backup plan is deleted, in Unix format and Coordinated Universal Time (UTC). The value of DeletionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var DeletionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last time a job to back up resources was run with this rule. A date and time, in Unix format and Coordinated Universal Time (UTC). The value of LastExecutionDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var LastExecutionDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Unique, randomly generated, Unicode, UTF-8 encoded strings that are at most 1,024 bytes long. Version IDs cannot be edited.
    */
  var VersionId: js.UndefOr[String] = js.undefined
}
object BackupPlansListMember {
  
  inline def apply(): BackupPlansListMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupPlansListMember]
  }
  
  extension [Self <: BackupPlansListMember](x: Self) {
    
    inline def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = StObject.set(x, "AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    inline def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "AdvancedBackupSettings", js.undefined)
    
    inline def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = StObject.set(x, "AdvancedBackupSettings", js.Array(value*))
    
    inline def setBackupPlanArn(value: ARN): Self = StObject.set(x, "BackupPlanArn", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanArnUndefined: Self = StObject.set(x, "BackupPlanArn", js.undefined)
    
    inline def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    inline def setBackupPlanName(value: BackupPlanName): Self = StObject.set(x, "BackupPlanName", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanNameUndefined: Self = StObject.set(x, "BackupPlanName", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setDeletionDate(value: js.Date): Self = StObject.set(x, "DeletionDate", value.asInstanceOf[js.Any])
    
    inline def setDeletionDateUndefined: Self = StObject.set(x, "DeletionDate", js.undefined)
    
    inline def setLastExecutionDate(value: js.Date): Self = StObject.set(x, "LastExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastExecutionDateUndefined: Self = StObject.set(x, "LastExecutionDate", js.undefined)
    
    inline def setVersionId(value: String): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
