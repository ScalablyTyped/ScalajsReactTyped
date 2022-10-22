package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a depth frame arrived event. */
trait PerceptionDepthFrameArrivedEventArgs extends StObject {
  
  /** Gets the relative time of this frame. */
  var relativeTime: Double
  
  /**
    * Attempts to open the depth frame that has arrived. Existing frames should be closed before opening new frames. If an app has three or more frames still open when this method is called, TryOpenFrame will fail.
    * @return If the attempt is successful, this method returns the newly-arrived depth frame. If the attempt is unsuccessful, this value is unchanged.
    */
  def tryOpenFrame(): PerceptionDepthFrame
}
object PerceptionDepthFrameArrivedEventArgs {
  
  inline def apply(relativeTime: Double, tryOpenFrame: CallbackTo[PerceptionDepthFrame]): PerceptionDepthFrameArrivedEventArgs = {
    val __obj = js.Dynamic.literal(relativeTime = relativeTime.asInstanceOf[js.Any], tryOpenFrame = tryOpenFrame.toJsFn)
    __obj.asInstanceOf[PerceptionDepthFrameArrivedEventArgs]
  }
  
  extension [Self <: PerceptionDepthFrameArrivedEventArgs](x: Self) {
    
    inline def setRelativeTime(value: Double): Self = StObject.set(x, "relativeTime", value.asInstanceOf[js.Any])
    
    inline def setTryOpenFrame(value: CallbackTo[PerceptionDepthFrame]): Self = StObject.set(x, "tryOpenFrame", value.toJsFn)
  }
}
