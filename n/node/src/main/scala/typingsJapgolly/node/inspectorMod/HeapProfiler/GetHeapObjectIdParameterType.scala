package typingsJapgolly.node.inspectorMod.HeapProfiler

import typingsJapgolly.node.inspectorMod.Runtime.RemoteObjectId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetHeapObjectIdParameterType extends StObject {
  
  /**
    * Identifier of the object to get heap object id for.
    */
  var objectId: RemoteObjectId
}
object GetHeapObjectIdParameterType {
  
  inline def apply(objectId: RemoteObjectId): GetHeapObjectIdParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHeapObjectIdParameterType]
  }
  
  extension [Self <: GetHeapObjectIdParameterType](x: Self) {
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
