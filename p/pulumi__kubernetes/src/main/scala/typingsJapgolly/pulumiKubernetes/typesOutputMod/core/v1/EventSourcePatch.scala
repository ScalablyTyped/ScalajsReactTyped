package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventSource contains information for an event.
  */
trait EventSourcePatch extends StObject {
  
  /**
    * Component from which the event is generated.
    */
  var component: String
  
  /**
    * Node name on which the event is generated.
    */
  var host: String
}
object EventSourcePatch {
  
  inline def apply(component: String, host: String): EventSourcePatch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSourcePatch]
  }
  
  extension [Self <: EventSourcePatch](x: Self) {
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
