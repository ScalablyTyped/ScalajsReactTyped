package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.HeapProfiler.StopTrackingHeapObjectsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `14` extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StopTrackingHeapObjectsRequest]]
  
  var returnType: Unit
}
object `14` {
  
  inline def apply(paramsType: js.Array[js.UndefOr[StopTrackingHeapObjectsRequest]], returnType: Unit): `14` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`14`]
  }
  
  extension [Self <: `14`](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[StopTrackingHeapObjectsRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[StopTrackingHeapObjectsRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
