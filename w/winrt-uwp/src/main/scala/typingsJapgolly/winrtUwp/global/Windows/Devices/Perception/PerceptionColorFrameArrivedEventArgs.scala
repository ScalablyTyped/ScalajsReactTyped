package typingsJapgolly.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a color frame arrived event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionColorFrameArrivedEventArgs")
@js.native
open class PerceptionColorFrameArrivedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionColorFrameArrivedEventArgs {
  
  /** Gets the relative time of this frame. */
  /* CompleteClass */
  var relativeTime: Double = js.native
  
  /**
    * Attempts to open the color frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived color frame. If the attempt is unsuccessful, this value is unchanged.
    */
  /* CompleteClass */
  override def tryOpenFrame(): typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionColorFrame = js.native
}
