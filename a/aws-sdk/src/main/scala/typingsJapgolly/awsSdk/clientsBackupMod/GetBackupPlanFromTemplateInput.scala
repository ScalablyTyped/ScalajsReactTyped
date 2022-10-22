package typingsJapgolly.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackupPlanFromTemplateInput extends StObject {
  
  /**
    * Uniquely identifies a stored backup plan template.
    */
  var BackupPlanTemplateId: String
}
object GetBackupPlanFromTemplateInput {
  
  inline def apply(BackupPlanTemplateId: String): GetBackupPlanFromTemplateInput = {
    val __obj = js.Dynamic.literal(BackupPlanTemplateId = BackupPlanTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupPlanFromTemplateInput]
  }
  
  extension [Self <: GetBackupPlanFromTemplateInput](x: Self) {
    
    inline def setBackupPlanTemplateId(value: String): Self = StObject.set(x, "BackupPlanTemplateId", value.asInstanceOf[js.Any])
  }
}
