package typingsJapgolly.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotListenOptions extends StObject {
  
  val includeMetadataChanges: js.UndefOr[Boolean] = js.undefined
}
object SnapshotListenOptions {
  
  inline def apply(): SnapshotListenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotListenOptions]
  }
  
  extension [Self <: SnapshotListenOptions](x: Self) {
    
    inline def setIncludeMetadataChanges(value: Boolean): Self = StObject.set(x, "includeMetadataChanges", value.asInstanceOf[js.Any])
    
    inline def setIncludeMetadataChangesUndefined: Self = StObject.set(x, "includeMetadataChanges", js.undefined)
  }
}
