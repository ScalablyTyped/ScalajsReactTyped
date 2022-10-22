package typingsJapgolly.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableFastSnapshotRestoreErrorItem extends StObject {
  
  /**
    * The errors.
    */
  var FastSnapshotRestoreStateErrors: js.UndefOr[DisableFastSnapshotRestoreStateErrorSet] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
}
object DisableFastSnapshotRestoreErrorItem {
  
  inline def apply(): DisableFastSnapshotRestoreErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoreErrorItem]
  }
  
  extension [Self <: DisableFastSnapshotRestoreErrorItem](x: Self) {
    
    inline def setFastSnapshotRestoreStateErrors(value: DisableFastSnapshotRestoreStateErrorSet): Self = StObject.set(x, "FastSnapshotRestoreStateErrors", value.asInstanceOf[js.Any])
    
    inline def setFastSnapshotRestoreStateErrorsUndefined: Self = StObject.set(x, "FastSnapshotRestoreStateErrors", js.undefined)
    
    inline def setFastSnapshotRestoreStateErrorsVarargs(value: DisableFastSnapshotRestoreStateErrorItem*): Self = StObject.set(x, "FastSnapshotRestoreStateErrors", js.Array(value*))
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}
