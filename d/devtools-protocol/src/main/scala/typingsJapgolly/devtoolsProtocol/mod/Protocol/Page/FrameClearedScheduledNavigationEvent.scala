package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameClearedScheduledNavigationEvent extends StObject {
  
  /**
    * Id of the frame that has cleared its scheduled navigation.
    */
  var frameId: FrameId
}
object FrameClearedScheduledNavigationEvent {
  
  inline def apply(frameId: FrameId): FrameClearedScheduledNavigationEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameClearedScheduledNavigationEvent]
  }
  
  extension [Self <: FrameClearedScheduledNavigationEvent](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
