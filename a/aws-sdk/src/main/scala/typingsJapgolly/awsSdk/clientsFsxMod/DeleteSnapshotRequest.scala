package typingsJapgolly.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typingsJapgolly.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The ID of the snapshot that you want to delete.
    */
  var SnapshotId: typingsJapgolly.awsSdk.clientsFsxMod.SnapshotId
}
object DeleteSnapshotRequest {
  
  inline def apply(SnapshotId: SnapshotId): DeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotRequest]
  }
  
  extension [Self <: DeleteSnapshotRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}
