package typingsJapgolly.devtoolsProtocol.anon

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOMSnapshot.CaptureSnapshotRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOMSnapshot.CaptureSnapshotResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCaptureSnapshotResponse extends StObject {
  
  var paramsType: js.Array[CaptureSnapshotRequest]
  
  var returnType: CaptureSnapshotResponse
}
object ReturnTypeCaptureSnapshotResponse {
  
  inline def apply(paramsType: js.Array[CaptureSnapshotRequest], returnType: CaptureSnapshotResponse): ReturnTypeCaptureSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCaptureSnapshotResponse]
  }
  
  extension [Self <: ReturnTypeCaptureSnapshotResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[CaptureSnapshotRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CaptureSnapshotRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CaptureSnapshotResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
