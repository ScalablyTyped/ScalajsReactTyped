package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupRequest extends StObject {
  
  /**
    * The ID of the backup that you want to delete.
    */
  var BackupId: typingsJapgolly.awsSdk.clientsFsxMod.BackupId
  
  /**
    * A string of up to 64 ASCII characters that Amazon FSx uses to ensure idempotent deletion. This parameter is automatically filled on your behalf when using the CLI or SDK.
    */
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
}
object DeleteBackupRequest {
  
  inline def apply(BackupId: BackupId): DeleteBackupRequest = {
    val __obj = js.Dynamic.literal(BackupId = BackupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupRequest]
  }
  
  extension [Self <: DeleteBackupRequest](x: Self) {
    
    inline def setBackupId(value: BackupId): Self = StObject.set(x, "BackupId", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
  }
}
