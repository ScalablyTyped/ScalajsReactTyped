package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event data for color frame source added events. */
trait PerceptionColorFrameSourceRemovedEventArgs extends StObject {
  
  /** Gets the color frame source that was removed. */
  var frameSource: PerceptionColorFrameSource
}
object PerceptionColorFrameSourceRemovedEventArgs {
  
  inline def apply(frameSource: PerceptionColorFrameSource): PerceptionColorFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionColorFrameSourceRemovedEventArgs]
  }
  
  extension [Self <: PerceptionColorFrameSourceRemovedEventArgs](x: Self) {
    
    inline def setFrameSource(value: PerceptionColorFrameSource): Self = StObject.set(x, "frameSource", value.asInstanceOf[js.Any])
  }
}
