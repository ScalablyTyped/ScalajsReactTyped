package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Event data for infrared frame source removed events. */
trait PerceptionInfraredFrameSourceRemovedEventArgs extends StObject {
  
  /** Gets the infrared frame source that was removed. */
  var frameSource: PerceptionInfraredFrameSource
}
object PerceptionInfraredFrameSourceRemovedEventArgs {
  
  inline def apply(frameSource: PerceptionInfraredFrameSource): PerceptionInfraredFrameSourceRemovedEventArgs = {
    val __obj = js.Dynamic.literal(frameSource = frameSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionInfraredFrameSourceRemovedEventArgs]
  }
  
  extension [Self <: PerceptionInfraredFrameSourceRemovedEventArgs](x: Self) {
    
    inline def setFrameSource(value: PerceptionInfraredFrameSource): Self = StObject.set(x, "frameSource", value.asInstanceOf[js.Any])
  }
}
