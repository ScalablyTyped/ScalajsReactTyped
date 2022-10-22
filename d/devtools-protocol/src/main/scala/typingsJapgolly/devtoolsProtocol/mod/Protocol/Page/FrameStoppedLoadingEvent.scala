package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameStoppedLoadingEvent extends StObject {
  
  /**
    * Id of the frame that has stopped loading.
    */
  var frameId: FrameId
}
object FrameStoppedLoadingEvent {
  
  inline def apply(frameId: FrameId): FrameStoppedLoadingEvent = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameStoppedLoadingEvent]
  }
  
  extension [Self <: FrameStoppedLoadingEvent](x: Self) {
    
    inline def setFrameId(value: FrameId): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
  }
}
