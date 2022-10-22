package typingsJapgolly.devtoolsProtocol.mod.Protocol.LayerTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadSnapshotResponse extends StObject {
  
  /**
    * The id of the snapshot.
    */
  var snapshotId: SnapshotId
}
object LoadSnapshotResponse {
  
  inline def apply(snapshotId: SnapshotId): LoadSnapshotResponse = {
    val __obj = js.Dynamic.literal(snapshotId = snapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadSnapshotResponse]
  }
  
  extension [Self <: LoadSnapshotResponse](x: Self) {
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
  }
}
