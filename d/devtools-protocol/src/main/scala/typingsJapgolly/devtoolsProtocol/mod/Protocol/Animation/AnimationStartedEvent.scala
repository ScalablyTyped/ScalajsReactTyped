package typingsJapgolly.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationStartedEvent extends StObject {
  
  /**
    * Animation that was started.
    */
  var animation: typingsJapgolly.devtoolsProtocol.mod.Protocol.Animation.Animation
}
object AnimationStartedEvent {
  
  inline def apply(animation: typingsJapgolly.devtoolsProtocol.mod.Protocol.Animation.Animation): AnimationStartedEvent = {
    val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationStartedEvent]
  }
  
  extension [Self <: AnimationStartedEvent](x: Self) {
    
    inline def setAnimation(value: typingsJapgolly.devtoolsProtocol.mod.Protocol.Animation.Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
  }
}
