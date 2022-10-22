package typingsJapgolly.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotLegacy extends StObject {
  
  var canTakeSnapshot: Boolean
}
object SnapshotLegacy {
  
  inline def apply(canTakeSnapshot: Boolean): SnapshotLegacy = {
    val __obj = js.Dynamic.literal(canTakeSnapshot = canTakeSnapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotLegacy]
  }
  
  extension [Self <: SnapshotLegacy](x: Self) {
    
    inline def setCanTakeSnapshot(value: Boolean): Self = StObject.set(x, "canTakeSnapshot", value.asInstanceOf[js.Any])
  }
}
