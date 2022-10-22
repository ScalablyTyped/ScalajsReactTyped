package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotRestoreResponse extends StObject {
  
  var snapshot: SnapshotRestoreSnapshotRestore
}
object SnapshotRestoreResponse {
  
  inline def apply(snapshot: SnapshotRestoreSnapshotRestore): SnapshotRestoreResponse = {
    val __obj = js.Dynamic.literal(snapshot = snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotRestoreResponse]
  }
  
  extension [Self <: SnapshotRestoreResponse](x: Self) {
    
    inline def setSnapshot(value: SnapshotRestoreSnapshotRestore): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
  }
}
