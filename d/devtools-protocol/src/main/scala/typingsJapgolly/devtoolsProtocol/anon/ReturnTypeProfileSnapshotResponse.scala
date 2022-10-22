package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeProfileSnapshotResponse extends StObject {
  
  var paramsType: js.Array[ProfileSnapshotRequest]
  
  var returnType: ProfileSnapshotResponse
}
object ReturnTypeProfileSnapshotResponse {
  
  inline def apply(paramsType: js.Array[ProfileSnapshotRequest], returnType: ProfileSnapshotResponse): ReturnTypeProfileSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeProfileSnapshotResponse]
  }
  
  extension [Self <: ReturnTypeProfileSnapshotResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[ProfileSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ProfileSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: ProfileSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
