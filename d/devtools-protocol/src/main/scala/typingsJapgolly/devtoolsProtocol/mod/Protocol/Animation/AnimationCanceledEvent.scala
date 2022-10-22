package typingsJapgolly.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationCanceledEvent extends StObject {
  
  /**
    * Id of the animation that was cancelled.
    */
  var id: String
}
object AnimationCanceledEvent {
  
  inline def apply(id: String): AnimationCanceledEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationCanceledEvent]
  }
  
  extension [Self <: AnimationCanceledEvent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
