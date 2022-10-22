package typingsJapgolly.devtoolsProtocol.mod.Protocol.HeapProfiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHeapObjectIdResponse extends StObject {
  
  /**
    * Id of the heap snapshot object corresponding to the passed remote object id.
    */
  var heapSnapshotObjectId: HeapSnapshotObjectId
}
object GetHeapObjectIdResponse {
  
  inline def apply(heapSnapshotObjectId: HeapSnapshotObjectId): GetHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(heapSnapshotObjectId = heapSnapshotObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdResponse]
  }
  
  extension [Self <: GetHeapObjectIdResponse](x: Self) {
    
    inline def setHeapSnapshotObjectId(value: HeapSnapshotObjectId): Self = StObject.set(x, "heapSnapshotObjectId", value.asInstanceOf[js.Any])
  }
}
