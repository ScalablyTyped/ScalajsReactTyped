package typingsJapgolly.devtoolsProtocol.mod.Protocol.Browser

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Target.TargetID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWindowForTargetRequest extends StObject {
  
  /**
    * Devtools agent host id. If called as a part of the session, associated targetId is used.
    */
  var targetId: js.UndefOr[TargetID] = js.undefined
}
object GetWindowForTargetRequest {
  
  inline def apply(): GetWindowForTargetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWindowForTargetRequest]
  }
  
  extension [Self <: GetWindowForTargetRequest](x: Self) {
    
    inline def setTargetId(value: TargetID): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
  }
}
