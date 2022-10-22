package typingsJapgolly.awsSdk.clientsBackupstorageMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartObjectInput extends StObject {
  
  /**
    * Backup job Id for the in-progress backup
    */
  var BackupJobId: String
  
  /**
    * Name for the object.
    */
  var ObjectName: String
  
  /**
    * Throw an exception if Object name is already exist.
    */
  var ThrowOnDuplicate: js.UndefOr[Boolean] = js.undefined
}
object StartObjectInput {
  
  inline def apply(BackupJobId: String, ObjectName: String): StartObjectInput = {
    val __obj = js.Dynamic.literal(BackupJobId = BackupJobId.asInstanceOf[js.Any], ObjectName = ObjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartObjectInput]
  }
  
  extension [Self <: StartObjectInput](x: Self) {
    
    inline def setBackupJobId(value: String): Self = StObject.set(x, "BackupJobId", value.asInstanceOf[js.Any])
    
    inline def setObjectName(value: String): Self = StObject.set(x, "ObjectName", value.asInstanceOf[js.Any])
    
    inline def setThrowOnDuplicate(value: Boolean): Self = StObject.set(x, "ThrowOnDuplicate", value.asInstanceOf[js.Any])
    
    inline def setThrowOnDuplicateUndefined: Self = StObject.set(x, "ThrowOnDuplicate", js.undefined)
  }
}
