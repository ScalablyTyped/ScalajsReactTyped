package typingsJapgolly.awsSdk.clientsEfsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBackupPolicyRequest extends StObject {
  
  /**
    * The backup policy included in the PutBackupPolicy request.
    */
  var BackupPolicy: typingsJapgolly.awsSdk.clientsEfsMod.BackupPolicy
  
  /**
    * Specifies which EFS file system to update the backup policy for.
    */
  var FileSystemId: typingsJapgolly.awsSdk.clientsEfsMod.FileSystemId
}
object PutBackupPolicyRequest {
  
  inline def apply(BackupPolicy: BackupPolicy, FileSystemId: FileSystemId): PutBackupPolicyRequest = {
    val __obj = js.Dynamic.literal(BackupPolicy = BackupPolicy.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBackupPolicyRequest]
  }
  
  extension [Self <: PutBackupPolicyRequest](x: Self) {
    
    inline def setBackupPolicy(value: BackupPolicy): Self = StObject.set(x, "BackupPolicy", value.asInstanceOf[js.Any])
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
