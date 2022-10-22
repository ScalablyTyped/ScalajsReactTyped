package typingsJapgolly.devtoolsProtocol.mod.Protocol.Animation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveAnimationRequest extends StObject {
  
  /**
    * Animation id.
    */
  var animationId: String
}
object ResolveAnimationRequest {
  
  inline def apply(animationId: String): ResolveAnimationRequest = {
    val __obj = js.Dynamic.literal(animationId = animationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveAnimationRequest]
  }
  
  extension [Self <: ResolveAnimationRequest](x: Self) {
    
    inline def setAnimationId(value: String): Self = StObject.set(x, "animationId", value.asInstanceOf[js.Any])
  }
}
