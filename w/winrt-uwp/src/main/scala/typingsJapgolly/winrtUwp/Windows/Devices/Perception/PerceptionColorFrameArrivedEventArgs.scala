package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a color frame arrived event. */
trait PerceptionColorFrameArrivedEventArgs extends StObject {
  
  /** Gets the relative time of this frame. */
  var relativeTime: Double
  
  /**
    * Attempts to open the color frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived color frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionColorFrame
}
object PerceptionColorFrameArrivedEventArgs {
  
  inline def apply(relativeTime: Double, tryOpenFrame: CallbackTo[PerceptionColorFrame]): PerceptionColorFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = tryOpenFrame.toJsFn)
    __obj.asInstanceOf[PerceptionColorFrameArrivedEventArgs]
  }
  
  extension [Self <: PerceptionColorFrameArrivedEventArgs](x: Self) {
    
    inline def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    inline def setTryOpenFrame(value: CallbackTo[PerceptionColorFrame]): Self = StObject.set(x, "tryOpenFrame", value.toJsFn)
  }
}
