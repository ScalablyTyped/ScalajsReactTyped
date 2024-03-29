package typingsJapgolly.winrtUwp.Windows.Devices.Perception

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PerceptionFrameSourcePropertyChangeStatus extends StObject
/** Indicates the status of a property change that an app requested of a frame source. */
@JSGlobal("Windows.Devices.Perception.PerceptionFrameSourcePropertyChangeStatus")
@js.native
object PerceptionFrameSourcePropertyChangeStatus extends StObject {
  
  /** The requested property change was accepted by the frame source. */
  @js.native
  sealed trait accepted
    extends StObject
       with PerceptionFrameSourcePropertyChangeStatus
  
  /** The frame source property could not be changed because the app lost controller mode before the request was processed. */
  @js.native
  sealed trait lostControl
    extends StObject
       with PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property is not supported by the frame source. */
  @js.native
  sealed trait propertyNotSupported
    extends StObject
       with PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the property is read-only. */
  @js.native
  sealed trait propertyReadOnly
    extends StObject
       with PerceptionFrameSourcePropertyChangeStatus
  
  /** The status change is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with PerceptionFrameSourcePropertyChangeStatus
  
  /** The requested property change was not accepted because the value is not in a valid range. */
  @js.native
  sealed trait valueOutOfRange
    extends StObject
       with PerceptionFrameSourcePropertyChangeStatus
}
