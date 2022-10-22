package typingsJapgolly.node.inspectorMod.HeapProfiler

import typingsJapgolly.node.inspectorMod.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetObjectByHeapObjectIdReturnType extends StObject {
  
  /**
    * Evaluation result.
    */
  var result: RemoteObject
}
object GetObjectByHeapObjectIdReturnType {
  
  inline def apply(result: RemoteObject): GetObjectByHeapObjectIdReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectByHeapObjectIdReturnType]
  }
  
  extension [Self <: GetObjectByHeapObjectIdReturnType](x: Self) {
    
    inline def setResult(value: RemoteObject): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
