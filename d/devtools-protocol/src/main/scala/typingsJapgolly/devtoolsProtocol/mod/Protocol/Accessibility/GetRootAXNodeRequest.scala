package typingsJapgolly.devtoolsProtocol.mod.Protocol.Accessibility

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Page.FrameId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRootAXNodeRequest extends StObject {
  
  /**
    * The frame in whose document the node resides.
    * If omitted, the root frame is used.
    */
  var frameId: js.UndefOr[FrameId] = js.undefined
}
object GetRootAXNodeRequest {
  
  inline def apply(): GetRootAXNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRootAXNodeRequest]
  }
  
  extension [Self <: GetRootAXNodeRequest](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setFrameIdUndefined: Self = StObject.set(x, "frameId", js.undefined)
  }
}
