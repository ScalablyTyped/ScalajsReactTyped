package typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionContextCreatedEvent extends StObject {
  
  /**
    * A newly created execution context.
    */
  var context: ExecutionContextDescription
}
object ExecutionContextCreatedEvent {
  
  inline def apply(context: ExecutionContextDescription): ExecutionContextCreatedEvent = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextCreatedEvent]
  }
  
  extension [Self <: ExecutionContextCreatedEvent](x: Self) {
    
    inline def setContext(value: ExecutionContextDescription): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
