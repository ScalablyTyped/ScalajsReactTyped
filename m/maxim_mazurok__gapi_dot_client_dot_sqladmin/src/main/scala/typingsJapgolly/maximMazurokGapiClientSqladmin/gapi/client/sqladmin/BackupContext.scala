package typingsJapgolly.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupContext extends StObject {
  
  /** The identifier of the backup. */
  var backupId: js.UndefOr[String] = js.undefined
  
  /** This is always `sql#backupContext`. */
  var kind: js.UndefOr[String] = js.undefined
}
object BackupContext {
  
  inline def apply(): BackupContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackupContext]
  }
  
  extension [Self <: BackupContext](x: Self) {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
