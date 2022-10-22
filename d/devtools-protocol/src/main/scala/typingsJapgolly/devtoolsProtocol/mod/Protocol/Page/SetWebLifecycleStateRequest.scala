package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.active
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.frozen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWebLifecycleStateRequest extends StObject {
  
  /**
    * Target lifecycle state (SetWebLifecycleStateRequestState enum)
    */
  var state: frozen | active
}
object SetWebLifecycleStateRequest {
  
  inline def apply(state: frozen | active): SetWebLifecycleStateRequest = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWebLifecycleStateRequest]
  }
  
  extension [Self <: SetWebLifecycleStateRequest](x: Self) {
    
    inline def setState(value: frozen | active): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
