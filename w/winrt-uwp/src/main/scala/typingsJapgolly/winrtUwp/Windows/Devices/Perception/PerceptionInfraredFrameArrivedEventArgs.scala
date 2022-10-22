package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a infrared frame arrived event. */
trait PerceptionInfraredFrameArrivedEventArgs extends StObject {
  
  /** Gets the relative time of this frame. */
  var relativeTime: Double
  
  /**
    * Attempts to open the infrared frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived infrared frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionInfraredFrame
}
object PerceptionInfraredFrameArrivedEventArgs {
  
  inline def apply(relativeTime: Double, tryOpenFrame: CallbackTo[PerceptionInfraredFrame]): PerceptionInfraredFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = tryOpenFrame.toJsFn)
    __obj.asInstanceOf[PerceptionInfraredFrameArrivedEventArgs]
  }
  
  extension [Self <: PerceptionInfraredFrameArrivedEventArgs](x: Self) {
    
    inline def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    inline def setTryOpenFrame(value: CallbackTo[PerceptionInfraredFrame]): Self = StObject.set(x, "tryOpenFrame", value.toJsFn)
  }
}
