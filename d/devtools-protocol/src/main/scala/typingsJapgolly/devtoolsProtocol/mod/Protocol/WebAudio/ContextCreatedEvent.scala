package typingsJapgolly.devtoolsProtocol.mod.Protocol.WebAudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextCreatedEvent extends StObject {
  
  var context: BaseAudioContext
}
object ContextCreatedEvent {
  
  inline def apply(context: BaseAudioContext): ContextCreatedEvent = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextCreatedEvent]
  }
  
  extension [Self <: ContextCreatedEvent](x: Self) {
    
    inline def setContext(value: BaseAudioContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
  }
}
