package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Tracing.RecordClockSyncMarkerRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `228` extends StObject {
  
  var paramsType: js.Array[RecordClockSyncMarkerRequest]
  
  var returnType: Unit
}
object `228` {
  
  inline def apply(paramsType: js.Array[RecordClockSyncMarkerRequest], returnType: Unit): `228` = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`228`]
  }
  
  extension [Self <: `228`](x: Self) {
    
    inline def setParamsType(value: js.Array[RecordClockSyncMarkerRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RecordClockSyncMarkerRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: Unit): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
