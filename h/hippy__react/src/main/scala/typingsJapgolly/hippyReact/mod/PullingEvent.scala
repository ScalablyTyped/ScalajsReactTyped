package typingsJapgolly.hippyReact.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event response from onHeaderPulling and onFooterPulling
  */
trait PullingEvent extends StObject {
  
  /**
    * Dragging gap
    */
  var contentOffset: Double
}
object PullingEvent {
  
  inline def apply(contentOffset: Double): PullingEvent = {
    val __obj = js.Dynamic.literal(contentOffset = contentOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullingEvent]
  }
  
  extension [Self <: PullingEvent](x: Self) {
    
    inline def setContentOffset(value: Double): Self = StObject.set(x, "contentOffset", value.asInstanceOf[js.Any])
  }
}
