package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContainerStateWaiting is a waiting state of a container.
  */
trait ContainerStateWaitingPatch extends StObject {
  
  /**
    * Message regarding why the container is not yet running.
    */
  var message: String
  
  /**
    * (brief) reason the container is not yet running.
    */
  var reason: String
}
object ContainerStateWaitingPatch {
  
  inline def apply(message: String, reason: String): ContainerStateWaitingPatch = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerStateWaitingPatch]
  }
  
  extension [Self <: ContainerStateWaitingPatch](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
