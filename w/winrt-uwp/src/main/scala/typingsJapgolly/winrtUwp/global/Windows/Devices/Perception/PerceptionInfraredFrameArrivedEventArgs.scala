package typingsJapgolly.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about a infrared frame arrived event. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionInfraredFrameArrivedEventArgs")
@js.native
open class PerceptionInfraredFrameArrivedEventArgs ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrameArrivedEventArgs {
  
  /** Gets the relative time of this frame. */
  /* CompleteClass */
  var relativeTime: Double = js.native
  
  /**
    * Attempts to open the infrared frame that has arrived.
    * @return If the attempt is successful, this method returns the newly-arrived infrared frame. If the attempt is unsuccessful, this value is unchanged.
    */
  /* CompleteClass */
  override def tryOpenFrame(): typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionInfraredFrame = js.native
}
