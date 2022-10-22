package typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextWillBeDestroyedEvent extends StObject {
  
  var contextId: GraphObjectId
}
object ContextWillBeDestroyedEvent {
  
  inline def apply(contextId: GraphObjectId): ContextWillBeDestroyedEvent = {
    val __obj = js.Dynamic.literal(contextId = contextId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextWillBeDestroyedEvent]
  }
  
  extension [Self <: ContextWillBeDestroyedEvent](x: Self) {
    
    inline def setContextId(value: GraphObjectId): Self = StObject.set(x, "contextId", value.asInstanceOf[js.Any])
  }
}
