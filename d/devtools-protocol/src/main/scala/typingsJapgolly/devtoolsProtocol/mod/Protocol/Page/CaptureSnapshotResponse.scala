package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptureSnapshotResponse extends StObject {
  
  /**
    * Serialized page data.
    */
  var data: String
}
object CaptureSnapshotResponse {
  
  inline def apply(data: String): CaptureSnapshotResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureSnapshotResponse]
  }
  
  extension [Self <: CaptureSnapshotResponse](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
