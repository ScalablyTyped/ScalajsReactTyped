package typingsJapgolly.winrtUwp.global.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about an attempted property change on a frame source. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeResult")
@js.native
open class PerceptionFrameSourcePropertyChangeResult ()
  extends StObject
     with typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeResult {
  
  /** Gets a PerceptionFrameSourcePropertyChangeStatus indicating the status of the change request, including whether or not the change took effect. */
  /* CompleteClass */
  var newValue: Any = js.native
  
  /** Gets the value of the property after the change request has been processed. */
  /* CompleteClass */
  var status: typingsJapgolly.winrtUwp.Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus = js.native
}
